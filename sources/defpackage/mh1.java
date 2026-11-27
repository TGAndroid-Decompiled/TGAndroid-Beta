package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class mh1 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final v41 r;
    public boolean s;
    public final mm w;
    public final nh1 x;

    public mh1(nh1 nh1Var, Activity activity) {
        super(activity);
        this.x = nh1Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new v41(this);
        this.w = new mm(this, 0L, 320L, k43.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(kc7 kc7Var) {
        boolean o;
        boolean z;
        vnb vnbVar = this.x.a;
        if (vnbVar != null) {
            o = vnbVar.a();
        } else {
            o = aob.I.o();
        }
        boolean z2 = false;
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (o && kc7Var.g() != kc7Var.f() && kc7Var.i() == kc7Var.f()) {
            paint2.setColor(kc7Var.e(1, vnbVar));
            paint.setColor(kc7Var.e(0, vnbVar));
        } else {
            paint2.setColor(kc7Var.e(0, vnbVar));
            paint.setColor(kc7Var.e(1, vnbVar));
        }
        this.d.setColor(kc7Var.e(2, vnbVar));
        if (kc7Var.g() != kc7Var.f()) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (kc7Var.i() != kc7Var.f()) {
            z2 = true;
        }
        this.n = z2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a = this.r.a(0.05f);
        canvas.scale(a, a, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.b);
        if (this.h) {
            canvas.drawPath(this.f, this.c);
        }
        canvas.restore();
        if (this.n) {
            canvas.save();
            RectF rectF = hl.P;
            rectF.set((getMeasuredWidth() - hl.L(12.4f)) / 2.0f, (getMeasuredHeight() - hl.L(12.4f)) / 2.0f, (hl.L(12.4f) + getMeasuredWidth()) / 2.0f, (hl.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, hl.L(2.33f), hl.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.w.d(this.s);
        if (d > 0.0f) {
            float N = hl.N(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, hl.R1((paint.getStrokeWidth() * 0.5f) + hl.L(20.0f), hl.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(56.0f), hl.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, hl.L(20.0f), Path.Direction.CW);
        Path path2 = this.f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override
    public final void setBackgroundColor(int i) {
        this.a.setColor(i);
    }

    @Override
    public final void setPressed(boolean z) {
        super.setPressed(z);
        this.r.c(z);
    }
}
