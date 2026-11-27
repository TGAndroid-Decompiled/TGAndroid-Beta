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
public final class xta extends View implements snb {
    public final kua a;
    public final ImageReceiver b;
    public final Path c;
    public final Paint d;

    public xta(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        xob xobVar = yob.a;
        kua kuaVar = new kua(this, starGift, 60, 0.27f);
        this.a = kuaVar;
        kuaVar.L = (byte) 3;
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.k(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(30.0f));
        imageReceiver.U(tLObject, rb0Var, null);
        paint.setColor(aob.w0(null, aob.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -hl.L(8.0f));
        path.lineTo(hl.L(6.166f), 0.0f);
        path.lineTo(0.0f, hl.L(8.0f));
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
        int width = (getWidth() / 2) - (hl.L(156.0f) / 2);
        int height = (getHeight() / 2) - hl.L(30.0f);
        kua kuaVar = this.a;
        kuaVar.setBounds(width, height, hl.L(60.0f) + width, hl.L(60.0f) + height);
        kuaVar.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (hl.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(hl.L(96.0f) + width, height, hl.L(60.0f), hl.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i = aob.E6;
            paint.setColor(aob.w0(null, i, false));
            paint.setColor(aob.w0(null, i, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public xta(Context context, TL_stars.StarGift starGift) {
        super(context);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        xob xobVar = yob.a;
        kua kuaVar = new kua(this, starGift, 60, 0.27f);
        this.a = kuaVar;
        kuaVar.L = (byte) 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        imageReceiver.q0(hl.L(30.0f));
        imageReceiver.g0(g9a.a(60, "fragment"));
        paint.setColor(aob.w0(null, aob.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(hl.L(2.33f));
        path.rewind();
        path.moveTo(0.0f, -hl.L(8.0f));
        path.lineTo(hl.L(6.166f), 0.0f);
        path.lineTo(0.0f, hl.L(8.0f));
    }
}
