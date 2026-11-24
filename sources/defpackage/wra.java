package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class wra extends View implements vlb {
    public final jsa a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public wra(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        zmb zmbVar = anb.a;
        jsa jsaVar = new jsa(this, starGift, 60, 0.27f);
        this.a = jsaVar;
        jsaVar.L = (byte) 3;
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gm.L(30.0f));
        imageReceiver.U(tLObject, pc0Var, null);
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
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (gm.L(156.0f) / 2);
        int height = (getHeight() / 2) - gm.L(30.0f);
        jsa jsaVar = this.a;
        jsaVar.setBounds(width, height, gm.L(60.0f) + width, gm.L(60.0f) + height);
        jsaVar.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (gm.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(gm.L(96.0f) + width, height, gm.L(60.0f), gm.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i = cmb.D6;
            paint.setColor(cmb.w0(null, i, false));
            paint.setColor(cmb.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public wra(Context context, TL_stars.StarGift starGift) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        zmb zmbVar = anb.a;
        jsa jsaVar = new jsa(this, starGift, 60, 0.27f);
        this.a = jsaVar;
        jsaVar.L = (byte) 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gm.L(30.0f));
        imageReceiver.g0(q7a.a(60, "fragment"));
        paint.setColor(cmb.w0(null, cmb.D6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gm.L(2.33f));
        path.rewind();
        path.moveTo(0.0f, -gm.L(8.0f));
        path.lineTo(gm.L(6.166f), 0.0f);
        path.lineTo(0.0f, gm.L(8.0f));
    }
}
