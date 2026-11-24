package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class sgc extends FrameLayout {
    public String a;
    public final ImageView b;
    public final TextView c;
    public boolean d;
    public final lfc e;
    public final RectF f;

    public sgc(Context context, lfc lfcVar, int i) {
        super(context);
        this.f = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.e = lfcVar;
        lfcVar.a(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, nme.d(24, 24.0f, 16, 8.0f, 2.0f, 8.0f, 2.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 14.0f);
        addView(textView, nme.d(-2, -2.0f, 16, i != 0 ? 36.0f : 14.0f, 2.0f, 14.0f, 2.0f));
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
        lfc lfcVar = this.e;
        lfcVar.d(x, y);
        Paint paint = lfcVar.l;
        if (this.d) {
            b = paint;
        } else {
            b = lfcVar.b();
        }
        int alpha = b.getAlpha();
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), alpha, 31);
        if (this.d) {
            b2 = paint;
        } else {
            b2 = lfcVar.b();
        }
        b2.setAlpha(255);
        float L = gl.L(16.0f);
        float L2 = gl.L(16.0f);
        if (this.d) {
            b3 = paint;
        } else {
            b3 = lfcVar.b();
        }
        canvas.drawRoundRect(rectF, L, L2, b3);
        if (!this.d) {
            paint = lfcVar.b();
        }
        paint.setAlpha(alpha);
        if (lfcVar.e) {
            int alpha2 = ((Paint) lfcVar.d.a).getAlpha();
            ((Paint) lfcVar.d.a).setAlpha(255);
            canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), (Paint) lfcVar.d.a);
            ((Paint) lfcVar.d.a).setAlpha(alpha2);
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }
}
