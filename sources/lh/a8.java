package lh;

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
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.jr;
public class a8 extends NestedScrollView implements i70 {
    public final u9 S;
    public final o1.k T;
    public final z7 U;
    public boolean V;
    public float W;
    public float f15340a0;
    public float f15341b0;
    public float f15342c0;
    public float f15343d0;
    public float f15344e0;
    public float f15345f0;
    public final OverScroller f15346g0;
    public boolean f15347h0;
    public int f15348i0;
    public int f15349j0;
    public int f15350k0;
    public int f15351l0;
    public int m0;
    public final FrameLayout f15352n0;
    public boolean f15353o0;
    public boolean f15354p0;
    public int f15355q0;
    public boolean f15356r0;
    public boolean f15357s0;

    public a8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.m0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15352n0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        z7 z7Var = new z7(this, getContext());
        this.U = z7Var;
        u9 u9Var = new u9(z7Var, c6Var);
        this.S = u9Var;
        u9Var.f25947i0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(z7Var, o1.i.f19028n, 0.0f);
        this.T = kVar;
        kVar.f19045u.b(100.0f);
        kVar.f19042j = 1.0f;
        kVar.b(new bg.z(1, this));
        kVar.f19045u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f15346g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f15346g0 = null;
            FileLog.e(e11);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.V && i10 == 0) {
            this.V = false;
            if (this.W != 0.0f && (overScroller = this.f15346g0) != null && overScroller.isFinished()) {
                K(this.f15341b0);
            }
        }
    }

    public final void C() {
        if (!this.f15356r0) {
            return;
        }
        this.f15356r0 = false;
        float f9 = this.U.f16475w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t7(this, getScrollY(), f9, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(jr.f29800f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f15356r0 && !z10) {
            return;
        }
        this.f15356r0 = true;
        float f9 = this.U.f16475w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t7(this, getScrollY(), f9, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(jr.f29800f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f15356r0 = false;
        z7 z7Var = this.U;
        z7Var.f16475w = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f9) {
        o1.k kVar = this.T;
        if (!kVar.f19039f) {
            kVar.f19035a = f9;
            kVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: lh.a8.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.U;
        y7[] y7VarArr = z7Var.f16473r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f16435p != null) {
            int i10 = z7Var.B;
            int i11 = z7Var.B;
            y7 y7Var2 = z7Var.f16473r[0];
            rectF.set(z7Var.A, (AndroidUtilities.lerp(y7Var.f16432m, y7Var.f16431l, z7Var.f16475w) + i10) - z7Var.f16473r[0].f16435p.b(), getWidth() - z7Var.A, AndroidUtilities.lerp(y7Var2.f16432m, y7Var2.f16431l, z7Var.f16475w) + i11);
            float x4 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f15352n0;
            rectF.offset(frameLayout.getX() + x4, frameLayout.getY() + (z7Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f9) {
        y7 y7Var;
        z7 z7Var = this.U;
        y7[] y7VarArr = z7Var.f16473r;
        y7[] y7VarArr2 = z7Var.f16473r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f16435p != null) {
            canvas.save();
            float x4 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f15352n0;
            float x10 = frameLayout.getX() + x4 + z7Var.A;
            float y8 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.B;
            y7 y7Var2 = y7VarArr2[0];
            canvas.translate(x10, (y8 + AndroidUtilities.lerp(y7Var2.f16432m, y7Var2.f16431l, z7Var.f16475w)) - y7VarArr2[0].f16435p.b());
            v7 v7Var = y7VarArr2[0].f16435p;
            int width = getWidth();
            int i10 = z7Var.A;
            v7Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.V && this.W != 0.0f && (overScroller = this.f15346g0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f15354p0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f15355q0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f9;
        int i13;
        iArr[1] = 0;
        if (!this.V || (((this.W) <= 0.0f || i11 <= 0) && (f9 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f9 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.W = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.W = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.W = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.W = f11;
            iArr[1] = i11;
        }
        this.U.setTranslationY(this.W);
        this.S.x();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f15352n0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f15352n0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.U.getTranslationY()) / Math.min(this.f15351l0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.U.getTranslationY() + this.f15352n0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f9;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.W) / this.f15352n0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.V;
                z7 z7Var = this.U;
                if (!z10) {
                    if (!this.T.f19039f) {
                        OverScroller overScroller = this.f15346g0;
                        if (overScroller != null) {
                            f9 = overScroller.getCurrVelocity();
                        } else {
                            f9 = Float.NaN;
                        }
                        if (!Float.isNaN(f9)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f11 = 3000.0f;
                            } else {
                                f11 = 5000.0f;
                            }
                            float min = Math.min(f11, f9);
                            round = (int) ((round * min) / f9);
                            f10 = min * (-this.f15340a0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.W - round;
                            this.W = f12;
                            z7Var.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.W - round;
                    this.W = f13;
                    z7Var.setTranslationY(f13);
                }
            }
        }
        this.S.x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.S.x();
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f15340a0 = Math.signum(i10);
        this.f15341b0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: lh.a8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: lh.a8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.T.c();
            this.V = true;
            this.W = this.U.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, m5 m5Var) {
    }
}
