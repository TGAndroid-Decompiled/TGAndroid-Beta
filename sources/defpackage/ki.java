package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class ki extends LinearLayout {
    public final byte a = 1;
    public boolean b;
    public final hq7 c;
    public final Object d;
    public final hq7 e;
    public final hq7 f;

    public ki(Context context, gj gjVar, hq7 hq7Var, wm0 wm0Var, xm0 xm0Var) {
        super(context);
        this.c = hq7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        uh9.p(textPaint, hl.L(20.0f));
        textPaint.setColor(gjVar.a);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wm0) this.e).getRight() - hl.L(12.0f), (getHeight() / 2.0f) - hl.L(11.0f), (TextPaint) this.d);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        int i3 = 5;
        hq7 hq7Var = this.c;
        hq7 hq7Var2 = this.e;
        hq7 hq7Var3 = this.f;
        switch (b) {
            case 0:
                hq7 hq7Var4 = (hq7) this.d;
                this.b = true;
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                hq7Var.setItemCount(i3);
                hq7Var4.setItemCount(i3);
                hq7Var2.setItemCount(i3);
                hq7Var3.setItemCount(i3);
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var4.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var2.getLayoutParams().height = hl.L(42.0f) * i3;
                hq7Var3.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                xm0 xm0Var = (xm0) hq7Var3;
                wm0 wm0Var = (wm0) hq7Var2;
                this.b = true;
                Point point2 = hl.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                hq7Var.setItemCount(i3);
                wm0Var.setItemCount(i3);
                xm0Var.setItemCount(i3);
                hq7Var.getLayoutParams().height = hl.L(42.0f) * i3;
                wm0Var.getLayoutParams().height = hl.L(42.0f) * i3;
                xm0Var.getLayoutParams().height = hl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                if (!this.b) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    public ki(Context context, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, hq7 hq7Var4) {
        super(context);
        this.c = hq7Var;
        this.d = hq7Var2;
        this.e = hq7Var3;
        this.f = hq7Var4;
        this.b = false;
    }
}
