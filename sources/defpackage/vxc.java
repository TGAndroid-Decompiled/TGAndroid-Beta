package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class vxc {
    public static final vxc b;
    public final sxc a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = rxc.s;
        } else if (i >= 30) {
            b = qxc.r;
        } else {
            b = sxc.b;
        }
    }

    public vxc(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.a = new rxc(this, windowInsets);
        } else if (i >= 30) {
            this.a = new qxc(this, windowInsets);
        } else if (i >= 29) {
            this.a = new pxc(this, windowInsets);
        } else if (i >= 28) {
            this.a = new oxc(this, windowInsets);
        } else {
            this.a = new nxc(this, windowInsets);
        }
    }

    public static io5 e(io5 io5Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, io5Var.a - i);
        int max2 = Math.max(0, io5Var.b - i2);
        int max3 = Math.max(0, io5Var.c - i3);
        int max4 = Math.max(0, io5Var.d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return io5Var;
        }
        return io5.b(max, max2, max3, max4);
    }

    public static vxc h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        vxc vxcVar = new vxc(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = jdc.a;
            vxc a = cdc.a(view);
            sxc sxcVar = vxcVar.a;
            sxcVar.r(a);
            sxcVar.d(view.getRootView());
            sxcVar.t(view.getWindowSystemUiVisibility());
        }
        return vxcVar;
    }

    public final int a() {
        return this.a.k().d;
    }

    public final int b() {
        return this.a.k().a;
    }

    public final int c() {
        return this.a.k().c;
    }

    public final int d() {
        return this.a.k().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        return Objects.equals(this.a, ((vxc) obj).a);
    }

    public final vxc f(int i, int i2, int i3, int i4) {
        lxc hxcVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            hxcVar = new kxc(this);
        } else if (i5 >= 30) {
            hxcVar = new jxc(this);
        } else if (i5 >= 29) {
            hxcVar = new ixc(this);
        } else {
            hxcVar = new hxc(this);
        }
        hxcVar.g(io5.b(i, i2, i3, i4));
        return hxcVar.b();
    }

    public final WindowInsets g() {
        sxc sxcVar = this.a;
        if (sxcVar instanceof mxc) {
            return ((mxc) sxcVar).c;
        }
        return null;
    }

    public final int hashCode() {
        sxc sxcVar = this.a;
        if (sxcVar == null) {
            return 0;
        }
        return sxcVar.hashCode();
    }

    public vxc() {
        this.a = new sxc(this);
    }
}
