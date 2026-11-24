package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class tic extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final lhc e;
    public final RectF f;

    public tic(Context context, lhc lhcVar, int i) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = lhcVar;
        lhcVar.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, qoe.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, qoe.d(-2, -2.0f, 16, i != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint b;
        Paint b2;
        Paint b3;
        RectF rectF = this.f;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        float x = ((View) getParent()).getX() + getX();
        float y = ((View) getParent()).getY() + getY();
        lhc lhcVar = this.e;
        lhcVar.d(x, y);
        Paint paint = lhcVar.l;
        if (this.d) {
            b = paint;
        } else {
            b = lhcVar.b();
        }
        int alpha = b.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b2 = paint;
        } else {
            b2 = lhcVar.b();
        }
        b2.setAlpha(255);
        float L = gm.L(16.0f);
        float L2 = gm.L(16.0f);
        if (this.d) {
            b3 = paint;
        } else {
            b3 = lhcVar.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b3);
        if (!this.d) {
            paint = lhcVar.b();
        }
        paint.setAlpha(alpha);
        if (lhcVar.e) {
            int alpha2 = ((Paint) lhcVar.d.a).getAlpha();
            ((Paint) lhcVar.d.a).setAlpha(255);
            canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), (Paint) lhcVar.d.a);
            ((Paint) lhcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
