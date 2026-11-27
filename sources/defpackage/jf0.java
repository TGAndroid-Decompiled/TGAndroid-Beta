package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
public abstract class jf0 extends ViewGroup implements tma {
    public boolean a;
    public gf0 b;
    public int c;
    public p1 d;
    public Runnable e;

    public jf0(Context context) {
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

    public static void u(int i, int i2, Drawable drawable) {
        drawable.setBounds(i, i2, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight() + i2);
    }

    public static void w(Drawable drawable, float f, float f2) {
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
        gf0 gf0Var = this.b;
        if (gf0Var != null) {
            removeCallbacks(gf0Var);
        }
        p1 p1Var = this.d;
        if (p1Var != null) {
            removeCallbacks(p1Var);
        }
    }

    public void p() {
        super.invalidate();
    }

    public boolean q() {
        return true;
    }

    public final void x() {
        if (this.a) {
            return;
        }
        this.a = true;
        p1 p1Var = this.d;
        if (p1Var == null) {
            p1Var = new p1(this, (byte) 7);
            this.d = p1Var;
        }
        postDelayed(p1Var, ViewConfiguration.getTapTimeout());
    }
}
