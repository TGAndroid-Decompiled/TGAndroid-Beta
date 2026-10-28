package di;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
public final class x8 {
    public final n4 f9382a;
    public final org.telegram.ui.Components.h6 f9383b;
    public final TextPaint f9384c;
    public final StaticLayout d;
    public final float e;
    public final float f9385f;
    public float f9386g;
    public boolean h;
    public int f9387i;

    public x8(q4 q4Var, n4 n4Var) {
        float f7;
        this.f9382a = n4Var;
        this.f9383b = new org.telegram.ui.Components.h6(q4Var, 0L, 360L, ds.h);
        TextPaint textPaint = new TextPaint(1);
        this.f9384c = textPaint;
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
        this.f9385f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
