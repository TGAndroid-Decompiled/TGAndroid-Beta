package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
public final class aw7 extends View {
    public final ln E;
    public e99 F;
    public float G;
    public float H;
    public oeb I;
    public Runnable J;
    public boolean K;
    public zv7 L;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final lj4 d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final ln x;
    public final ln y;

    public aw7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new ln(this);
        this.y = new ln(this);
        this.E = new ln(this);
        this.I = new oeb(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new lj4(context, new yv7(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(gm.L(4.0f), 0.0f, gm.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(gm.L(3.0f), 0.0f, gm.L(1.0f), 637534208);
    }

    public final void a(float f, float f2, float f3, Canvas canvas, boolean z) {
        if (z) {
            RectF rectF = gm.P;
            rectF.set((f - f3) - gm.L(6.0f), (f2 - f3) - gm.L(6.0f), f + f3 + gm.L(6.0f), f2 + f3 + gm.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f, f2, f3, this.b);
        if (z) {
            canvas.restore();
        }
    }

    public final void b(float f, float f2) {
        this.G = f;
        this.H = f2;
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        zv7 zv7Var = this.L;
        if (zv7Var != null) {
            f = zv7Var.get();
        } else {
            f = this.I.c;
        }
        float e = this.x.e(false, f);
        float e2 = this.y.e(false, this.G);
        float e3 = this.E.e(false, this.H);
        boolean z = this.h;
        float f2 = this.n;
        if (z) {
            if (f2 != 1.0f) {
                this.n = kt6.A((float) min, 200.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.n = aq1.x((float) min, 200.0f, f2, 0.0f);
            invalidate();
        }
        boolean z2 = this.f;
        float f3 = this.r;
        if (z2) {
            if (f3 != 1.0f) {
                this.r = kt6.A((float) min, 200.0f, f3, 1.0f);
                invalidate();
            }
        } else if (f3 != 0.0f) {
            this.r = aq1.x((float) min, 200.0f, f3, 0.0f);
            invalidate();
        }
        RectF rectF = this.e;
        float height = rectF.height();
        int L = gm.L(16.0f);
        int L2 = gm.L(3.0f);
        int L3 = gm.L(3.0f);
        Path path = this.c;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        RectF rectF2 = gm.P;
        int i = -L3;
        int i2 = -L;
        rectF2.set(gm.U1(this.r, i, i2), 0.0f, gm.U1(this.r, L3, L), gm.U1(this.r, L3, L) << 1);
        path.arcTo(rectF2, -90.0f, 90.0f);
        path.lineTo(gm.U1(this.r, L3, L2), height);
        rectF2.set(gm.U1(this.r, i, -L2), height - (L2 << 1), gm.U1(this.r, L3, L2), height);
        path.arcTo(rectF2, 0.0f, 180.0f);
        float f4 = L;
        path.lineTo(gm.U1(this.r, i, i2), f4);
        rectF2.set(gm.U1(this.r, i, i2), 0.0f, gm.U1(this.r, L3, L), L << 1);
        path.arcTo(rectF2, -180.0f, 90.0f);
        path.close();
        if (this.n != 0.0f) {
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
        }
        canvas.save();
        d53 d53Var = d53.f;
        canvas.translate(d53Var.getInterpolation(this.r) * gm.L(32.0f), rectF.top);
        canvas.drawPath(path, this.a);
        canvas.restore();
        float f5 = (e - e2) / (e3 - e2);
        float f6 = L2 * 1.5f;
        a(d53Var.getInterpolation(this.r) * gm.L(32.0f), pqe.a(td4.A(1.0f, f5, rectF.height(), rectF.top), rectF.top + f4, rectF.bottom - Math.min(f6, f4)), gm.R1(gm.L(12.0f), gm.R1(Math.min(f6, f4), f4, f5), this.r), canvas, false);
        if (this.K && this.r != 0.0f && this.w && this.F != null) {
            e99 e99Var = this.F;
            float f7 = e99Var.c.g.a;
            a(getWidth() / 2.0f, getHeight() / 2.0f, e99Var.getCurrentBrush().g() * b10.w(f7, 0.043945312f, e, 0.00390625f * f7) * this.F.getCurrentBrush().f(), canvas, true);
        }
        if (this.n != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, gm.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.a).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f) {
        this.I.c = f;
        invalidate();
    }

    public void setColorSwatch(oeb oebVar) {
        this.I = oebVar;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.K = z;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(e99 e99Var) {
        this.F = e99Var;
    }

    public void setShowPreview(boolean z) {
        this.w = z;
        invalidate();
    }

    public void setValueOverride(zv7 zv7Var) {
        this.L = zv7Var;
        invalidate();
    }

    public void setViewHidden(boolean z) {
        this.h = z;
        invalidate();
    }
}
