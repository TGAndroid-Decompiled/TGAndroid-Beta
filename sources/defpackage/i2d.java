package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class i2d {
    public static final l2d b;
    public final l2d a;

    static {
        b2d x1dVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            x1dVar = new a2d();
        } else if (i >= 30) {
            x1dVar = new z1d();
        } else if (i >= 29) {
            x1dVar = new y1d();
        } else {
            x1dVar = new x1d();
        }
        b = x1dVar.b().a.a().a.b().a.c();
    }

    public i2d(l2d l2dVar) {
        this.a = l2dVar;
    }

    public l2d a() {
        return this.a;
    }

    public l2d b() {
        return this.a;
    }

    public l2d c() {
        return this.a;
    }

    public cp3 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2d)) {
            return false;
        }
        i2d i2dVar = (i2d) obj;
        if (o() == i2dVar.o() && n() == i2dVar.n() && Objects.equals(k(), i2dVar.k()) && Objects.equals(i(), i2dVar.i()) && Objects.equals(e(), i2dVar.e())) {
            return true;
        }
        return false;
    }

    public mq5 f(int i) {
        return mq5.e;
    }

    public mq5 g(int i) {
        if ((i & 8) == 0) {
            return mq5.e;
        }
        lq5.j("Unable to query the maximum insets for IME");
        return null;
    }

    public mq5 h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public mq5 i() {
        return mq5.e;
    }

    public mq5 j() {
        return k();
    }

    public mq5 k() {
        return mq5.e;
    }

    public mq5 l() {
        return k();
    }

    public l2d m(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void q(mq5[] mq5VarArr) {
    }

    public void r(l2d l2dVar) {
    }

    public void s(mq5 mq5Var) {
    }

    public void t(int i) {
    }
}
