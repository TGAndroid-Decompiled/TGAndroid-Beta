package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.zu0;
public final class e4 {
    public final ImageReceiver f11925a;
    public int f11926b;
    public StaticLayout f11927c;
    public final TextPaint d;
    public i5 f11928e;
    public final f4 f11929f;

    public e4(f4 f4Var) {
        this.f11929f = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(f4Var);
        this.f11925a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        f4 f4Var = this.f11929f;
        ArrayList arrayList = f4Var.F;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f11928e = (i5) arrayList.get(i7);
            boolean z10 = f4Var.f11982w;
            ImageReceiver imageReceiver = this.f11925a;
            if (z10) {
                imageReceiver.P();
            }
            i5 i5Var = this.f11928e;
            TL_stories.StoryItem storyItem = i5Var.f12142a;
            if (storyItem != null) {
                i7.x(imageReceiver, storyItem);
            } else {
                o6 o6Var = i5Var.f12143b;
                s10[] s10VarArr = i7.f12147a;
                if (o6Var.f12375c.K) {
                    imageReceiver.r0(gc.g(o6Var.f12377f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(gc.g(o6Var.f12376e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11928e.f12142a;
        f4 f4Var = this.f11929f;
        if (storyItem != null) {
            f4.a(f4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11927c = null;
            return;
        }
        int i7 = (int) (f4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = zu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f11927c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f4.a(f4Var, spannableStringBuilder2, this.f11928e.f12142a.views, true);
            this.f11927c = zu0.c(spannableStringBuilder2, textPaint, (int) (f4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
