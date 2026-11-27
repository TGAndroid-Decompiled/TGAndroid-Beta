package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
public final class ss1 extends pmb {
    public final zu1 L;

    public ss1(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(activity);
        this.L = zu1Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = hl.L(24.0f);
        this.e = new OvershootInterpolator();
        this.I = new s8b(this, (byte) 18);
        this.K = new Path();
        int v0 = aob.v0(aob.yj, vnbVar);
        int alpha = Color.alpha(v0);
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setColor(v0);
        paint.setColor(v0);
        paint.setAlpha((int) (alpha * 0.14d));
        int L = hl.L(6.0f);
        int i = aob.wj;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        setBackground(b0);
        yob.j(this, b0, M, null, vnbVar);
    }

    public final void d() {
        int i = -(hl.L(16.0f) + getMeasuredHeight());
        zu1 zu1Var = this.L;
        int top = zu1Var.a0.getTop() - zu1Var.m1.getMeasuredHeight();
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
