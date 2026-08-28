package ih;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.z10;
public final class l4 {
    public final ImageReceiver f11706a;
    public int f11707b;
    public StaticLayout f11708c;
    public final TextPaint d;
    public n5 f11709e;
    public final m4 f11710f;

    public l4(m4 m4Var) {
        this.f11710f = m4Var;
        ImageReceiver imageReceiver = new ImageReceiver(m4Var);
        this.f11706a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i9) {
        m4 m4Var = this.f11710f;
        ArrayList arrayList = m4Var.A;
        if (i9 >= 0 && i9 < arrayList.size()) {
            this.f11709e = (n5) arrayList.get(i9);
            boolean z10 = m4Var.v;
            ImageReceiver imageReceiver = this.f11706a;
            if (z10) {
                imageReceiver.onAttachedToWindow();
            }
            n5 n5Var = this.f11709e;
            TL_stories.StoryItem storyItem = n5Var.f11843a;
            if (storyItem != null) {
                p7.x(imageReceiver, storyItem);
            } else {
                u6 u6Var = n5Var.f11844b;
                z10[] z10VarArr = p7.f11959a;
                if (u6Var.f12193c.K) {
                    imageReceiver.setImage(ImageLocation.getForPath(u6Var.f12195f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.setImage(ImageLocation.getForPath(u6Var.f12194e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11709e.f11843a;
        m4 m4Var = this.f11710f;
        if (storyItem != null) {
            m4.a(m4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11708c = null;
            return;
        }
        int i9 = (int) (m4Var.F + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = rv0.c(spannableStringBuilder, textPaint, i9, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f11708c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            m4.a(m4Var, spannableStringBuilder2, this.f11709e.f11843a.views, true);
            this.f11708c = rv0.c(spannableStringBuilder2, textPaint, (int) (m4Var.F + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
