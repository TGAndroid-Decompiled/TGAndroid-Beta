package bi;

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
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.pr;
public class ea extends NestedScrollView implements m70 {
    public final org.telegram.ui.Cells.aa W;
    public final o1.k f2921a0;
    public final da f2922b0;
    public boolean f2923c0;
    public float f2924d0;
    public float f2925e0;
    public float f2926f0;
    public float f2927g0;
    public float f2928h0;
    public float f2929i0;
    public float f2930j0;
    public final OverScroller f2931k0;
    public boolean f2932l0;
    public int m0;
    public int f2933n0;
    public int f2934o0;
    public int f2935p0;
    public int f2936q0;
    public final FrameLayout f2937r0;
    public boolean f2938s0;
    public boolean f2939t0;
    public int f2940u0;
    public boolean f2941v0;
    public boolean f2942w0;

    public ea(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f2936q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2937r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        da daVar = new da(this, getContext());
        this.f2922b0 = daVar;
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(daVar, f6Var);
        this.W = aaVar;
        aaVar.f21777i0 = false;
        frameLayout.addView(daVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(daVar, o1.h.f16807n, 0.0f);
        this.f2921a0 = kVar;
        kVar.f16825u.b(100.0f);
        kVar.f16821j = 1.0f;
        kVar.b(new x9(0, this));
        kVar.f16825u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f2931k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f2931k0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f2923c0 && i10 == 0) {
            this.f2923c0 = false;
            if (this.f2924d0 != 0.0f && (overScroller = this.f2931k0) != null && overScroller.isFinished()) {
                K(this.f2926f0);
            }
        }
    }

    public final void C() {
        if (!this.f2941v0) {
            return;
        }
        this.f2941v0 = false;
        float f7 = this.f2922b0.f2884w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w9(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(pr.f29466f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f2941v0 && !z10) {
            return;
        }
        this.f2941v0 = true;
        float f7 = this.f2922b0.f2884w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w9(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(pr.f29466f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f2941v0 = false;
        da daVar = this.f2922b0;
        daVar.f2884w = 0.0f;
        daVar.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f2921a0;
        if (!kVar.f16818f) {
            kVar.f16814a = f7;
            kVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        ca caVar;
        da daVar = this.f2922b0;
        ca[] caVarArr = daVar.f2882r;
        if (caVarArr != null && (caVar = caVarArr[0]) != null && caVar.f2837p != null) {
            int i10 = daVar.F;
            int i11 = daVar.F;
            ca caVar2 = daVar.f2882r[0];
            rectF.set(daVar.E, (AndroidUtilities.lerp(caVar.f2834m, caVar.f2833l, daVar.f2884w) + i10) - daVar.f2882r[0].f2837p.b(), getWidth() - daVar.E, AndroidUtilities.lerp(caVar2.f2834m, caVar2.f2833l, daVar.f2884w) + i11);
            float x10 = daVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f2937r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (daVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        ca caVar;
        da daVar = this.f2922b0;
        ca[] caVarArr = daVar.f2882r;
        ca[] caVarArr2 = daVar.f2882r;
        if (caVarArr != null && (caVar = caVarArr[0]) != null && caVar.f2837p != null) {
            canvas.save();
            float x10 = daVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f2937r0;
            float x11 = frameLayout.getX() + x10 + daVar.E;
            float y3 = frameLayout.getY() + (daVar.getY() - getScrollY()) + daVar.F;
            ca caVar2 = caVarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(caVar2.f2834m, caVar2.f2833l, daVar.f2884w)) - caVarArr2[0].f2837p.b());
            z9 z9Var = caVarArr2[0].f2837p;
            int width = getWidth();
            int i10 = daVar.E;
            z9Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f2923c0 && this.f2924d0 != 0.0f && (overScroller = this.f2931k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f2939t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f2940u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f2923c0 || (((this.f2924d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f2924d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f2924d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f2924d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f2924d0 = f11;
            iArr[1] = i11;
        }
        this.f2922b0.setTranslationY(this.f2924d0);
        this.W.x();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f2937r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f2936q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f2937r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f2922b0.getTranslationY()) / Math.min(this.f2935p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f2922b0.getTranslationY() + this.f2937r0.getTop()) - getScrollY();
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
            int round = Math.round((1.0f - Math.abs((-this.f2924d0) / this.f2937r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f2923c0;
                da daVar = this.f2922b0;
                if (!z10) {
                    if (!this.f2921a0.f16818f) {
                        OverScroller overScroller = this.f2931k0;
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
                            f10 = min * (-this.f2925e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f2924d0 - round;
                            this.f2924d0 = f12;
                            daVar.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f2924d0 - round;
                    this.f2924d0 = f13;
                    daVar.setTranslationY(f13);
                }
            }
        }
        this.W.x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.x();
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f2925e0 = Math.signum(i10);
        this.f2926f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ea.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f2921a0.c();
            this.f2923c0 = true;
            this.f2924d0 = this.f2922b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.z5 z5Var) {
    }

    public void I(z9 z9Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, a3.c cVar) {
    }
}
