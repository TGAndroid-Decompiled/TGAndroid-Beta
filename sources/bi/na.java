package bi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class na {
    public final l5 f3410a;
    public final org.telegram.ui.Components.e6 f3411b;
    public final TextPaint f3412c;
    public final StaticLayout d;
    public final float f3413e;
    public final float f3414f;
    public float f3415g;
    public boolean h;
    public int f3416i;

    public na(o5 o5Var, l5 l5Var) {
        float f7;
        this.f3410a = l5Var;
        this.f3411b = new org.telegram.ui.Components.e6(o5Var, 0L, 360L, pr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f3412c = textPaint;
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
        this.f3413e = f7;
        this.f3414f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
