package ei;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.xq;
public final class o8 {
    public final g4 f10719a;
    public final org.telegram.ui.Components.u5 f10720b;
    public final TextPaint f10721c;
    public final StaticLayout d;
    public final float f10722e;
    public final float f10723f;
    public float f10724g;
    public boolean h;
    public int f10725i;

    public o8(j4 j4Var, g4 g4Var) {
        float f10;
        this.f10719a = g4Var;
        this.f10720b = new org.telegram.ui.Components.u5(j4Var, 0L, 360L, xq.h);
        TextPaint textPaint = new TextPaint(1);
        this.f10721c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(bd.M0(2131744490, null), textPaint, org.telegram.messenger.g0.f22608q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f10722e = f10;
        this.f10723f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
