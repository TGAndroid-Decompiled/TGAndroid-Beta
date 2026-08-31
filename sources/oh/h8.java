package oh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class h8 {
    public final c4 f17194a;
    public final org.telegram.ui.Components.z5 f17195b;
    public final TextPaint f17196c;
    public final StaticLayout d;
    public final float f17197e;
    public final float f17198f;
    public float f17199g;
    public boolean h;
    public int f17200i;

    public h8(f4 f4Var, c4 c4Var) {
        float f10;
        this.f17194a = c4Var;
        this.f17195b = new org.telegram.ui.Components.z5(f4Var, 0L, 360L, pr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f17196c = textPaint;
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
        this.f17197e = f10;
        this.f17198f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
