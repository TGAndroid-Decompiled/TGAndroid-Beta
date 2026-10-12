package bi;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es;
public final class ra {
    public final n5 f3615a;
    public final org.telegram.ui.Components.g6 f3616b;
    public final TextPaint f3617c;
    public final StaticLayout d;
    public final float e;
    public final float f3618f;
    public float f3619g;
    public boolean h;
    public int f3620i;

    public ra(q5 q5Var, n5 n5Var) {
        float f7;
        this.f3615a = n5Var;
        this.f3616b = new org.telegram.ui.Components.g6(q5Var, 0L, 360L, es.h);
        TextPaint textPaint = new TextPaint(1);
        this.f3617c = textPaint;
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
        this.f3618f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
