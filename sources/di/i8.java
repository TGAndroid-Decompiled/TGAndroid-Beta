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
import org.telegram.ui.Components.wq;
public class i8 extends NestedScrollView implements j60 {
    public final org.telegram.ui.Cells.s9 W;
    public final r1.g f9129a0;
    public final h8 f9130b0;
    public boolean f9131c0;
    public float f9132d0;
    public float f9133e0;
    public float f9134f0;
    public float f9135g0;
    public float f9136h0;
    public float f9137i0;
    public float f9138j0;
    public final OverScroller f9139k0;
    public boolean f9140l0;
    public int m0;
    public int f9141n0;
    public int f9142o0;
    public int f9143p0;
    public int f9144q0;
    public final FrameLayout f9145r0;
    public boolean f9146s0;
    public boolean f9147t0;
    public int f9148u0;
    public boolean f9149v0;
    public boolean f9150w0;

    public i8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f9144q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9145r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        qs.i(this);
        h8 h8Var = new h8(this, getContext());
        this.f9130b0 = h8Var;
        org.telegram.ui.Cells.s9 s9Var = new org.telegram.ui.Cells.s9(h8Var, h6Var);
        this.W = s9Var;
        s9Var.f30676h0 = false;
        frameLayout.addView(h8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) h8Var, (r1.e) r1.g.f54263p, 0.0f);
        this.f9129a0 = gVar;
        gVar.f54279m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new a8(0, this));
        gVar.f54279m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f9139k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f9139k0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f9129a0.d();
            this.f9131c0 = true;
            this.f9132d0 = this.f9130b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f9131c0 && i7 == 0) {
            this.f9131c0 = false;
            if (this.f9132d0 != 0.0f && (overScroller = this.f9139k0) != null && overScroller.isFinished()) {
                K(this.f9134f0);
            }
        }
    }

    public final void D() {
        if (!this.f9149v0) {
            return;
        }
        this.f9149v0 = false;
        float f10 = this.f9130b0.f9091x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(wq.f40046f);
        ofFloat.start();
    }

    public final void E(boolean z9) {
        if (this.f9149v0 && !z9) {
            return;
        }
        this.f9149v0 = true;
        float f10 = this.f9130b0.f9091x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(wq.f40046f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f9149v0 = false;
        h8 h8Var = this.f9130b0;
        h8Var.f9091x = 0.0f;
        h8Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f9129a0;
        if (!gVar.f54273f) {
            gVar.f54269a = f10;
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
        if (!this.f9131c0 && this.f9132d0 != 0.0f && (overScroller = this.f9139k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f9131c0 || (((this.f9132d0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f9132d0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f9132d0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f9132d0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f9132d0 = f12;
            iArr[1] = i10;
        }
        this.f9130b0.setTranslationY(this.f9132d0);
        this.W.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f9147t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f9148u0 + i7);
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
            int round = Math.round((1.0f - Math.abs((-this.f9132d0) / this.f9145r0.getTop())) * i12);
            if (round != 0) {
                boolean z9 = this.f9131c0;
                h8 h8Var = this.f9130b0;
                if (!z9) {
                    if (!this.f9129a0.f54273f) {
                        OverScroller overScroller = this.f9139k0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22567q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f9133e0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f9132d0 - round;
                            this.f9132d0 = f13;
                            h8Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f9132d0 - round;
                    this.f9132d0 = f14;
                    h8Var.setTranslationY(f14);
                }
            }
        }
        this.W.w();
    }

    @Override
    public final void g(RectF rectF) {
        g8 g8Var;
        h8 h8Var = this.f9130b0;
        g8[] g8VarArr = h8Var.f9088r;
        if (g8VarArr != null && (g8Var = g8VarArr[0]) != null && g8Var.f9054p != null) {
            int i7 = h8Var.F;
            int i10 = g8Var.f9051m;
            int i11 = g8Var.f9050l;
            int i12 = h8Var.F;
            g8 g8Var2 = h8Var.f9088r[0];
            rectF.set(h8Var.E, (org.telegram.messenger.g0.W1(h8Var.f9091x, i10, i11) + i7) - h8Var.f9088r[0].f9054p.b(), getWidth() - h8Var.E, org.telegram.messenger.g0.W1(h8Var.f9091x, g8Var2.f9051m, g8Var2.f9050l) + i12);
            float x10 = h8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9145r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (h8Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f9145r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f9144q0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f9145r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f9130b0.getTranslationY()) / Math.min(this.f9143p0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f9130b0.getTranslationY() + this.f9145r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        g8 g8Var;
        h8 h8Var = this.f9130b0;
        g8[] g8VarArr = h8Var.f9088r;
        g8[] g8VarArr2 = h8Var.f9088r;
        if (g8VarArr != null && (g8Var = g8VarArr[0]) != null && g8Var.f9054p != null) {
            canvas.save();
            float x10 = h8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f9145r0;
            float x11 = frameLayout.getX() + x10 + h8Var.E;
            float y10 = frameLayout.getY() + (h8Var.getY() - getScrollY()) + h8Var.F;
            g8 g8Var2 = g8VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(h8Var.f9091x, g8Var2.f9051m, g8Var2.f9050l)) - g8VarArr2[0].f9054p.b());
            c8 c8Var = g8VarArr2[0].f9054p;
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
        this.f9133e0 = Math.signum(i7);
        this.f9134f0 = 0.0f;
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

    public void F(org.telegram.ui.Components.q5 q5Var) {
    }

    public void I(c8 c8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, f8 f8Var) {
    }
}
