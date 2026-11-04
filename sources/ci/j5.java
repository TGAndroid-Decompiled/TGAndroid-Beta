package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class j5 extends View implements org.telegram.ui.ActionBar.z5 {
    public final w5 f5339a;
    public final ImageReceiver f5340b;
    public final Path f5341c;
    public final Paint d;

    public j5(Context context, TL_stars.StarGift starGift, TLObject tLObject) {
        super(context);
        Path path = new Path();
        this.f5341c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        w5 w5Var = new w5(this, starGift, 60, 0.27f);
        this.f5339a = w5Var;
        w5Var.L = 3;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5340b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.i0(tLObject, u8Var, null);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        path.rewind();
        path.moveTo(0.0f, -org.telegram.messenger.g0.L(8.0f));
        path.lineTo(org.telegram.messenger.g0.L(6.166f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5340b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5340b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        w5 w5Var = this.f5339a;
        w5Var.setBounds(width, height, org.telegram.messenger.g0.L(60.0f) + width, org.telegram.messenger.g0.L(60.0f) + height);
        w5Var.draw(canvas);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (org.telegram.messenger.g0.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f5341c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver = this.f5340b;
        imageReceiver.y0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        Paint paint = this.d;
        try {
            int i3 = org.telegram.ui.ActionBar.k6.E6;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public j5(Context context, TL_stars.StarGift starGift) {
        super(context);
        Path path = new Path();
        this.f5341c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        w5 w5Var = new w5(this, starGift, 60, 0.27f);
        this.f5339a = w5Var;
        w5Var.L = 3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5340b = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.w0(org.telegram.ui.Cells.r6.a(60, "fragment"));
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.33f));
        path.rewind();
        path.moveTo(0.0f, -org.telegram.messenger.g0.L(8.0f));
        path.lineTo(org.telegram.messenger.g0.L(6.166f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
