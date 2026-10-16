package bi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.ix0;
public final class x5 {
    public final ImageReceiver f3958a;
    public int f3959b;
    public StaticLayout f3960c;
    public final TextPaint d;
    public d7 e;
    public final y5 f3961f;

    public x5(y5 y5Var) {
        this.f3961f = y5Var;
        ImageReceiver imageReceiver = new ImageReceiver(y5Var);
        this.f3958a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        y5 y5Var = this.f3961f;
        ArrayList arrayList = y5Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (d7) arrayList.get(i10);
            boolean z10 = y5Var.v;
            ImageReceiver imageReceiver = this.f3958a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            d7 d7Var = this.e;
            TL_stories.StoryItem storyItem = d7Var.f2957a;
            if (storyItem != null) {
                s9.x(imageReceiver, storyItem);
            } else {
                w8 w8Var = d7Var.f2958b;
                b30[] b30VarArr = s9.f3644a;
                if (w8Var.f3919c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(w8Var.f3920f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(w8Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f2957a;
        y5 y5Var = this.f3961f;
        if (storyItem != null) {
            y5.a(y5Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f3960c = null;
            return;
        }
        int i10 = (int) (y5Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ix0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f3960c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            y5.a(y5Var, spannableStringBuilder2, this.e.f2957a.views, true);
            this.f3960c = ix0.c(spannableStringBuilder2, textPaint, (int) (y5Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
