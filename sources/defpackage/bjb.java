package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
public abstract class bjb extends TextView {
    public boolean a;
    public final lm b;
    public final ih2 c;

    public bjb(Context context) {
        super(context);
        this.a = false;
        this.b = new lm(320L, this, s33.h);
        this.c = new ih2(-1);
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
            canvas2.translate(0.0f, gl.L(6.0f) * d);
            super.onDraw(canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        if (d > 0.0f) {
            int height = getHeight() / 2;
            int width = (getWidth() / 2) - ((int) ((1.0f - d) * gl.L(6.0f)));
            ih2 ih2Var = this.c;
            ih2Var.setAlpha((int) (d * 255.0f));
            ih2Var.setBounds(width - (ih2Var.getIntrinsicWidth() / 2), height - (ih2Var.getIntrinsicWidth() / 2), (ih2Var.getIntrinsicWidth() / 2) + width, (ih2Var.getIntrinsicHeight() / 2) + height);
            ih2Var.draw(canvas2);
            invalidate();
        }
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.c.b(i);
    }
}
