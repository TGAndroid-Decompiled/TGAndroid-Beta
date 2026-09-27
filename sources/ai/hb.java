package ai;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.sr;
public final class hb {
    public final b6 f968a;
    public final org.telegram.ui.Components.e6 f969b;
    public final TextPaint f970c;
    public final StaticLayout d;
    public final float e;
    public final float f971f;
    public float f972g;
    public boolean h;
    public int f973i;

    public hb(e6 e6Var, b6 b6Var) {
        float f7;
        this.f968a = b6Var;
        this.f969b = new org.telegram.ui.Components.e6(e6Var, 0L, 360L, sr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f970c = textPaint;
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
        this.f971f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
