package fi;

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
import org.telegram.messenger.ns;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l60;
public class a8 extends NestedScrollView implements l60 {
    public final org.telegram.ui.Cells.r9 f11418a0;
    public final r1.g f11419b0;
    public final z7 f11420c0;
    public boolean f11421d0;
    public float f11422e0;
    public float f11423f0;
    public float f11424g0;
    public float f11425h0;
    public float f11426i0;
    public float f11427j0;
    public float f11428k0;
    public final OverScroller f11429l0;
    public boolean m0;
    public int f11430n0;
    public int f11431o0;
    public int f11432p0;
    public int f11433q0;
    public int f11434r0;
    public final FrameLayout f11435s0;
    public boolean f11436t0;
    public boolean f11437u0;
    public int f11438v0;
    public boolean f11439w0;
    public boolean f11440x0;

    public a8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f11434r0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11435s0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        ns.i(this);
        z7 z7Var = new z7(this, getContext());
        this.f11420c0 = z7Var;
        org.telegram.ui.Cells.r9 r9Var = new org.telegram.ui.Cells.r9(z7Var, e6Var);
        this.f11418a0 = r9Var;
        r9Var.f31748h0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) z7Var, (r1.e) r1.g.f55732p, 0.0f);
        this.f11419b0 = gVar;
        gVar.f55748m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new t7(0, this));
        gVar.f55748m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f11429l0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f11429l0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f11419b0.d();
            this.f11421d0 = true;
            this.f11422e0 = this.f11420c0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f11421d0 && i7 == 0) {
            this.f11421d0 = false;
            if (this.f11422e0 != 0.0f && (overScroller = this.f11429l0) != null && overScroller.isFinished()) {
                K(this.f11424g0);
            }
        }
    }

    public final void D() {
        if (!this.f11439w0) {
            return;
        }
        this.f11439w0 = false;
        float f10 = this.f11420c0.f12603x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new s7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(er.f34419f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f11439w0 && !z10) {
            return;
        }
        this.f11439w0 = true;
        float f10 = this.f11420c0.f12603x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new s7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(er.f34419f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f11439w0 = false;
        z7 z7Var = this.f11420c0;
        z7Var.f12603x = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f11419b0;
        if (!gVar.f55742f) {
            gVar.f55738a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.a8.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f11421d0 && this.f11422e0 != 0.0f && (overScroller = this.f11429l0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f11421d0 || (((this.f11422e0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f11422e0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f11422e0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f11422e0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f11422e0 = f12;
            iArr[1] = i10;
        }
        this.f11420c0.setTranslationY(this.f11422e0);
        this.f11418a0.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f11437u0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f11438v0 + i7);
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
            int round = Math.round((1.0f - Math.abs((-this.f11422e0) / this.f11435s0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.f11421d0;
                z7 z7Var = this.f11420c0;
                if (!z10) {
                    if (!this.f11419b0.f55742f) {
                        OverScroller overScroller = this.f11429l0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f23611q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f11423f0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f11422e0 - round;
                            this.f11422e0 = f13;
                            z7Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f11422e0 - round;
                    this.f11422e0 = f14;
                    z7Var.setTranslationY(f14);
                }
            }
        }
        this.f11418a0.w();
    }

    @Override
    public final void f(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.f11420c0;
        y7[] y7VarArr = z7Var.f12600r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f12564p != null) {
            int i7 = z7Var.G;
            int i10 = y7Var.f12561m;
            int i11 = y7Var.f12560l;
            int i12 = z7Var.G;
            y7 y7Var2 = z7Var.f12600r[0];
            rectF.set(z7Var.F, (org.telegram.messenger.g0.W1(z7Var.f12603x, i10, i11) + i7) - z7Var.f12600r[0].f12564p.b(), getWidth() - z7Var.F, org.telegram.messenger.g0.W1(z7Var.f12603x, y7Var2.f12561m, y7Var2.f12560l) + i12);
            float x10 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f11435s0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (z7Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f11435s0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f11434r0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f11435s0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f11420c0.getTranslationY()) / Math.min(this.f11433q0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f11420c0.getTranslationY() + this.f11435s0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        y7 y7Var;
        z7 z7Var = this.f11420c0;
        y7[] y7VarArr = z7Var.f12600r;
        y7[] y7VarArr2 = z7Var.f12600r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f12564p != null) {
            canvas.save();
            float x10 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f11435s0;
            float x11 = frameLayout.getX() + x10 + z7Var.F;
            float y10 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.G;
            y7 y7Var2 = y7VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(z7Var.f12603x, y7Var2.f12561m, y7Var2.f12560l)) - y7VarArr2[0].f12564p.b());
            v7 v7Var = y7VarArr2[0].f12564p;
            int width = getWidth();
            int i7 = z7Var.F;
            v7Var.a(canvas, (width - i7) - i7);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void i(int i7) {
        super.i(i7);
        this.f11423f0 = Math.signum(i7);
        this.f11424g0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.f11418a0.w();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: fi.a8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        L(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: fi.a8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        super.scrollBy(i7, i10);
        invalidate();
    }

    public void F(org.telegram.ui.Components.p5 p5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, c1 c1Var) {
    }
}
