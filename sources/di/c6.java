package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
public final class c6 extends View implements org.telegram.ui.ActionBar.c6 {
    public final ImageReceiver f8595a;
    public final ImageReceiver f8596b;
    public final Path f8597c;
    public final Paint d;

    public c6(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.f8597c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.f30163a;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.l(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f8595a = imageReceiver;
        imageReceiver.K0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver.j0(tLObject, a9Var, null);
        org.telegram.ui.Components.a9 a9Var2 = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var2.l(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f8596b = imageReceiver2;
        imageReceiver2.K0(org.telegram.messenger.g0.L(30.0f));
        imageReceiver2.j0(tLObject2, a9Var2, null);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false));
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
        this.f8595a.Q();
        this.f8596b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8595a.S();
        this.f8596b.S();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() / 2) - (org.telegram.messenger.g0.L(156.0f) / 2);
        float height = (getHeight() / 2) - org.telegram.messenger.g0.L(30.0f);
        ImageReceiver imageReceiver = this.f8595a;
        imageReceiver.z0(width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver.h(canvas, null);
        canvas.save();
        canvas.translate((getWidth() / 2.0f) - (org.telegram.messenger.g0.L(6.166f) / 2.0f), getHeight() / 2.0f);
        canvas.drawPath(this.f8597c, this.d);
        canvas.restore();
        ImageReceiver imageReceiver2 = this.f8596b;
        imageReceiver2.z0(org.telegram.messenger.g0.L(96.0f) + width, height, org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(100.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E6, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
