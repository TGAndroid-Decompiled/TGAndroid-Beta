package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class jj extends LinearLayout {
    public final byte a = 1;
    public boolean b;
    public final lp7 c;
    public final Object d;
    public final lp7 e;
    public final lp7 f;

    public jj(Context context, fk fkVar, lp7 lp7Var, wn0 wn0Var, xn0 xn0Var) {
        super(context);
        this.c = lp7Var;
        this.e = wn0Var;
        this.f = xn0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        hg9.o(textPaint, gm.L(20.0f));
        textPaint.setColor(fkVar.a);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wn0) this.e).getRight() - gm.L(12.0f), (getHeight() / 2.0f) - gm.L(11.0f), (TextPaint) this.d);
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
        lp7 lp7Var = this.c;
        lp7 lp7Var2 = this.e;
        lp7 lp7Var3 = this.f;
        switch (b) {
            case 0:
                lp7 lp7Var4 = (lp7) this.d;
                this.b = true;
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                lp7Var.setItemCount(i3);
                lp7Var4.setItemCount(i3);
                lp7Var2.setItemCount(i3);
                lp7Var3.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var4.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var2.getLayoutParams().height = gm.L(42.0f) * i3;
                lp7Var3.getLayoutParams().height = gm.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                xn0 xn0Var = (xn0) lp7Var3;
                wn0 wn0Var = (wn0) lp7Var2;
                this.b = true;
                Point point2 = gm.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                lp7Var.setItemCount(i3);
                wn0Var.setItemCount(i3);
                xn0Var.setItemCount(i3);
                lp7Var.getLayoutParams().height = gm.L(42.0f) * i3;
                wn0Var.getLayoutParams().height = gm.L(42.0f) * i3;
                xn0Var.getLayoutParams().height = gm.L(42.0f) * i3;
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

    public jj(Context context, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, lp7 lp7Var4) {
        super(context);
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.f = lp7Var4;
        this.b = false;
    }
}
