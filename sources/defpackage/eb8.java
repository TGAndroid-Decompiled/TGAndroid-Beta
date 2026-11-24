package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.ui.ActionBar.a;
public abstract class eb8 extends NestedScrollView {
    public final Paint W;
    public final zna a0;
    public boolean b0;
    public float c0;
    public float d0;
    public float e0;
    public final Method f0;
    public final OverScroller g0;
    public boolean h0;
    public int i0;
    public int j0;
    public float k0;
    public boolean l0;
    public int m0;
    public final hb8 n0;
    public final FrameLayout o0;

    public eb8(Context context, hb8 hb8Var, FrameLayout frameLayout) {
        super(context);
        Paint paint = new Paint(1);
        this.W = paint;
        this.k0 = 1.0f;
        this.m0 = -1;
        this.n0 = hb8Var;
        this.o0 = frameLayout;
        setClipChildren(false);
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(gm.L(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        zna znaVar = new zna((Object) hb8Var, (vk4) zna.p, 0.0f);
        this.a0 = znaVar;
        znaVar.m.b(100.0f);
        znaVar.f(1.0f);
        znaVar.b(new h20(this, (byte) 11));
        znaVar.a(new hx0(this, (byte) 6));
        znaVar.m.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("a", null);
            this.f0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            this.f0 = null;
            fc4.g(e, true);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.g0 = (OverScroller) declaredField.get(this);
        } catch (Exception e2) {
            this.g0 = null;
            fc4.g(e2, true);
        }
    }

    @Override
    public final boolean A(int i, int i2) {
        if (i2 == 0) {
            this.a0.d();
            this.b0 = true;
            this.c0 = this.n0.getTranslationY();
            F();
        }
        return true;
    }

    @Override
    public final void C(int i) {
        OverScroller overScroller;
        if (this.b0 && i == 0) {
            this.b0 = false;
            if (this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
                float f = this.e0;
                zna znaVar = this.a0;
                if (!znaVar.f) {
                    znaVar.a = f;
                    znaVar.h();
                }
            }
            E();
        }
    }

    public boolean D() {
        return true;
    }

    public final void H(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb8.H(int, int):void");
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.b0 && this.c0 != 0.0f && (overScroller = this.g0) != null && overScroller.isFinished()) {
            zna znaVar = this.a0;
            if (!znaVar.f) {
                znaVar.a = 0.0f;
                znaVar.h();
            }
        }
        G();
    }

    @Override
    public final boolean d(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        float f;
        int i4;
        iArr[1] = 0;
        if (!this.b0 || (((this.c0) <= 0.0f || i2 <= 0) && (f >= 0.0f || i2 >= 0))) {
            return false;
        }
        float f2 = i2;
        float f3 = f - f2;
        if (i4 > 0) {
            if (f3 < 0.0f) {
                this.c0 = 0.0f;
                iArr[1] = (int) (f2 + f3 + 0.0f);
            } else {
                this.c0 = f3;
                iArr[1] = i2;
            }
        } else if (f3 > 0.0f) {
            this.c0 = 0.0f;
            iArr[1] = (int) (f2 + f3 + 0.0f);
        } else {
            this.c0 = f3;
            iArr[1] = i2;
        }
        G();
        this.n0.setTranslationY(this.c0);
        return true;
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int save = canvas.save();
        int i = height + scrollY;
        canvas.clipRect(0, scrollY, width, i);
        Paint paint = this.W;
        paint.setAlpha((int) (this.k0 * 127.0f));
        canvas.drawRect(0.0f, this.n0.getTranslationY() + this.o0.getTop(), width, i, paint);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override
    public final void f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        float f;
        float f2;
        float f3;
        if (i4 != 0) {
            if (D()) {
                i6 = gm.m;
            } else {
                i6 = 0;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i6;
            int round = Math.round((1.0f - Math.abs((-this.c0) / (this.o0.getTop() - currentActionBarHeight))) * i4);
            if (round != 0) {
                boolean z = this.b0;
                hb8 hb8Var = this.n0;
                if (!z) {
                    zna znaVar = this.a0;
                    if (!znaVar.f) {
                        OverScroller overScroller = this.g0;
                        if (overScroller != null) {
                            f = overScroller.getCurrVelocity();
                        } else {
                            f = Float.NaN;
                        }
                        if (!Float.isNaN(f)) {
                            Point point = gm.q;
                            if (point.x > point.y) {
                                f3 = 3000.0f;
                            } else {
                                f3 = 5000.0f;
                            }
                            float min = Math.min(f3, f);
                            round = (int) ((round * min) / f);
                            f2 = min * (-this.d0);
                        } else {
                            f2 = 0.0f;
                        }
                        if (round != 0) {
                            float f4 = this.c0 - round;
                            this.c0 = f4;
                            hb8Var.setTranslationY(f4);
                        }
                        if (!znaVar.f) {
                            znaVar.a = f2;
                            znaVar.h();
                        }
                    }
                } else {
                    float f5 = this.c0 - round;
                    this.c0 = f5;
                    hb8Var.setTranslationY(f5);
                }
            }
            G();
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i = this.m0;
        if (i >= 0) {
            return i - ((ViewGroup.MarginLayoutParams) this.o0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void i(int i) {
        super.i(i);
        this.d0 = Math.signum(i);
        this.e0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        H(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.n0.getTranslationY() + (this.o0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }
}
