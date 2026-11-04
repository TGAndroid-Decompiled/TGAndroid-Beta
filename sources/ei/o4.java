package ei;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.lu0;
public final class o4 {
    public final ImageReceiver f10688a;
    public int f10689b;
    public StaticLayout f10690c;
    public final TextPaint d;
    public r5 f10691e;
    public final p4 f10692f;

    public o4(p4 p4Var) {
        this.f10692f = p4Var;
        ImageReceiver imageReceiver = new ImageReceiver(p4Var);
        this.f10688a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i3) {
        p4 p4Var = this.f10692f;
        ArrayList arrayList = p4Var.F;
        if (i3 >= 0 && i3 < arrayList.size()) {
            this.f10691e = (r5) arrayList.get(i3);
            boolean z10 = p4Var.f10766w;
            ImageReceiver imageReceiver = this.f10688a;
            if (z10) {
                imageReceiver.P();
            }
            r5 r5Var = this.f10691e;
            TL_stories.StoryItem storyItem = r5Var.f10868a;
            if (storyItem != null) {
                s7.x(imageReceiver, storyItem);
            } else {
                y6 y6Var = r5Var.f10869b;
                b10[] b10VarArr = s7.f11011a;
                if (y6Var.f11236c.K) {
                    imageReceiver.r0(ac.g(y6Var.f11238f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(ac.g(y6Var.f11237e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f10691e.f10868a;
        p4 p4Var = this.f10692f;
        if (storyItem != null) {
            p4.a(p4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f10690c = null;
            return;
        }
        int i3 = (int) (p4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c2 = lu0.c(spannableStringBuilder, textPaint, i3, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f10690c = c2;
        if (c2.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            p4.a(p4Var, spannableStringBuilder2, this.f10691e.f10868a.views, true);
            this.f10690c = lu0.c(spannableStringBuilder2, textPaint, (int) (p4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
