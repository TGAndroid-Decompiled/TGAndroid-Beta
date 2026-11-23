package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nr;
public final class e8 {
    public final w3 f11957a;
    public final org.telegram.ui.Components.d6 f11958b;
    public final TextPaint f11959c;
    public final StaticLayout d;
    public final float f11960e;
    public final float f11961f;
    public float f11962g;
    public boolean h;
    public int f11963i;

    public e8(z3 z3Var, w3 w3Var) {
        float f10;
        this.f11957a = w3Var;
        this.f11958b = new org.telegram.ui.Components.d6(z3Var, 0L, 360L, nr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11959c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(hd.N0(2131744237, null), textPaint, org.telegram.messenger.g0.f24046q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11960e = f10;
        this.f11961f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
