package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class c2d extends i2d {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public mq5[] d;
    public mq5 e;
    public l2d f;
    public mq5 g;
    public int h;

    public c2d(l2d l2dVar, WindowInsets windowInsets) {
        super(l2dVar);
        this.e = null;
        this.c = windowInsets;
    }

    public static boolean B(int i2, int i3) {
        if ((i2 & 6) == (i3 & 6)) {
            return true;
        }
        return false;
    }

    private mq5 u(int i2, boolean z) {
        mq5 mq5Var = mq5.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                mq5Var = mq5.a(mq5Var, v(i3, z));
            }
        }
        return mq5Var;
    }

    private mq5 w() {
        l2d l2dVar = this.f;
        if (l2dVar != null) {
            return l2dVar.a.i();
        }
        return mq5.e;
    }

    private mq5 x(View view) {
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
                        return mq5.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        qyc.c("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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

    public void A(mq5 mq5Var) {
        this.g = mq5Var;
    }

    @Override
    public void d(View view) {
        mq5 x = x(view);
        if (x == null) {
            x = mq5.e;
        }
        A(x);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c2d c2dVar = (c2d) obj;
        if (!Objects.equals(this.g, c2dVar.g) || !B(this.h, c2dVar.h)) {
            return false;
        }
        return true;
    }

    @Override
    public mq5 f(int i2) {
        return u(i2, false);
    }

    @Override
    public mq5 g(int i2) {
        return u(i2, true);
    }

    @Override
    public final mq5 k() {
        mq5 mq5Var = this.e;
        if (mq5Var == null) {
            WindowInsets windowInsets = this.c;
            mq5 b = mq5.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = b;
            return b;
        }
        return mq5Var;
    }

    @Override
    public l2d m(int i2, int i3, int i4, int i5) {
        b2d x1dVar;
        l2d h = l2d.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            x1dVar = new a2d(h);
        } else if (i6 >= 30) {
            x1dVar = new z1d(h);
        } else if (i6 >= 29) {
            x1dVar = new y1d(h);
        } else {
            x1dVar = new x1d(h);
        }
        x1dVar.g(l2d.e(k(), i2, i3, i4, i5));
        x1dVar.e(l2d.e(i(), i2, i3, i4, i5));
        return x1dVar.b();
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
    public void q(mq5[] mq5VarArr) {
        this.d = mq5VarArr;
    }

    @Override
    public void r(l2d l2dVar) {
        this.f = l2dVar;
    }

    @Override
    public void t(int i2) {
        this.h = i2;
    }

    public mq5 v(int i2, boolean z) {
        int i3;
        cp3 e;
        int i4;
        int i5;
        int i6;
        mq5 mq5Var = mq5.e;
        int i7 = 0;
        if (i2 != 1) {
            mq5 mq5Var2 = null;
            if (i2 != 2) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 == 128) {
                                    l2d l2dVar = this.f;
                                    if (l2dVar != null) {
                                        e = l2dVar.a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            int n = go.n(e.a);
                                            i5 = go.p(e.a);
                                            i6 = go.o(e.a);
                                            i7 = go.m(e.a);
                                            i4 = n;
                                        } else {
                                            i4 = 0;
                                            i5 = 0;
                                            i6 = 0;
                                        }
                                        return mq5.b(i4, i5, i6, i7);
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
                    mq5[] mq5VarArr = this.d;
                    if (mq5VarArr != null) {
                        mq5Var2 = mq5VarArr[b3f.a(8)];
                    }
                    if (mq5Var2 != null) {
                        return mq5Var2;
                    }
                    mq5 k2 = k();
                    mq5 w = w();
                    int i8 = k2.d;
                    if (i8 > w.d) {
                        return mq5.b(0, 0, 0, i8);
                    }
                    mq5 mq5Var3 = this.g;
                    if (mq5Var3 != null && !mq5Var3.equals(mq5Var) && (i3 = this.g.d) > w.d) {
                        return mq5.b(0, 0, 0, i3);
                    }
                }
            } else if (z) {
                mq5 w2 = w();
                mq5 i9 = i();
                return mq5.b(Math.max(w2.a, i9.a), 0, Math.max(w2.c, i9.c), Math.max(w2.d, i9.d));
            } else if ((this.h & 2) == 0) {
                mq5 k3 = k();
                l2d l2dVar2 = this.f;
                if (l2dVar2 != null) {
                    mq5Var2 = l2dVar2.a.i();
                }
                int i10 = k3.d;
                if (mq5Var2 != null) {
                    i10 = Math.min(i10, mq5Var2.d);
                }
                return mq5.b(k3.a, 0, k3.c, i10);
            }
        } else if (z) {
            return mq5.b(0, Math.max(w().b, k().b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return mq5.b(0, k().b, 0, 0);
            }
        }
        return mq5Var;
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
        return !v(i2, false).equals(mq5.e);
    }
}
