package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.er;
public final class h8 {
    public final y3 f11801a;
    public final org.telegram.ui.Components.u5 f11802b;
    public final TextPaint f11803c;
    public final StaticLayout d;
    public final float f11804e;
    public final float f11805f;
    public float f11806g;
    public boolean h;
    public int f11807i;

    public h8(b4 b4Var, y3 y3Var) {
        float f10;
        this.f11801a = y3Var;
        this.f11802b = new org.telegram.ui.Components.u5(b4Var, 0L, 360L, er.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11803c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(hd.M0(2131744480, null), textPaint, org.telegram.messenger.g0.f23611q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11804e = f10;
        this.f11805f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
