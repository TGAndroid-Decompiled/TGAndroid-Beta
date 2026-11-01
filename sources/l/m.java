package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {
    public e0 f11518a;
    public g.f f11519b;
    public h f11520c;

    @Override
    public final boolean B(l lVar) {
        return false;
    }

    @Override
    public final void g(l lVar, boolean z10) {
        g.f fVar;
        if ((z10 || lVar == this.f11518a) && (fVar = this.f11519b) != null) {
            fVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        e0 e0Var = this.f11518a;
        h hVar = this.f11520c;
        if (hVar.f11492f == null) {
            hVar.f11492f = new g(hVar);
        }
        e0Var.q(hVar.f11492f.getItem(i10), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f11520c.g(this.f11518a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        e0 e0Var = this.f11518a;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f11519b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f11519b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e0Var.performShortcut(i10, keyEvent, 0);
    }
}
