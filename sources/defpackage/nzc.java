package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class nzc extends tzc {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public iq5[] d;
    public iq5 e;
    public wzc f;
    public iq5 g;
    public int h;

    public nzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        if ((i2 & 6) == (i3 & 6)) {
            return true;
        }
        return false;
    }

    private iq5 u(int i2, boolean z) {
        iq5 iq5Var = iq5.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                iq5Var = iq5.a(iq5Var, v(i3, z));
            }
        }
        return iq5Var;
    }

    private iq5 w() {
        wzc wzcVar = this.f;
        if (wzcVar != null) {
            return wzcVar.a.i();
        }
        return iq5.e;
    }

    private iq5 x(View view) {
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
                        return iq5.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        rjb.j("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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

    public void A(iq5 iq5Var) {
        this.g = iq5Var;
    }

    @Override
    public void d(View view) {
        iq5 x = x(view);
        if (x == null) {
            x = iq5.e;
        }
        A(x);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        nzc nzcVar = (nzc) obj;
        if (!Objects.equals(this.g, nzcVar.g) || !B(this.h, nzcVar.h)) {
            return false;
        }
        return true;
    }

    @Override
    public iq5 f(int i2) {
        return u(i2, false);
    }

    @Override
    public iq5 g(int i2) {
        return u(i2, true);
    }

    @Override
    public final iq5 k() {
        iq5 iq5Var = this.e;
        if (iq5Var == null) {
            WindowInsets windowInsets = this.c;
            iq5 b = iq5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = b;
            return b;
        }
        return iq5Var;
    }

    @Override
    public wzc m(int i2, int i3, int i4, int i5) {
        mzc izcVar;
        wzc h = wzc.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            izcVar = new lzc(h);
        } else if (i6 >= 30) {
            izcVar = new kzc(h);
        } else if (i6 >= 29) {
            izcVar = new jzc(h);
        } else {
            izcVar = new izc(h);
        }
        izcVar.g(wzc.e(k(), i2, i3, i4, i5));
        izcVar.e(wzc.e(i(), i2, i3, i4, i5));
        return izcVar.b();
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
    public void q(iq5[] iq5VarArr) {
        this.d = iq5VarArr;
    }

    @Override
    public void r(wzc wzcVar) {
        this.f = wzcVar;
    }

    @Override
    public void t(int i2) {
        this.h = i2;
    }

    public iq5 v(int i2, boolean z) {
        int i3;
        vp3 e;
        int i4;
        int i5;
        int i6;
        iq5 iq5Var = iq5.e;
        int i7 = 0;
        if (i2 != 1) {
            iq5 iq5Var2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    wzc wzcVar = this.f;
                                    if (wzcVar != null) {
                                        e = wzcVar.a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            int n = fp.n(e.a);
                                            i5 = fp.p(e.a);
                                            i6 = fp.o(e.a);
                                            i7 = fp.m(e.a);
                                            i4 = n;
                                        } else {
                                            i4 = 0;
                                            i5 = 0;
                                            i6 = 0;
                                        }
                                        return iq5.b(i4, i5, i6, i7);
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
                    iq5[] iq5VarArr = this.d;
                    if (iq5VarArr != null) {
                        iq5Var2 = iq5VarArr[j0f.a(8)];
                    }
                    if (iq5Var2 != null) {
                        return iq5Var2;
                    }
                    iq5 k2 = k();
                    iq5 w = w();
                    int i8 = k2.d;
                    if (i8 > w.d) {
                        return iq5.b(0, 0, 0, i8);
                    }
                    iq5 iq5Var3 = this.g;
                    if (iq5Var3 != null && !iq5Var3.equals(iq5Var) && (i3 = this.g.d) > w.d) {
                        return iq5.b(0, 0, 0, i3);
                    }
                }
            } else if (z) {
                iq5 w2 = w();
                iq5 i9 = i();
                return iq5.b(Math.max(w2.a, i9.a), 0, Math.max(w2.c, i9.c), Math.max(w2.d, i9.d));
            } else if ((this.h & 2) == 0) {
                iq5 k3 = k();
                wzc wzcVar2 = this.f;
                if (wzcVar2 != null) {
                    iq5Var2 = wzcVar2.a.i();
                }
                int i10 = k3.d;
                if (iq5Var2 != null) {
                    i10 = Math.min(i10, iq5Var2.d);
                }
                return iq5.b(k3.a, 0, k3.c, i10);
            }
        } else if (z) {
            return iq5.b(0, Math.max(w().b, k().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return iq5.b(0, k().b, 0, 0);
            }
        }
        return iq5Var;
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
        return !v(i2, false).equals(iq5.e);
    }
}
