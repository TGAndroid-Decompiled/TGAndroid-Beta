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
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.sx0;
public final class m6 {
    public final ImageReceiver f1394a;
    public int f1395b;
    public StaticLayout f1396c;
    public final TextPaint d;
    public s7 f1397e;
    public final n6 f1398f;

    public m6(n6 n6Var) {
        this.f1398f = n6Var;
        ImageReceiver imageReceiver = new ImageReceiver(n6Var);
        this.f1394a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        n6 n6Var = this.f1398f;
        ArrayList arrayList = n6Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f1397e = (s7) arrayList.get(i10);
            boolean z10 = n6Var.v;
            ImageReceiver imageReceiver = this.f1394a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            s7 s7Var = this.f1397e;
            TL_stories.StoryItem storyItem = s7Var.f1706a;
            if (storyItem != null) {
                ja.x(imageReceiver, storyItem);
            } else {
                l9 l9Var = s7Var.f1707b;
                i30[] i30VarArr = ja.f1193a;
                if (l9Var.f1349c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(l9Var.f1351f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(l9Var.f1350e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f1397e.f1706a;
        n6 n6Var = this.f1398f;
        if (storyItem != null) {
            n6.a(n6Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f1396c = null;
            return;
        }
        int i10 = (int) (n6Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = sx0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f1396c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            n6.a(n6Var, spannableStringBuilder2, this.f1397e.f1706a.views, true);
            this.f1396c = sx0.c(spannableStringBuilder2, textPaint, (int) (n6Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
