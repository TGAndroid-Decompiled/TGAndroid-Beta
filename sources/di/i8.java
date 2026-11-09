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
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.xq;
public class i8 extends NestedScrollView implements k60 {
    public final org.telegram.ui.Cells.s9 W;
    public final r1.g f9124a0;
    public final h8 f9125b0;
    public boolean f9126c0;
    public float f9127d0;
    public float f9128e0;
    public float f9129f0;
    public float f9130g0;
    public float f9131h0;
    public float f9132i0;
    public float f9133j0;
    public final OverScroller f9134k0;
    public boolean f9135l0;
    public int m0;
    public int f9136n0;
    public int f9137o0;
    public int f9138p0;
    public int f9139q0;
    public final FrameLayout f9140r0;
    public boolean f9141s0;
    public boolean f9142t0;
    public int f9143u0;
    public boolean f9144v0;
    public boolean f9145w0;

    public i8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9139q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9140r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        qs.i(this);
        h8 h8Var = new h8(this, getContext());
        this.f9125b0 = h8Var;
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9(h8Var, g6Var);
        this.W = s9Var;
        s9Var.f30665h0 = false;
        frameLayout.addView(h8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) h8Var, (r1.e) r1.g.f54264p, 0.0f);
        this.f9124a0 = gVar;
        gVar.f54280m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new a8(0, this));
        gVar.f54280m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f9134k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f9134k0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f9124a0.d();
            this.f9126c0 = true;
            this.f9127d0 = this.f9125b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f9126c0 && i7 == 0) {
            this.f9126c0 = false;
            if (this.f9127d0 != 0.0f && (overScroller = this.f9134k0) != null && overScroller.isFinished()) {
                K(this.f9129f0);
            }
        }
    }

    public final void D() {
        if (!this.f9144v0) {
            return;
        }
        this.f9144v0 = false;
        float f10 = this.f9125b0.f9086x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40458f);
        ofFloat.start();
    }

    public final void E(boolean z9) {
        if (this.f9144v0 && !z9) {
            return;
        }
        this.f9144v0 = true;
        float f10 = this.f9125b0.f9086x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40458f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f9144v0 = false;
        h8 h8Var = this.f9125b0;
        h8Var.f9086x = 0.0f;
        h8Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f9124a0;
        if (!gVar.f54274f) {
            gVar.f54270a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.i8.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f9126c0 && this.f9127d0 != 0.0f && (overScroller = this.f9134k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f9126c0 || (((this.f9127d0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f9127d0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f9127d0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f9127d0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f9127d0 = f12;
            iArr[1] = i10;
        }
        this.f9125b0.setTranslationY(this.f9127d0);
        this.W.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f9142t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f9143u0 + i7);
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
            int round = Math.round((1.0f - Math.abs((-this.f9127d0) / this.f9140r0.getTop())) * i12);
            if (round != 0) {
                boolean z9 = this.f9126c0;
                h8 h8Var = this.f9125b0;
                if (!z9) {
                    if (!this.f9124a0.f54274f) {
                        OverScroller overScroller = this.f9134k0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22563q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f9128e0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f9127d0 - round;
                            this.f9127d0 = f13;
                            h8Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f9127d0 - round;
                    this.f9127d0 = f14;
                    h8Var.setTranslationY(f14);
                }
            }
        }
        this.W.w();
    }

    @Override
    public final void g(RectF rectF) {
        g8 g8Var;
        h8 h8Var = this.f9125b0;
        g8[] g8VarArr = h8Var.f9083r;
        if (g8VarArr != null && (g8Var = g8VarArr[0]) != null && g8Var.f9049p != null) {
            int i7 = h8Var.F;
            int i10 = g8Var.f9046m;
            int i11 = g8Var.f9045l;
            int i12 = h8Var.F;
            g8 g8Var2 = h8Var.f9083r[0];
            rectF.set(h8Var.E, (org.telegram.messenger.g0.W1(h8Var.f9086x, i10, i11) + i7) - h8Var.f9083r[0].f9049p.b(), getWidth() - h8Var.E, org.telegram.messenger.g0.W1(h8Var.f9086x, g8Var2.f9046m, g8Var2.f9045l) + i12);
            float x10 = h8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9140r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (h8Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f9140r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f9139q0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f9140r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f9125b0.getTranslationY()) / Math.min(this.f9138p0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f9125b0.getTranslationY() + this.f9140r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        g8 g8Var;
        h8 h8Var = this.f9125b0;
        g8[] g8VarArr = h8Var.f9083r;
        g8[] g8VarArr2 = h8Var.f9083r;
        if (g8VarArr != null && (g8Var = g8VarArr[0]) != null && g8Var.f9049p != null) {
            canvas.save();
            float x10 = h8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9140r0;
            float x11 = frameLayout.getX() + x10 + h8Var.E;
            float y10 = frameLayout.getY() + (h8Var.getY() - getScrollY()) + h8Var.F;
            g8 g8Var2 = g8VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(h8Var.f9086x, g8Var2.f9046m, g8Var2.f9045l)) - g8VarArr2[0].f9049p.b());
            c8 c8Var = g8VarArr2[0].f9049p;
            int width = getWidth();
            int i7 = h8Var.E;
            c8Var.a(canvas, (width - i7) - i7);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void i(int i7) {
        super.i(i7);
        this.f9128e0 = Math.signum(i7);
        this.f9129f0 = 0.0f;
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
        throw new UnsupportedOperationException("Method not decompiled: di.i8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        L(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: di.i8.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void H(URLSpan uRLSpan, View view, f8 f8Var) {
    }
}
