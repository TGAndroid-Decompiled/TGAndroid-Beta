package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class kx9 extends PopupWindow {
    public static final Field c;
    public static final e8 d = new Object();
    public final ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = field;
    }

    public kx9(tx9 tx9Var) {
        super(tx9Var, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = c;
        if (field != null) {
            try {
                this.a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.a = null;
            }
        }
    }

    public final void a() {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public final void b() {
        super.dismiss();
    }

    public final void c(View view) {
        ViewTreeObserver viewTreeObserver;
        if (getContentView() instanceof tx9) {
            ((tx9) getContentView()).r(new jx9(this, (byte) 1));
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.a;
        if (onScrollChangedListener != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(onScrollChangedListener);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                }
            }
        }
    }

    @Override
    public void dismiss() {
        if (getContentView() instanceof tx9) {
            tx9 tx9Var = (tx9) getContentView();
            jx9 jx9Var = new jx9(this, (byte) 0);
            Integer num = tx9Var.a2;
            if (num != null) {
                tx9.e2.put(num, tx9Var.s0.d0());
            }
            ValueAnimator valueAnimator = tx9Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                tx9Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            tx9Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new vv9(tx9Var, (byte) 3));
            tx9Var.X1.addListener(new eh8(tx9Var, jx9Var, (byte) 13));
            tx9Var.X1.setDuration(200L);
            tx9Var.X1.setInterpolator(s33.h);
            tx9Var.X1.start();
            lw9 lw9Var = tx9Var.g0;
            if (lw9Var != null) {
                gl.t1(lw9Var.h);
            }
            View rootView = getContentView().getRootView();
            WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
            if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
                try {
                    int i = layoutParams.flags;
                    if ((i & 2) != 0) {
                        layoutParams.flags = i & (-3);
                        layoutParams.dimAmount = 0.0f;
                        windowManager.updateViewLayout(rootView, layoutParams);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        super.dismiss();
    }

    @Override
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i, i2, i3);
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.a;
        if (onScrollChangedListener != null && (viewTreeObserver = this.b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.b.removeOnScrollChangedListener(onScrollChangedListener);
            }
            this.b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        c(view);
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        c(view);
    }
}
