package di;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class p8 {
    public final g4 f9517a;
    public final org.telegram.ui.Components.w5 f9518b;
    public final TextPaint f9519c;
    public final StaticLayout d;
    public final float f9520e;
    public final float f9521f;
    public float f9522g;
    public boolean h;
    public int f9523i;

    public p8(j4 j4Var, g4 g4Var) {
        float f10;
        this.f9517a = g4Var;
        this.f9518b = new org.telegram.ui.Components.w5(j4Var, 0L, 360L, xq.h);
        TextPaint textPaint = new TextPaint(1);
        this.f9519c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(id.M0(2131744480, null), textPaint, org.telegram.messenger.g0.f22563q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f9520e = f10;
        this.f9521f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
