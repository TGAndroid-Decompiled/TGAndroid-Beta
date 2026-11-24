package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
public final class s56 implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final er3 G;
    public final n70 a;
    public final AccelerateInterpolator b;
    public final er3 c;
    public o1 d;
    public final float[] e;
    public final float[] f;
    public final int h;
    public final float[] n;
    public final float[] r;
    public final float[] s;
    public boolean w;
    public boolean x;
    public boolean y;

    public s56(er3 er3Var) {
        ?? obj = new Object();
        obj.d = Long.MIN_VALUE;
        obj.f = -1L;
        obj.e = 0L;
        this.a = obj;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.r = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.s = fArr5;
        this.c = er3Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = H;
        obj.a = (short) 500;
        obj.b = (short) 500;
        this.G = er3Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public final float a(float r4, float r5, float r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s56.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.E) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        short s = 0;
        if (this.x) {
            this.E = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        n70 n70Var = this.a;
        int i = (int) (currentAnimationTimeMillis - n70Var.d);
        short s2 = n70Var.b;
        if (i > s2) {
            s = s2;
        } else if (i >= 0) {
            s = i;
        }
        n70Var.h = s;
        n70Var.g = n70Var.a(currentAnimationTimeMillis);
        n70Var.f = currentAnimationTimeMillis;
    }

    public final boolean e() {
        er3 er3Var;
        int count;
        float f = this.a.c;
        int abs = (int) (f / Math.abs(f));
        if (abs != 0 && (count = (er3Var = this.G).getCount()) != 0) {
            int childCount = er3Var.getChildCount();
            int firstVisiblePosition = er3Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && er3Var.getChildAt(0).getTop() >= 0)) : !(i >= count && er3Var.getChildAt(childCount - 1).getBottom() <= er3Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s56.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
