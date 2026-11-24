package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public final class jo4 extends URLSpan {
    public static final int e = 0;
    public final String a;
    public final TLRPC.TL_messageEntityFormattedDate b;
    public final wkb c;
    public final boolean d;

    public jo4(jo4 jo4Var, boolean z) {
        super(jo4Var.a);
        this.a = jo4Var.a;
        this.b = jo4Var.b;
        this.c = jo4Var.c;
        this.d = z;
    }

    public static CharSequence a(CharSequence charSequence, boolean z) {
        String str;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            jo4[] jo4VarArr = (jo4[]) spanned.getSpans(0, spanned.length(), jo4.class);
            int length = jo4VarArr.length;
            ?? r4 = 0;
            int i = 0;
            while (i < length) {
                jo4 jo4Var = jo4VarArr[i];
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = jo4Var.b;
                if (tL_messageEntityFormattedDate.flags != 0 && (jo4Var.d != z || (z && tL_messageEntityFormattedDate.relative))) {
                    if (r4 == 0) {
                        charSequence = new SpannableStringBuilder(spanned);
                        r4 = charSequence;
                    }
                    int spanStart = r4.getSpanStart(jo4Var);
                    int spanEnd = r4.getSpanEnd(jo4Var);
                    if (z) {
                        str = jb6.A(jo4Var.b, System.currentTimeMillis(), Locale.getDefault(), false);
                    } else {
                        str = jo4Var.a;
                    }
                    r4.removeSpan(jo4Var);
                    r4.replace(spanStart, spanEnd, str);
                    r4.setSpan(new jo4(jo4Var, z), spanStart, str.length() + spanStart, 33);
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
        wkb wkbVar = this.c;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        if (i == color) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    public jo4(String str, wkb wkbVar, TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate) {
        super(str);
        this.a = str;
        this.b = tL_messageEntityFormattedDate;
        this.c = wkbVar;
        this.d = false;
    }

    @Override
    public final void onClick(View view) {
    }
}
