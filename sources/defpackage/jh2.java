package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class jh2 implements eec {
    public final byte a;
    public int b;
    public final View c;

    public jh2(View view, byte b) {
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
                mo8 mo8Var = (mo8) this.c;
                ProfileActivity profileActivity = mo8Var.n;
                int k = profileActivity.o0.E0.k(i);
                if (this.b != k) {
                    z = true;
                } else {
                    z = false;
                }
                mo8Var.a(z);
                this.b = k;
                if (profileActivity.r0 != null) {
                    if (profileActivity.T0.y()) {
                        gl.d3(new w88(mo8Var, (byte) 24), 500L);
                        return;
                    } else {
                        mo8Var.c();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        qw4 qw4Var;
        byte b = this.a;
        View view = this.c;
        switch (b) {
            case 0:
                if (i == ((sp8) view).getCurrentItem() && f == 0.0f && this.b == 1) {
                    d();
                    return;
                }
                return;
            default:
                qw4Var = ((d) ((mo8) view).n).glassEngine;
                qw4Var.g();
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
        sp8 sp8Var = (sp8) this.c;
        if (sp8Var.x0 != null) {
            int currentItem = sp8Var.getCurrentItem();
            int k = sp8Var.x0.k(currentItem) + sp8Var.x0.j();
            if (currentItem != k) {
                sp8Var.x(k, false);
            }
        }
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }
}
