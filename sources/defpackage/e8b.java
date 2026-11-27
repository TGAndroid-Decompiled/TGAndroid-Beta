package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
public final class e8b {
    public final m68 a;
    public final mm b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public e8b(o68 o68Var, m68 m68Var) {
        float f;
        this.a = m68Var;
        this.b = new mm(o68Var, 0L, 360L, k43.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(hl.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(hl.L(3.0f), 0.0f, hl.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(ob6.M0(2131744134, null), textPaint, hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
