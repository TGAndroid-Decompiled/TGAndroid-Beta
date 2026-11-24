package defpackage;

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
public class k3b extends NestedScrollView implements bs5 {
    public final oib W;
    public final yla a0;
    public final j3b b0;
    public boolean c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public final OverScroller k0;
    public boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final FrameLayout r0;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v0;
    public boolean w0;

    public k3b(Context context, f53 f53Var) {
        super(context);
        Paint paint = new Paint(1);
        this.q0 = -1;
        new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, bm2.o(-16777216, 51)});
        FrameLayout frameLayout = new FrameLayout(context);
        this.r0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        kk7.i(this);
        j3b j3bVar = new j3b(this, getContext());
        this.b0 = j3bVar;
        oib oibVar = new oib(j3bVar, f53Var);
        this.W = oibVar;
        oibVar.h0 = false;
        frameLayout.addView(j3bVar, -1, -2);
        addView(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        paint.setColor(-16777216);
        setFadingEdgeLength(gl.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        yla ylaVar = new yla((Object) j3bVar, (ri4) yla.p, 0.0f);
        this.a0 = ylaVar;
        ylaVar.m.b(100.0f);
        ylaVar.f(1.0f);
        ylaVar.b(new h10(this, (byte) 17));
        ylaVar.m.a(1.0f);
        try {
            NestedScrollView.class.getDeclaredMethod("a", null).setAccessible(true);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.k0 = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.k0 = null;
            fa4.g(e2, true);
        }
    }

    @Override
    public final boolean A(int i, int i2) {
        if (i2 == 0) {
            this.a0.d();
            this.c0 = true;
            this.d0 = this.b0.getTranslationY();
        }
        return true;
    }

    @Override
    public final void C(int i) {
        OverScroller overScroller;
        if (this.c0 && i == 0) {
            this.c0 = false;
            if (this.d0 != 0.0f && (overScroller = this.k0) != null && overScroller.isFinished()) {
                K(this.f0);
            }
        }
    }

    public final void D() {
        if (!this.v0) {
            return;
        }
        this.v0 = false;
        float f = this.b0.x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3b(this, getScrollY(), f, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(s33.f);
        ofFloat.start();
    }

    public final void E(boolean z) {
        if (this.v0 && !z) {
            return;
        }
        this.v0 = true;
        float f = this.b0.x;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3b(this, getScrollY(), f, (byte) 1));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(s33.f);
        ofFloat.start();
    }

    public final void J() {
        scrollTo(0, 0);
        this.v0 = false;
        j3b j3bVar = this.b0;
        j3bVar.x = 0.0f;
        j3bVar.invalidate();
    }

    public final void K(float f) {
        yla ylaVar = this.a0;
        if (!ylaVar.f) {
            ylaVar.a = f;
            ylaVar.h();
        }
        if (getScrollY() < gl.L(2.0f)) {
            D();
        }
    }

    public final void L(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.L(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.c0 && this.d0 != 0.0f && (overScroller = this.k0) != null && overScroller.isFinished()) {
            K(0.0f);
        }
    }

    @Override
    public final boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.c0) {
            float f = this.d0;
            float f2 = 0.0f;
            int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if ((i4 > 0 && i2 > 0) || (f < 0.0f && i2 < 0)) {
                float f3 = i2;
                float f4 = f - f3;
                if (i4 > 0) {
                    if (f4 < 0.0f) {
                        this.d0 = 0.0f;
                        iArr[1] = (int) (f3 + f4 + 0.0f);
                    } else {
                        this.d0 = f4;
                        iArr[1] = i2;
                        f2 = f4;
                    }
                } else if (f4 > 0.0f) {
                    this.d0 = 0.0f;
                    iArr[1] = (int) (f3 + f4 + 0.0f);
                } else {
                    this.d0 = f4;
                    iArr[1] = i2;
                    f2 = f4;
                }
                this.b0.setTranslationY(f2);
                this.W.v();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.t0) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, this.u0 + i);
        canvas.clipRect(0, scrollY, width, i);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void e(RectF rectF) {
        i3b i3bVar;
        j3b j3bVar = this.b0;
        i3b[] i3bVarArr = j3bVar.r;
        if (i3bVarArr != null && (i3bVar = i3bVarArr[0]) != null && i3bVar.p != null) {
            int i = j3bVar.G;
            int i2 = i3bVar.m;
            int i3 = i3bVar.l;
            int i4 = j3bVar.G;
            i3b i3bVar2 = j3bVar.r[0];
            rectF.set(j3bVar.F, (gl.U1(j3bVar.x, i2, i3) + i) - j3bVar.r[0].p.b(), getWidth() - j3bVar.F, gl.U1(j3bVar.x, i3bVar2.m, i3bVar2.l) + i4);
            float x = j3bVar.getX() - getScrollX();
            FrameLayout frameLayout = this.r0;
            rectF.offset(frameLayout.getX() + x, frameLayout.getY() + (j3bVar.getY() - getScrollY()));
        }
    }

    @Override
    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        float f;
        float f2;
        float f3;
        if (i4 != 0) {
            int round = Math.round((1.0f - Math.abs((-this.d0) / this.r0.getTop())) * i4);
            if (round != 0) {
                boolean z = this.c0;
                j3b j3bVar = this.b0;
                if (!z) {
                    if (!this.a0.f) {
                        OverScroller overScroller = this.k0;
                        if (overScroller != null) {
                            f = overScroller.getCurrVelocity();
                        } else {
                            f = Float.NaN;
                        }
                        if (!Float.isNaN(f)) {
                            Point point = gl.q;
                            if (point.x > point.y) {
                                f3 = 3000.0f;
                            } else {
                                f3 = 5000.0f;
                            }
                            float min = Math.min(f3, f);
                            round = (int) ((round * min) / f);
                            f2 = min * (-this.e0);
                        } else {
                            f2 = 0.0f;
                        }
                        if (round != 0) {
                            float f4 = this.d0 - round;
                            this.d0 = f4;
                            j3bVar.setTranslationY(f4);
                        }
                        K(f2);
                    }
                } else {
                    float f5 = this.d0 - round;
                    this.d0 = f5;
                    j3bVar.setTranslationY(f5);
                }
            }
        }
        this.W.v();
    }

    @Override
    public final void g(Canvas canvas, float f) {
        i3b i3bVar;
        j3b j3bVar = this.b0;
        i3b[] i3bVarArr = j3bVar.r;
        i3b[] i3bVarArr2 = j3bVar.r;
        if (i3bVarArr != null && (i3bVar = i3bVarArr[0]) != null && i3bVar.p != null) {
            canvas.save();
            float x = j3bVar.getX() - getScrollX();
            FrameLayout frameLayout = this.r0;
            float x2 = frameLayout.getX() + x + j3bVar.F;
            float y = frameLayout.getY() + (j3bVar.getY() - getScrollY()) + j3bVar.G;
            i3b i3bVar2 = i3bVarArr2[0];
            canvas.translate(x2, (y + gl.U1(j3bVar.x, i3bVar2.m, i3bVar2.l)) - i3bVarArr2[0].p.b());
            f3b f3bVar = i3bVarArr2[0].p;
            int width = getWidth();
            int i = j3bVar.F;
            f3bVar.a(canvas, (width - i) - i);
            canvas.restore();
            return;
        }
        draw(canvas);
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public float getMaxTop() {
        FrameLayout frameLayout = this.r0;
        return frameLayout.getTop() - (frameLayout.getBottom() - getMeasuredHeight());
    }

    public int getPendingMarginTopDiff() {
        int i = this.q0;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.r0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    public float getProgressToBlackout() {
        return Utilities.i((getScrollY() - this.b0.getTranslationY()) / Math.min(this.p0, gl.L(40.0f)), 1.0f, 0.0f);
    }

    public float getTextTop() {
        return (this.b0.getTranslationY() + this.r0.getTop()) - getScrollY();
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i) {
        super.i(i);
        this.e0 = Math.signum(i);
        this.f0 = 0.0f;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.W.v();
    }

    @Override
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        L(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
        invalidate();
    }

    @Override
    public void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }

    public void F(gm gmVar) {
    }

    public void I(f3b f3bVar) {
    }

    public void G(CharacterStyle characterStyle, View view) {
    }

    public void H(URLSpan uRLSpan, View view, kya kyaVar) {
    }
}
