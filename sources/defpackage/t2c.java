package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class t2c extends Drawable {
    public final b29 a;
    public int b;
    public final TextPaint c;

    public t2c(TextPaint textPaint) {
        jn jnVar = new jn(this, (byte) 12);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        b29 b29Var = new b29(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.a = b29Var;
        b29Var.setCallback(jnVar);
        b29Var.F(1);
        b29Var.H((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        b29Var.E(true);
        b29Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i = this.b;
        b29 b29Var = this.a;
        if (color != i) {
            b29Var.a0 = true;
            b29Var.L(color, "Comp 1");
            b29Var.j();
            b29Var.E(true);
            b29Var.Q(0L);
            this.b = color;
        }
        b29Var.draw(canvas);
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
