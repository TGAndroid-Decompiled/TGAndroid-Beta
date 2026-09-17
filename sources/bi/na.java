package bi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class na {
    public final l5 f3383a;
    public final org.telegram.ui.Components.e6 f3384b;
    public final TextPaint f3385c;
    public final StaticLayout d;
    public final float f3386e;
    public final float f3387f;
    public float f3388g;
    public boolean h;
    public int f3389i;

    public na(o5 o5Var, l5 l5Var) {
        float f7;
        this.f3383a = l5Var;
        this.f3384b = new org.telegram.ui.Components.e6(o5Var, 0L, 360L, pr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f3385c = textPaint;
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
        this.f3386e = f7;
        this.f3387f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
