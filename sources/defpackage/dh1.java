package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class dh1 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final n41 r;
    public boolean s;
    public final lm w;
    public final eh1 x;

    public dh1(eh1 eh1Var, Activity activity) {
        super(activity);
        this.x = eh1Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new n41(this);
        this.w = new lm(this, 0L, 320L, s33.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(da7 da7Var) {
        boolean o;
        boolean z;
        wjb wjbVar = this.x.a;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        boolean z2 = false;
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (o && da7Var.g() != da7Var.f() && da7Var.i() == da7Var.f()) {
            paint2.setColor(da7Var.e(1, wjbVar));
            paint.setColor(da7Var.e(0, wjbVar));
        } else {
            paint2.setColor(da7Var.e(0, wjbVar));
            paint.setColor(da7Var.e(1, wjbVar));
        }
        this.d.setColor(da7Var.e(2, wjbVar));
        if (da7Var.g() != da7Var.f()) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (da7Var.i() != da7Var.f()) {
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
            RectF rectF = gl.P;
            rectF.set((getMeasuredWidth() - gl.L(12.4f)) / 2.0f, (getMeasuredHeight() - gl.L(12.4f)) / 2.0f, (gl.L(12.4f) + getMeasuredWidth()) / 2.0f, (gl.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, gl.L(2.33f), gl.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.w.d(this.s);
        if (d > 0.0f) {
            float N = gl.N(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, gl.R1((paint.getStrokeWidth() * 0.5f) + gl.L(20.0f), gl.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(56.0f), gl.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, gl.L(20.0f), Path.Direction.CW);
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
