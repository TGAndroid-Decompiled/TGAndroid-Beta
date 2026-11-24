package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class vsa extends View implements vlb {
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public vsa(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        zmb zmbVar = anb.a;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.q0(gm.L(30.0f));
        imageReceiver.U(tLObject, pc0Var, null);
        pc0 pc0Var2 = new pc0((ylb) null);
        pc0Var2.k(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.b = imageReceiver2;
        imageReceiver2.q0(gm.L(30.0f));
        imageReceiver2.U(tLObject2, pc0Var2, null);
        paint.setColor(cmb.w0(null, cmb.D6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -gm.L(8.0f));
        path.lineTo(gm.L(6.166f), 0.0f);
        path.lineTo(0.0f, gm.L(8.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (gm.L(156.0f) / 2);
        float height = (getHeight() / 2) - gm.L(30.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(width, height, gm.L(60.0f), gm.L(60.0f));
        imageReceiver.h(canvas, null);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (gm.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver2 = this.b;
        imageReceiver2.i0(gm.L(96.0f) + width, height, gm.L(60.0f), gm.L(60.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(cmb.w0(null, cmb.D6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
