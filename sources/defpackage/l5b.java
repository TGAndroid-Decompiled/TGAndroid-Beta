package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import org.telegram.messenger.Utilities;
public class l5b extends NestedScrollView implements au5 {
    public final pkb W;
    public final zna a0;
    public final k5b b0;
    public boolean c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public final OverScroller k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final FrameLayout r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public boolean w0;

    public l5b(Context context, r63 r63Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, on2.p(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        nm7.i(this);
        k5b k5bVar = new k5b(this, getContext());
        this.b0 = k5bVar;
        pkb pkbVar = new pkb(k5bVar, r63Var);
        this.W = pkbVar;
        pkbVar.h0 = false;
        frameLayout.addView(k5bVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(gm.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        zna znaVar = new zna((Object) k5bVar, (vk4) zna.p, 0.0f);
        this.a0 = znaVar;
        znaVar.m.b(100.0f);
        znaVar.f(1.0f);
        znaVar.b(new h20(this, (byte) 17));
        znaVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.k0 = null;
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean A(int i, int i2) {
        if (i2 == 0) {
            this.a0.d();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i) {
        OverScroller overScroller;
        if (this.c0 && i == 0) {
            this.c0 = false;
            if (this.d0 != 0.0f && (overScroller = this.k0) != null && overScroller.isFinished()) {
                K(this.f0);
            }
        }
    }

    public final void D() {
        if (!this.v0) {
            return;
        }
        this.v0 = false;
        float f = this.b0.x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new e5b(this, getScrollY(), f, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(d53.f);
        ofFloat.start();
    }

    public final void E(boolean z) {
        if (this.v0 && !z) {
            return;
        }
        this.v0 = true;
        float f = this.b0.x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new e5b(this, getScrollY(), f, (byte) 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(d53.f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        k5b k5bVar = this.b0;
        k5bVar.x = 0.0f;
        k5bVar.invalidate();
    }

    public final void K(float f) {
        zna znaVar = this.a0;
        if (!znaVar.f) {
            znaVar.a = f;
            znaVar.h();
        }
        if (getScrollY() < gm.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5b.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.c0 && this.d0 != 0.0f && (overScroller = this.k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f = this.d0;
            float f2 = 0.0f;
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if ((i4 > 0 && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f3 = i2;
                float f4 = f - f3;
                if (i4 > 0) {
                    if (f4 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f3 + f4 + 0.0f);
                    } else {
                        this.d0 = f4;
                        iArr[1] = i2;
                        f2 = f4;
                    }
                } else if (f4 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f3 + f4 + 0.0f);
                } else {
                    this.d0 = f4;
                    iArr[1] = i2;
                    f2 = f4;
                }
                this.b0.setTranslationY(f2);
                this.W.v();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(RectF rectF) {
        j5b j5bVar;
        k5b k5bVar = this.b0;
        j5b[] j5bVarArr = k5bVar.r;
        if (j5bVarArr != null && (j5bVar = j5bVarArr[0]) != null && j5bVar.p != null) {
            int i = k5bVar.G;
            int i2 = j5bVar.m;
            int i3 = j5bVar.l;
            int i4 = k5bVar.G;
            j5b j5bVar2 = k5bVar.r[0];
            rectF.set(k5bVar.F, (gm.U1(k5bVar.x, i2, i3) + i) - k5bVar.r[0].p.b(), getWidth() - k5bVar.F, gm.U1(k5bVar.x, j5bVar2.m, j5bVar2.l) + i4);
            float x = k5bVar.getX() - getScrollX();
            FrameLayout frameLayout = this.r0;
            rectF.offset(frameLayout.getX() + x, frameLayout.getY() + (k5bVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        float f;
        float f2;
        float f3;
        if (i4 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i4);
            if (round != 0) {
                boolean z = this.c0;
                k5b k5bVar = this.b0;
                if (!z) {
                    if (!this.a0.f) {
                        OverScroller overScroller = this.k0;
                        if (overScroller != null) {
                            f = overScroller.getCurrVelocity();
                        } else {
                            f = Float.NaN;
                        }
                        if (!Float.isNaN(f)) {
                            Point point = gm.q;
                            if (point.x > point.y) {
                                f3 = 3000.0f;
                            } else {
                                f3 = 5000.0f;
                            }
                            float min = Math.min(f3, f);
                            round = (int) ((round * min) / f);
                            f2 = min * (-this.e0);
                        } else {
                            f2 = 0.0f;
                        }
                        if (round != 0) {
                            float f4 = this.d0 - round;
                            this.d0 = f4;
                            k5bVar.setTranslationY(f4);
                        }
                        K(f2);
                    }
                } else {
                    float f5 = this.d0 - round;
                    this.d0 = f5;
                    k5bVar.setTranslationY(f5);
                }
            }
        }
        this.W.v();
    }

    @Override
    public final void g(Canvas canvas, float f) {
        j5b j5bVar;
        k5b k5bVar = this.b0;
        j5b[] j5bVarArr = k5bVar.r;
        j5b[] j5bVarArr2 = k5bVar.r;
        if (j5bVarArr != null && (j5bVar = j5bVarArr[0]) != null && j5bVar.p != null) {
            canvas.save();
            float x = k5bVar.getX() - getScrollX();
            FrameLayout frameLayout = this.r0;
            float x2 = frameLayout.getX() + x + k5bVar.F;
            float y = frameLayout.getY() + (k5bVar.getY() - getScrollY()) + k5bVar.G;
            j5b j5bVar2 = j5bVarArr2[0];
            canvas.translate(x2, (y + gm.U1(k5bVar.x, j5bVar2.m, j5bVar2.l)) - j5bVarArr2[0].p.b());
            g5b g5bVar = j5bVarArr2[0].p;
            int width = getWidth();
            int i = k5bVar.F;
            g5bVar.a(canvas, (width - i) - i);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i = this.q0;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, gm.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i) {
        super.i(i);
        this.e0 = Math.signum(i);
        this.f0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.v();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        L(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override
    public void setScrimHidden(boolean z) {
        td4.a(this, z);
    }

    public void F(gn gnVar) {
    }

    public void I(g5b g5bVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, nsa nsaVar) {
    }
}
