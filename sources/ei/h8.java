package ei;

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
import org.telegram.messenger.hs;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.xq;
public class h8 extends NestedScrollView implements e60 {
    public final org.telegram.ui.Cells.r9 f10373a0;
    public final q1.g f10374b0;
    public final g8 f10375c0;
    public boolean f10376d0;
    public float f10377e0;
    public float f10378f0;
    public float f10379g0;
    public float f10380h0;
    public float f10381i0;
    public float f10382j0;
    public float f10383k0;
    public final OverScroller f10384l0;
    public boolean m0;
    public int f10385n0;
    public int f10386o0;
    public int f10387p0;
    public int f10388q0;
    public int f10389r0;
    public final FrameLayout f10390s0;
    public boolean f10391t0;
    public boolean f10392u0;
    public int f10393v0;
    public boolean f10394w0;
    public boolean f10395x0;

    public h8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f10389r0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10390s0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        hs.i(this);
        g8 g8Var = new g8(this, getContext());
        this.f10375c0 = g8Var;
        org.telegram.ui.Cells.r9 r9Var = new org.telegram.ui.Cells.r9(g8Var, e6Var);
        this.f10373a0 = r9Var;
        r9Var.f30672h0 = false;
        frameLayout.addView(g8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        q1.g gVar = new q1.g((Object) g8Var, (q1.e) q1.g.f53637p, 0.0f);
        this.f10374b0 = gVar;
        gVar.f53653m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new a8(0, this));
        gVar.f53653m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f10384l0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f10384l0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i3, int i10) {
        if (i10 == 0) {
            this.f10374b0.d();
            this.f10376d0 = true;
            this.f10377e0 = this.f10375c0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i3) {
        OverScroller overScroller;
        if (this.f10376d0 && i3 == 0) {
            this.f10376d0 = false;
            if (this.f10377e0 != 0.0f && (overScroller = this.f10384l0) != null && overScroller.isFinished()) {
                K(this.f10379g0);
            }
        }
    }

    public final void D() {
        if (!this.f10394w0) {
            return;
        }
        this.f10394w0 = false;
        float f10 = this.f10375c0.f10347x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40452f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f10394w0 && !z10) {
            return;
        }
        this.f10394w0 = true;
        float f10 = this.f10375c0.f10347x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(xq.f40452f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f10394w0 = false;
        g8 g8Var = this.f10375c0;
        g8Var.f10347x = 0.0f;
        g8Var.invalidate();
    }

    public final void K(float f10) {
        q1.g gVar = this.f10374b0;
        if (!gVar.f53647f) {
            gVar.f53643a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.h8.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f10376d0 && this.f10377e0 != 0.0f && (overScroller = this.f10384l0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i3, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f10376d0 || (((this.f10377e0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f10377e0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f10377e0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f10377e0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f10377e0 = f12;
            iArr[1] = i10;
        }
        this.f10375c0.setTranslationY(this.f10377e0);
        this.f10373a0.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f10392u0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i3 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f10393v0 + i3);
        canvas.clipRect(0, scrollY, width, i3);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(int i3, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f10377e0) / this.f10390s0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.f10376d0;
                g8 g8Var = this.f10375c0;
                if (!z10) {
                    if (!this.f10374b0.f53647f) {
                        OverScroller overScroller = this.f10384l0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f22608q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f10378f0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f10377e0 - round;
                            this.f10377e0 = f13;
                            g8Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f10377e0 - round;
                    this.f10377e0 = f14;
                    g8Var.setTranslationY(f14);
                }
            }
        }
        this.f10373a0.w();
    }

    @Override
    public final void g(RectF rectF) {
        f8 f8Var;
        g8 g8Var = this.f10375c0;
        f8[] f8VarArr = g8Var.f10344r;
        if (f8VarArr != null && (f8Var = f8VarArr[0]) != null && f8Var.f10286p != null) {
            int i3 = g8Var.G;
            int i10 = f8Var.f10283m;
            int i11 = f8Var.f10282l;
            int i12 = g8Var.G;
            f8 f8Var2 = g8Var.f10344r[0];
            rectF.set(g8Var.F, (org.telegram.messenger.g0.W1(g8Var.f10347x, i10, i11) + i3) - g8Var.f10344r[0].f10286p.b(), getWidth() - g8Var.F, org.telegram.messenger.g0.W1(g8Var.f10347x, f8Var2.f10283m, f8Var2.f10282l) + i12);
            float x10 = g8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f10390s0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (g8Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f10390s0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i3 = this.f10389r0;
        if (i3 >= 0) {
            return i3 - ((ViewGroup.MarginLayoutParams) this.f10390s0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f10375c0.getTranslationY()) / Math.min(this.f10388q0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f10375c0.getTranslationY() + this.f10390s0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        f8 f8Var;
        g8 g8Var = this.f10375c0;
        f8[] f8VarArr = g8Var.f10344r;
        f8[] f8VarArr2 = g8Var.f10344r;
        if (f8VarArr != null && (f8Var = f8VarArr[0]) != null && f8Var.f10286p != null) {
            canvas.save();
            float x10 = g8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f10390s0;
            float x11 = frameLayout.getX() + x10 + g8Var.F;
            float y9 = frameLayout.getY() + (g8Var.getY() - getScrollY()) + g8Var.G;
            f8 f8Var2 = f8VarArr2[0];
            canvas.translate(x11, (y9 + org.telegram.messenger.g0.W1(g8Var.f10347x, f8Var2.f10283m, f8Var2.f10282l)) - f8VarArr2[0].f10286p.b());
            c8 c8Var = f8VarArr2[0].f10286p;
            int width = getWidth();
            int i3 = g8Var.F;
            c8Var.a(canvas, (width - i3) - i3);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void i(int i3) {
        super.i(i3);
        this.f10378f0 = Math.signum(i3);
        this.f10379g0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.f10373a0.w();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ei.h8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        L(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        super.onMeasure(i3, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ei.h8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i3, int i10) {
        super.scrollBy(i3, i10);
        invalidate();
    }

    public void F(org.telegram.ui.Components.p5 p5Var) {
    }

    public void I(c8 c8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, z5 z5Var) {
    }
}
