package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.Arrays;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ProfileActivity;
public final class lo8 extends View implements op8 {
    public final float[] E;
    public boolean F;
    public float G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public final ProfileActivity Q;
    public final int a;
    public final Rect b;
    public final Rect c;
    public final RectF d;
    public final GradientDrawable e;
    public final GradientDrawable f;
    public final ValueAnimator h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final GradientDrawable[] x;
    public final boolean[] y;

    public lo8(org.telegram.ui.ProfileActivity r7, android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo8.<init>(org.telegram.ui.ProfileActivity, android.content.Context):void");
    }

    @Override
    public final void a() {
        Arrays.fill(this.y, false);
        postInvalidateOnAnimation();
    }

    @Override
    public final void b(boolean z) {
        this.y[!z ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override
    public final void c() {
        RectF rectF = ProfileActivity.Z6;
        this.Q.d4(false);
    }

    @Override
    public final void d() {
        invalidate();
    }

    public final void e(boolean z, float f) {
        int i = (int) (255.0f * f);
        this.e.setAlpha(i);
        this.f.setAlpha(i);
        this.r.setAlpha((int) (66.0f * f));
        this.s.setAlpha((int) (85.0f * f));
        this.w.setAlpha(i);
        this.H = f;
        if (!z) {
            this.G = f;
        }
        invalidate();
    }

    public final void f(boolean z, float f) {
        if (z != this.F) {
            this.F = z;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f2 = this.G;
            float[] fArr = this.n;
            float S1 = gl.S1(f2, fArr);
            float f3 = 1.0f;
            if (z) {
                valueAnimator.setDuration(((1.0f - S1) * 250.0f) / f);
            } else {
                valueAnimator.setDuration((250.0f * S1) / f);
            }
            fArr[0] = S1;
            if (!z) {
                f3 = 0.0f;
            }
            fArr[1] = f3;
            valueAnimator.start();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.a;
        Rect rect = this.b;
        rect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.c;
        rect2.set(0, (int) (i2 - (gl.L(72.0f) * 0.5f)), i, i2);
        this.e.setBounds(0, rect.bottom, i, gl.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.Z6;
        this.f.setBounds(0, ((i2 - this.Q.W1()) - gl.L(72.0f)) - gl.L(24.0f), i, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.x;
        int i5 = i / 5;
        gradientDrawableArr[0].setBounds(0, 0, i5, i2);
        gradientDrawableArr[1].setBounds(i - i5, 0, i, i2);
    }
}
