package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class im4 extends URLSpan {
    public static final int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final vib c;
    public final boolean d;

    public im4(im4 im4Var, boolean z) {
        super(im4Var.a);
        this.a = im4Var.a;
        this.b = im4Var.b;
        this.c = im4Var.c;
        this.d = z;
    }

    public static CharSequence a(CharSequence charSequence, boolean z) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            im4[] im4VarArr = (im4[]) spanned.getSpans(0, spanned.length(), im4.class);
            int length = im4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                im4 im4Var = im4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = im4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (im4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(im4Var);
                    int spanEnd = r4.getSpanEnd(im4Var);
                    if (z) {
                        str = k96.A(im4Var.b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = im4Var.a;
                    }
                    r4.removeSpan(im4Var);
                    r4.replace(spanStart, spanEnd, str);
                    r4.setSpan(new im4(im4Var, z), spanStart, str.length() + spanStart, 33);
                }
                i++;
                r4 = r4;
            }
        }
        return charSequence;
    }

    public static CharSequence b(SpannableStringBuilder spannableStringBuilder) {
        return a(spannableStringBuilder, false);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vib vibVar = this.c;
        if (vibVar != null) {
            vibVar.a(textPaint);
        }
        if (i == color) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public im4(String str, vib vibVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = vibVar;
        this.d = false;
    }

    @Override
    public final void onClick(View view) {
    }
}
