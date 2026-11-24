package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
public final class li1 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final u51 r;
    public boolean s;
    public final ln w;
    public final mi1 x;

    public li1(mi1 mi1Var, Activity activity) {
        super(activity);
        this.x = mi1Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new u51(this);
        this.w = new ln(this, 0L, 320L, d53.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(ec7 ec7Var) {
        boolean o;
        boolean z;
        ylb ylbVar = this.x.a;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        boolean z2 = false;
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (o && ec7Var.g() != ec7Var.f() && ec7Var.i() == ec7Var.f()) {
            paint2.setColor(ec7Var.e(1, ylbVar));
            paint.setColor(ec7Var.e(0, ylbVar));
        } else {
            paint2.setColor(ec7Var.e(0, ylbVar));
            paint.setColor(ec7Var.e(1, ylbVar));
        }
        this.d.setColor(ec7Var.e(2, ylbVar));
        if (ec7Var.g() != ec7Var.f()) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (ec7Var.i() != ec7Var.f()) {
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
            RectF rectF = gm.P;
            rectF.set((getMeasuredWidth() - gm.L(12.4f)) / 2.0f, (getMeasuredHeight() - gm.L(12.4f)) / 2.0f, (gm.L(12.4f) + getMeasuredWidth()) / 2.0f, (gm.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, gm.L(2.33f), gm.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.w.d(this.s);
        if (d > 0.0f) {
            float N = gm.N(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, gm.R1((paint.getStrokeWidth() * 0.5f) + gm.L(20.0f), gm.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(56.0f), gm.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, gm.L(20.0f), Path.Direction.CW);
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
