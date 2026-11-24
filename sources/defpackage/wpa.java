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
public final class wpa extends View implements tjb {
    public final jqa a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public wpa(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        ykb ykbVar = zkb.a;
        jqa jqaVar = new jqa(this, starGift, 60, 0.27f);
        this.a = jqaVar;
        jqaVar.L = (byte) 3;
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(30.0f));
        imageReceiver.U(tLObject, pb0Var, null);
        paint.setColor(bkb.w0(null, bkb.D6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -gl.L(8.0f));
        path.lineTo(gl.L(6.166f), 0.0f);
        path.lineTo(0.0f, gl.L(8.0f));
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
        int width = (getWidth() / 2) - (gl.L(156.0f) / 2);
        int height = (getHeight() / 2) - gl.L(30.0f);
        jqa jqaVar = this.a;
        jqaVar.setBounds(width, height, gl.L(60.0f) + width, gl.L(60.0f) + height);
        jqaVar.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (gl.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(gl.L(96.0f) + width, height, gl.L(60.0f), gl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i = bkb.D6;
            paint.setColor(bkb.w0(null, i, false));
            paint.setColor(bkb.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public wpa(Context context, TL_stars.StarGift starGift) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        ykb ykbVar = zkb.a;
        jqa jqaVar = new jqa(this, starGift, 60, 0.27f);
        this.a = jqaVar;
        jqaVar.L = (byte) 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(30.0f));
        imageReceiver.g0(o5a.a(60, "fragment"));
        paint.setColor(bkb.w0(null, bkb.D6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.L(2.33f));
        path.rewind();
        path.moveTo(0.0f, -gl.L(8.0f));
        path.lineTo(gl.L(6.166f), 0.0f);
        path.lineTo(0.0f, gl.L(8.0f));
    }
}
