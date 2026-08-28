package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
    public d0 f16575a;
    public g.f f16576b;
    public g f16577c;

    @Override
    public final void c(k kVar, boolean z10) {
        g.f fVar;
        if ((z10 || kVar == this.f16575a) && (fVar = this.f16576b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final boolean j(k kVar) {
        return false;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        d0 d0Var = this.f16575a;
        g gVar = this.f16577c;
        if (gVar.f16547f == null) {
            gVar.f16547f = new f(gVar);
        }
        d0Var.q(gVar.f16547f.getItem(i9), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f16577c.c(this.f16575a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i9, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        d0 d0Var = this.f16575a;
        if (i9 == 82 || i9 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f16576b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f16576b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                d0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return d0Var.performShortcut(i9, keyEvent, 0);
    }
}
