package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
public abstract class clb extends TextView {
    public boolean a;
    public final ln b;
    public final wi2 c;

    public clb(Context context) {
        super(context);
        this.a = false;
        this.b = new ln(320L, this, d53.h);
        this.c = new wi2(-1);
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
            canvas2.translate(0.0f, gm.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - d) * gm.L(6.0f)));
            wi2 wi2Var = this.c;
            wi2Var.setAlpha((int) (d * 255.0f));
            wi2Var.setBounds(width - (wi2Var.getIntrinsicWidth() / 2), height - (wi2Var.getIntrinsicWidth() / 2), (wi2Var.getIntrinsicWidth() / 2) + width, (wi2Var.getIntrinsicHeight() / 2) + height);
            wi2Var.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.c.b(i);
    }
}
