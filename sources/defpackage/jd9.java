package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public abstract class jd9 extends FrameLayout {
    public ll0 a;
    public final re1 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;

    public jd9(Context context) {
        super(context);
        ?? obj = new Object();
        obj.b = Long.MIN_VALUE;
        obj.a = -1;
        this.b = obj;
    }

    public final void c(ll0 ll0Var) {
        this.b.a(ll0Var, new h68(this, (byte) 27));
    }

    public int d() {
        return 0;
    }

    public void e(int i) {
        int d;
        int i2;
        int i3;
        int i4;
        int d2 = uue.d(this.a);
        int i5 = 0;
        if (i <= 0 && d2 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        ll0 ll0Var = this.a;
        if (ll0Var != null && ll0Var.n) {
            if (ll0Var.l <= 0) {
                i2 = 0;
            } else {
                i2 = gm.L(((i4 - 1) << 4) + 10);
            }
        } else {
            i2 = this.e;
        }
        ll0 ll0Var2 = this.a;
        if (ll0Var2 != null && ll0Var2.o) {
            if (ll0Var2.m > 0) {
                i5 = gm.L(((i3 - 1) << 4) + 10);
            }
        } else {
            i5 = this.h;
        }
        int i6 = i + d;
        int i7 = d2 + d;
        int i8 = this.d;
        int i9 = this.f;
        if (jb6.a0) {
            setPadding(i8 + i7, i2, i9 + i6, i5);
        } else {
            setPadding(i8 + i6, i2, i9 + i7, i5);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = i4;
        int i5 = this.c;
        if (jb6.a0) {
            setPadding(i, i2, i3 + i5, i4);
        } else {
            setPadding(i + i5, i2, i3, i4);
        }
    }
}
