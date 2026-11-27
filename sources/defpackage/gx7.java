package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
public final class gx7 extends View {
    public final mm E;
    public pa9 F;
    public float G;
    public float H;
    public igb I;
    public Runnable J;
    public boolean K;
    public fx7 L;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final kj4 d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final mm x;
    public final mm y;

    public gx7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new mm(this);
        this.y = new mm(this);
        this.E = new mm(this);
        this.I = new igb(1.0f, 0.016773745f, -1);
        this.K = true;
        this.d = new kj4(context, new ex7(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(hl.L(4.0f), 0.0f, hl.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(hl.L(3.0f), 0.0f, hl.L(1.0f), 637534208);
    }

    public final void a(float f, float f2, float f3, Canvas canvas, boolean z) {
        if (z) {
            RectF rectF = hl.P;
            rectF.set((f - f3) - hl.L(6.0f), (f2 - f3) - hl.L(6.0f), f + f3 + hl.L(6.0f), f2 + f3 + hl.L(6.0f));
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
        fx7 fx7Var = this.L;
        if (fx7Var != null) {
            f = fx7Var.get();
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
                this.n = qu6.z((float) min, 200.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.n = bp1.x((float) min, 200.0f, f2, 0.0f);
            invalidate();
        }
        boolean z2 = this.f;
        float f3 = this.r;
        if (z2) {
            if (f3 != 1.0f) {
                this.r = qu6.z((float) min, 200.0f, f3, 1.0f);
                invalidate();
            }
        } else if (f3 != 0.0f) {
            this.r = bp1.x((float) min, 200.0f, f3, 0.0f);
            invalidate();
        }
        RectF rectF = this.e;
        float height = rectF.height();
        int L = hl.L(16.0f);
        int L2 = hl.L(3.0f);
        int L3 = hl.L(3.0f);
        Path path = this.c;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        RectF rectF2 = hl.P;
        int i = -L3;
        int i2 = -L;
        rectF2.set(hl.U1(this.r, i, i2), 0.0f, hl.U1(this.r, L3, L), hl.U1(this.r, L3, L) << 1);
        path.arcTo(rectF2, -90.0f, 90.0f);
        path.lineTo(hl.U1(this.r, L3, L2), height);
        rectF2.set(hl.U1(this.r, i, -L2), height - (L2 << 1), hl.U1(this.r, L3, L2), height);
        path.arcTo(rectF2, 0.0f, 180.0f);
        float f4 = L;
        path.lineTo(hl.U1(this.r, i, i2), f4);
        rectF2.set(hl.U1(this.r, i, i2), 0.0f, hl.U1(this.r, L3, L), L << 1);
        path.arcTo(rectF2, -180.0f, 90.0f);
        path.close();
        if (this.n != 0.0f) {
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
        }
        canvas.save();
        k43 k43Var = k43.f;
        canvas.translate(k43Var.getInterpolation(this.r) * hl.L(32.0f), rectF.top);
        canvas.drawPath(path, this.a);
        canvas.restore();
        float f5 = (e - e2) / (e3 - e2);
        float f6 = L2 * 1.5f;
        a(k43Var.getInterpolation(this.r) * hl.L(32.0f), ete.a(qd4.A(1.0f, f5, rectF.height(), rectF.top), rectF.top + f4, rectF.bottom - Math.min(f6, f4)), hl.R1(hl.L(12.0f), hl.R1(Math.min(f6, f4), f4, f5), this.r), canvas, false);
        if (this.K && this.r != 0.0f && this.w && this.F != null) {
            pa9 pa9Var = this.F;
            float f7 = pa9Var.c.g.a;
            a(getWidth() / 2.0f, getHeight() / 2.0f, pa9Var.getCurrentBrush().g() * c00.x(f7, 0.043945312f, e, 0.00390625f * f7) * this.F.getCurrentBrush().f(), canvas, true);
        }
        if (this.n != 0.0f) {
            canvas.restore();
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, hl.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.b).onTouchEvent(motionEvent);
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

    public void setColorSwatch(igb igbVar) {
        this.I = igbVar;
        invalidate();
    }

    public void setDrawCenter(boolean z) {
        this.K = z;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.J = runnable;
    }

    public void setRenderView(pa9 pa9Var) {
        this.F = pa9Var;
    }

    public void setShowPreview(boolean z) {
        this.w = z;
        invalidate();
    }

    public void setValueOverride(fx7 fx7Var) {
        this.L = fx7Var;
        invalidate();
    }

    public void setViewHidden(boolean z) {
        this.h = z;
        invalidate();
    }
}
