package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
public class hd0 extends View {
    public final gd0 a;
    public nj8 b;
    public uib c;
    public Paint d;

    public hd0(Context context, boolean z) {
        super(context);
        this.a = new gd0(this, z);
    }

    public final void a(boolean z) {
        this.a.a(z, true);
    }

    public final void b(int i, int i2, TLObject tLObject) {
        this.a.j(i, i2, tLObject);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.e();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.f();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.g(canvas);
        if (this.c != null) {
            RectF rectF = gm.P;
            rectF.set(getWidth() - gm.L(22.0f), getHeight() - gm.L(22.0f), getWidth() - gm.L(0.0f), getHeight() - gm.L(0.0f));
            this.b.e(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + gm.L(1.33f), this.d);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.b.f);
            this.c.c(rectF.centerX() - (this.c.c / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        gd0 gd0Var = this.a;
        gd0Var.p = measuredWidth;
        gd0Var.o = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i) {
        this.a.h(i);
    }

    public void setCentered(boolean z) {
        this.a.l = z;
    }

    public void setCount(int i) {
        this.a.i(i);
    }

    public void setDelegate(Runnable runnable) {
        this.a.j = runnable;
    }

    public void setSize(int i) {
        this.a.s = i;
    }

    public void setStepFactor(float f) {
        this.a.t = f;
    }

    public void setStyle(int i) {
        gd0 gd0Var = this.a;
        gd0Var.k = i;
        gd0Var.d();
    }
}
