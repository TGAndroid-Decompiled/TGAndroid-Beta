package ih;

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
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w60;
public class e8 extends NestedScrollView implements w60 {
    public final x9 S;
    public final o1.j T;
    public final d8 U;
    public boolean V;
    public float W;
    public float f11375a0;
    public float f11376b0;
    public float f11377c0;
    public float f11378d0;
    public float f11379e0;
    public float f11380f0;
    public final OverScroller f11381g0;
    public boolean f11382h0;
    public int f11383i0;
    public int f11384j0;
    public int f11385k0;
    public int f11386l0;
    public int m0;
    public final FrameLayout f11387n0;
    public boolean f11388o0;
    public boolean f11389p0;
    public int f11390q0;
    public boolean f11391r0;
    public boolean f11392s0;

    public e8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.m0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11387n0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        NotificationCenter.listenEmojiLoading(this);
        d8 d8Var = new d8(this, getContext());
        this.U = d8Var;
        x9 x9Var = new x9(d8Var, b6Var);
        this.S = x9Var;
        x9Var.f24086i0 = false;
        frameLayout.addView(d8Var, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(d8Var, o1.h.f18783n, 0.0f);
        this.T = jVar;
        jVar.f18800u.b(100.0f);
        jVar.f18797j = 1.0f;
        jVar.b(new x7(0, this));
        jVar.f18800u.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("d", null).setAccessible(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f11381g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e11) {
            this.f11381g0 = null;
            FileLog.e(e11);
        }
    }

    @Override
    public final void B(int i9) {
        OverScroller overScroller;
        if (this.V && i9 == 0) {
            this.V = false;
            if (this.W != 0.0f && (overScroller = this.f11381g0) != null && overScroller.isFinished()) {
                K(this.f11376b0);
            }
        }
    }

    public final void C() {
        if (!this.f11391r0) {
            return;
        }
        this.f11391r0 = false;
        float f10 = this.U.f11338w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w7(this, getScrollY(), f10, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gr.f28844f);
        ofFloat.start();
    }

    public final void D(boolean z10) {
        if (this.f11391r0 && !z10) {
            return;
        }
        this.f11391r0 = true;
        float f10 = this.U.f11338w;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w7(this, getScrollY(), f10, 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gr.f28844f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.f11391r0 = false;
        d8 d8Var = this.U;
        d8Var.f11338w = 0.0f;
        d8Var.invalidate();
    }

    public final void K(float f10) {
        o1.j jVar = this.T;
        if (!jVar.f18794f) {
            jVar.f18790a = f10;
            jVar.f();
        }
        if (getScrollY() < AndroidUtilities.dp(2.0f)) {
            C();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ih.e8.L(int, int):void");
    }

    @Override
    public final void a(RectF rectF) {
        c8 c8Var;
        d8 d8Var = this.U;
        c8[] c8VarArr = d8Var.f11336r;
        if (c8VarArr != null && (c8Var = c8VarArr[0]) != null && c8Var.f11306p != null) {
            int i9 = d8Var.B;
            int i10 = d8Var.B;
            c8 c8Var2 = d8Var.f11336r[0];
            rectF.set(d8Var.A, (AndroidUtilities.lerp(c8Var.f11303m, c8Var.f11302l, d8Var.f11338w) + i9) - d8Var.f11336r[0].f11306p.b(), getWidth() - d8Var.A, AndroidUtilities.lerp(c8Var2.f11303m, c8Var2.f11302l, d8Var.f11338w) + i10);
            float x10 = d8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f11387n0;
            rectF.offset(frameLayout.getX() + x10, frameLayout.getY() + (d8Var.getY() - getScrollY()));
        }
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        c8 c8Var;
        d8 d8Var = this.U;
        c8[] c8VarArr = d8Var.f11336r;
        c8[] c8VarArr2 = d8Var.f11336r;
        if (c8VarArr != null && (c8Var = c8VarArr[0]) != null && c8Var.f11306p != null) {
            canvas.save();
            float x10 = d8Var.getX() - getScrollX();
            FrameLayout frameLayout = this.f11387n0;
            float x11 = frameLayout.getX() + x10 + d8Var.A;
            float y10 = frameLayout.getY() + (d8Var.getY() - getScrollY()) + d8Var.B;
            c8 c8Var2 = c8VarArr2[0];
            canvas.translate(x11, (y10 + AndroidUtilities.lerp(c8Var2.f11303m, c8Var2.f11302l, d8Var.f11338w)) - c8VarArr2[0].f11306p.b());
            z7 z7Var = c8VarArr2[0].f11306p;
            int width = getWidth();
            int i9 = d8Var.A;
            z7Var.a(canvas, (width - i9) - i9);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.V && this.W != 0.0f && (overScroller = this.f11381g0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f11389p0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i9 = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.f11390q0 + i9);
        canvas.clipRect(0, scrollY, width, i9);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final boolean g(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        float f10;
        int i12;
        iArr[1] = 0;
        if (!this.V || (((this.W) <= 0.0f || i10 <= 0) && (f10 >= 0.0f || i10 >= 0))) {
            return false;
        }
        float f11 = i10;
        float f12 = f10 - f11;
        if (i12 > 0) {
            if (f12 < 0.0f) {
                this.W = 0.0f;
                iArr[1] = (int) (f11 + f12 + 0);
            } else {
                this.W = f12;
                iArr[1] = i10;
            }
        } else if (f12 > 0.0f) {
            this.W = 0.0f;
            iArr[1] = (int) (f11 + f12 + 0);
        } else {
            this.W = f12;
            iArr[1] = i10;
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
        FrameLayout frameLayout = this.f11387n0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i9 = this.m0;
        if (i9 >= 0) {
            return i9 - ((ViewGroup.MarginLayoutParams) this.f11387n0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.clamp((getScrollY() - this.U.getTranslationY()) / Math.min(this.f11386l0, AndroidUtilities.dp(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.U.getTranslationY() + this.f11387n0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        float f10;
        float f11;
        float f12;
        if (i12 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.W) / this.f11387n0.getTop())) * i12);
            if (round != 0) {
                boolean z10 = this.V;
                d8 d8Var = this.U;
                if (!z10) {
                    if (!this.T.f18794f) {
                        OverScroller overScroller = this.f11381g0;
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
                            f11 = min * (-this.f11375a0);
                        } else {
                            f11 = 0.0f;
                        }
                        if (round != 0) {
                            float f13 = this.W - round;
                            this.W = f13;
                            d8Var.setTranslationY(f13);
                        }
                        K(f11);
                    }
                } else {
                    float f14 = this.W - round;
                    this.W = f14;
                    d8Var.setTranslationY(f14);
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
    public final void k(int i9) {
        super.k(i9);
        this.f11375a0 = Math.signum(i9);
        this.f11376b0 = 0.0f;
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ih.e8.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        L(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        super.onMeasure(i9, i10);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ih.e8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i9, int i10) {
        super.scrollBy(i9, i10);
        invalidate();
    }

    @Override
    public final boolean z(int i9, int i10) {
        if (i10 == 0) {
            this.T.c();
            this.V = true;
            this.W = this.U.getTranslationY();
        }
        return true;
    }

    public void F(org.telegram.ui.Components.t5 t5Var) {
    }

    public void I(z7 z7Var) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, g gVar) {
    }
}
