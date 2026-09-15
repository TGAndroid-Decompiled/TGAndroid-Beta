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
import org.telegram.ui.Components.o20;
public final class m6 {
    public final ImageReceiver f1246a;
    public int f1247b;
    public StaticLayout f1248c;
    public final TextPaint d;
    public q7 e;
    public final n6 f1249f;

    public m6(n6 n6Var) {
        this.f1249f = n6Var;
        ImageReceiver imageReceiver = new ImageReceiver(n6Var);
        this.f1246a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        n6 n6Var = this.f1249f;
        ArrayList arrayList = n6Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (q7) arrayList.get(i10);
            boolean z10 = n6Var.v;
            ImageReceiver imageReceiver = this.f1246a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            q7 q7Var = this.e;
            TL_stories.StoryItem storyItem = q7Var.f1425a;
            if (storyItem != null) {
                ia.x(imageReceiver, storyItem);
            } else {
                k9 k9Var = q7Var.f1426b;
                o20[] o20VarArr = ia.f1010a;
                if (k9Var.f1138c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.f1139f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(k9Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f1425a;
        n6 n6Var = this.f1249f;
        if (storyItem != null) {
            n6.a(n6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f1248c = null;
            return;
        }
        int i10 = (int) (n6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = jw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f1248c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            n6.a(n6Var, spannableStringBuilder2, this.e.f1425a.views, true);
            this.f1248c = jw0.c(spannableStringBuilder2, textPaint, (int) (n6Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
