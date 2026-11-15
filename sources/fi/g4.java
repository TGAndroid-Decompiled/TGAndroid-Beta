package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.ou0;
public final class g4 {
    public final ImageReceiver f11736a;
    public int f11737b;
    public StaticLayout f11738c;
    public final TextPaint d;
    public j5 f11739e;
    public final h4 f11740f;

    public g4(h4 h4Var) {
        this.f11740f = h4Var;
        ImageReceiver imageReceiver = new ImageReceiver(h4Var);
        this.f11736a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        h4 h4Var = this.f11740f;
        ArrayList arrayList = h4Var.F;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f11739e = (j5) arrayList.get(i7);
            boolean z10 = h4Var.f11771w;
            ImageReceiver imageReceiver = this.f11736a;
            if (z10) {
                imageReceiver.P();
            }
            j5 j5Var = this.f11739e;
            TL_stories.StoryItem storyItem = j5Var.f11899a;
            if (storyItem != null) {
                l7.x(imageReceiver, storyItem);
            } else {
                r6 r6Var = j5Var.f11900b;
                i10[] i10VarArr = l7.f12001a;
                if (r6Var.f12274c.K) {
                    imageReceiver.r0(gc.g(r6Var.f12276f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(gc.g(r6Var.f12275e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11739e.f11899a;
        h4 h4Var = this.f11740f;
        if (storyItem != null) {
            h4.a(h4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11738c = null;
            return;
        }
        int i7 = (int) (h4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ou0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f11738c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            h4.a(h4Var, spannableStringBuilder2, this.f11739e.f11899a.views, true);
            this.f11738c = ou0.c(spannableStringBuilder2, textPaint, (int) (h4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
