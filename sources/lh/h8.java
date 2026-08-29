package lh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jr;
public final class h8 {
    public final a4 f15688a;
    public final org.telegram.ui.Components.d6 f15689b;
    public final TextPaint f15690c;
    public final StaticLayout d;
    public final float f15691e;
    public final float f15692f;
    public float f15693g;
    public boolean h;
    public int f15694i;

    public h8(d4 d4Var, a4 a4Var) {
        float f9;
        this.f15688a = a4Var;
        this.f15689b = new org.telegram.ui.Components.d6(d4Var, 0L, 360L, jr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f15690c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f9 = staticLayout.getLineLeft(0);
        } else {
            f9 = 0.0f;
        }
        this.f15691e = f9;
        this.f15692f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
