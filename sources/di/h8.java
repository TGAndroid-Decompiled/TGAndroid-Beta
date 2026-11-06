package di;

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
import org.telegram.messenger.qs;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.xq;
public class h8 extends NestedScrollView implements j60 {
    public final org.telegram.ui.Cells.s9 W;
    public final r1.g f9094a0;
    public final g8 f9095b0;
    public boolean f9096c0;
    public float f9097d0;
    public float f9098e0;
    public float f9099f0;
    public float f9100g0;
    public float f9101h0;
    public float f9102i0;
    public float f9103j0;
    public final OverScroller f9104k0;
    public boolean f9105l0;
    public int m0;
    public int f9106n0;
    public int f9107o0;
    public int f9108p0;
    public int f9109q0;
    public final FrameLayout f9110r0;
    public boolean f9111s0;
    public boolean f9112t0;
    public int f9113u0;
    public boolean f9114v0;
    public boolean f9115w0;

    public h8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9109q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9110r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        qs.i(this);
        g8 g8Var = new g8(this, getContext());
        this.f9095b0 = g8Var;
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9(g8Var, f6Var);
        this.W = s9Var;
        s9Var.f30657h0 = false;
        frameLayout.addView(g8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) g8Var, (r1.e) r1.g.f54158p, 0.0f);
        this.f9094a0 = gVar;
        gVar.f54174m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new a8(0, this));
        gVar.f54174m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f9104k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f9104k0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f9094a0.d();
            this.f9096c0 = true;
            this.f9097d0 = this.f9095b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f9096c0 && i7 == 0) {
            this.f9096c0 = false;
            if (this.f9097d0 != 0.0f && (overScroller = this.f9104k0) != null && overScroller.isFinished()) {
                K(this.f9099f0);
            }
        }
    }

    public final void D() {
        if (!this.f9114v0) {
            return;
        }
        this.f9114v0 = false;
        float f10 = this.f9095b0.f9060x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40345f);
        ofFloat.start();
    }

    public final void E(boolean z9) {
        if (this.f9114v0 && !z9) {
            return;
        }
        this.f9114v0 = true;
        float f10 = this.f9095b0.f9060x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40345f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f9114v0 = false;
        g8 g8Var = this.f9095b0;
        g8Var.f9060x = 0.0f;
        g8Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f9094a0;
        if (!gVar.f54168f) {
            gVar.f54164a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f9096c0 && this.f9097d0 != 0.0f && (overScroller = this.f9104k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f9096c0 || (((this.f9097d0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f9097d0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f9097d0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f9097d0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f9097d0 = f12;
            iArr[1] = i10;
        }
        this.f9095b0.setTranslationY(this.f9097d0);
        this.W.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f9112t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f9113u0 + i7);
        canvas.clipRect(0, scrollY, width, i7);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(int i7, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f9097d0) / this.f9110r0.getTop())) * i12);
            if (round != 0) {
                boolean z9 = this.f9096c0;
                g8 g8Var = this.f9095b0;
                if (!z9) {
                    if (!this.f9094a0.f54168f) {
                        OverScroller overScroller = this.f9104k0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22544q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f9098e0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f9097d0 - round;
                            this.f9097d0 = f13;
                            g8Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f9097d0 - round;
                    this.f9097d0 = f14;
                    g8Var.setTranslationY(f14);
                }
            }
        }
        this.W.w();
    }

    @Override
    public final void g(RectF rectF) {
        f8 f8Var;
        g8 g8Var = this.f9095b0;
        f8[] f8VarArr = g8Var.f9057r;
        if (f8VarArr != null && (f8Var = f8VarArr[0]) != null && f8Var.f9016p != null) {
            int i7 = g8Var.F;
            int i10 = f8Var.f9013m;
            int i11 = f8Var.f9012l;
            int i12 = g8Var.F;
            f8 f8Var2 = g8Var.f9057r[0];
            rectF.set(g8Var.E, (org.telegram.messenger.g0.W1(g8Var.f9060x, i10, i11) + i7) - g8Var.f9057r[0].f9016p.b(), getWidth() - g8Var.E, org.telegram.messenger.g0.W1(g8Var.f9060x, f8Var2.f9013m, f8Var2.f9012l) + i12);
            float x10 = g8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9110r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (g8Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f9110r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f9109q0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f9110r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f9095b0.getTranslationY()) / Math.min(this.f9108p0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f9095b0.getTranslationY() + this.f9110r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        f8 f8Var;
        g8 g8Var = this.f9095b0;
        f8[] f8VarArr = g8Var.f9057r;
        f8[] f8VarArr2 = g8Var.f9057r;
        if (f8VarArr != null && (f8Var = f8VarArr[0]) != null && f8Var.f9016p != null) {
            canvas.save();
            float x10 = g8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9110r0;
            float x11 = frameLayout.getX() + x10 + g8Var.E;
            float y10 = frameLayout.getY() + (g8Var.getY() - getScrollY()) + g8Var.F;
            f8 f8Var2 = f8VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(g8Var.f9060x, f8Var2.f9013m, f8Var2.f9012l)) - f8VarArr2[0].f9016p.b());
            c8 c8Var = f8VarArr2[0].f9016p;
            int width = getWidth();
            int i7 = g8Var.E;
            c8Var.a(canvas, (width - i7) - i7);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void i(int i7) {
        super.i(i7);
        this.f9098e0 = Math.signum(i7);
        this.f9099f0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.w();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        L(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: di.h8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        super.scrollBy(i7, i10);
        invalidate();
    }

    public void F(org.telegram.ui.Components.r5 r5Var) {
    }

    public void I(c8 c8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, s7 s7Var) {
    }
}
