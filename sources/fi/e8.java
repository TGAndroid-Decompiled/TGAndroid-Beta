package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kr;
public final class e8 {
    public final w3 f11919a;
    public final org.telegram.ui.Components.c6 f11920b;
    public final TextPaint f11921c;
    public final StaticLayout d;
    public final float f11922e;
    public final float f11923f;
    public float f11924g;
    public boolean h;
    public int f11925i;

    public e8(z3 z3Var, w3 w3Var) {
        float f10;
        this.f11919a = w3Var;
        this.f11920b = new org.telegram.ui.Components.c6(z3Var, 0L, 360L, kr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11921c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(gd.N0(2131744236, null), textPaint, org.telegram.messenger.g0.f24226q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11922e = f10;
        this.f11923f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
