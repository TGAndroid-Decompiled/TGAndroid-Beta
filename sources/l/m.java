package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {
    public e0 f12648a;
    public g.g f12649b;
    public h f12650c;

    @Override
    public final void c(l lVar, boolean z10) {
        g.g gVar;
        if ((z10 || lVar == this.f12648a) && (gVar = this.f12649b) != null) {
            gVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        e0 e0Var = this.f12648a;
        h hVar = this.f12650c;
        if (hVar.f12622f == null) {
            hVar.f12622f = new g(hVar);
        }
        e0Var.q(hVar.f12622f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f12650c.c(this.f12648a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f12648a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f12649b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f12649b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i10, keyEvent, 0);
    }

    @Override
    public final boolean u(l lVar) {
        return false;
    }
}
