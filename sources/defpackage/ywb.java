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
public final class ywb extends q5c {
    public final xl3 n3;
    public final lm o3;
    public final lm p3;
    public final RectF q3;
    public final Paint r3;
    public final lm s3;
    public Drawable t3;
    public int u3;
    public final Paint v3;
    public final kxb w3;

    public ywb(kxb kxbVar, Activity activity, int i, swb swbVar, twb twbVar, twb twbVar2, wjb wjbVar) {
        super(activity, i, 0, false, swbVar, twbVar, twbVar2, wjbVar);
        this.w3 = kxbVar;
        this.n3 = new xl3((byte) 7);
        s33 s33Var = s33.h;
        this.o3 = new lm(320L, this, s33Var);
        this.p3 = new lm(320L, this, s33Var);
        this.q3 = new RectF();
        this.r3 = new Paint(1);
        this.s3 = new lm(420L, this, s33Var);
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
            if (childAt instanceof fxb) {
                fxb fxbVar = (fxb) childAt;
                if (fxbVar.s) {
                    if (width > fxbVar.getX()) {
                        width = fxbVar.getX();
                        RecyclerView.R(fxbVar);
                    }
                    if (f4 < fxbVar.getX() + fxbVar.getWidth()) {
                        f4 = fxbVar.getX() + fxbVar.getWidth();
                        RecyclerView.R(fxbVar);
                    }
                }
            }
        }
        int i4 = (f4 > width ? 1 : (f4 == width ? 0 : -1));
        wjb wjbVar = this.o2;
        if (i4 > 0) {
            int p1 = bkb.p1(0.06f, bkb.v0(bkb.F6, wjbVar));
            Paint paint = this.v3;
            paint.setColor(p1);
            RectF rectF = gl.P;
            f2 = 14.0f;
            f = 1.0f;
            rectF.set(width + gl.L(1.0f), (getHeight() - gl.L(28.0f)) / 2.0f, f4 - gl.L(1.0f), (gl.L(28.0f) + getHeight()) / 2.0f);
            canvas2.drawRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), paint);
            if (this.t3 == null) {
                this.t3 = getContext().getResources().getDrawable(2131232206).mutate();
            }
            int v0 = bkb.v0(bkb.a9, wjbVar);
            if (this.u3 != v0) {
                Drawable drawable = this.t3;
                this.u3 = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            this.t3.setBounds((int) (gl.L(-17.0f) + f4), (int) (rectF.top + gl.L(10.0f)), (int) (f4 + gl.L(-7.0f)), (int) (rectF.top + gl.L(20.0f)));
            this.t3.draw(canvas2);
        } else {
            f = 1.0f;
            f2 = 14.0f;
        }
        super.dispatchDraw(canvas);
        kxb kxbVar = this.w3;
        long j = kxbVar.L;
        int i5 = (j > kxbVar.f0 ? 1 : (j == kxbVar.f0 ? 0 : -1));
        lm lmVar = this.s3;
        if (i5 != 0) {
            kxbVar.M = j;
            lmVar.e(true, 0.0f);
        }
        kxbVar.L = kxbVar.f0;
        fxb fxbVar2 = null;
        fxb fxbVar3 = null;
        int i6 = 0;
        while (i6 < getChildCount()) {
            View childAt2 = getChildAt(i6);
            if (childAt2 instanceof fxb) {
                fxb fxbVar4 = (fxb) childAt2;
                if (!fxbVar4.y) {
                    i = i2;
                    if (fxbVar4.getTopicId() == kxbVar.f0) {
                        fxbVar2 = fxbVar4;
                    }
                    z2 = z;
                    if (fxbVar4.getTopicId() == kxbVar.M) {
                        fxbVar3 = fxbVar4;
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
        if (fxbVar2 != null) {
            float x = fxbVar2.getX() + gl.L(f);
            float y = fxbVar2.getY() + gl.L(4.0f);
            float x2 = (fxbVar2.getX() + fxbVar2.getWidth()) - gl.L(f);
            float y2 = (fxbVar2.getY() + getHeight()) - gl.L(4.0f);
            RectF rectF2 = this.q3;
            rectF2.set(x, y, x2, y2);
            if (fxbVar3 != null) {
                RectF rectF3 = gl.P;
                rectF3.set(fxbVar3.getX() + gl.L(f), fxbVar3.getY() + gl.L(4.0f), (fxbVar3.getX() + fxbVar3.getWidth()) - gl.L(f), (fxbVar3.getY() + getHeight()) - gl.L(4.0f));
                gl.X1(rectF3, rectF2, lmVar.e(false, f), rectF2);
            }
            int o = bm2.o(bkb.v0(bkb.Ei, wjbVar), 31);
            Paint paint2 = this.r3;
            paint2.setColor(o);
            canvas2.drawRoundRect(rectF2, gl.L(f2), gl.L(f2), paint2);
        }
        if (z3) {
            canvas2.save();
            xl3 xl3Var = this.n3;
            if (i7 > 0) {
                RectF rectF4 = gl.P;
                f3 = 0.0f;
                rectF4.set(0.0f, 0.0f, gl.L(12.0f), getHeight());
                xl3Var.s(canvas2, rectF4, 0, d);
            } else {
                f3 = 0.0f;
            }
            if (d2 > f3) {
                RectF rectF5 = gl.P;
                rectF5.set(getWidth() - gl.L(12.0f), f3, getWidth(), getHeight());
                xl3Var.s(canvas2, rectF5, 2, d2);
            }
            canvas2.restore();
            canvas2.restore();
        }
    }
}
