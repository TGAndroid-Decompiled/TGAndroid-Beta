package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import hh.y9;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.er;

public class a8 extends NestedScrollView implements a70 {
    public final t9 S;
    public final o1.j T;
    public final z7 U;
    public boolean V;
    public float W;

    public float f13046a0;

    public float f13047b0;

    public float f13048c0;

    public float f13049d0;

    public float f13050e0;

    public float f13051f0;

    public final OverScroller f13052g0;

    public boolean f13053h0;

    public int f13054i0;

    public int f13055j0;

    public int f13056k0;

    public int f13057l0;
    public int m0;

    public final FrameLayout f13058n0;

    public boolean f13059o0;

    public boolean f13060p0;

    public int f13061q0;

    public boolean f13062r0;

    public boolean f13063s0;

    public a8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        Paint paint = new Paint(1);
        this.m0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.b.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13058n0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        z7 z7Var = new z7(this, getContext());
        this.U = z7Var;
        t9 t9Var = new t9(z7Var, c6Var);
        this.S = t9Var;
        t9Var.f25873i0 = false;
        frameLayout.addView(z7Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(z7Var, o1.h.f19130n, 0.0f);
        this.T = jVar;
        jVar.f19147u.b(100.0f);
        jVar.f19144j = 1.0f;
        jVar.b(new t7(0, this));
        jVar.f19147u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f13052g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f13052g0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.V && i10 == 0) {
            this.V = false;
            if (this.W == 0.0f || (overScroller = this.f13052g0) == null || !overScroller.isFinished()) {
                return;
            }
            K(this.f13047b0);
        }
    }

    public final void C() {
        if (this.f13062r0) {
            this.f13062r0 = false;
            float scrollY = getScrollY();
            float f10 = this.U.f14200w;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new s7(this, scrollY, f10, 0));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(er.f28122f);
            valueAnimatorOfFloat.start();
        }
    }

    public final void D(boolean z10) {
        if (!this.f13062r0 || z10) {
            this.f13062r0 = true;
            float scrollY = getScrollY();
            float f10 = this.U.f14200w;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new s7(this, scrollY, f10, 1));
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(er.f28122f);
            valueAnimatorOfFloat.start();
        }
    }

    public final void J() {
        scrollTo(0, 0);
        this.f13062r0 = false;
        z7 z7Var = this.U;
        z7Var.f14200w = 0.0f;
        z7Var.invalidate();
    }

    public final void K(float f10) {
        o1.j jVar = this.T;
        if (!jVar.f19141f) {
            jVar.f19137a = f10;
            jVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int i10, int i11) {
        int iLerp;
        if (i10 == 0 || i11 == 0) {
            iLerp = -1;
        } else {
            z7 z7Var = this.U;
            y7 y7Var = z7Var.f14198r[0];
            CharSequence charSequence = y7Var.f14167n;
            v7 v7Var = y7Var.f14168o;
            SpannableStringBuilder spannableStringBuilder = v7Var != null ? v7Var.f14066k : null;
            String str = v7Var != null ? v7Var.f14067l : null;
            int iHashCode = charSequence.hashCode();
            int iHashCode2 = spannableStringBuilder != null ? spannableStringBuilder.hashCode() : 0;
            int iHashCode3 = str != null ? str.hashCode() : 0;
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.f13054i0 == iHashCode && this.f13055j0 == iHashCode2 && this.f13056k0 == iHashCode3 && this.f13053h0 == z10 && this.f13057l0 == i11 && !z7Var.D) {
                iLerp = -1;
            } else {
                this.f13054i0 = iHashCode;
                this.f13055j0 = iHashCode2;
                this.f13056k0 = iHashCode3;
                this.f13053h0 = z10;
                this.f13057l0 = i11;
                z7Var.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                y7[] y7VarArr = z7Var.f14198r;
                int iA = y7VarArr[0].a(i11);
                y7 y7Var2 = y7VarArr[1];
                iLerp = AndroidUtilities.lerp(iA, y7Var2 != null ? y7Var2.a(i11) : 0, z7Var.C);
            }
        }
        if (iLerp >= 0) {
            ((ViewGroup.MarginLayoutParams) this.f13058n0.getLayoutParams()).topMargin = iLerp;
            this.m0 = -1;
        }
    }

    @Override
    public final void a(RectF rectF) {
        y7 y7Var;
        z7 z7Var = this.U;
        y7[] y7VarArr = z7Var.f14198r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.f14169p == null) {
            return;
        }
        float f10 = z7Var.A;
        float fLerp = (AndroidUtilities.lerp(y7Var.f14166m, y7Var.f14165l, z7Var.f14200w) + z7Var.B) - z7Var.f14198r[0].f14169p.b();
        float width = getWidth() - z7Var.A;
        int i10 = z7Var.B;
        y7 y7Var2 = z7Var.f14198r[0];
        rectF.set(f10, fLerp, width, AndroidUtilities.lerp(y7Var2.f14166m, y7Var2.f14165l, z7Var.f14200w) + i10);
        float x8 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.f13058n0;
        rectF.offset(frameLayout.getX() + x8, frameLayout.getY() + (z7Var.getY() - getScrollY()));
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        y7 y7Var;
        z7 z7Var = this.U;
        y7[] y7VarArr = z7Var.f14198r;
        y7[] y7VarArr2 = z7Var.f14198r;
        if (y7VarArr == null || (y7Var = y7VarArr[0]) == null || y7Var.f14169p == null) {
            draw(canvas);
            return;
        }
        canvas.save();
        float x8 = z7Var.getX() - getScrollX();
        FrameLayout frameLayout = this.f13058n0;
        float x10 = frameLayout.getX() + x8 + z7Var.A;
        float y10 = frameLayout.getY() + (z7Var.getY() - getScrollY()) + z7Var.B;
        y7 y7Var2 = y7VarArr2[0];
        canvas.translate(x10, (y10 + AndroidUtilities.lerp(y7Var2.f14166m, y7Var2.f14165l, z7Var.f14200w)) - y7VarArr2[0].f14169p.b());
        v7 v7Var = y7VarArr2[0].f14169p;
        int width = getWidth();
        int i10 = z7Var.A;
        v7Var.a(canvas, (width - i10) - i10);
        canvas.restore();
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (this.V || this.W == 0.0f || (overScroller = this.f13052g0) == null || !overScroller.isFinished()) {
            return;
        }
        K(0.0f);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f13060p0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int iSave = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f13061q0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.V) {
            float f10 = this.W;
            if ((f10 > 0.0f && i11 > 0) || (f10 < 0.0f && i11 < 0)) {
                float f11 = i11;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.W = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.W = f12;
                        iArr[1] = i11;
                    }
                } else if (f12 > 0.0f) {
                    this.W = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.W = f12;
                    iArr[1] = i11;
                }
                this.U.setTranslationY(this.W);
                this.S.x();
                return true;
            }
        }
        return false;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f13058n0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.m0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f13058n0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.U.getTranslationY()) / Math.min(this.f13057l0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.U.getTranslationY() + this.f13058n0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f10;
        if (i13 != 0) {
            int iRound = Math.round((1.0f - Math.abs((-this.W) / this.f13058n0.getTop())) * i13);
            if (iRound != 0) {
                boolean z10 = this.V;
                z7 z7Var = this.U;
                if (z10) {
                    float f11 = this.W - iRound;
                    this.W = f11;
                    z7Var.setTranslationY(f11);
                } else if (!this.T.f19141f) {
                    OverScroller overScroller = this.f13052g0;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (Float.isNaN(currVelocity)) {
                        f10 = 0.0f;
                    } else {
                        Point point = AndroidUtilities.displaySize;
                        float fMin = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        iRound = (int) ((iRound * fMin) / currVelocity);
                        f10 = fMin * (-this.f13046a0);
                    }
                    if (iRound != 0) {
                        float f12 = this.W - iRound;
                        this.W = f12;
                        z7Var.setTranslationY(f12);
                    }
                    K(f10);
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
        this.f13046a0 = Math.signum(i10);
        this.f13047b0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: jh.a8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: jh.a8.onTouchEvent(android.view.MotionEvent):boolean");
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

    public void F(org.telegram.ui.Components.t5 t5Var) {
    }

    public void I(v7 v7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, y9 y9Var) {
    }
}
