package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public final class i6b {
    public final y48 a;
    public final ln b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public i6b(a58 a58Var, y48 y48Var) {
        float f;
        this.a = y48Var;
        this.b = new ln(a58Var, 0L, 360L, d53.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(gm.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(gm.L(3.0f), 0.0f, gm.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(jb6.M0(2131744166, null), textPaint, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f = staticLayout.getLineLeft(0);
        } else {
            f = 0.0f;
        }
        this.e = f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
