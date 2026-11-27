package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
public abstract class xmb extends TextView {
    public boolean a;
    public final mm b;
    public final di2 c;

    public xmb(Context context) {
        super(context);
        this.a = false;
        this.b = new mm(320L, this, k43.h);
        this.c = new di2(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(this.a);
        if (d < 1.0f) {
            if (d <= 0.0f) {
                canvas.save();
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - d) * 255.0f), 31);
            }
            canvas2.translate(0.0f, hl.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - d) * hl.L(6.0f)));
            di2 di2Var = this.c;
            di2Var.setAlpha((int) (d * 255.0f));
            di2Var.setBounds(width - (di2Var.getIntrinsicWidth() / 2), height - (di2Var.getIntrinsicWidth() / 2), (di2Var.getIntrinsicWidth() / 2) + width, (di2Var.getIntrinsicHeight() / 2) + height);
            di2Var.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.c.b(i);
    }
}
