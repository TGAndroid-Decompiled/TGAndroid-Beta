package ih;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
public final class l8 {
    public final f4 f11739a;
    public final org.telegram.ui.Components.y5 f11740b;
    public final TextPaint f11741c;
    public final StaticLayout d;
    public final float f11742e;
    public final float f11743f;
    public float f11744g;
    public boolean h;
    public int f11745i;

    public l8(i4 i4Var, f4 f4Var) {
        float f10;
        this.f11739a = f4Var;
        this.f11740b = new org.telegram.ui.Components.y5(i4Var, 0L, 360L, gr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f11741c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f10 = staticLayout.getLineLeft(0);
        } else {
            f10 = 0.0f;
        }
        this.f11742e = f10;
        this.f11743f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
