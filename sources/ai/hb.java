package ai;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;
public final class hb {
    public final c6 f958a;
    public final org.telegram.ui.Components.d6 f959b;
    public final TextPaint f960c;
    public final StaticLayout d;
    public final float e;
    public final float f961f;
    public float f962g;
    public boolean h;
    public int f963i;

    public hb(f6 f6Var, c6 c6Var) {
        float f7;
        this.f958a = c6Var;
        this.f959b = new org.telegram.ui.Components.d6(f6Var, 0L, 360L, qr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f960c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.e = f7;
        this.f961f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
