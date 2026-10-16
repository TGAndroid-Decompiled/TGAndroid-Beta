package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k80;
public class ha extends NestedScrollView implements k80 {
    public final org.telegram.ui.Cells.y9 W;
    public final o1.k f3135a0;
    public final ga f3136b0;
    public boolean f3137c0;
    public float f3138d0;
    public float f3139e0;
    public float f3140f0;
    public float f3141g0;
    public float f3142h0;
    public float f3143i0;
    public float f3144j0;
    public final OverScroller f3145k0;
    public boolean f3146l0;
    public int m0;
    public int f3147n0;
    public int f3148o0;
    public int f3149p0;
    public int f3150q0;
    public final FrameLayout f3151r0;
    public boolean f3152s0;
    public boolean f3153t0;
    public int f3154u0;
    public boolean f3155v0;
    public boolean f3156w0;

    public ha(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f3150q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3151r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        ga gaVar = new ga(this, getContext());
        this.f3136b0 = gaVar;
        org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(gaVar, c6Var);
        this.W = y9Var;
        y9Var.f20667h0 = false;
        frameLayout.addView(gaVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.k kVar = new o1.k(gaVar, o1.h.f16144n, 0.0f);
        this.f3135a0 = kVar;
        kVar.f16161u.b(100.0f);
        kVar.e(1.0f);
        kVar.b(new aa(0, this));
        kVar.f16161u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f3145k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e7) {
            this.f3145k0 = null;
            FileLog.e(e7);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.f3137c0 && i10 == 0) {
            this.f3137c0 = false;
            if (this.f3138d0 != 0.0f && (overScroller = this.f3145k0) != null && overScroller.isFinished()) {
                K(this.f3140f0);
            }
        }
    }

    public final void C() {
        if (!this.f3155v0) {
            return;
        }
        this.f3155v0 = false;
        float f7 = this.f3136b0.f3099w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z9(this, getScrollY(), f7, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(es.f24465f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f3155v0 && !z10) {
            return;
        }
        this.f3155v0 = true;
        float f7 = this.f3136b0.f3099w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new z9(this, getScrollY(), f7, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(es.f24465f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f3155v0 = false;
        ga gaVar = this.f3136b0;
        gaVar.f3099w = 0.0f;
        gaVar.invalidate();
    }

    public final void K(float f7) {
        o1.k kVar = this.f3135a0;
        if (!kVar.f16154f) {
            kVar.f16151a = f7;
            kVar.h();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ha.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        fa faVar;
        ga gaVar = this.f3136b0;
        fa[] faVarArr = gaVar.f3097r;
        if (faVarArr != null && (faVar = faVarArr[0]) != null && faVar.f3041p != null) {
            int i10 = gaVar.F;
            int i11 = gaVar.F;
            fa faVar2 = gaVar.f3097r[0];
            rectF.set(gaVar.E, (AndroidUtilities.lerp(faVar.f3038m, faVar.f3037l, gaVar.f3099w) + i10) - gaVar.f3097r[0].f3041p.b(), getWidth() - gaVar.E, AndroidUtilities.lerp(faVar2.f3038m, faVar2.f3037l, gaVar.f3099w) + i11);
            float x10 = gaVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f3151r0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (gaVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        fa faVar;
        ga gaVar = this.f3136b0;
        fa[] faVarArr = gaVar.f3097r;
        fa[] faVarArr2 = gaVar.f3097r;
        if (faVarArr != null && (faVar = faVarArr[0]) != null && faVar.f3041p != null) {
            canvas.save();
            float x10 = gaVar.getX() - getScrollX();
            FrameLayout frameLayout = this.f3151r0;
            float x11 = frameLayout.getX() + x10 + gaVar.E;
            float y3 = frameLayout.getY() + (gaVar.getY() - getScrollY()) + gaVar.F;
            fa faVar2 = faVarArr2[0];
            canvas.translate(x11, (y3 + AndroidUtilities.lerp(faVar2.f3038m, faVar2.f3037l, gaVar.f3099w)) - faVarArr2[0].f3041p.b());
            ca caVar = faVarArr2[0].f3041p;
            int width = getWidth();
            int i10 = gaVar.E;
            caVar.a(canvas, (width - i10) - i10);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.f3137c0 && this.f3138d0 != 0.0f && (overScroller = this.f3145k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f3153t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f3154u0 + i10);
        canvas.clipRect(0, scrollY, width, i10);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        float f7;
        int i13;
        iArr[1] = 0;
        if (!this.f3137c0 || (((this.f3138d0) <= 0.0f || i11 <= 0) && (f7 >= 0.0f || i11 >= 0))) {
            return false;
        }
        float f10 = i11;
        float f11 = f7 - f10;
        if (i13 > 0) {
            if (f11 < 0.0f) {
                this.f3138d0 = 0.0f;
                iArr[1] = (int) (f10 + f11 + 0);
            } else {
                this.f3138d0 = f11;
                iArr[1] = i11;
            }
        } else if (f11 > 0.0f) {
            this.f3138d0 = 0.0f;
            iArr[1] = (int) (f10 + f11 + 0);
        } else {
            this.f3138d0 = f11;
            iArr[1] = i11;
        }
        this.f3136b0.setTranslationY(this.f3138d0);
        this.W.w();
        return true;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.f3151r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f3150q0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f3151r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.f3136b0.getTranslationY()) / Math.min(this.f3149p0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.f3136b0.getTranslationY() + this.f3151r0.getTop()) - getScrollY();
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
            int round = Math.round((1.0f - Math.abs((-this.f3138d0) / this.f3151r0.getTop())) * i13);
            if (round != 0) {
                boolean z10 = this.f3137c0;
                ga gaVar = this.f3136b0;
                if (!z10) {
                    if (!this.f3135a0.f16154f) {
                        OverScroller overScroller = this.f3145k0;
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
                            f10 = min * (-this.f3139e0);
                        } else {
                            f10 = 0.0f;
                        }
                        if (round != 0) {
                            float f12 = this.f3138d0 - round;
                            this.f3138d0 = f12;
                            gaVar.setTranslationY(f12);
                        }
                        K(f10);
                    }
                } else {
                    float f13 = this.f3138d0 - round;
                    this.f3138d0 = f13;
                    gaVar.setTranslationY(f13);
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
        this.f3139e0 = Math.signum(i10);
        this.f3140f0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ha.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        L(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.ha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i10, int i11) {
        super.scrollBy(i10, i11);
        invalidate();
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.f3135a0.c();
            this.f3137c0 = true;
            this.f3138d0 = this.f3136b0.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.b6 b6Var) {
    }

    public void I(ca caVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, a3.d dVar) {
    }
}
