package bg;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.ka;
public final class w1 extends org.telegram.ui.Cells.v0 {
    public final ka f2587g2;
    public final TextPaint f2588h2;
    public final y1 f2589i2;

    public w1(y1 y1Var, Context context, c2 c2Var) {
        super(context, c2Var, false);
        this.f2589i2 = y1Var;
        this.f2587g2 = new ka(y1Var.d, this, 10, false);
        TextPaint textPaint = new TextPaint(1);
        this.f2588h2 = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint.setColor(-1);
    }

    @Override
    public final Paint G(String str) {
        float f9;
        float f10;
        if (!"paintChatActionText".equals(str) && !"paintChatActionText2".equals(str)) {
            if ("paintChatActionBackground".equals(str)) {
                f5 f5Var = this.f2589i2.h;
                f5Var.f2152r0 = true;
                boolean z10 = f5Var.f2158x0;
                ka kaVar = this.f2587g2;
                if (kaVar.f29991r != z10) {
                    kaVar.f29991r = z10;
                    if (kaVar.f29982i == 10) {
                        ColorMatrix colorMatrix = new ColorMatrix();
                        colorMatrix.setSaturation(1.6f);
                        if (kaVar.f29991r) {
                            f9 = 0.97f;
                        } else {
                            f9 = 0.92f;
                        }
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f9);
                        if (kaVar.f29991r) {
                            f10 = 0.12f;
                        } else {
                            f10 = -0.06f;
                        }
                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f10);
                        kaVar.h.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                        kaVar.f29981g.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    }
                }
                Paint c3 = kaVar.c(1.0f);
                if (c3 != null) {
                    return c3;
                }
            }
            return super.G(str);
        }
        return this.f2588h2;
    }
}
