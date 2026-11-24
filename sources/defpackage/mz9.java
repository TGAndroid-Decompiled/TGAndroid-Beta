package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class mz9 {
    public final ImageReceiver a;
    public int b;
    public StaticLayout c;
    public final TextPaint d;
    public m0a e;
    public final nz9 f;

    public mz9(nz9 nz9Var) {
        this.f = nz9Var;
        ImageReceiver imageReceiver = new ImageReceiver(nz9Var);
        this.a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.q0(gl.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(13.0f));
    }

    public final void a(int i) {
        nz9 nz9Var = this.f;
        ArrayList arrayList = nz9Var.F;
        if (i >= 0 && i < arrayList.size()) {
            this.e = (m0a) arrayList.get(i);
            boolean z = nz9Var.w;
            ImageReceiver imageReceiver = this.a;
            if (z) {
                imageReceiver.I();
            }
            m0a m0aVar = this.e;
            TL_stories.StoryItem storyItem = m0aVar.a;
            if (storyItem != null) {
                x2b.x(imageReceiver, storyItem);
            } else {
                f2b f2bVar = m0aVar.b;
                kz4[] kz4VarArr = x2b.a;
                if (f2bVar.c.K) {
                    imageReceiver.Z(gl5.g(f2bVar.f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.Z(gl5.g(f2bVar.e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.e.a;
        if (storyItem != null) {
            nz9.a(spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.c = null;
            return;
        }
        nz9 nz9Var = this.f;
        int i = (int) (nz9Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c = lwa.c(spannableStringBuilder, textPaint, i, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.c = c;
        if (c.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            nz9.a(spannableStringBuilder2, this.e.a.views, true);
            this.c = lwa.c(spannableStringBuilder2, textPaint, (int) (nz9Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
