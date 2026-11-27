package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class no4 extends URLSpan {
    public static final int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final rmb c;
    public final boolean d;

    public no4(no4 no4Var, boolean z) {
        super(no4Var.a);
        this.a = no4Var.a;
        this.b = no4Var.b;
        this.c = no4Var.c;
        this.d = z;
    }

    public static CharSequence a(CharSequence charSequence, boolean z) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            no4[] no4VarArr = (no4[]) spanned.getSpans(0, spanned.length(), no4.class);
            int length = no4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                no4 no4Var = no4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = no4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (no4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(no4Var);
                    int spanEnd = r4.getSpanEnd(no4Var);
                    if (spanStart >= 0 && spanEnd >= spanStart) {
                        if (z) {
                            str = ob6.A(no4Var.b, System.currentTimeMillis(), Locale.getDefault(), false);
                        } else {
                            str = no4Var.a;
                        }
                        r4.removeSpan(no4Var);
                        r4.replace(spanStart, spanEnd, str);
                        r4.setSpan(new no4(no4Var, z), spanStart, str.length() + spanStart, 33);
                    }
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
        rmb rmbVar = this.c;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        if (i == color) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public no4(String str, rmb rmbVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = rmbVar;
        this.d = false;
    }

    @Override
    public final void onClick(View view) {
    }
}
