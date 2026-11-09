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
import org.telegram.ui.Components.ou0;
public final class o4 {
    public final ImageReceiver f9432a;
    public int f9433b;
    public StaticLayout f9434c;
    public final TextPaint d;
    public s5 f9435e;
    public final p4 f9436f;

    public o4(p4 p4Var) {
        this.f9436f = p4Var;
        ImageReceiver imageReceiver = new ImageReceiver(p4Var);
        this.f9432a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.f21236z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        p4 p4Var = this.f9436f;
        ArrayList arrayList = p4Var.E;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f9435e = (s5) arrayList.get(i7);
            boolean z9 = p4Var.f9506w;
            ImageReceiver imageReceiver = this.f9432a;
            if (z9) {
                imageReceiver.P();
            }
            s5 s5Var = this.f9435e;
            TL_stories.StoryItem storyItem = s5Var.f9730a;
            if (storyItem != null) {
                s7.x(imageReceiver, storyItem);
            } else {
                y6 y6Var = s5Var.f9731b;
                f10[] f10VarArr = s7.f9735a;
                if (y6Var.f9960c.K) {
                    imageReceiver.r0(hc.g(y6Var.f9962f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(hc.g(y6Var.f9961e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f9435e.f9730a;
        p4 p4Var = this.f9436f;
        if (storyItem != null) {
            p4.a(p4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f9434c = null;
            return;
        }
        int i7 = (int) (p4Var.J + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = ou0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f9434c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            p4.a(p4Var, spannableStringBuilder2, this.f9435e.f9730a.views, true);
            this.f9434c = ou0.c(spannableStringBuilder2, textPaint, (int) (p4Var.J + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
