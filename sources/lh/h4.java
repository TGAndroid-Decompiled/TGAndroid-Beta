package lh;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.k20;
public final class h4 {
    public final ImageReceiver f15658a;
    public int f15659b;
    public StaticLayout f15660c;
    public final TextPaint d;
    public k5 f15661e;
    public final i4 f15662f;

    public h4(i4 i4Var) {
        this.f15662f = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(i4Var);
        this.f15658a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        i4 i4Var = this.f15662f;
        ArrayList arrayList = i4Var.A;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f15661e = (k5) arrayList.get(i10);
            boolean z10 = i4Var.v;
            ImageReceiver imageReceiver = this.f15658a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            k5 k5Var = this.f15661e;
            TL_stories.StoryItem storyItem = k5Var.f15830a;
            if (storyItem != null) {
                l7.x(imageReceiver, storyItem);
            } else {
                r6 r6Var = k5Var.f15831b;
                k20[] k20VarArr = l7.f15896a;
                if (r6Var.f16169c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(r6Var.f16171f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(r6Var.f16170e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f15661e.f15830a;
        i4 i4Var = this.f15662f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f15660c = null;
            return;
        }
        int i10 = (int) (i4Var.F + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = bw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f15660c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.f15661e.f15830a.views, true);
            this.f15660c = bw0.c(spannableStringBuilder2, textPaint, (int) (i4Var.F + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
