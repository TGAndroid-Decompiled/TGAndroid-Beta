package nh;

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
import org.telegram.ui.Components.q20;
public final class h4 {
    public final ImageReceiver f15358a;
    public int f15359b;
    public StaticLayout f15360c;
    public final TextPaint d;
    public l5 e;
    public final i4 f15361f;

    public h4(i4 i4Var) {
        this.f15361f = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(i4Var);
        this.f15358a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        i4 i4Var = this.f15361f;
        ArrayList arrayList = i4Var.B;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (l5) arrayList.get(i10);
            boolean z4 = i4Var.v;
            ImageReceiver imageReceiver = this.f15358a;
            if (z4) {
                imageReceiver.onAttachedToWindow();
            }
            l5 l5Var = this.e;
            TL_stories.StoryItem storyItem = l5Var.f15553a;
            if (storyItem != null) {
                m7.x(imageReceiver, storyItem);
            } else {
                s6 s6Var = l5Var.f15554b;
                q20[] q20VarArr = m7.f15601a;
                if (s6Var.f15863c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f15864f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f15553a;
        i4 i4Var = this.f15361f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f15360c = null;
            return;
        }
        int i10 = (int) (i4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = kw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f15360c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.e.f15553a.views, true);
            this.f15360c = kw0.c(spannableStringBuilder2, textPaint, (int) (i4Var.G + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
