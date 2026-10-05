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
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.s20;
public final class l6 {
    public final ImageReceiver f1280a;
    public int f1281b;
    public StaticLayout f1282c;
    public final TextPaint d;
    public r7 f1283e;
    public final m6 f1284f;

    public l6(m6 m6Var) {
        this.f1284f = m6Var;
        ImageReceiver imageReceiver = new ImageReceiver(m6Var);
        this.f1280a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        m6 m6Var = this.f1284f;
        ArrayList arrayList = m6Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f1283e = (r7) arrayList.get(i10);
            boolean z10 = m6Var.v;
            ImageReceiver imageReceiver = this.f1280a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            r7 r7Var = this.f1283e;
            TL_stories.StoryItem storyItem = r7Var.f1597a;
            if (storyItem != null) {
                ia.x(imageReceiver, storyItem);
            } else {
                k9 k9Var = r7Var.f1598b;
                s20[] s20VarArr = ia.f1085a;
                if (k9Var.f1232c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.f1234f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.f1233e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f1283e.f1597a;
        m6 m6Var = this.f1284f;
        if (storyItem != null) {
            m6.a(m6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f1282c = null;
            return;
        }
        int i10 = (int) (m6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = gx0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f1282c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            m6.a(m6Var, spannableStringBuilder2, this.f1283e.f1597a.views, true);
            this.f1282c = gx0.c(spannableStringBuilder2, textPaint, (int) (m6Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
