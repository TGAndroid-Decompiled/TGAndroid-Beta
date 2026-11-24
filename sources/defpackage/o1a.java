package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class o1a {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public o2a e;
    public final p1a f;

    public o1a(p1a p1aVar) {
        this.f = p1aVar;
        ImageReceiver imageReceiver = new ImageReceiver(p1aVar);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.q0(gm.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(gm.L(13.0f));
    }

    public final void a(int i) {
        p1a p1aVar = this.f;
        ArrayList arrayList = p1aVar.F;
        if (i >= 0 && i < arrayList.size()) {
            this.e = (o2a) arrayList.get(i);
            boolean z = p1aVar.w;
            ImageReceiver imageReceiver = this.a;
            if (z) {
                imageReceiver.I();
            }
            o2a o2aVar = this.e;
            TL_stories.StoryItem storyItem = o2aVar.a;
            if (storyItem != null) {
                y4b.x(imageReceiver, storyItem);
            } else {
                g4b g4bVar = o2aVar.b;
                j15[] j15VarArr = y4b.a;
                if (g4bVar.c.K) {
                    imageReceiver.Z(gn5.g(g4bVar.f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.Z(gn5.g(g4bVar.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        if (storyItem != null) {
            p1a.a(spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        p1a p1aVar = this.f;
        int i = (int) (p1aVar.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c = oya.c(spannableStringBuilder, textPaint, i, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.c = c;
        if (c.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            p1a.a(spannableStringBuilder2, this.e.a.views, true);
            this.c = oya.c(spannableStringBuilder2, textPaint, (int) (p1aVar.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
