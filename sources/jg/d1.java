package jg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.w9;
import vh.s3;
public final class d1 extends org.telegram.ui.Cells.s0 {
    public final w9 f9918t2;
    public final TextPaint f9919u2;
    public final f1 f9920v2;

    public d1(f1 f1Var, Context context, i1 i1Var) {
        super(context, i1Var, false);
        this.f9920v2 = f1Var;
        this.f9918t2 = new w9(f1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f9919u2 = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(Math.max(16, tz.W0) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint P(String str) {
        float f7;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                s3 s3Var = this.f9920v2.h;
                s3Var.f10060v0 = true;
                boolean z10 = s3Var.B0;
                w9 w9Var = this.f9918t2;
                if (w9Var.f32122r != z10) {
                    w9Var.f32122r = z10;
                    if (w9Var.f32113i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (w9Var.f32122r) {
                            f7 = 0.97f;
                        } else {
                            f7 = 0.92f;
                        }
                        org.telegram.messenger.i0.n2(colorMatrix, f7);
                        if (w9Var.f32122r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        org.telegram.messenger.i0.h(colorMatrix, f10);
                        w9Var.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        w9Var.f32112g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c10 = w9Var.c(1.0f);
                if (c10 != null) {
                    return c10;
                }
            }
            return super.P(str);
        }
        return this.f9919u2;
    }
}
