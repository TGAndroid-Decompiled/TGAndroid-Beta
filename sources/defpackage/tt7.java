package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class tt7 extends HorizontalScrollView implements vlb {
    public int E;
    public int F;
    public int G;
    public int H;
    public final ylb I;
    public int J;
    public final ln K;
    public final ln L;
    public final LinearLayout.LayoutParams a;
    public final lw b;
    public egc c;
    public final LinearLayout d;
    public ggc e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public tt7(Context context, ylb ylbVar) {
        super(context);
        this.b = new lw(this, (byte) 2);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.w = 436207616;
        this.x = false;
        this.y = gm.L(52.0f);
        this.E = gm.L(8.0f);
        this.F = gm.L(2.0f);
        this.G = gm.L(12.0f);
        this.H = gm.L(24.0f);
        this.J = 0;
        d53 d53Var = d53.h;
        this.K = new ln(350L, this, d53Var);
        this.L = new ln(350L, this, d53Var);
        this.I = ylbVar;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(linearLayout);
        Paint paint = new Paint();
        this.r = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.a = new LinearLayout.LayoutParams(-2, -1);
    }

    public final void a(int i, CharSequence charSequence) {
        st7 st7Var = new st7(this, getContext(), i);
        boolean z = true;
        st7Var.setTextSize(1, 14.0f);
        st7Var.setTypeface(gm.o());
        st7Var.setTextColor(b(0.6f));
        st7Var.setFocusable(true);
        st7Var.setGravity(17);
        st7Var.setText(charSequence);
        rve.b(st7Var, 0.025f, 1.2f);
        st7Var.setOnClickListener(new v0(this, i, (byte) 12));
        st7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        this.d.addView(st7Var, qoe.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i != this.h) {
            z = false;
        }
        st7Var.setSelected(z);
    }

    public final int b(float f) {
        return on2.p(cmb.v0(cmb.Ml, this.I), (int) (f * 255.0f));
    }

    public final void c() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i = 0; i < this.f; i++) {
            boolean z = this.e.getAdapter() instanceof y14;
            ggc ggcVar = this.e;
            if (z) {
                ((y14) ggcVar.getAdapter()).getClass();
                a(i, this.e.getAdapter().d(i));
            } else {
                a(i, ggcVar.getAdapter().d(i));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new uq(this, (byte) 5));
    }

    public final void d(int i, int i2) {
        View childAt;
        if (this.f != 0 && (childAt = this.d.getChildAt(i)) != null) {
            int left = childAt.getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.y;
            }
            if (left != this.J) {
                this.J = left;
                scrollTo(left, 0);
            }
        }
    }

    public final void e() {
        float f;
        for (int i = 0; i < this.f; i++) {
            View childAt = this.d.getChildAt(i);
            childAt.setLayoutParams(this.a);
            if (this.x) {
                childAt.setPadding(0, 0, 0, 0);
                childAt.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            } else if (this.e.getAdapter() instanceof y14) {
                ((y14) this.e.getAdapter()).getClass();
                if (i == 1) {
                    f = 12.0f;
                } else {
                    f = 18.0f;
                }
                int L = gm.L(f);
                childAt.setPadding(L, 0, L, 0);
            } else {
                int i2 = this.H;
                childAt.setPadding(i2, 0, i2, 0);
            }
        }
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getIndicatorColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.E;
    }

    public int getScrollOffset() {
        return this.y;
    }

    public boolean getShouldExpand() {
        return this.x;
    }

    public int getTabPaddingLeftRight() {
        return this.H;
    }

    public int getUnderlineColor() {
        return this.w;
    }

    public int getUnderlineHeight() {
        return this.F;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e;
        float e2;
        int i;
        if (!isInEditMode() && this.f != 0) {
            int height = getHeight();
            int i2 = this.F;
            LinearLayout linearLayout = this.d;
            Paint paint = this.r;
            if (i2 != 0) {
                paint.setColor(this.w);
                RectF rectF = gm.P;
                rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
                float f = this.F / 2.0f;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i3 = (this.n > 0.0f ? 1 : (this.n == 0.0f ? 0 : -1));
                ln lnVar = this.L;
                ln lnVar2 = this.K;
                if (i3 > 0 && (i = this.h) < this.f - 1) {
                    View childAt2 = linearLayout.getChildAt(i + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f2 = this.n;
                    float f3 = 1.0f - f2;
                    e = (paddingLeft * f3) + (paddingLeft2 * f2);
                    e2 = (f3 * right) + (f2 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    lnVar2.e(true, e);
                    lnVar.e(true, e2);
                    if (childAt instanceof st7) {
                        st7 st7Var = (st7) childAt;
                        st7Var.setTextColor(st7Var.a.b(gm.R1(0.6f, 0.8f, 1.0f - this.n)));
                    }
                    if (childAt2 instanceof st7) {
                        st7 st7Var2 = (st7) childAt2;
                        st7Var2.setTextColor(st7Var2.a.b(gm.R1(0.6f, 0.8f, this.n)));
                    }
                } else {
                    e = lnVar2.e(false, paddingLeft);
                    e2 = lnVar.e(false, right);
                }
                if (this.E != 0) {
                    paint.setColor(this.s);
                    RectF rectF2 = gm.P;
                    rectF2.set(e - gm.L(11.0f), getPaddingTop(), e2 + gm.L(11.0f), height - getPaddingBottom());
                    rectF2.offset(getPaddingLeft(), 0.0f);
                    canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
                }
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.x && View.MeasureSpec.getMode(i) != 0) {
            this.d.measure(getMeasuredWidth() | 1073741824, i2);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!this.x) {
            post(new kl7(this, (byte) 8));
        }
    }

    public void setDividerPadding(int i) {
        this.G = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.s = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.s = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.E = i;
        invalidate();
    }

    public void setOnPageChangeListener(egc egcVar) {
        this.c = egcVar;
    }

    public void setScrollOffset(int i) {
        this.y = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.x = z;
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        e();
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.H = i;
        e();
    }

    public void setUnderlineColor(int i) {
        this.w = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.w = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.F = i;
        invalidate();
    }

    public void setViewPager(ggc ggcVar) {
        this.e = ggcVar;
        if (ggcVar.getAdapter() != null) {
            ggcVar.setOnPageChangeListener(this.b);
            c();
            return;
        }
        dq9.m("ViewPager does not have adapter instance.");
    }

    @Override
    public final void updateColors() {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                try {
                    View childAt = linearLayout.getChildAt(i);
                    childAt.setSelected(childAt.isSelected());
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
