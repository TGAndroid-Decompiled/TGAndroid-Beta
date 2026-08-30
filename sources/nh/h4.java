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
import org.telegram.ui.Components.p20;
public final class h4 {
    public final ImageReceiver f15378a;
    public int f15379b;
    public StaticLayout f15380c;
    public final TextPaint d;
    public l5 e;
    public final i4 f15381f;

    public h4(i4 i4Var) {
        this.f15381f = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(i4Var);
        this.f15378a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        i4 i4Var = this.f15381f;
        ArrayList arrayList = i4Var.B;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.e = (l5) arrayList.get(i10);
            boolean z4 = i4Var.v;
            ImageReceiver imageReceiver = this.f15378a;
            if (z4) {
                imageReceiver.onAttachedToWindow();
            }
            l5 l5Var = this.e;
            TL_stories.StoryItem storyItem = l5Var.f15573a;
            if (storyItem != null) {
                m7.x(imageReceiver, storyItem);
            } else {
                s6 s6Var = l5Var.f15574b;
                p20[] p20VarArr = m7.f15621a;
                if (s6Var.f15883c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f15884f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.f15573a;
        i4 i4Var = this.f15381f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f15380c = null;
            return;
        }
        int i10 = (int) (i4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = kw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f15380c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.e.f15573a.views, true);
            this.f15380c = kw0.c(spannableStringBuilder2, textPaint, (int) (i4Var.G + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
