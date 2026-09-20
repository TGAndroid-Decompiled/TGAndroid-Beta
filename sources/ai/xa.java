package ai;

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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u70;
public class xa extends NestedScrollView implements u70 {
    public final org.telegram.ui.Cells.ba W;
    public final o1.k f1716a0;
    public final wa f1717b0;
    public boolean f1718c0;
    public float f1719d0;
    public float f1720e0;
    public float f1721f0;
    public float f1722g0;
    public float f1723h0;
    public float f1724i0;
    public float f1725j0;
    public final OverScroller f1726k0;
    public boolean f1727l0;
    public int m0;
    public int f1728n0;
    public int f1729o0;
    public int f1730p0;
    public int f1731q0;
    public final FrameLayout f1732r0;
    public boolean f1733s0;
    public boolean f1734t0;
    public int f1735u0;
    public boolean f1736v0;
    public boolean f1737w0;

    public xa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f1731q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1732r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        wa waVar = new wa(this, getContext());
        this.f1717b0 = waVar;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(waVar, f6Var);
        this.W = baVar;
        baVar.f20217i0 = false;
        frameLayout.addView(waVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(waVar, o1.h.f15505n, 0.0f);
        this.f1716a0 = kVar;
        kVar.f15522u.b(100.0f);
        kVar.f15518j = 1.0f;
        kVar.b(new qa(0, this));
        kVar.f15522u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f1726k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f1726k0 = null;
            FileLog.e(e7);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f1718c0 && i10 == 0) {
            this.f1718c0 = false;
            if (this.f1719d0 != 0.0f && (overScroller = this.f1726k0) != null && overScroller.isFinished()) {
                K(this.f1721f0);
            }
        }
    }

    public final void C() {
        if (!this.f1736v0) {
            return;
        }
        this.f1736v0 = false;
        float f7 = this.f1717b0.f1675w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pa(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(qr.f27642f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f1736v0 && !z10) {
            return;
        }
        this.f1736v0 = true;
        float f7 = this.f1717b0.f1675w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pa(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(qr.f27642f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f1736v0 = false;
        wa waVar = this.f1717b0;
        waVar.f1675w = 0.0f;
        waVar.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f1716a0;
        if (!kVar.f15515f) {
            kVar.f15512a = f7;
            kVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xa.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        va vaVar;
        wa waVar = this.f1717b0;
        va[] vaVarArr = waVar.f1673r;
        if (vaVarArr != null && (vaVar = vaVarArr[0]) != null && vaVar.f1631p != null) {
            int i10 = waVar.F;
            int i11 = waVar.F;
            va vaVar2 = waVar.f1673r[0];
            rectF.set(waVar.E, (AndroidUtilities.lerp(vaVar.f1628m, vaVar.f1627l, waVar.f1675w) + i10) - waVar.f1673r[0].f1631p.b(), getWidth() - waVar.E, AndroidUtilities.lerp(vaVar2.f1628m, vaVar2.f1627l, waVar.f1675w) + i11);
            float x10 = waVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f1732r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (waVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        va vaVar;
        wa waVar = this.f1717b0;
        va[] vaVarArr = waVar.f1673r;
        va[] vaVarArr2 = waVar.f1673r;
        if (vaVarArr != null && (vaVar = vaVarArr[0]) != null && vaVar.f1631p != null) {
            canvas.save();
            float x10 = waVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f1732r0;
            float x11 = frameLayout.getX() + x10 + waVar.E;
            float y3 = frameLayout.getY() + (waVar.getY() - getScrollY()) + waVar.F;
            va vaVar2 = vaVarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(vaVar2.f1628m, vaVar2.f1627l, waVar.f1675w)) - vaVarArr2[0].f1631p.b());
            sa saVar = vaVarArr2[0].f1631p;
            int width = getWidth();
            int i10 = waVar.E;
            saVar.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f1718c0 && this.f1719d0 != 0.0f && (overScroller = this.f1726k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f1734t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f1735u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f1718c0 || (((this.f1719d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f1719d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f1719d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f1719d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f1719d0 = f11;
            iArr[1] = i11;
        }
        this.f1717b0.setTranslationY(this.f1719d0);
        this.W.x();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f1732r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f1731q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f1732r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f1717b0.getTranslationY()) / Math.min(this.f1730p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f1717b0.getTranslationY() + this.f1732r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f1719d0) / this.f1732r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f1718c0;
                wa waVar = this.f1717b0;
                if (!z10) {
                    if (!this.f1716a0.f15515f) {
                        OverScroller overScroller = this.f1726k0;
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
                            f10 = min * (-this.f1720e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f1719d0 - round;
                            this.f1719d0 = f12;
                            waVar.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f1719d0 - round;
                    this.f1719d0 = f13;
                    waVar.setTranslationY(f13);
                }
            }
        }
        this.W.x();
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.x();
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.f1720e0 = Math.signum(i10);
        this.f1721f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xa.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.xa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f1716a0.c();
            this.f1718c0 = true;
            this.f1719d0 = this.f1717b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(sa saVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, a3.d dVar) {
    }
}
