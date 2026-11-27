package defpackage;

import android.view.View;
public final class v69 implements Runnable {
    public final View a;
    public final int b;
    public final float c;
    public final float d;
    public final w69 e;

    public v69(w69 w69Var, View view, int i, float f, float f2) {
        this.e = w69Var;
        this.a = view;
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    @Override
    public final void run() {
        gu5 gu5Var = this.e.b;
        d79 d79Var = (d79) gu5Var.b;
        if (this == d79Var.R1) {
            d79Var.R1 = null;
        }
        View view = this.a;
        if (view != null) {
            d79Var.l1(view, 0.0f, 0.0f, false);
            if (!((d79) gu5Var.b).Q1) {
                try {
                    view.playSoundEffect(0);
                } catch (Exception unused) {
                }
                view.sendAccessibilityEvent(1);
                int i = this.b;
                if (i != -1) {
                    d79 d79Var2 = (d79) gu5Var.b;
                    r69 r69Var = d79Var2.U0;
                    if (r69Var != null) {
                        r69Var.e(i, view);
                        return;
                    }
                    s69 s69Var = d79Var2.V0;
                    if (s69Var != null) {
                        s69Var.d(this.c - view.getX(), this.d - view.getY(), i, view);
                    }
                }
            }
        }
    }
}
