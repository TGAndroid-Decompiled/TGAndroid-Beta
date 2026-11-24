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
public final class azb extends q7c {
    public final in3 n3;
    public final ln o3;
    public final ln p3;
    public final RectF q3;
    public final Paint r3;
    public final ln s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final mzb w3;

    public azb(mzb mzbVar, Activity activity, int i, vyb vybVar, wyb wybVar, wyb wybVar2, ylb ylbVar) {
        super(activity, i, 0, false, vybVar, wybVar, wybVar2, ylbVar);
        this.w3 = mzbVar;
        this.n3 = new in3((byte) 7);
        d53 d53Var = d53.h;
        this.o3 = new ln(320L, this, d53Var);
        this.p3 = new ln(320L, this, d53Var);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new ln(420L, this, d53Var);
        this.v3 = new Paint(1);
    }

    @Override
    public final Integer W0(int i) {
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
            if (childAt instanceof hzb) {
                hzb hzbVar = (hzb) childAt;
                if (hzbVar.s) {
                    if (width > hzbVar.getX()) {
                        width = hzbVar.getX();
                        RecyclerView.R(hzbVar);
                    }
                    if (f4 < hzbVar.getX() + hzbVar.getWidth()) {
                        f4 = hzbVar.getX() + hzbVar.getWidth();
                        RecyclerView.R(hzbVar);
                    }
                }
            }
        }
        int i4 = (f4 > width ? 1 : (f4 == width ? 0 : -1));
        ylb ylbVar = this.o2;
        if (i4 > 0) {
            int p1 = cmb.p1(0.06f, cmb.v0(cmb.F6, ylbVar));
            Paint paint = this.v3;
            paint.setColor(p1);
            RectF rectF = gm.P;
            f2 = 14.0f;
            f = 1.0f;
            rectF.set(width + gm.L(1.0f), (getHeight() - gm.L(28.0f)) / 2.0f, f4 - gm.L(1.0f), (gm.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, gm.L(14.0f), gm.L(14.0f), paint);
            if (this.t3 == null) {
                this.t3 = getContext().getResources().getDrawable(2131232207).mutate();
            }
            int v0 = cmb.v0(cmb.a9, ylbVar);
            if (this.u3 != v0) {
                Drawable drawable = this.t3;
                this.u3 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            this.t3.setBounds((int) (gm.L(-17.0f) + f4), (int) (rectF.top + gm.L(10.0f)), (int) (f4 + gm.L(-7.0f)), (int) (rectF.top + gm.L(20.0f)));
            this.t3.draw(canvas2);
        } else {
            f = 1.0f;
            f2 = 14.0f;
        }
        super.dispatchDraw(canvas);
        mzb mzbVar = this.w3;
        long j = mzbVar.L;
        int i5 = (j > mzbVar.f0 ? 1 : (j == mzbVar.f0 ? 0 : -1));
        ln lnVar = this.s3;
        if (i5 != 0) {
            mzbVar.M = j;
            lnVar.e(true, 0.0f);
        }
        mzbVar.L = mzbVar.f0;
        hzb hzbVar2 = null;
        hzb hzbVar3 = null;
        int i6 = 0;
        while (i6 < getChildCount()) {
            View childAt2 = getChildAt(i6);
            if (childAt2 instanceof hzb) {
                hzb hzbVar4 = (hzb) childAt2;
                if (!hzbVar4.y) {
                    i = i2;
                    if (hzbVar4.getTopicId() == mzbVar.f0) {
                        hzbVar2 = hzbVar4;
                    }
                    z2 = z;
                    if (hzbVar4.getTopicId() == mzbVar.M) {
                        hzbVar3 = hzbVar4;
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
        if (hzbVar2 != null) {
            float x = hzbVar2.getX() + gm.L(f);
            float y = hzbVar2.getY() + gm.L(4.0f);
            float x2 = (hzbVar2.getX() + hzbVar2.getWidth()) - gm.L(f);
            float y2 = (hzbVar2.getY() + getHeight()) - gm.L(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x, y, x2, y2);
            if (hzbVar3 != null) {
                RectF rectF3 = gm.P;
                rectF3.set(hzbVar3.getX() + gm.L(f), hzbVar3.getY() + gm.L(4.0f), (hzbVar3.getX() + hzbVar3.getWidth()) - gm.L(f), (hzbVar3.getY() + getHeight()) - gm.L(4.0f));
                gm.X1(rectF3, rectF2, lnVar.e(false, f), rectF2);
            }
            int p = on2.p(cmb.v0(cmb.Ei, ylbVar), 31);
            Paint paint2 = this.r3;
            paint2.setColor(p);
            canvas2.drawRoundRect(rectF2, gm.L(f2), gm.L(f2), paint2);
        }
        if (z3) {
            canvas2.save();
            in3 in3Var = this.n3;
            if (i7 > 0) {
                RectF rectF4 = gm.P;
                f3 = 0.0f;
                rectF4.set(0.0f, 0.0f, gm.L(12.0f), getHeight());
                in3Var.r(canvas2, rectF4, 0, d);
            } else {
                f3 = 0.0f;
            }
            if (d2 > f3) {
                RectF rectF5 = gm.P;
                rectF5.set(getWidth() - gm.L(12.0f), f3, getWidth(), getHeight());
                in3Var.r(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
