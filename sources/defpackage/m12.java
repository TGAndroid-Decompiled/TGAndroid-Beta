package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public class m12 extends View implements tjb {
    public final gia a;
    public final Paint b;
    public float c;
    public yla d;
    public final wjb e;

    public m12(Context context, wjb wjbVar) {
        super(context);
        gia giaVar = new gia(new qm0((byte) 25), new qm0((byte) 26));
        giaVar.c = 100.0f;
        this.a = giaVar;
        Paint paint = new Paint(1);
        this.b = paint;
        this.e = wjbVar;
        paint.setColor(bkb.v0(bkb.Ei, wjbVar));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
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
        yla ylaVar = new yla(this, this.a);
        zla zlaVar = new zla();
        zlaVar.b(400.0f);
        zlaVar.a(1.0f);
        ylaVar.m = zlaVar;
        this.d = ylaVar;
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
        yla ylaVar = this.d;
        if (ylaVar == null) {
            setLoadProgress(f);
            return;
        }
        ylaVar.m.i = f * 100.0f;
        ylaVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(bkb.v0(bkb.Ei, this.e));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
