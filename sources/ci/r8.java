package ci;

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
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.zr;
public class r8 extends NestedScrollView implements g80 {
    public final org.telegram.ui.Cells.y9 W;
    public final o1.k f5875a0;
    public final q8 f5876b0;
    public boolean f5877c0;
    public float f5878d0;
    public float f5879e0;
    public float f5880f0;
    public float f5881g0;
    public float f5882h0;
    public float f5883i0;
    public float f5884j0;
    public final OverScroller f5885k0;
    public boolean f5886l0;
    public int m0;
    public int f5887n0;
    public int f5888o0;
    public int f5889p0;
    public int f5890q0;
    public final FrameLayout f5891r0;
    public boolean f5892s0;
    public boolean f5893t0;
    public int f5894u0;
    public boolean f5895v0;
    public boolean f5896w0;

    public r8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f5890q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5891r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        q8 q8Var = new q8(this, getContext());
        this.f5876b0 = q8Var;
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(q8Var, g6Var);
        this.W = y9Var;
        y9Var.f22166h0 = false;
        frameLayout.addView(q8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(q8Var, o1.h.f17605n, 0.0f);
        this.f5875a0 = kVar;
        kVar.f17622u.b(100.0f);
        kVar.e(1.0f);
        kVar.b(new k8(0, this));
        kVar.f17622u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f5885k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f5885k0 = null;
            FileLog.e(e7);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f5877c0 && i10 == 0) {
            this.f5877c0 = false;
            if (this.f5878d0 != 0.0f && (overScroller = this.f5885k0) != null && overScroller.isFinished()) {
                K(this.f5880f0);
            }
        }
    }

    public final void C() {
        if (!this.f5895v0) {
            return;
        }
        this.f5895v0 = false;
        float f7 = this.f5876b0.f5805w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new j8(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(zr.f33337f);
        ofFloat.start();
    }

    public final void E(boolean z10) {
        if (this.f5895v0 && !z10) {
            return;
        }
        this.f5895v0 = true;
        float f7 = this.f5876b0.f5805w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new j8(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(zr.f33337f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f5895v0 = false;
        q8 q8Var = this.f5876b0;
        q8Var.f5805w = 0.0f;
        q8Var.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f5875a0;
        if (!kVar.f17615f) {
            kVar.f17612a = f7;
            kVar.h();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r8.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        p8 p8Var;
        q8 q8Var = this.f5876b0;
        p8[] p8VarArr = q8Var.f5803r;
        if (p8VarArr != null && (p8Var = p8VarArr[0]) != null && p8Var.f5747p != null) {
            int i10 = q8Var.F;
            int i11 = q8Var.F;
            p8 p8Var2 = q8Var.f5803r[0];
            rectF.set(q8Var.E, (AndroidUtilities.lerp(p8Var.f5744m, p8Var.f5743l, q8Var.f5805w) + i10) - q8Var.f5803r[0].f5747p.b(), getWidth() - q8Var.E, AndroidUtilities.lerp(p8Var2.f5744m, p8Var2.f5743l, q8Var.f5805w) + i11);
            float x10 = q8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f5891r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (q8Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        p8 p8Var;
        q8 q8Var = this.f5876b0;
        p8[] p8VarArr = q8Var.f5803r;
        p8[] p8VarArr2 = q8Var.f5803r;
        if (p8VarArr != null && (p8Var = p8VarArr[0]) != null && p8Var.f5747p != null) {
            canvas.save();
            float x10 = q8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f5891r0;
            float x11 = frameLayout.getX() + x10 + q8Var.E;
            float y3 = frameLayout.getY() + (q8Var.getY() - getScrollY()) + q8Var.F;
            p8 p8Var2 = p8VarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(p8Var2.f5744m, p8Var2.f5743l, q8Var.f5805w)) - p8VarArr2[0].f5747p.b());
            m8 m8Var = p8VarArr2[0].f5747p;
            int width = getWidth();
            int i10 = q8Var.E;
            m8Var.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f5877c0 && this.f5878d0 != 0.0f && (overScroller = this.f5885k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f5893t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f5894u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f5877c0 || (((this.f5878d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f5878d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f5878d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f5878d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f5878d0 = f11;
            iArr[1] = i11;
        }
        this.f5876b0.setTranslationY(this.f5878d0);
        this.W.w();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f5891r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f5890q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f5891r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f5876b0.getTranslationY()) / Math.min(this.f5889p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f5876b0.getTranslationY() + this.f5891r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f7;
        float f10;
        float f11;
        if (i13 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.f5878d0) / this.f5891r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f5877c0;
                q8 q8Var = this.f5876b0;
                if (!z10) {
                    if (!this.f5875a0.f17615f) {
                        OverScroller overScroller = this.f5885k0;
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
                            f10 = min * (-this.f5879e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f5878d0 - round;
                            this.f5878d0 = f12;
                            q8Var.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f5878d0 - round;
                    this.f5878d0 = f13;
                    q8Var.setTranslationY(f13);
                }
            }
        }
        this.W.w();
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
    public final void k(int i10) {
        super.k(i10);
        this.f5879e0 = Math.signum(i10);
        this.f5880f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ci.r8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f5875a0.c();
            this.f5877c0 = true;
            this.f5878d0 = this.f5876b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.y5 y5Var) {
    }

    public void I(m8 m8Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, androidx.fragment.app.d dVar) {
    }
}
