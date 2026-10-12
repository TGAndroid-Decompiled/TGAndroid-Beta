package ai;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.js;
public final class ib {
    public final c6 f1160a;
    public final org.telegram.ui.Components.g6 f1161b;
    public final TextPaint f1162c;
    public final StaticLayout d;
    public final float f1163e;
    public final float f1164f;
    public float f1165g;
    public boolean h;
    public int f1166i;

    public ib(f6 f6Var, c6 c6Var) {
        float f7;
        this.f1160a = c6Var;
        this.f1161b = new org.telegram.ui.Components.g6(f6Var, 0L, 360L, js.h);
        TextPaint textPaint = new TextPaint(1);
        this.f1162c = textPaint;
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
        this.f1163e = f7;
        this.f1164f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
