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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j80;
public class p8 extends NestedScrollView implements j80 {
    public final org.telegram.ui.Cells.ca W;
    public final o1.j f8910a0;
    public final o8 f8911b0;
    public boolean f8912c0;
    public float f8913d0;
    public float f8914e0;
    public float f8915f0;
    public float f8916g0;
    public float f8917h0;
    public float f8918i0;
    public float f8919j0;
    public final OverScroller f8920k0;
    public boolean f8921l0;
    public int m0;
    public int f8922n0;
    public int f8923o0;
    public int f8924p0;
    public int f8925q0;
    public final FrameLayout f8926r0;
    public boolean f8927s0;
    public boolean f8928t0;
    public int f8929u0;
    public boolean f8930v0;
    public boolean f8931w0;

    public p8(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f8925q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8926r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        o8 o8Var = new o8(this, getContext());
        this.f8911b0 = o8Var;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(o8Var, u6Var);
        this.W = caVar;
        caVar.f24099h0 = false;
        frameLayout.addView(o8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(o8Var, o1.h.f18953n, 0.0f);
        this.f8910a0 = jVar;
        jVar.f18969u.b(100.0f);
        jVar.e(1.0f);
        jVar.b(new i8(0, this));
        jVar.f18969u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("c", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f8920k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f8920k0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean A(int i10, int i11) {
        if (i11 == 0) {
            this.f8910a0.c();
            this.f8912c0 = true;
            this.f8913d0 = this.f8911b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i10) {
        OverScroller overScroller;
        if (this.f8912c0 && i10 == 0) {
            this.f8912c0 = false;
            if (this.f8913d0 != 0.0f && (overScroller = this.f8920k0) != null && overScroller.isFinished()) {
                K(this.f8915f0);
            }
        }
    }

    public final void D() {
        if (!this.f8930v0) {
            return;
        }
        this.f8930v0 = false;
        float f7 = this.f8911b0.f8890w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h8(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(ds.f27586f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f8930v0 && !z10) {
            return;
        }
        this.f8930v0 = true;
        float f7 = this.f8911b0.f8890w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new h8(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(ds.f27586f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f8930v0 = false;
        o8 o8Var = this.f8911b0;
        o8Var.f8890w = 0.0f;
        o8Var.invalidate();
    }

    public final void K(float f7) {
        o1.j jVar = this.f8910a0;
        if (!jVar.f18963f) {
            jVar.f18960a = f7;
            jVar.h();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.p8.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        n8 n8Var;
        o8 o8Var = this.f8911b0;
        n8[] n8VarArr = o8Var.f8888r;
        if (n8VarArr != null && (n8Var = n8VarArr[0]) != null && n8Var.f8849p != null) {
            int i10 = o8Var.F;
            int i11 = o8Var.F;
            n8 n8Var2 = o8Var.f8888r[0];
            rectF.set(o8Var.E, (AndroidUtilities.lerp(n8Var.f8846m, n8Var.f8845l, o8Var.f8890w) + i10) - o8Var.f8888r[0].f8849p.b(), getWidth() - o8Var.E, AndroidUtilities.lerp(n8Var2.f8846m, n8Var2.f8845l, o8Var.f8890w) + i11);
            float x9 = o8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f8926r0;
            rectF.offset(frameLayout.getX() + x9, frameLayout.getY() + (o8Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        n8 n8Var;
        o8 o8Var = this.f8911b0;
        n8[] n8VarArr = o8Var.f8888r;
        n8[] n8VarArr2 = o8Var.f8888r;
        if (n8VarArr != null && (n8Var = n8VarArr[0]) != null && n8Var.f8849p != null) {
            canvas.save();
            float x9 = o8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f8926r0;
            float x10 = frameLayout.getX() + x9 + o8Var.E;
            float y3 = frameLayout.getY() + (o8Var.getY() - getScrollY()) + o8Var.F;
            n8 n8Var2 = n8VarArr2[0];
            canvas.translate(x10, (y3 + AndroidUtilities.lerp(n8Var2.f8846m, n8Var2.f8845l, o8Var.f8890w)) - n8VarArr2[0].f8849p.b());
            k8 k8Var = n8VarArr2[0].f8849p;
            int width = getWidth();
            int i10 = o8Var.E;
            k8Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f8912c0 && this.f8913d0 != 0.0f && (overScroller = this.f8920k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f8928t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f8929u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean f(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f8912c0 || (((this.f8913d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f8913d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f8913d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f8913d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f8913d0 = f11;
            iArr[1] = i11;
        }
        this.f8911b0.setTranslationY(this.f8913d0);
        this.W.w();
        return true;
    }

    @Override
    public final void g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f8913d0) / this.f8926r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f8912c0;
                o8 o8Var = this.f8911b0;
                if (!z10) {
                    if (!this.f8910a0.f18963f) {
                        OverScroller overScroller = this.f8920k0;
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
                            f10 = min * (-this.f8914e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f8913d0 - round;
                            this.f8913d0 = f12;
                            o8Var.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f8913d0 - round;
                    this.f8913d0 = f13;
                    o8Var.setTranslationY(f13);
                }
            }
        }
        this.W.w();
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f8926r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f8925q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f8926r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f8911b0.getTranslationY()) / Math.min(this.f8924p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f8911b0.getTranslationY() + this.f8926r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10) {
        super.i(i10);
        this.f8914e0 = Math.signum(i10);
        this.f8915f0 = 0.0f;
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
        throw new UnsupportedOperationException("Method not decompiled: di.p8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: di.p8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    public void F(org.telegram.ui.Components.c6 c6Var) {
    }

    public void I(k8 k8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, bi.u6 u6Var) {
    }
}
