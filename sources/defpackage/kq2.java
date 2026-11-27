package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Field;
public final class kq2 implements f36 {
    public static byte c = 0;
    public static Field d;
    public static Field e;
    public static Field f;
    public final byte a;
    public pq2 b;

    public kq2(pq2 pq2Var, byte b) {
        this.a = b;
        this.b = pq2Var;
    }

    @Override
    public final void b(i36 i36Var, y26 y26Var) {
        View view = null;
        switch (this.a) {
            case 0:
                if (y26Var == y26.ON_STOP) {
                    Window window = this.b.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (y26Var == y26.ON_DESTROY) {
                    this.b.b.c = null;
                    if (!this.b.isChangingConfigurations()) {
                        this.b.f().a();
                    }
                    nq2 nq2Var = this.b.r;
                    pq2 pq2Var = nq2Var.d;
                    pq2Var.getWindow().getDecorView().removeCallbacks(nq2Var);
                    pq2Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nq2Var);
                    return;
                }
                return;
            case 2:
                pq2 pq2Var2 = this.b;
                if (pq2Var2.f == null) {
                    mq2 mq2Var = (mq2) pq2Var2.getLastNonConfigurationInstance();
                    if (mq2Var != null) {
                        pq2Var2.f = mq2Var.a;
                    }
                    if (pq2Var2.f == null) {
                        pq2Var2.f = new rhc();
                    }
                }
                pq2Var2.d.b(this);
                return;
            case 3:
                if (y26Var == y26.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    vr7 vr7Var = this.b.n;
                    OnBackInvokedDispatcher a = lq2.a((pq2) i36Var);
                    vr7Var.getClass();
                    a.getClass();
                    vr7Var.e = a;
                    vr7Var.b(vr7Var.g);
                    return;
                }
                return;
            default:
                if (y26Var == y26.ON_DESTROY) {
                    if (c == 0) {
                        try {
                            c = (byte) 2;
                            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                            e = declaredField;
                            declaredField.setAccessible(true);
                            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                            f = declaredField2;
                            declaredField2.setAccessible(true);
                            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                            d = declaredField3;
                            declaredField3.setAccessible(true);
                            c = (byte) 1;
                        } catch (NoSuchFieldException unused) {
                        }
                    }
                    if (c == 1) {
                        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
                        try {
                            Object obj = d.get(inputMethodManager);
                            if (obj != null) {
                                synchronized (obj) {
                                    try {
                                        try {
                                            View view2 = (View) e.get(inputMethodManager);
                                            if (view2 != null) {
                                                if (!view2.isAttachedToWindow()) {
                                                    try {
                                                        f.set(inputMethodManager, null);
                                                        inputMethodManager.isActive();
                                                    } catch (IllegalAccessException unused2) {
                                                    }
                                                }
                                            }
                                        } catch (IllegalAccessException unused3) {
                                        }
                                    } catch (ClassCastException unused4) {
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (IllegalAccessException unused5) {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public kq2() {
        this.a = (byte) 4;
    }
}
