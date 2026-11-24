package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
public final class u0c extends Drawable {
    public final p09 a;
    public int b;
    public final TextPaint c;

    public u0c(TextPaint textPaint) {
        jo joVar = new jo(this, (byte) 12);
        this.c = textPaint;
        float textSize = textPaint.getTextSize() * 0.89f;
        p09 p09Var = new p09(2131624001, (int) textSize, (int) (textSize * 1.25f));
        this.a = p09Var;
        p09Var.setCallback(joVar);
        p09Var.F(1);
        p09Var.H((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
        p09Var.E(true);
        p09Var.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        int color = this.c.getColor();
        int i = this.b;
        p09 p09Var = this.a;
        if (color != i) {
            p09Var.a0 = true;
            p09Var.L(color, "Comp 1");
            p09Var.j();
            p09Var.E(true);
            p09Var.Q(0L);
            this.b = color;
        }
        p09Var.draw(canvas);
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
