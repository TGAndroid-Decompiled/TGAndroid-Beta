package nh;

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
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;
public class a8 extends NestedScrollView implements n70 {
    public final w9 T;
    public final o1.j U;
    public final z7 V;
    public boolean W;
    public float f15076a0;
    public float f15077b0;
    public float f15078c0;
    public float f15079d0;
    public float f15080e0;
    public float f15081f0;
    public float f15082g0;
    public final OverScroller f15083h0;
    public boolean f15084i0;
    public int f15085j0;
    public int f15086k0;
    public int f15087l0;
    public int m0;
    public int f15088n0;
    public final FrameLayout f15089o0;
    public boolean f15090p0;
    public boolean f15091q0;
    public int f15092r0;
    public boolean f15093s0;
    public boolean f15094t0;

    public a8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f15088n0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15089o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        z7 z7Var = new z7(this, getContext());
        this.V = z7Var;
        w9 w9Var = new w9(z7Var, f6Var);
        this.T = w9Var;
        w9Var.f22679i0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(z7Var, o1.h.f16182n, 0.0f);
        this.U = jVar;
        jVar.f16198u.b(100.0f);
        jVar.f16195j = 1.0f;
        jVar.b(new dg.y(1, this));
        jVar.f16198u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f15083h0 = (OverScroller) declaredField.get(this);
        } catch (Exception e6) {
            this.f15083h0 = null;
            FileLog.e(e6);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.W && i10 == 0) {
            this.W = false;
            if (this.f15076a0 != 0.0f && (overScroller = this.f15083h0) != null && overScroller.isFinished()) {
                K(this.f15078c0);
            }
        }
    }

    public final void C() {
        if (!this.f15093s0) {
            return;
        }
        this.f15093s0 = false;
        float f10 = this.V.f16130w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(nr.f27346f);
        ofFloat.start();
    }

    public final void D(boolean z4) {
        if (this.f15093s0 && !z4) {
            return;
        }
        this.f15093s0 = true;
        float f10 = this.V.f16130w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(nr.f27346f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f15093s0 = false;
        z7 z7Var = this.V;
        z7Var.f16130w = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f10) {
        o1.j jVar = this.U;
        if (!jVar.f16192f) {
            jVar.f16189a = f10;
            jVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.a8.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.V;
        y7[] y7VarArr = z7Var.f16128r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f16097p != null) {
            int i10 = z7Var.C;
            int i11 = z7Var.C;
            y7 y7Var2 = z7Var.f16128r[0];
            rectF.set(z7Var.B, (AndroidUtilities.lerp(y7Var.f16094m, y7Var.f16093l, z7Var.f16130w) + i10) - z7Var.f16128r[0].f16097p.b(), getWidth() - z7Var.B, AndroidUtilities.lerp(y7Var2.f16094m, y7Var2.f16093l, z7Var.f16130w) + i11);
            float x10 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f15089o0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (z7Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        y7 y7Var;
        z7 z7Var = this.V;
        y7[] y7VarArr = z7Var.f16128r;
        y7[] y7VarArr2 = z7Var.f16128r;
        if (y7VarArr != null && (y7Var = y7VarArr[0]) != null && y7Var.f16097p != null) {
            canvas.save();
            float x10 = z7Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f15089o0;
            float x11 = frameLayout.getX() + x10 + z7Var.B;
            float y10 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.C;
            y7 y7Var2 = y7VarArr2[0];
            canvas.translate(x11, (y10 + AndroidUtilities.lerp(y7Var2.f16094m, y7Var2.f16093l, z7Var.f16130w)) - y7VarArr2[0].f16097p.b());
            v7 v7Var = y7VarArr2[0].f16097p;
            int width = getWidth();
            int i10 = z7Var.B;
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
        if (!this.W && this.f15076a0 != 0.0f && (overScroller = this.f15083h0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f15091q0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f15092r0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f10;
        int i13;
        iArr[1] = 0;
        if (!this.W || (((this.f15076a0) <= 0.0f || i11 <= 0) && (f10 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f11 = i11;
        float f12 = f10 - f11;
        if (i13 > 0) {
            if (f12 < 0.0f) {
                this.f15076a0 = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.f15076a0 = f12;
                iArr[1] = i11;
            }
        } else if (f12 > 0.0f) {
            this.f15076a0 = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.f15076a0 = f12;
            iArr[1] = i11;
        }
        this.V.setTranslationY(this.f15076a0);
        this.T.x();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f15089o0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f15088n0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f15089o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.V.getTranslationY()) / Math.min(this.m0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.V.getTranslationY() + this.f15089o0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f10;
        float f11;
        float f12;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f15076a0) / this.f15089o0.getTop())) * i13);
            if (round != 0) {
                boolean z4 = this.W;
                z7 z7Var = this.V;
                if (!z4) {
                    if (!this.U.f16192f) {
                        OverScroller overScroller = this.f15083h0;
                        if (overScroller != null) {
                            f10 = overScroller.getCurrVelocity();
                        } else {
                            f10 = Float.NaN;
                        }
                        if (!Float.isNaN(f10)) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                f12 = 3000.0f;
                            } else {
                                f12 = 5000.0f;
                            }
                            float min = Math.min(f12, f10);
                            round = (int) ((round * min) / f10);
                            f11 = min * (-this.f15077b0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.f15076a0 - round;
                            this.f15076a0 = f13;
                            z7Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.f15076a0 - round;
                    this.f15076a0 = f14;
                    z7Var.setTranslationY(f14);
                }
            }
        }
        this.T.x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.T.x();
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f15077b0 = Math.signum(i10);
        this.f15078c0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.a8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: nh.a8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.U.c();
            this.W = true;
            this.f15076a0 = this.V.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.u5 u5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, n5 n5Var) {
    }
}
