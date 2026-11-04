package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class i6 extends View implements org.telegram.ui.ActionBar.z5 {
    public final ImageReceiver f5296a;
    public final ImageReceiver f5297b;
    public final Path f5298c;
    public final Paint d;

    public i6(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f5298c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.f28514a;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f5296a = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.i0(tLObject, u8Var, null);
        org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var2.l(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f5297b = imageReceiver2;
        imageReceiver2.J0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver2.i0(tLObject2, u8Var2, null);
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
        this.f5296a.P();
        this.f5297b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5296a.R();
        this.f5297b.R();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        float height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        ImageReceiver imageReceiver = this.f5296a;
        imageReceiver.y0(width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (org.telegram.messenger.g0.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f5298c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver2 = this.f5297b;
        imageReceiver2.y0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
