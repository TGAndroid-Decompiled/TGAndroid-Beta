package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class fi2 implements dic {
    public final byte a;
    public int b;
    public final View c;

    public fi2(View view, byte b) {
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
                yr8 yr8Var = (yr8) this.c;
                ProfileActivity profileActivity = yr8Var.n;
                int k = profileActivity.o0.E0.k(i);
                if (this.b != k) {
                    z = true;
                } else {
                    z = false;
                }
                yr8Var.a(z);
                this.b = k;
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        hl.d3(new uk8(yr8Var, (byte) 10), 500L);
                        return;
                    } else {
                        yr8Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        vy4 vy4Var;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                if (i == ((et8) view).getCurrentItem() && f == 0.0f && this.b == 1) {
                    d();
                    return;
                }
                return;
            default:
                vy4Var = ((e) ((yr8) view).n).glassEngine;
                vy4Var.g();
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
        et8 et8Var = (et8) this.c;
        if (et8Var.x0 != null) {
            int currentItem = et8Var.getCurrentItem();
            int k = et8Var.x0.k(currentItem) + et8Var.x0.j();
            if (currentItem != k) {
                et8Var.x(k, false);
            }
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }
}
