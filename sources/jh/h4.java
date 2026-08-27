package jh;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.tv0;

public final class h4 {

    public final ImageReceiver f13381a;

    public int f13382b;

    public StaticLayout f13383c;
    public final TextPaint d;

    public j5 f13384e;

    public final i4 f13385f;

    public h4(i4 i4Var) {
        this.f13385f = i4Var;
        ImageReceiver imageReceiver = new ImageReceiver(i4Var);
        this.f13381a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public final void a(int i10) {
        i4 i4Var = this.f13385f;
        ArrayList arrayList = i4Var.A;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        this.f13384e = (j5) arrayList.get(i10);
        boolean z10 = i4Var.v;
        ImageReceiver imageReceiver = this.f13381a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
        }
        j5 j5Var = this.f13384e;
        TL_stories.StoryItem storyItem = j5Var.f13532a;
        if (storyItem != null) {
            l7.x(imageReceiver, storyItem);
        } else {
            r6 r6Var = j5Var.f13533b;
            c20[] c20VarArr = l7.f13626a;
            if (r6Var.f13907c.K) {
                imageReceiver.setImage(ImageLocation.getForPath(r6Var.f13909f), "320_180", null, null, null, 0L, null, null, 0);
            } else {
                imageReceiver.setImage(ImageLocation.getForPath(r6Var.f13908e), "320_180", null, null, null, 0L, null, null, 0);
            }
        }
        b();
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f13384e.f13532a;
        i4 i4Var = this.f13385f;
        if (storyItem != null) {
            i4.a(i4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f13383c = null;
            return;
        }
        int i10 = (int) (i4Var.F + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout staticLayoutC = tv0.c(spannableStringBuilder, textPaint, i10, alignment, 0.0f, false, null, Integer.MAX_VALUE, 1, true);
        this.f13383c = staticLayoutC;
        if (staticLayoutC.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            i4.a(i4Var, spannableStringBuilder2, this.f13384e.f13532a.views, true);
            this.f13383c = tv0.c(spannableStringBuilder2, textPaint, (int) (i4Var.F + 1.0f), alignment, 0.0f, false, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
