package ci;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.x20;
public final class w4 {
    public final ImageReceiver f6114a;
    public int f6115b;
    public StaticLayout f6116c;
    public final TextPaint d;
    public b6 e;
    public final x4 f6117f;

    public w4(x4 x4Var) {
        this.f6117f = x4Var;
        ImageReceiver imageReceiver = new ImageReceiver(x4Var);
        this.f6114a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        x4 x4Var = this.f6117f;
        ArrayList arrayList = x4Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (b6) arrayList.get(i10);
            boolean z10 = x4Var.v;
            ImageReceiver imageReceiver = this.f6114a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            b6 b6Var = this.e;
            TL_stories.StoryItem storyItem = b6Var.f5252a;
            if (storyItem != null) {
                d8.x(imageReceiver, storyItem);
            } else {
                h7 h7Var = b6Var.f5253b;
                x20[] x20VarArr = d8.f5326a;
                if (h7Var.f5471c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(h7Var.f5472f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(h7Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f5252a;
        x4 x4Var = this.f6117f;
        if (storyItem != null) {
            x4.a(x4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f6116c = null;
            return;
        }
        int i10 = (int) (x4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = dx0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f6116c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            x4.a(x4Var, spannableStringBuilder2, this.e.f5252a.views, true);
            this.f6116c = dx0.c(spannableStringBuilder2, textPaint, (int) (x4Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
