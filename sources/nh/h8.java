package nh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nr;
public final class h8 {
    public final a4 f15393a;
    public final org.telegram.ui.Components.z5 f15394b;
    public final TextPaint f15395c;
    public final StaticLayout d;
    public final float e;
    public final float f15396f;
    public float f15397g;
    public boolean h;
    public int f15398i;

    public h8(d4 d4Var, a4 a4Var) {
        float f10;
        this.f15393a = a4Var;
        this.f15394b = new org.telegram.ui.Components.z5(d4Var, 0L, 360L, nr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f15395c = textPaint;
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
        this.e = f10;
        this.f15396f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
