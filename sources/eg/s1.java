package eg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.fa;
import qh.o4;
public final class s1 extends org.telegram.ui.Cells.v0 {
    public final fa f5471h2;
    public final TextPaint f5472i2;
    public final u1 f5473j2;

    public s1(u1 u1Var, Context context, a9.a aVar) {
        super(context, aVar, false);
        this.f5473j2 = u1Var;
        this.f5471h2 = new fa(u1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f5472i2 = textPaint;
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
                o4 o4Var = this.f5473j2.h;
                o4Var.f5557s0 = true;
                boolean z4 = o4Var.f5563y0;
                fa faVar = this.f5471h2;
                if (faVar.f26846r != z4) {
                    faVar.f26846r = z4;
                    if (faVar.f26837i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (faVar.f26846r) {
                            f10 = 0.97f;
                        } else {
                            f10 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f10);
                        if (faVar.f26846r) {
                            f11 = 0.12f;
                        } else {
                            f11 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
                        faVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        faVar.f26836g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c3 = faVar.c(1.0f);
                if (c3 != null) {
                    return c3;
                }
            }
            return super.G(str);
        }
        return this.f5472i2;
    }
}
