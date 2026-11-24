package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class zz6 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, r07 {
    public yz6 a;
    public id b;
    public i56 c;

    @Override
    public final boolean J(yz6 yz6Var) {
        return false;
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
        id idVar;
        if ((z || yz6Var == this.a) && (idVar = this.b) != null) {
            idVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        yz6 yz6Var = this.a;
        i56 i56Var = this.c;
        h56 h56Var = i56Var.f;
        if (h56Var == null) {
            h56Var = new h56(i56Var);
            i56Var.f = h56Var;
        }
        yz6Var.q(h56Var.getItem(i), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.d(this.a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        yz6 yz6Var = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                yz6Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return yz6Var.performShortcut(i, keyEvent, 0);
    }
}
