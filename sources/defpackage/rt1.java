package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class rt1 extends ukb {
    public final yv1 L;

    public rt1(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(activity);
        this.L = yv1Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = gm.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new zcb(this, (byte) 9);
        this.K = new Path();
        int v0 = cmb.v0(cmb.xj, ylbVar);
        int alpha = Color.alpha(v0);
        textPaint.setTextSize(gm.L(15.0f));
        textPaint.setColor(v0);
        paint.setColor(v0);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = gm.L(6.0f);
        int i = cmb.vj;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        setBackground(b0);
        anb.j(this, b0, M, null, ylbVar);
    }

    public final void d() {
        int i = -(gm.L(16.0f) + getMeasuredHeight());
        yv1 yv1Var = this.L;
        int top = yv1Var.a0.getTop() - yv1Var.m1.getMeasuredHeight();
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
