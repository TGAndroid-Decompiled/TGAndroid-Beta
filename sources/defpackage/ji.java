package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
public final class ji extends LinearLayout {
    public final byte a = 1;
    public boolean b;
    public final hn7 c;
    public final Object d;
    public final hn7 e;
    public final hn7 f;

    public ji(Context context, fj fjVar, hn7 hn7Var, wm0 wm0Var, xm0 xm0Var) {
        super(context);
        this.c = hn7Var;
        this.e = wm0Var;
        this.f = xm0Var;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        de9.p(textPaint, gl.L(20.0f));
        textPaint.setColor(fjVar.a);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wm0) this.e).getRight() - gl.L(12.0f), (getHeight() / 2.0f) - gl.L(11.0f), (TextPaint) this.d);
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
        hn7 hn7Var = this.c;
        hn7 hn7Var2 = this.e;
        hn7 hn7Var3 = this.f;
        switch (b) {
            case 0:
                hn7 hn7Var4 = (hn7) this.d;
                this.b = true;
                Point point = gl.q;
                if (point.x > point.y) {
                    i3 = 3;
                }
                hn7Var.setItemCount(i3);
                hn7Var4.setItemCount(i3);
                hn7Var2.setItemCount(i3);
                hn7Var3.setItemCount(i3);
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var4.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var2.getLayoutParams().height = gl.L(42.0f) * i3;
                hn7Var3.getLayoutParams().height = gl.L(42.0f) * i3;
                this.b = false;
                super.onMeasure(i, i2);
                return;
            default:
                xm0 xm0Var = (xm0) hn7Var3;
                wm0 wm0Var = (wm0) hn7Var2;
                this.b = true;
                Point point2 = gl.q;
                if (point2.x > point2.y) {
                    i3 = 3;
                }
                hn7Var.setItemCount(i3);
                wm0Var.setItemCount(i3);
                xm0Var.setItemCount(i3);
                hn7Var.getLayoutParams().height = gl.L(42.0f) * i3;
                wm0Var.getLayoutParams().height = gl.L(42.0f) * i3;
                xm0Var.getLayoutParams().height = gl.L(42.0f) * i3;
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

    public ji(Context context, hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, hn7 hn7Var4) {
        super(context);
        this.c = hn7Var;
        this.d = hn7Var2;
        this.e = hn7Var3;
        this.f = hn7Var4;
        this.b = false;
    }
}
