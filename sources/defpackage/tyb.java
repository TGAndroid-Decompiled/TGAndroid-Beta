package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class tyb extends Drawable {
    public final oy8 a;
    public int b;
    public final TextPaint c;

    public tyb(TextPaint textPaint) {
        in inVar = new in(this, (byte) 12);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        oy8 oy8Var = new oy8(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.a = oy8Var;
        oy8Var.setCallback(inVar);
        oy8Var.F(1);
        oy8Var.H((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        oy8Var.E(true);
        oy8Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i = this.b;
        oy8 oy8Var = this.a;
        if (color != i) {
            oy8Var.a0 = true;
            oy8Var.L(color, "Comp 1");
            oy8Var.j();
            oy8Var.E(true);
            oy8Var.Q(0L);
            this.b = color;
        }
        oy8Var.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
