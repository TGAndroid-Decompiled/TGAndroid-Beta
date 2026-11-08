package di;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class o8 {
    public final f4 f9473a;
    public final org.telegram.ui.Components.w5 f9474b;
    public final TextPaint f9475c;
    public final StaticLayout d;
    public final float f9476e;
    public final float f9477f;
    public float f9478g;
    public boolean h;
    public int f9479i;

    public o8(i4 i4Var, f4 f4Var) {
        float f10;
        this.f9473a = f4Var;
        this.f9474b = new org.telegram.ui.Components.w5(i4Var, 0L, 360L, xq.h);
        TextPaint textPaint = new TextPaint(1);
        this.f9475c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(id.M0(2131744483, null), textPaint, org.telegram.messenger.g0.f22563q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f9476e = f10;
        this.f9477f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
