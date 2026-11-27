package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
public final class g27 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y27 {
    public f27 a;
    public jd b;
    public m76 c;

    @Override
    public final void f(f27 f27Var, boolean z) {
        jd jdVar;
        if ((z || f27Var == this.a) && (jdVar = this.b) != null) {
            jdVar.dismiss();
        }
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        f27 f27Var = this.a;
        m76 m76Var = this.c;
        l76 l76Var = m76Var.f;
        if (l76Var == null) {
            l76Var = new l76(m76Var);
            m76Var.f = l76Var;
        }
        f27Var.q(l76Var.getItem(i), null, 0);
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.f(this.a, true);
    }

    @Override
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f27 f27Var = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f27Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f27Var.performShortcut(i, keyEvent, 0);
    }

    @Override
    public final boolean z0(f27 f27Var) {
        return false;
    }
}
