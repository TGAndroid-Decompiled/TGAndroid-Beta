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
import org.telegram.messenger.ls;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z60;
public class x7 extends NestedScrollView implements z60 {
    public final t9 f12730a0;
    public final r1.g f12731b0;
    public final w7 f12732c0;
    public boolean f12733d0;
    public float f12734e0;
    public float f12735f0;
    public float f12736g0;
    public float f12737h0;
    public float f12738i0;
    public float f12739j0;
    public float f12740k0;
    public final OverScroller f12741l0;
    public boolean m0;
    public int f12742n0;
    public int f12743o0;
    public int f12744p0;
    public int f12745q0;
    public int f12746r0;
    public final FrameLayout f12747s0;
    public boolean f12748t0;
    public boolean f12749u0;
    public int f12750v0;
    public boolean f12751w0;
    public boolean f12752x0;

    public x7(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f12746r0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12747s0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        ls.i(this);
        w7 w7Var = new w7(this, getContext());
        this.f12732c0 = w7Var;
        t9 t9Var = new t9(w7Var, h6Var);
        this.f12730a0 = t9Var;
        t9Var.f32247h0 = false;
        frameLayout.addView(w7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) w7Var, (r1.e) r1.g.f56317p, 0.0f);
        this.f12731b0 = gVar;
        gVar.f56333m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new q7(0, this));
        gVar.f56333m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f12741l0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f12741l0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f12731b0.d();
            this.f12733d0 = true;
            this.f12734e0 = this.f12732c0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f12733d0 && i7 == 0) {
            this.f12733d0 = false;
            if (this.f12734e0 != 0.0f && (overScroller = this.f12741l0) != null && overScroller.isFinished()) {
                K(this.f12736g0);
            }
        }
    }

    public final void D() {
        if (!this.f12751w0) {
            return;
        }
        this.f12751w0 = false;
        float f10 = this.f12732c0.f12704x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new p7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(nr.f37917f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f12751w0 && !z10) {
            return;
        }
        this.f12751w0 = true;
        float f10 = this.f12732c0.f12704x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new p7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(nr.f37917f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f12751w0 = false;
        w7 w7Var = this.f12732c0;
        w7Var.f12704x = 0.0f;
        w7Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f12731b0;
        if (!gVar.f56327f) {
            gVar.f56323a = f10;
            gVar.h();
        }
        if (getScrollY() < org.telegram.messenger.g0.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.x7.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f12733d0 && this.f12734e0 != 0.0f && (overScroller = this.f12741l0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f12733d0 || (((this.f12734e0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f12734e0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f12734e0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f12734e0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f12734e0 = f12;
            iArr[1] = i10;
        }
        this.f12732c0.setTranslationY(this.f12734e0);
        this.f12730a0.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f12749u0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f12750v0 + i7);
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
            int round = Math.round((1.0f - Math.abs((-this.f12734e0) / this.f12747s0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.f12733d0;
                w7 w7Var = this.f12732c0;
                if (!z10) {
                    if (!this.f12731b0.f56327f) {
                        OverScroller overScroller = this.f12741l0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f24010q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f12735f0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f12734e0 - round;
                            this.f12734e0 = f13;
                            w7Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f12734e0 - round;
                    this.f12734e0 = f14;
                    w7Var.setTranslationY(f14);
                }
            }
        }
        this.f12730a0.w();
    }

    @Override
    public final void f(RectF rectF) {
        v7 v7Var;
        w7 w7Var = this.f12732c0;
        v7[] v7VarArr = w7Var.f12701r;
        if (v7VarArr != null && (v7Var = v7VarArr[0]) != null && v7Var.f12657p != null) {
            int i7 = w7Var.G;
            int i10 = v7Var.f12654m;
            int i11 = v7Var.f12653l;
            int i12 = w7Var.G;
            v7 v7Var2 = w7Var.f12701r[0];
            rectF.set(w7Var.F, (org.telegram.messenger.g0.W1(w7Var.f12704x, i10, i11) + i7) - w7Var.f12701r[0].f12657p.b(), getWidth() - w7Var.F, org.telegram.messenger.g0.W1(w7Var.f12704x, v7Var2.f12654m, v7Var2.f12653l) + i12);
            float x10 = w7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f12747s0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (w7Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f12747s0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f12746r0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f12747s0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f12732c0.getTranslationY()) / Math.min(this.f12745q0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f12732c0.getTranslationY() + this.f12747s0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        v7 v7Var;
        w7 w7Var = this.f12732c0;
        v7[] v7VarArr = w7Var.f12701r;
        v7[] v7VarArr2 = w7Var.f12701r;
        if (v7VarArr != null && (v7Var = v7VarArr[0]) != null && v7Var.f12657p != null) {
            canvas.save();
            float x10 = w7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f12747s0;
            float x11 = frameLayout.getX() + x10 + w7Var.F;
            float y10 = frameLayout.getY() + (w7Var.getY() - getScrollY()) + w7Var.G;
            v7 v7Var2 = v7VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(w7Var.f12704x, v7Var2.f12654m, v7Var2.f12653l)) - v7VarArr2[0].f12657p.b());
            s7 s7Var = v7VarArr2[0].f12657p;
            int width = getWidth();
            int i7 = w7Var.F;
            s7Var.a(canvas, (width - i7) - i7);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void i(int i7) {
        super.i(i7);
        this.f12735f0 = Math.signum(i7);
        this.f12736g0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.f12730a0.w();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: fi.x7.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        L(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        super.onMeasure(i7, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: fi.x7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i7, int i10) {
        super.scrollBy(i7, i10);
        invalidate();
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(s7 s7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, f2.a aVar) {
    }
}
