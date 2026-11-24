package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
public abstract class hf0 extends ViewGroup implements zia {
    public boolean a;
    public ef0 b;
    public int c;
    public o1 d;
    public Runnable e;

    public hf0(Context context) {
        super(context);
        this.a = false;
        this.b = null;
        this.c = 0;
        this.d = null;
        setWillNotDraw(false);
        setFocusable(true);
        setHapticFeedbackEnabled(true);
    }

    public static float s(Drawable drawable, float f, float f2, float f3) {
        float intrinsicWidth = (drawable.getIntrinsicWidth() * f3) / drawable.getIntrinsicHeight();
        int i = (int) f;
        int i2 = (int) f2;
        drawable.setBounds(i, i2, ((int) intrinsicWidth) + i, ((int) f3) + i2);
        return intrinsicWidth;
    }

    public static void t(int i, int i2, Drawable drawable) {
        drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
    }

    public static void u(Drawable drawable, float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
    }

    @Override
    public final void d(Runnable runnable) {
        this.e = runnable;
    }

    public int getBoundsLeft() {
        return 0;
    }

    public int getBoundsRight() {
        return getWidth();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void invalidate() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        super.invalidate();
    }

    public final void o() {
        this.a = false;
        ef0 ef0Var = this.b;
        if (ef0Var != null) {
            removeCallbacks(ef0Var);
        }
        o1 o1Var = this.d;
        if (o1Var != null) {
            removeCallbacks(o1Var);
        }
    }

    public void q() {
        super.invalidate();
    }

    public boolean r() {
        return true;
    }

    public final void w() {
        if (this.a) {
            return;
        }
        this.a = true;
        o1 o1Var = this.d;
        if (o1Var == null) {
            o1Var = new o1(this, (byte) 7);
            this.d = o1Var;
        }
        postDelayed(o1Var, ViewConfiguration.getTapTimeout());
    }
}
