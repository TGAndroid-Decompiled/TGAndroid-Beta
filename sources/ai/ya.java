package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.o80;
public class ya extends NestedScrollView implements o80 {
    public final org.telegram.ui.Cells.y9 W;
    public final o1.k f1968a0;
    public final xa f1969b0;
    public boolean f1970c0;
    public float f1971d0;
    public float f1972e0;
    public float f1973f0;
    public float f1974g0;
    public float f1975h0;
    public float f1976i0;
    public float f1977j0;
    public final OverScroller f1978k0;
    public boolean f1979l0;
    public int m0;
    public int f1980n0;
    public int f1981o0;
    public int f1982p0;
    public int f1983q0;
    public final FrameLayout f1984r0;
    public boolean f1985s0;
    public boolean f1986t0;
    public int f1987u0;
    public boolean f1988v0;
    public boolean f1989w0;

    public ya(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f1983q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1984r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        xa xaVar = new xa(this, getContext());
        this.f1969b0 = xaVar;
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(xaVar, e6Var);
        this.W = y9Var;
        y9Var.f21865h0 = false;
        frameLayout.addView(xaVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(xaVar, o1.h.f16920n, 0.0f);
        this.f1968a0 = kVar;
        kVar.f16938u.b(100.0f);
        kVar.e(1.0f);
        kVar.b(new ra(0, this));
        kVar.f16938u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f1978k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f1978k0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f1970c0 && i10 == 0) {
            this.f1970c0 = false;
            if (this.f1971d0 != 0.0f && (overScroller = this.f1978k0) != null && overScroller.isFinished()) {
                K(this.f1973f0);
            }
        }
    }

    public final void C() {
        if (!this.f1988v0) {
            return;
        }
        this.f1988v0 = false;
        float f7 = this.f1969b0.f1925w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qa(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(hs.f27118f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f1988v0 && !z10) {
            return;
        }
        this.f1988v0 = true;
        float f7 = this.f1969b0.f1925w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qa(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(hs.f27118f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f1988v0 = false;
        xa xaVar = this.f1969b0;
        xaVar.f1925w = 0.0f;
        xaVar.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f1968a0;
        if (!kVar.f16931f) {
            kVar.f16927a = f7;
            kVar.h();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ya.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        wa waVar;
        xa xaVar = this.f1969b0;
        wa[] waVarArr = xaVar.f1923r;
        if (waVarArr != null && (waVar = waVarArr[0]) != null && waVar.f1881p != null) {
            int i10 = xaVar.F;
            int i11 = xaVar.F;
            wa waVar2 = xaVar.f1923r[0];
            rectF.set(xaVar.E, (AndroidUtilities.lerp(waVar.f1878m, waVar.f1877l, xaVar.f1925w) + i10) - xaVar.f1923r[0].f1881p.b(), getWidth() - xaVar.E, AndroidUtilities.lerp(waVar2.f1878m, waVar2.f1877l, xaVar.f1925w) + i11);
            float x10 = xaVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f1984r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (xaVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        wa waVar;
        xa xaVar = this.f1969b0;
        wa[] waVarArr = xaVar.f1923r;
        wa[] waVarArr2 = xaVar.f1923r;
        if (waVarArr != null && (waVar = waVarArr[0]) != null && waVar.f1881p != null) {
            canvas.save();
            float x10 = xaVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f1984r0;
            float x11 = frameLayout.getX() + x10 + xaVar.E;
            float y3 = frameLayout.getY() + (xaVar.getY() - getScrollY()) + xaVar.F;
            wa waVar2 = waVarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(waVar2.f1878m, waVar2.f1877l, xaVar.f1925w)) - waVarArr2[0].f1881p.b());
            ta taVar = waVarArr2[0].f1881p;
            int width = getWidth();
            int i10 = xaVar.E;
            taVar.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f1970c0 && this.f1971d0 != 0.0f && (overScroller = this.f1978k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f1986t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f1987u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f1970c0 || (((this.f1971d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f1971d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f1971d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f1971d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f1971d0 = f11;
            iArr[1] = i11;
        }
        this.f1969b0.setTranslationY(this.f1971d0);
        this.W.w();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f1984r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f1983q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f1984r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f1969b0.getTranslationY()) / Math.min(this.f1982p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f1969b0.getTranslationY() + this.f1984r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f1971d0) / this.f1984r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f1970c0;
                xa xaVar = this.f1969b0;
                if (!z10) {
                    if (!this.f1968a0.f16931f) {
                        OverScroller overScroller = this.f1978k0;
                        if (overScroller != null) {
                            f7 = overScroller.getCurrVelocity();
                        } else {
                            f7 = Float.NaN;
                        }
                        if (!Float.isNaN(f7)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f7);
                            round = (int) ((round * min) / f7);
                            f10 = min * (-this.f1972e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f1971d0 - round;
                            this.f1971d0 = f12;
                            xaVar.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f1971d0 - round;
                    this.f1971d0 = f13;
                    xaVar.setTranslationY(f13);
                }
            }
        }
        this.W.w();
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
    public final void k(int i10) {
        super.k(i10);
        this.f1972e0 = Math.signum(i10);
        this.f1973f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ya.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.ya.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f1968a0.c();
            this.f1970c0 = true;
            this.f1971d0 = this.f1969b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.b6 b6Var) {
    }

    public void I(ta taVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, a3.d dVar) {
    }
}
