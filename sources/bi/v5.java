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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.o20;
public final class v5 {
    public final ImageReceiver f3895a;
    public int f3896b;
    public StaticLayout f3897c;
    public final TextPaint d;
    public z6 f3898e;
    public final w5 f3899f;

    public v5(w5 w5Var) {
        this.f3899f = w5Var;
        ImageReceiver imageReceiver = new ImageReceiver(w5Var);
        this.f3895a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        w5 w5Var = this.f3899f;
        ArrayList arrayList = w5Var.E;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f3898e = (z6) arrayList.get(i10);
            boolean z10 = w5Var.v;
            ImageReceiver imageReceiver = this.f3895a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            z6 z6Var = this.f3898e;
            TL_stories.StoryItem storyItem = z6Var.f4060a;
            if (storyItem != null) {
                p9.x(imageReceiver, storyItem);
            } else {
                t8 t8Var = z6Var.f4061b;
                o20[] o20VarArr = p9.f3510a;
                if (t8Var.f3740c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(t8Var.f3742f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(t8Var.f3741e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f3898e.f4060a;
        w5 w5Var = this.f3899f;
        if (storyItem != null) {
            w5.a(w5Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f3897c = null;
            return;
        }
        int i10 = (int) (w5Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = iw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f3897c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            w5.a(w5Var, spannableStringBuilder2, this.f3898e.f4060a.views, true);
            this.f3897c = iw0.c(spannableStringBuilder2, textPaint, (int) (w5Var.J + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
