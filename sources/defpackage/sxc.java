package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class sxc {
    public static final vxc b;
    public final vxc a;

    static {
        lxc hxcVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            hxcVar = new kxc();
        } else if (i >= 30) {
            hxcVar = new jxc();
        } else if (i >= 29) {
            hxcVar = new ixc();
        } else {
            hxcVar = new hxc();
        }
        b = hxcVar.b().a.a().a.b().a.c();
    }

    public sxc(vxc vxcVar) {
        this.a = vxcVar;
    }

    public vxc a() {
        return this.a;
    }

    public vxc b() {
        return this.a;
    }

    public vxc c() {
        return this.a;
    }

    public lo3 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxc)) {
            return false;
        }
        sxc sxcVar = (sxc) obj;
        if (o() == sxcVar.o() && n() == sxcVar.n() && Objects.equals(k(), sxcVar.k()) && Objects.equals(i(), sxcVar.i()) && Objects.equals(e(), sxcVar.e())) {
            return true;
        }
        return false;
    }

    public io5 f(int i) {
        return io5.e;
    }

    public io5 g(int i) {
        if ((i & 8) == 0) {
            return io5.e;
        }
        w26.j("Unable to query the maximum insets for IME");
        return null;
    }

    public io5 h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public io5 i() {
        return io5.e;
    }

    public io5 j() {
        return k();
    }

    public io5 k() {
        return io5.e;
    }

    public io5 l() {
        return k();
    }

    public vxc m(int i, int i2, int i3, int i4) {
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

    public void q(io5[] io5VarArr) {
    }

    public void r(vxc vxcVar) {
    }

    public void s(io5 io5Var) {
    }

    public void t(int i) {
    }
}
