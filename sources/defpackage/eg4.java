package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class eg4 {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final ig4 h;

    public eg4(ig4 ig4Var, int i, Spannable spannable, boolean z) {
        this.h = ig4Var;
        this.a = i;
        this.b = spannable;
        this.g = z;
    }

    public final int a(boolean z) {
        int i;
        int i2;
        CharSequence charSequence = this.b;
        ig4 ig4Var = this.h;
        int ceil = (int) Math.ceil(hg5.h(charSequence, ig4Var.b));
        this.c = ceil;
        int i3 = 0;
        if (z) {
            i = ((dk3) ig4Var.K).a(this.a);
            if (i < 0) {
                i = 0;
            }
            if (z) {
                this.d = i;
            }
        } else {
            i = this.d;
        }
        if (i > 0) {
            i2 = gm.L(-2.0f) + gm.L(10.0f) + Math.max(gm.L(7.333f), (int) Math.ceil(ig4Var.c.measureText(String.format("%d", Integer.valueOf(i)))));
        } else {
            if (!this.e && ig4Var.n) {
                i3 = gm.L(12.333f);
            }
            i2 = i3;
        }
        return Math.max(gm.L(16.0f), ceil + i2);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.b;
        if (TextUtils.equals(this.b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.b = spannableStringBuilder;
        CharSequence m = gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.b = m;
        this.b = k47.A5(m, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
