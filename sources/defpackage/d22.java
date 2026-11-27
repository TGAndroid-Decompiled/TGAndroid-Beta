package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public class d22 extends View implements snb {
    public final bma a;
    public final Paint b;
    public float c;
    public vpa d;
    public final vnb e;

    public d22(Context context, vnb vnbVar) {
        super(context);
        bma bmaVar = new bma(new c22((byte) 0), new c22((byte) 1));
        bmaVar.c = 100.0f;
        this.a = bmaVar;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = vnbVar;
        paint.setColor(aob.v0(aob.Fi, vnbVar));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c > 0.0f) {
            Paint paint = this.b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vpa vpaVar = new vpa(this, this.a);
        wpa wpaVar = new wpa();
        wpaVar.b(400.0f);
        wpaVar.a(1.0f);
        vpaVar.m = wpaVar;
        this.d = vpaVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f) {
        this.c = f;
        invalidate();
    }

    public void setLoadProgressAnimated(float f) {
        vpa vpaVar = this.d;
        if (vpaVar == null) {
            setLoadProgress(f);
            return;
        }
        vpaVar.m.i = f * 100.0f;
        vpaVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(aob.v0(aob.Fi, this.e));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
