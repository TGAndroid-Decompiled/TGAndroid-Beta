package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class z17 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, r27 {
    public y17 a;
    public ie b;
    public i76 c;

    @Override
    public final void d(y17 y17Var, boolean z) {
        ie ieVar;
        if ((z || y17Var == this.a) && (ieVar = this.b) != null) {
            ieVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        y17 y17Var = this.a;
        i76 i76Var = this.c;
        h76 h76Var = i76Var.f;
        if (h76Var == null) {
            h76Var = new h76(i76Var);
            i76Var.f = h76Var;
        }
        y17Var.q(h76Var.getItem(i), null, 0);
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
        y17 y17Var = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                y17Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return y17Var.performShortcut(i, keyEvent, 0);
    }

    @Override
    public final boolean w0(y17 y17Var) {
        return false;
    }
}
