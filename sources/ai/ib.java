package ai;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.is;
public final class ib {
    public final c6 f1162a;
    public final org.telegram.ui.Components.g6 f1163b;
    public final TextPaint f1164c;
    public final StaticLayout d;
    public final float f1165e;
    public final float f1166f;
    public float f1167g;
    public boolean h;
    public int f1168i;

    public ib(f6 f6Var, c6 c6Var) {
        float f7;
        this.f1162a = c6Var;
        this.f1163b = new org.telegram.ui.Components.g6(f6Var, 0L, 360L, is.h);
        TextPaint textPaint = new TextPaint(1);
        this.f1164c = textPaint;
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
        this.f1165e = f7;
        this.f1166f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
