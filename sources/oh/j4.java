package oh;

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
public final class j4 {
    public final ImageReceiver f17332a;
    public int f17333b;
    public StaticLayout f17334c;
    public final TextPaint d;
    public m5 f17335e;
    public final k4 f17336f;

    public j4(k4 k4Var) {
        this.f17336f = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(k4Var);
        this.f17332a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        k4 k4Var = this.f17336f;
        ArrayList arrayList = k4Var.B;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f17335e = (m5) arrayList.get(i10);
            boolean z4 = k4Var.v;
            ImageReceiver imageReceiver = this.f17332a;
            if (z4) {
                imageReceiver.onAttachedToWindow();
            }
            m5 m5Var = this.f17335e;
            TL_stories.StoryItem storyItem = m5Var.f17439a;
            if (storyItem != null) {
                m7.x(imageReceiver, storyItem);
            } else {
                s6 s6Var = m5Var.f17440b;
                q20[] q20VarArr = m7.f17444a;
                if (s6Var.f17739c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f17741f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f17740e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f17335e.f17439a;
        k4 k4Var = this.f17336f;
        if (storyItem != null) {
            k4.a(k4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f17334c = null;
            return;
        }
        int i10 = (int) (k4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = kw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f17334c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            k4.a(k4Var, spannableStringBuilder2, this.f17335e.f17439a.views, true);
            this.f17334c = kw0.c(spannableStringBuilder2, textPaint, (int) (k4Var.G + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
