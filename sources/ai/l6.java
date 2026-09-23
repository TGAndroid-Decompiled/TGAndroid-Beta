package ai;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.p20;
public final class l6 {
    public final ImageReceiver f1184a;
    public int f1185b;
    public StaticLayout f1186c;
    public final TextPaint d;
    public r7 e;
    public final m6 f1187f;

    public l6(m6 m6Var) {
        this.f1187f = m6Var;
        ImageReceiver imageReceiver = new ImageReceiver(m6Var);
        this.f1184a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        m6 m6Var = this.f1187f;
        ArrayList arrayList = m6Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (r7) arrayList.get(i10);
            boolean z10 = m6Var.v;
            ImageReceiver imageReceiver = this.f1184a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            r7 r7Var = this.e;
            TL_stories.StoryItem storyItem = r7Var.f1468a;
            if (storyItem != null) {
                ia.x(imageReceiver, storyItem);
            } else {
                k9 k9Var = r7Var.f1469b;
                p20[] p20VarArr = ia.f1000a;
                if (k9Var.f1143c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.f1144f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f1468a;
        m6 m6Var = this.f1187f;
        if (storyItem != null) {
            m6.a(m6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f1186c = null;
            return;
        }
        int i10 = (int) (m6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = jw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f1186c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            m6.a(m6Var, spannableStringBuilder2, this.e.f1468a.views, true);
            this.f1186c = jw0.c(spannableStringBuilder2, textPaint, (int) (m6Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
