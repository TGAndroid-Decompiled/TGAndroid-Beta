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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.o20;
public final class m6 {
    public final ImageReceiver f1251a;
    public int f1252b;
    public StaticLayout f1253c;
    public final TextPaint d;
    public q7 e;
    public final n6 f1254f;

    public m6(n6 n6Var) {
        this.f1254f = n6Var;
        ImageReceiver imageReceiver = new ImageReceiver(n6Var);
        this.f1251a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        n6 n6Var = this.f1254f;
        ArrayList arrayList = n6Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (q7) arrayList.get(i10);
            boolean z10 = n6Var.v;
            ImageReceiver imageReceiver = this.f1251a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            q7 q7Var = this.e;
            TL_stories.StoryItem storyItem = q7Var.f1430a;
            if (storyItem != null) {
                ia.x(imageReceiver, storyItem);
            } else {
                k9 k9Var = q7Var.f1431b;
                o20[] o20VarArr = ia.f1015a;
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
        TL_stories.StoryItem storyItem = this.e.f1430a;
        n6 n6Var = this.f1254f;
        if (storyItem != null) {
            n6.a(n6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f1253c = null;
            return;
        }
        int i10 = (int) (n6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = kw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f1253c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            n6.a(n6Var, spannableStringBuilder2, this.e.f1430a.views, true);
            this.f1253c = kw0.c(spannableStringBuilder2, textPaint, (int) (n6Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
