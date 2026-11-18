package fi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lr;
public final class e8 {
    public final w3 f11912a;
    public final org.telegram.ui.Components.c6 f11913b;
    public final TextPaint f11914c;
    public final StaticLayout d;
    public final float f11915e;
    public final float f11916f;
    public float f11917g;
    public boolean h;
    public int f11918i;

    public e8(z3 z3Var, w3 w3Var) {
        float f10;
        this.f11912a = w3Var;
        this.f11913b = new org.telegram.ui.Components.c6(z3Var, 0L, 360L, lr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11914c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(gd.M0(2131744245, null), textPaint, org.telegram.messenger.g0.f24118q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11915e = f10;
        this.f11916f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
