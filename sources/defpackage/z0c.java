package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class z0c extends q9c {
    public final pm3 n3;
    public final mm o3;
    public final mm p3;
    public final RectF q3;
    public final Paint r3;
    public final mm s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final l1c w3;

    public z0c(l1c l1cVar, Activity activity, int i, y0c y0cVar, t0c t0cVar, t0c t0cVar2, vnb vnbVar) {
        super(activity, i, 0, false, y0cVar, t0cVar, t0cVar2, vnbVar);
        this.w3 = l1cVar;
        this.n3 = new pm3((byte) 7);
        k43 k43Var = k43.h;
        this.o3 = new mm(320L, this, k43Var);
        this.p3 = new mm(320L, this, k43Var);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new mm(420L, this, k43Var);
        this.v3 = new Paint(1);
    }

    @Override
    public final Integer X0(int i) {
        return 0;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        int i;
        boolean z2;
        float d = this.o3.d(canScrollHorizontally(-1));
        float d2 = this.p3.d(canScrollHorizontally(1));
        int i2 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i2 <= 0 && d2 <= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        } else {
            canvas2 = canvas;
        }
        float width = getWidth();
        float f4 = 0.0f;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof g1c) {
                g1c g1cVar = (g1c) childAt;
                if (g1cVar.s) {
                    if (width > g1cVar.getX()) {
                        width = g1cVar.getX();
                        RecyclerView.S(g1cVar);
                    }
                    if (f4 < g1cVar.getX() + g1cVar.getWidth()) {
                        f4 = g1cVar.getX() + g1cVar.getWidth();
                        RecyclerView.S(g1cVar);
                    }
                }
            }
        }
        int i4 = (f4 > width ? 1 : (f4 == width ? 0 : -1));
        vnb vnbVar = this.o2;
        if (i4 > 0) {
            int p1 = aob.p1(0.06f, aob.v0(aob.G6, vnbVar));
            Paint paint = this.v3;
            paint.setColor(p1);
            RectF rectF = hl.P;
            f2 = 14.0f;
            f = 1.0f;
            rectF.set(width + hl.L(1.0f), (getHeight() - hl.L(28.0f)) / 2.0f, f4 - hl.L(1.0f), (hl.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, hl.L(14.0f), hl.L(14.0f), paint);
            if (this.t3 == null) {
                this.t3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int v0 = aob.v0(aob.b9, vnbVar);
            if (this.u3 != v0) {
                Drawable drawable = this.t3;
                this.u3 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            this.t3.setBounds((int) (hl.L(-17.0f) + f4), (int) (rectF.top + hl.L(10.0f)), (int) (f4 + hl.L(-7.0f)), (int) (rectF.top + hl.L(20.0f)));
            this.t3.draw(canvas2);
        } else {
            f = 1.0f;
            f2 = 14.0f;
        }
        super.dispatchDraw(canvas);
        l1c l1cVar = this.w3;
        long j = l1cVar.L;
        int i5 = (j > l1cVar.f0 ? 1 : (j == l1cVar.f0 ? 0 : -1));
        mm mmVar = this.s3;
        if (i5 != 0) {
            l1cVar.M = j;
            mmVar.e(true, 0.0f);
        }
        l1cVar.L = l1cVar.f0;
        g1c g1cVar2 = null;
        g1c g1cVar3 = null;
        int i6 = 0;
        while (i6 < getChildCount()) {
            View childAt2 = getChildAt(i6);
            if (childAt2 instanceof g1c) {
                g1c g1cVar4 = (g1c) childAt2;
                if (!g1cVar4.y) {
                    i = i2;
                    if (g1cVar4.getTopicId() == l1cVar.f0) {
                        g1cVar2 = g1cVar4;
                    }
                    z2 = z;
                    if (g1cVar4.getTopicId() == l1cVar.M) {
                        g1cVar3 = g1cVar4;
                    }
                    i6++;
                    i2 = i;
                    z = z2;
                }
            }
            i = i2;
            z2 = z;
            i6++;
            i2 = i;
            z = z2;
        }
        int i7 = i2;
        boolean z3 = z;
        if (g1cVar2 != null) {
            float x = g1cVar2.getX() + hl.L(f);
            float y = g1cVar2.getY() + hl.L(4.0f);
            float x2 = (g1cVar2.getX() + g1cVar2.getWidth()) - hl.L(f);
            float y2 = (g1cVar2.getY() + getHeight()) - hl.L(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x, y, x2, y2);
            if (g1cVar3 != null) {
                RectF rectF3 = hl.P;
                rectF3.set(g1cVar3.getX() + hl.L(f), g1cVar3.getY() + hl.L(4.0f), (g1cVar3.getX() + g1cVar3.getWidth()) - hl.L(f), (g1cVar3.getY() + getHeight()) - hl.L(4.0f));
                hl.X1(rectF3, rectF2, mmVar.e(false, f), rectF2);
            }
            int o = vm2.o(aob.v0(aob.Fi, vnbVar), 31);
            Paint paint2 = this.r3;
            paint2.setColor(o);
            canvas2.drawRoundRect(rectF2, hl.L(f2), hl.L(f2), paint2);
        }
        if (z3) {
            canvas2.save();
            pm3 pm3Var = this.n3;
            if (i7 > 0) {
                RectF rectF4 = hl.P;
                f3 = 0.0f;
                rectF4.set(0.0f, 0.0f, hl.L(12.0f), getHeight());
                pm3Var.r(canvas2, rectF4, 0, d);
            } else {
                f3 = 0.0f;
            }
            if (d2 > f3) {
                RectF rectF5 = hl.P;
                rectF5.set(getWidth() - hl.L(12.0f), f3, getWidth(), getHeight());
                pm3Var.r(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
