package dg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fa;
import ph.o4;
public final class u1 extends org.telegram.ui.Cells.v0 {
    public final fa f4813h2;
    public final TextPaint f4814i2;
    public final w1 f4815j2;

    public u1(w1 w1Var, Context context, a9.a aVar) {
        super(context, aVar, false);
        this.f4815j2 = w1Var;
        this.f4813h2 = new fa(w1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f4814i2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint G(String str) {
        float f10;
        float f11;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                o4 o4Var = this.f4815j2.h;
                o4Var.f4361s0 = true;
                boolean z4 = o4Var.f4367y0;
                fa faVar = this.f4813h2;
                if (faVar.f24853r != z4) {
                    faVar.f24853r = z4;
                    if (faVar.f24844i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (faVar.f24853r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f10);
                        if (faVar.f24853r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                        faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        faVar.f24843g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c3 = faVar.c(1.0f);
                if (c3 != null) {
                    return c3;
                }
            }
            return super.G(str);
        }
        return this.f4814i2;
    }
}
