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
    public final ImageReceiver f11881a;
    public int f11882b;
    public StaticLayout f11883c;
    public final TextPaint d;
    public h5 f11884e;
    public final f4 f11885f;

    public e4(f4 f4Var) {
        this.f11885f = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(f4Var);
        this.f11881a = imageReceiver;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(int i7) {
        f4 f4Var = this.f11885f;
        ArrayList arrayList = f4Var.F;
        if (i7 >= 0 && i7 < arrayList.size()) {
            this.f11884e = (h5) arrayList.get(i7);
            boolean z10 = f4Var.f11937w;
            ImageReceiver imageReceiver = this.f11881a;
            if (z10) {
                imageReceiver.P();
            }
            h5 h5Var = this.f11884e;
            TL_stories.StoryItem storyItem = h5Var.f12037a;
            if (storyItem != null) {
                i7.x(imageReceiver, storyItem);
            } else {
                o6 o6Var = h5Var.f12038b;
                p10[] p10VarArr = i7.f12112a;
                if (o6Var.f12330c.K) {
                    imageReceiver.r0(fc.g(o6Var.f12332f), "320_180", null, null, null, 0L, null, null, 0);
                } else {
                    imageReceiver.r0(fc.g(o6Var.f12331e), "320_180", null, null, null, 0L, null, null, 0);
                }
            }
            b();
        }
    }

    public final void b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_stories.StoryItem storyItem = this.f11884e.f12037a;
        f4 f4Var = this.f11885f;
        if (storyItem != null) {
            f4.a(f4Var, spannableStringBuilder, storyItem.views, false);
        }
        if (spannableStringBuilder.length() == 0) {
            this.f11883c = null;
            return;
        }
        int i7 = (int) (f4Var.K + 1.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextPaint textPaint = this.d;
        StaticLayout c10 = wu0.c(spannableStringBuilder, textPaint, i7, alignment, 0.0f, null, Integer.MAX_VALUE, 1, true);
        this.f11883c = c10;
        if (c10.getLineCount() > 1) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            f4.a(f4Var, spannableStringBuilder2, this.f11884e.f12037a.views, true);
            this.f11883c = wu0.c(spannableStringBuilder2, textPaint, (int) (f4Var.K + 1.0f), alignment, 0.0f, null, Integer.MAX_VALUE, 2, true);
        }
    }
}
