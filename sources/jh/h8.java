package jh;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;

public final class h8 {

    public final b4 f13414a;

    public final org.telegram.ui.Components.y5 f13415b;

    public final TextPaint f13416c;
    public final StaticLayout d;

    public final float f13417e;

    public final float f13418f;

    public float f13419g;
    public boolean h;

    public int f13420i;

    public h8(e4 e4Var, b4 b4Var) {
        this.f13414a = b4Var;
        this.f13415b = new org.telegram.ui.Components.y5(e4Var, 0L, 360L, er.h);
        TextPaint textPaint = new TextPaint(1);
        this.f13416c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.f13417e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f13418f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
