package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public abstract class mz9 extends PopupWindow {
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

    public mz9(vz9 vz9Var) {
        super(vz9Var, -2, -2);
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
        if (getContentView() instanceof vz9) {
            ((vz9) getContentView()).r(new lz9(this, (byte) 1));
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
        if (getContentView() instanceof vz9) {
            vz9 vz9Var = (vz9) getContentView();
            lz9 lz9Var = new lz9(this, (byte) 0);
            Integer num = vz9Var.a2;
            if (num != null) {
                vz9.e2.put(num, vz9Var.s0.d0());
            }
            ValueAnimator valueAnimator = vz9Var.X1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                vz9Var.X1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            vz9Var.X1 = ofFloat;
            ofFloat.addUpdateListener(new yx9(vz9Var, (byte) 3));
            vz9Var.X1.addListener(new ic8(vz9Var, lz9Var, (byte) 14));
            vz9Var.X1.setDuration(200L);
            vz9Var.X1.setInterpolator(d53.h);
            vz9Var.X1.start();
            ny9 ny9Var = vz9Var.g0;
            if (ny9Var != null) {
                gm.t1(ny9Var.h);
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
