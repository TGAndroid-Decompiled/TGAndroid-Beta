package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
public final class bg4 {
    public int a;
    public CharSequence b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final fg4 h;

    public bg4(fg4 fg4Var, int i, CharSequence charSequence, boolean z) {
        this.h = fg4Var;
        this.a = i;
        this.b = charSequence;
        this.g = z;
    }

    public final int a(boolean z) {
        int i;
        int i2;
        CharSequence charSequence = this.b;
        fg4 fg4Var = this.h;
        int ceil = (int) Math.ceil(kg5.h(charSequence, fg4Var.b));
        this.c = ceil;
        int i3 = 0;
        if (z) {
            i = fg4Var.K.q(this.a);
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
            i2 = hl.L(-2.0f) + hl.L(10.0f) + Math.max(hl.L(7.333f), (int) Math.ceil(fg4Var.c.measureText(String.format("%d", Integer.valueOf(i)))));
        } else {
            if (!this.e && fg4Var.n) {
                i3 = hl.L(12.333f);
            }
            i2 = i3;
        }
        return Math.max(hl.L(16.0f), ceil + i2);
    }

    public final void b(String str) {
        TextPaint textPaint = this.h.b;
        if (TextUtils.equals(this.b, str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        this.b = spannableStringBuilder;
        CharSequence m = pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.b = m;
        this.b = r47.A5(m, null, textPaint.getFontMetricsInt(), false);
        this.g = false;
    }
}
