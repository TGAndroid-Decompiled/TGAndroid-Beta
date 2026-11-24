package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class mxc extends sxc {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public io5[] d;
    public io5 e;
    public vxc f;
    public io5 g;
    public int h;

    public mxc(vxc vxcVar, WindowInsets windowInsets) {
        super(vxcVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        if ((i2 & 6) == (i3 & 6)) {
            return true;
        }
        return false;
    }

    private io5 u(int i2, boolean z) {
        io5 io5Var = io5.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                io5Var = io5.a(io5Var, v(i3, z));
            }
        }
        return io5Var;
    }

    private io5 w() {
        vxc vxcVar = this.f;
        if (vxcVar != null) {
            return vxcVar.a.i();
        }
        return io5.e;
    }

    private io5 x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!i) {
                z();
            }
            Method method = j;
            if (method != null && k != null && l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) l.get(m.get(invoke));
                    if (rect != null) {
                        return io5.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        fyb.i("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        return null;
    }

    private static void z() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public void A(io5 io5Var) {
        this.g = io5Var;
    }

    @Override
    public void d(View view) {
        io5 x = x(view);
        if (x == null) {
            x = io5.e;
        }
        A(x);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        mxc mxcVar = (mxc) obj;
        if (!Objects.equals(this.g, mxcVar.g) || !B(this.h, mxcVar.h)) {
            return false;
        }
        return true;
    }

    @Override
    public io5 f(int i2) {
        return u(i2, false);
    }

    @Override
    public io5 g(int i2) {
        return u(i2, true);
    }

    @Override
    public final io5 k() {
        io5 io5Var = this.e;
        if (io5Var == null) {
            WindowInsets windowInsets = this.c;
            io5 b = io5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = b;
            return b;
        }
        return io5Var;
    }

    @Override
    public vxc m(int i2, int i3, int i4, int i5) {
        lxc hxcVar;
        vxc h = vxc.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            hxcVar = new kxc(h);
        } else if (i6 >= 30) {
            hxcVar = new jxc(h);
        } else if (i6 >= 29) {
            hxcVar = new ixc(h);
        } else {
            hxcVar = new hxc(h);
        }
        hxcVar.g(vxc.e(k(), i2, i3, i4, i5));
        hxcVar.e(vxc.e(i(), i2, i3, i4, i5));
        return hxcVar.b();
    }

    @Override
    public boolean o() {
        return this.c.isRound();
    }

    @Override
    public boolean p(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !y(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void q(io5[] io5VarArr) {
        this.d = io5VarArr;
    }

    @Override
    public void r(vxc vxcVar) {
        this.f = vxcVar;
    }

    @Override
    public void t(int i2) {
        this.h = i2;
    }

    public io5 v(int i2, boolean z) {
        int i3;
        lo3 e;
        int i4;
        int i5;
        int i6;
        io5 io5Var = io5.e;
        int i7 = 0;
        if (i2 != 1) {
            io5 io5Var2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    vxc vxcVar = this.f;
                                    if (vxcVar != null) {
                                        e = vxcVar.a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            int n = fo.n(e.a);
                                            i5 = fo.p(e.a);
                                            i6 = fo.o(e.a);
                                            i7 = fo.m(e.a);
                                            i4 = n;
                                        } else {
                                            i4 = 0;
                                            i5 = 0;
                                            i6 = 0;
                                        }
                                        return io5.b(i4, i5, i6, i7);
                                    }
                                }
                            } else {
                                return l();
                            }
                        } else {
                            return h();
                        }
                    } else {
                        return j();
                    }
                } else {
                    io5[] io5VarArr = this.d;
                    if (io5VarArr != null) {
                        io5Var2 = io5VarArr[hye.a(8)];
                    }
                    if (io5Var2 != null) {
                        return io5Var2;
                    }
                    io5 k2 = k();
                    io5 w = w();
                    int i8 = k2.d;
                    if (i8 > w.d) {
                        return io5.b(0, 0, 0, i8);
                    }
                    io5 io5Var3 = this.g;
                    if (io5Var3 != null && !io5Var3.equals(io5Var) && (i3 = this.g.d) > w.d) {
                        return io5.b(0, 0, 0, i3);
                    }
                }
            } else if (z) {
                io5 w2 = w();
                io5 i9 = i();
                return io5.b(Math.max(w2.a, i9.a), 0, Math.max(w2.c, i9.c), Math.max(w2.d, i9.d));
            } else if ((this.h & 2) == 0) {
                io5 k3 = k();
                vxc vxcVar2 = this.f;
                if (vxcVar2 != null) {
                    io5Var2 = vxcVar2.a.i();
                }
                int i10 = k3.d;
                if (io5Var2 != null) {
                    i10 = Math.min(i10, io5Var2.d);
                }
                return io5.b(k3.a, 0, k3.c, i10);
            }
        } else if (z) {
            return io5.b(0, Math.max(w().b, k().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return io5.b(0, k().b, 0, 0);
            }
        }
        return io5Var;
    }

    public boolean y(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !v(i2, false).equals(io5.e);
    }
}
