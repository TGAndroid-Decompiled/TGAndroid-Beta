package di;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.mu0;
public final class n4 {
    public final ImageReceiver f9399a;
    public int f9400b;
    public StaticLayout f9401c;
    public final TextPaint d;
    public r5 f9402e;
    public final o4 f9403f;

    public n4(o4 o4Var) {
        this.f9403f = o4Var;
        ImageReceiver imageReceiver = new ImageReceiver(o4Var);
        this.f9399a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.f21236z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        o4 o4Var = this.f9403f;
        ArrayList arrayList = o4Var.E;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f9402e = (r5) arrayList.get(i7);
            boolean z9 = o4Var.f9462w;
            ImageReceiver imageReceiver = this.f9399a;
            if (z9) {
                imageReceiver.P();
            }
            r5 r5Var = this.f9402e;
            TL_stories.StoryItem storyItem = r5Var.f9699a;
            if (storyItem != null) {
                r7.x(imageReceiver, storyItem);
            } else {
                x6 x6Var = r5Var.f9700b;
                f10[] f10VarArr = r7.f9704a;
                if (x6Var.f9930c.K) {
                    imageReceiver.r0(hc.g(x6Var.f9932f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(hc.g(x6Var.f9931e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f9402e.f9699a;
        o4 o4Var = this.f9403f;
        if (storyItem != null) {
            o4.a(o4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f9401c = null;
            return;
        }
        int i7 = (int) (o4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = mu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f9401c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            o4.a(o4Var, spannableStringBuilder2, this.f9402e.f9699a.views, true);
            this.f9401c = mu0.c(spannableStringBuilder2, textPaint, (int) (o4Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
