package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class xi2 implements egc {
    public final byte a;
    public int b;
    public final View c;

    public xi2(View view, byte b) {
        this.a = b;
        this.c = view;
    }

    @Override
    public final void a(int i) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            default:
                nq8 nq8Var = (nq8) this.c;
                ProfileActivity profileActivity = nq8Var.n;
                int k = profileActivity.o0.E0.k(i);
                if (this.b != k) {
                    z = true;
                } else {
                    z = false;
                }
                nq8Var.a(z);
                this.b = k;
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        gm.d3(new pp8(nq8Var, (byte) 2), 500L);
                        return;
                    } else {
                        nq8Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        sy4 sy4Var;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                if (i == ((tr8) view).getCurrentItem() && f == 0.0f && this.b == 1) {
                    d();
                    return;
                }
                return;
            default:
                sy4Var = ((d) ((nq8) view).n).glassEngine;
                sy4Var.g();
                return;
        }
    }

    @Override
    public final void c(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    d();
                }
                this.b = i;
                return;
            default:
                return;
        }
    }

    public final void d() {
        tr8 tr8Var = (tr8) this.c;
        if (tr8Var.x0 != null) {
            int currentItem = tr8Var.getCurrentItem();
            int k = tr8Var.x0.k(currentItem) + tr8Var.x0.j();
            if (currentItem != k) {
                tr8Var.x(k, false);
            }
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }
}
