package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.nr;
public final class e8 {
    public final w3 f11954a;
    public final org.telegram.ui.Components.d6 f11955b;
    public final TextPaint f11956c;
    public final StaticLayout d;
    public final float f11957e;
    public final float f11958f;
    public float f11959g;
    public boolean h;
    public int f11960i;

    public e8(z3 z3Var, w3 w3Var) {
        float f10;
        this.f11954a = w3Var;
        this.f11955b = new org.telegram.ui.Components.d6(z3Var, 0L, 360L, nr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11956c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(gd.N0(2131744239, null), textPaint, org.telegram.messenger.g0.f24146q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11957e = f10;
        this.f11958f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
