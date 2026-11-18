package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.wu0;
public final class e4 {
    public final ImageReceiver f11884a;
    public int f11885b;
    public StaticLayout f11886c;
    public final TextPaint d;
    public h5 f11887e;
    public final f4 f11888f;

    public e4(f4 f4Var) {
        this.f11888f = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(f4Var);
        this.f11884a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        f4 f4Var = this.f11888f;
        ArrayList arrayList = f4Var.F;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f11887e = (h5) arrayList.get(i7);
            boolean z10 = f4Var.f11940w;
            ImageReceiver imageReceiver = this.f11884a;
            if (z10) {
                imageReceiver.P();
            }
            h5 h5Var = this.f11887e;
            TL_stories.StoryItem storyItem = h5Var.f12040a;
            if (storyItem != null) {
                i7.x(imageReceiver, storyItem);
            } else {
                o6 o6Var = h5Var.f12041b;
                p10[] p10VarArr = i7.f12115a;
                if (o6Var.f12333c.K) {
                    imageReceiver.r0(fc.g(o6Var.f12335f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(fc.g(o6Var.f12334e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11887e.f12040a;
        f4 f4Var = this.f11888f;
        if (storyItem != null) {
            f4.a(f4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11886c = null;
            return;
        }
        int i7 = (int) (f4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = wu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f11886c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f4.a(f4Var, spannableStringBuilder2, this.f11887e.f12040a.views, true);
            this.f11886c = wu0.c(spannableStringBuilder2, textPaint, (int) (f4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
