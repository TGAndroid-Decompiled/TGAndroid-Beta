package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
public final class bx3 extends PopupWindow {
    public static Field f;
    public static final f8 g = new Object();
    public ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;
    public final ax3 c;
    public boolean d;
    public final int e;

    public bx3(ax3 ax3Var) {
        super(ax3Var);
        float f2;
        if (hl.O1()) {
            f2 = 40.0f;
        } else {
            f2 = 32.0f;
        }
        this.e = hl.L(f2);
        this.c = ax3Var;
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(2);
        setSoftInputMode(0);
        ax3Var.setFocusableInTouchMode(true);
        ax3Var.setOnKeyListener(new x6(this, (byte) 3));
    }

    public final void a(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.a != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(this.a);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.a);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        setFocusable(false);
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
        if (this.a != null && (viewTreeObserver = this.b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.b.removeOnScrollChangedListener(this.a);
            }
            this.b = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            a(view);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void showAtLocation(View view, int i, int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i, i2, i3);
        if (this.a != null && (viewTreeObserver = this.b) != null) {
            if (viewTreeObserver.isAlive()) {
                this.b.removeOnScrollChangedListener(this.a);
            }
            this.b = null;
        }
    }

    @Override
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        a(view);
    }

    @Override
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        a(view);
    }
}
