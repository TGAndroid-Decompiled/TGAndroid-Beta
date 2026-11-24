package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Field;
public final class rp2 implements b16 {
    public static byte c = 0;
    public static Field d;
    public static Field e;
    public static Field f;
    public final byte a;
    public wp2 b;

    public rp2(wp2 wp2Var, byte b) {
        this.a = b;
        this.b = wp2Var;
    }

    @Override
    public final void b(e16 e16Var, u06 u06Var) {
        View view = null;
        switch (this.a) {
            case 0:
                if (u06Var == u06.ON_STOP) {
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
                if (u06Var == u06.ON_DESTROY) {
                    this.b.b.c = null;
                    if (!this.b.isChangingConfigurations()) {
                        this.b.f().a();
                    }
                    up2 up2Var = this.b.r;
                    wp2 wp2Var = up2Var.d;
                    wp2Var.getWindow().getDecorView().removeCallbacks(up2Var);
                    wp2Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(up2Var);
                    return;
                }
                return;
            case 2:
                wp2 wp2Var2 = this.b;
                if (wp2Var2.f == null) {
                    tp2 tp2Var = (tp2) wp2Var2.getLastNonConfigurationInstance();
                    if (tp2Var != null) {
                        wp2Var2.f = tp2Var.a;
                    }
                    if (wp2Var2.f == null) {
                        wp2Var2.f = new sdc();
                    }
                }
                wp2Var2.d.b(this);
                return;
            case 3:
                if (u06Var == u06.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    vo7 vo7Var = this.b.n;
                    OnBackInvokedDispatcher a = sp2.a((wp2) e16Var);
                    vo7Var.getClass();
                    a.getClass();
                    vo7Var.e = a;
                    vo7Var.b(vo7Var.g);
                    return;
                }
                return;
            default:
                if (u06Var == u06.ON_DESTROY) {
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

    public rp2() {
        this.a = (byte) 4;
    }
}
