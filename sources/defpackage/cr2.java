package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Field;
public final class cr2 implements b36 {
    public static byte c = 0;
    public static Field d;
    public static Field e;
    public static Field f;
    public final byte a;
    public hr2 b;

    public cr2(hr2 hr2Var, byte b) {
        this.a = b;
        this.b = hr2Var;
    }

    @Override
    public final void b(e36 e36Var, u26 u26Var) {
        View view = null;
        switch (this.a) {
            case 0:
                if (u26Var == u26.ON_STOP) {
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
                if (u26Var == u26.ON_DESTROY) {
                    this.b.b.c = null;
                    if (!this.b.isChangingConfigurations()) {
                        this.b.f().a();
                    }
                    fr2 fr2Var = this.b.r;
                    hr2 hr2Var = fr2Var.d;
                    hr2Var.getWindow().getDecorView().removeCallbacks(fr2Var);
                    hr2Var.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(fr2Var);
                    return;
                }
                return;
            case 2:
                hr2 hr2Var2 = this.b;
                if (hr2Var2.f == null) {
                    er2 er2Var = (er2) hr2Var2.getLastNonConfigurationInstance();
                    if (er2Var != null) {
                        hr2Var2.f = er2Var.a;
                    }
                    if (hr2Var2.f == null) {
                        hr2Var2.f = new tfc();
                    }
                }
                hr2Var2.d.b(this);
                return;
            case 3:
                if (u26Var == u26.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    yq7 yq7Var = this.b.n;
                    OnBackInvokedDispatcher a = dr2.a((hr2) e36Var);
                    yq7Var.getClass();
                    a.getClass();
                    yq7Var.e = a;
                    yq7Var.b(yq7Var.g);
                    return;
                }
                return;
            default:
                if (u26Var == u26.ON_DESTROY) {
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

    public cr2() {
        this.a = (byte) 4;
    }
}
