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
public final class sr7 extends HorizontalScrollView implements tjb {
    public int E;
    public int F;
    public int G;
    public int H;
    public final wjb I;
    public int J;
    public final lm K;
    public final lm L;
    public final LinearLayout.LayoutParams a;
    public final lv b;
    public eec c;
    public final LinearLayout d;
    public gec e;
    public int f;
    public int h;
    public float n;
    public final Paint r;
    public int s;
    public int w;
    public boolean x;
    public int y;

    public sr7(Context context, wjb wjbVar) {
        super(context);
        this.b = new lv(this, (byte) 2);
        this.h = 0;
        this.n = 0.0f;
        this.s = -10066330;
        this.w = 436207616;
        this.x = false;
        this.y = gl.L(52.0f);
        this.E = gl.L(8.0f);
        this.F = gl.L(2.0f);
        this.G = gl.L(12.0f);
        this.H = gl.L(24.0f);
        this.J = 0;
        s33 s33Var = s33.h;
        this.K = new lm(350L, this, s33Var);
        this.L = new lm(350L, this, s33Var);
        this.I = wjbVar;
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
        rr7 rr7Var = new rr7(this, getContext(), i);
        boolean z = true;
        rr7Var.setTextSize(1, 14.0f);
        rr7Var.setTypeface(gl.o());
        rr7Var.setTextColor(b(0.6f));
        rr7Var.setFocusable(true);
        rr7Var.setGravity(17);
        rr7Var.setText(charSequence);
        ote.b(rr7Var, 0.025f, 1.2f);
        rr7Var.setOnClickListener(new v0(this, i, (byte) 12));
        rr7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        this.d.addView(rr7Var, nme.k(10.0f, 0.0f, 10.0f, 0.0f, -2, -2));
        if (i != this.h) {
            z = false;
        }
        rr7Var.setSelected(z);
    }

    public final int b(float f) {
        return bm2.o(bkb.v0(bkb.Ml, this.I), (int) (f * 255.0f));
    }

    public final void c() {
        this.d.removeAllViews();
        this.f = this.e.getAdapter().b();
        for (int i = 0; i < this.f; i++) {
            boolean z = this.e.getAdapter() instanceof n04;
            gec gecVar = this.e;
            if (z) {
                ((n04) gecVar.getAdapter()).getClass();
                a(i, this.e.getAdapter().d(i));
            } else {
                a(i, gecVar.getAdapter().d(i));
            }
        }
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(new up(this, (byte) 5));
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
            } else if (this.e.getAdapter() instanceof n04) {
                ((n04) this.e.getAdapter()).getClass();
                if (i == 1) {
                    f = 12.0f;
                } else {
                    f = 18.0f;
                }
                int L = gl.L(f);
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
                RectF rectF = gl.P;
                rectF.set(0.0f, height - this.F, linearLayout.getWidth(), height);
                float f = this.F / 2.0f;
                canvas.drawRoundRect(rectF, f, f, paint);
            }
            View childAt = linearLayout.getChildAt(this.h);
            if (childAt != null) {
                float paddingLeft = childAt.getPaddingLeft() + childAt.getLeft();
                float right = childAt.getRight() - childAt.getPaddingRight();
                int i3 = (this.n > 0.0f ? 1 : (this.n == 0.0f ? 0 : -1));
                lm lmVar = this.L;
                lm lmVar2 = this.K;
                if (i3 > 0 && (i = this.h) < this.f - 1) {
                    View childAt2 = linearLayout.getChildAt(i + 1);
                    float paddingLeft2 = childAt2.getPaddingLeft() + childAt2.getLeft();
                    float f2 = this.n;
                    float f3 = 1.0f - f2;
                    e = (paddingLeft * f3) + (paddingLeft2 * f2);
                    e2 = (f3 * right) + (f2 * (childAt2.getRight() - childAt2.getPaddingRight()));
                    lmVar2.e(true, e);
                    lmVar.e(true, e2);
                    if (childAt instanceof rr7) {
                        rr7 rr7Var = (rr7) childAt;
                        rr7Var.setTextColor(rr7Var.a.b(gl.R1(0.6f, 0.8f, 1.0f - this.n)));
                    }
                    if (childAt2 instanceof rr7) {
                        rr7 rr7Var2 = (rr7) childAt2;
                        rr7Var2.setTextColor(rr7Var2.a.b(gl.R1(0.6f, 0.8f, this.n)));
                    }
                } else {
                    e = lmVar2.e(false, paddingLeft);
                    e2 = lmVar.e(false, right);
                }
                if (this.E != 0) {
                    paint.setColor(this.s);
                    RectF rectF2 = gl.P;
                    rectF2.set(e - gl.L(11.0f), getPaddingTop(), e2 + gl.L(11.0f), height - getPaddingBottom());
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
            post(new oq7(this, (byte) 1));
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

    public void setOnPageChangeListener(eec eecVar) {
        this.c = eecVar;
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

    public void setViewPager(gec gecVar) {
        this.e = gecVar;
        if (gecVar.getAdapter() != null) {
            gecVar.setOnPageChangeListener(this.b);
            c();
            return;
        }
        sc8.j("ViewPager does not have adapter instance.");
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
                    fa4.g(e, true);
                    return;
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
