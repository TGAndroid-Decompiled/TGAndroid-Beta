package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
public final class w37 extends dl1 {
    public final TextPaint A2;
    public final y37 B2;
    public final xl0 z2;

    public w37(y37 y37Var, Context context, a47 a47Var) {
        super(a47Var, context, false);
        this.B2 = y37Var;
        this.z2 = new xl0(y37Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint Q(String str) {
        float f;
        float f2;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                vw7 vw7Var = this.B2.h;
                vw7Var.x0 = true;
                boolean z = vw7Var.D0;
                xl0 xl0Var = this.z2;
                if (xl0Var.r != z) {
                    xl0Var.r = z;
                    if (xl0Var.i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (xl0Var.r) {
                            f = 0.97f;
                        } else {
                            f = 0.92f;
                        }
                        hl.l2(colorMatrix, f);
                        if (xl0Var.r) {
                            f2 = 0.12f;
                        } else {
                            f2 = -0.06f;
                        }
                        hl.h(colorMatrix, f2);
                        xl0Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        xl0Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c = xl0Var.c(1.0f);
                if (c != null) {
                    return c;
                }
            }
            return super.Q(str);
        }
        return this.A2;
    }
}
