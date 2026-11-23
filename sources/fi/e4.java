package fi;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.yu0;
public final class e4 {
    public final ImageReceiver f11887a;
    public int f11888b;
    public StaticLayout f11889c;
    public final TextPaint d;
    public i5 f11890e;
    public final f4 f11891f;

    public e4(f4 f4Var) {
        this.f11891f = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(f4Var);
        this.f11887a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.K0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        f4 f4Var = this.f11891f;
        ArrayList arrayList = f4Var.F;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f11890e = (i5) arrayList.get(i7);
            boolean z10 = f4Var.f11944w;
            ImageReceiver imageReceiver = this.f11887a;
            if (z10) {
                imageReceiver.Q();
            }
            i5 i5Var = this.f11890e;
            TL_stories.StoryItem storyItem = i5Var.f12104a;
            if (storyItem != null) {
                i7.x(imageReceiver, storyItem);
            } else {
                o6 o6Var = i5Var.f12105b;
                q10[] q10VarArr = i7.f12109a;
                if (o6Var.f12337c.K) {
                    imageReceiver.s0(fc.g(o6Var.f12339f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.s0(fc.g(o6Var.f12338e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11890e.f12104a;
        f4 f4Var = this.f11891f;
        if (storyItem != null) {
            f4.a(f4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11889c = null;
            return;
        }
        int i7 = (int) (f4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = yu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f11889c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f4.a(f4Var, spannableStringBuilder2, this.f11890e.f12104a.views, true);
            this.f11889c = yu0.c(spannableStringBuilder2, textPaint, (int) (f4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
