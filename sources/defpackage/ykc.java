package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ykc extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final kjc e;
    public final RectF f;

    public ykc(Context context, kjc kjcVar, int i) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = kjcVar;
        kjcVar.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, tre.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, tre.d(-2, -2.0f, 16, i != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
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
        kjc kjcVar = this.e;
        kjcVar.d(x, y);
        Paint paint = kjcVar.l;
        if (this.d) {
            b = paint;
        } else {
            b = kjcVar.b();
        }
        int alpha = b.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b2 = paint;
        } else {
            b2 = kjcVar.b();
        }
        b2.setAlpha(255);
        float L = hl.L(16.0f);
        float L2 = hl.L(16.0f);
        if (this.d) {
            b3 = paint;
        } else {
            b3 = kjcVar.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b3);
        if (!this.d) {
            paint = kjcVar.b();
        }
        paint.setAlpha(alpha);
        if (kjcVar.e) {
            int alpha2 = ((Paint) kjcVar.d.a).getAlpha();
            ((Paint) kjcVar.d.a).setAlpha(255);
            canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), (Paint) kjcVar.d.a);
            ((Paint) kjcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
