package defpackage;

import android.view.View;
public final class j59 implements Runnable {
    public final View a;
    public final int b;
    public final float c;
    public final float d;
    public final k59 e;

    public j59(k59 k59Var, View view, int i, float f, float f2) {
        this.e = k59Var;
        this.a = view;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override
    public final void run() {
        cu5 cu5Var = this.e.b;
        r59 r59Var = (r59) cu5Var.b;
        if (this == r59Var.R1) {
            r59Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            r59Var.k1(view, 0.0f, 0.0f, false);
            if (!((r59) cu5Var.b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i = this.b;
                if (i != -1) {
                    r59 r59Var2 = (r59) cu5Var.b;
                    f59 f59Var = r59Var2.U0;
                    if (f59Var != null) {
                        f59Var.g(i, view);
                        return;
                    }
                    g59 g59Var = r59Var2.V0;
                    if (g59Var != null) {
                        g59Var.d(this.c - view.getX(), this.d - view.getY(), i, view);
                    }
                }
            }
        }
    }
}
