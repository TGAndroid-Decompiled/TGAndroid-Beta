package di;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.z20;
public final class v4 {
    public final ImageReceiver f9253a;
    public int f9254b;
    public StaticLayout f9255c;
    public final TextPaint d;
    public a6 e;
    public final w4 f9256f;

    public v4(w4 w4Var) {
        this.f9256f = w4Var;
        ImageReceiver imageReceiver = new ImageReceiver(w4Var);
        this.f9253a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        w4 w4Var = this.f9256f;
        ArrayList arrayList = w4Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (a6) arrayList.get(i10);
            boolean z10 = w4Var.v;
            ImageReceiver imageReceiver = this.f9253a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            a6 a6Var = this.e;
            TL_stories.StoryItem storyItem = a6Var.f8373a;
            if (storyItem != null) {
                a8.x(imageReceiver, storyItem);
            } else {
                g7 g7Var = a6Var.f8374b;
                z20[] z20VarArr = a8.f8378a;
                if (g7Var.f8585c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(g7Var.f8586f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(g7Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f8373a;
        w4 w4Var = this.f9256f;
        if (storyItem != null) {
            w4.a(w4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f9255c = null;
            return;
        }
        int i10 = (int) (w4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = px0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f9255c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            w4.a(w4Var, spannableStringBuilder2, this.e.f8373a.views, true);
            this.f9255c = px0.c(spannableStringBuilder2, textPaint, (int) (w4Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
