package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class es1 extends tib {
    public final mu1 L;

    public es1(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(activity);
        this.L = mu1Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = gl.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new cib(this, (byte) 1);
        this.K = new Path();
        int v0 = bkb.v0(bkb.xj, wjbVar);
        int alpha = Color.alpha(v0);
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setColor(v0);
        paint.setColor(v0);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = gl.L(6.0f);
        int i = bkb.vj;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        setBackground(b0);
        zkb.j(this, b0, M, null, wjbVar);
    }

    public final void d() {
        int i = -(gl.L(16.0f) + getMeasuredHeight());
        mu1 mu1Var = this.L;
        int top = mu1Var.a0.getTop() - mu1Var.m1.getMeasuredHeight();
        setTranslationY(top - ((1.0f - getPrepareProgress()) * (top + i)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
