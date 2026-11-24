package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
public final class s76 implements View.OnTouchListener {
    public static final int H = ViewConfiguration.getTapTimeout();
    public boolean E;
    public boolean F;
    public final os3 G;
    public final n80 a;
    public final AccelerateInterpolator b;
    public final os3 c;
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

    public s76(os3 os3Var) {
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
        this.c = os3Var;
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
        this.G = os3Var;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s76.a(float, float, float, int):float");
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
        n80 n80Var = this.a;
        int i = (int) (currentAnimationTimeMillis - n80Var.d);
        short s2 = n80Var.b;
        if (i > s2) {
            s = s2;
        } else if (i >= 0) {
            s = i;
        }
        n80Var.h = s;
        n80Var.g = n80Var.a(currentAnimationTimeMillis);
        n80Var.f = currentAnimationTimeMillis;
    }

    public final boolean e() {
        os3 os3Var;
        int count;
        float f = this.a.c;
        int abs = (int) (f / Math.abs(f));
        if (abs != 0 && (count = (os3Var = this.G).getCount()) != 0) {
            int childCount = os3Var.getChildCount();
            int firstVisiblePosition = os3Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && os3Var.getChildAt(0).getTop() >= 0)) : !(i >= count && os3Var.getChildAt(childCount - 1).getBottom() <= os3Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s76.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
