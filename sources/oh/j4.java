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
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.q20;
public final class j4 {
    public final ImageReceiver f17330a;
    public int f17331b;
    public StaticLayout f17332c;
    public final TextPaint d;
    public m5 f17333e;
    public final k4 f17334f;

    public j4(k4 k4Var) {
        this.f17334f = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(k4Var);
        this.f17330a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        k4 k4Var = this.f17334f;
        ArrayList arrayList = k4Var.B;
        if (i10 >= 0 && i10 < arrayList.size()) {
            this.f17333e = (m5) arrayList.get(i10);
            boolean z4 = k4Var.v;
            ImageReceiver imageReceiver = this.f17330a;
            if (z4) {
                imageReceiver.onAttachedToWindow();
            }
            m5 m5Var = this.f17333e;
            TL_stories.StoryItem storyItem = m5Var.f17437a;
            if (storyItem != null) {
                m7.x(imageReceiver, storyItem);
            } else {
                s6 s6Var = m5Var.f17438b;
                q20[] q20VarArr = m7.f17442a;
                if (s6Var.f17737c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f17739f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(s6Var.f17738e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f17333e.f17437a;
        k4 k4Var = this.f17334f;
        if (storyItem != null) {
            k4.a(k4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f17332c = null;
            return;
        }
        int i10 = (int) (k4Var.G + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c3 = lw0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f17332c = c3;
        if (c3.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            k4.a(k4Var, spannableStringBuilder2, this.f17333e.f17437a.views, true);
            this.f17332c = lw0.c(spannableStringBuilder2, textPaint, (int) (k4Var.G + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
