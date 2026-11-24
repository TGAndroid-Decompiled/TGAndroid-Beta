package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
public final class p37 extends cm1 {
    public final TextPaint A2;
    public final r37 B2;
    public final wm0 z2;

    public p37(r37 r37Var, Context context, t37 t37Var) {
        super(t37Var, context, false);
        this.B2 = r37Var;
        this.z2 = new wm0(r37Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.A2 = textPaint;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint O(String str) {
        float f;
        float f2;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                pv7 pv7Var = this.B2.h;
                pv7Var.x0 = true;
                boolean z = pv7Var.D0;
                wm0 wm0Var = this.z2;
                if (wm0Var.r != z) {
                    wm0Var.r = z;
                    if (wm0Var.i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (wm0Var.r) {
                            f = 0.97f;
                        } else {
                            f = 0.92f;
                        }
                        gm.l2(colorMatrix, f);
                        if (wm0Var.r) {
                            f2 = 0.12f;
                        } else {
                            f2 = -0.06f;
                        }
                        gm.h(colorMatrix, f2);
                        wm0Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        wm0Var.g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c = wm0Var.c(1.0f);
                if (c != null) {
                    return c;
                }
            }
            return super.O(str);
        }
        return this.A2;
    }
}
