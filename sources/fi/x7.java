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
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.x60;
public class x7 extends NestedScrollView implements x60 {
    public final t9 f12735a0;
    public final r1.g f12736b0;
    public final w7 f12737c0;
    public boolean f12738d0;
    public float f12739e0;
    public float f12740f0;
    public float f12741g0;
    public float f12742h0;
    public float f12743i0;
    public float f12744j0;
    public float f12745k0;
    public final OverScroller f12746l0;
    public boolean m0;
    public int f12747n0;
    public int f12748o0;
    public int f12749p0;
    public int f12750q0;
    public int f12751r0;
    public final FrameLayout f12752s0;
    public boolean f12753t0;
    public boolean f12754u0;
    public int f12755v0;
    public boolean f12756w0;
    public boolean f12757x0;

    public x7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f12751r0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12752s0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        ks.i(this);
        w7 w7Var = new w7(this, getContext());
        this.f12737c0 = w7Var;
        t9 t9Var = new t9(w7Var, i6Var);
        this.f12735a0 = t9Var;
        t9Var.f32250h0 = false;
        frameLayout.addView(w7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(org.telegram.messenger.g0.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        r1.g gVar = new r1.g((Object) w7Var, (r1.e) r1.g.f56307p, 0.0f);
        this.f12736b0 = gVar;
        gVar.f56323m.b(100.0f);
        gVar.f(1.0f);
        gVar.b(new q7(0, this));
        gVar.f56323m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f12746l0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f12746l0 = null;
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final boolean A(int i7, int i10) {
        if (i10 == 0) {
            this.f12736b0.d();
            this.f12738d0 = true;
            this.f12739e0 = this.f12737c0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i7) {
        OverScroller overScroller;
        if (this.f12738d0 && i7 == 0) {
            this.f12738d0 = false;
            if (this.f12739e0 != 0.0f && (overScroller = this.f12746l0) != null && overScroller.isFinished()) {
                K(this.f12741g0);
            }
        }
    }

    public final void D() {
        if (!this.f12756w0) {
            return;
        }
        this.f12756w0 = false;
        float f10 = this.f12737c0.f12709x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new p7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(lr.f37208f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f12756w0 && !z10) {
            return;
        }
        this.f12756w0 = true;
        float f10 = this.f12737c0.f12709x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new p7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(lr.f37208f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f12756w0 = false;
        w7 w7Var = this.f12737c0;
        w7Var.f12709x = 0.0f;
        w7Var.invalidate();
    }

    public final void K(float f10) {
        r1.g gVar = this.f12736b0;
        if (!gVar.f56317f) {
            gVar.f56313a = f10;
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
        if (!this.f12738d0 && this.f12739e0 != 0.0f && (overScroller = this.f12746l0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.f12738d0 || (((this.f12739e0) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.f12739e0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f12739e0 = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.f12739e0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f12739e0 = f12;
            iArr[1] = i10;
        }
        this.f12737c0.setTranslationY(this.f12739e0);
        this.f12735a0.w();
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f12754u0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i7 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f12755v0 + i7);
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
            int round = Math.round((1.0f - Math.abs((-this.f12739e0) / this.f12752s0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.f12738d0;
                w7 w7Var = this.f12737c0;
                if (!z10) {
                    if (!this.f12736b0.f56317f) {
                        OverScroller overScroller = this.f12746l0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = org.telegram.messenger.g0.f24118q;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f12740f0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f12739e0 - round;
                            this.f12739e0 = f13;
                            w7Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f12739e0 - round;
                    this.f12739e0 = f14;
                    w7Var.setTranslationY(f14);
                }
            }
        }
        this.f12735a0.w();
    }

    @Override
    public final void f(RectF rectF) {
        v7 v7Var;
        w7 w7Var = this.f12737c0;
        v7[] v7VarArr = w7Var.f12706r;
        if (v7VarArr != null && (v7Var = v7VarArr[0]) != null && v7Var.f12662p != null) {
            int i7 = w7Var.G;
            int i10 = v7Var.f12659m;
            int i11 = v7Var.f12658l;
            int i12 = w7Var.G;
            v7 v7Var2 = w7Var.f12706r[0];
            rectF.set(w7Var.F, (org.telegram.messenger.g0.W1(w7Var.f12709x, i10, i11) + i7) - w7Var.f12706r[0].f12662p.b(), getWidth() - w7Var.F, org.telegram.messenger.g0.W1(w7Var.f12709x, v7Var2.f12659m, v7Var2.f12658l) + i12);
            float x10 = w7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f12752s0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (w7Var.getY() - getScrollY()));
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f12752s0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i7 = this.f12751r0;
        if (i7 >= 0) {
            return i7 - ((ViewGroup.MarginLayoutParams) this.f12752s0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.f12737c0.getTranslationY()) / Math.min(this.f12750q0, org.telegram.messenger.g0.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f12737c0.getTranslationY() + this.f12752s0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        v7 v7Var;
        w7 w7Var = this.f12737c0;
        v7[] v7VarArr = w7Var.f12706r;
        v7[] v7VarArr2 = w7Var.f12706r;
        if (v7VarArr != null && (v7Var = v7VarArr[0]) != null && v7Var.f12662p != null) {
            canvas.save();
            float x10 = w7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f12752s0;
            float x11 = frameLayout.getX() + x10 + w7Var.F;
            float y10 = frameLayout.getY() + (w7Var.getY() - getScrollY()) + w7Var.G;
            v7 v7Var2 = v7VarArr2[0];
            canvas.translate(x11, (y10 + org.telegram.messenger.g0.W1(w7Var.f12709x, v7Var2.f12659m, v7Var2.f12658l)) - v7VarArr2[0].f12662p.b());
            s7 s7Var = v7VarArr2[0].f12662p;
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
        this.f12740f0 = Math.signum(i7);
        this.f12741g0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.f12735a0.w();
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

    public void F(org.telegram.ui.Components.x5 x5Var) {
    }

    public void I(s7 s7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, f2.a aVar) {
    }
}
