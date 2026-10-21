package ki;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.o11;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.xw0;
public abstract class e6 {
    public static final int[] f15248a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i10, TL_iv.PageBlock pageBlock, boolean z10) {
        String str;
        CharSequence charSequence;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i11 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                a(spannableStringBuilder, richText2, i10, pageBlock, z10);
            }
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = j(textdiff.text);
            boolean j11 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j10) {
                a(spannableStringBuilder, textdiff.old_text, i10, pageBlock, z10);
                if (spannableStringBuilder.length() > length) {
                    ?? obj = new Object();
                    obj.f28650a = 8192;
                    spannableStringBuilder.setSpan(new o11(obj, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i10, pageBlock, z10);
            if (j11) {
                if (spannableStringBuilder.length() > length) {
                    ?? obj2 = new Object();
                    obj2.f28650a = 4096;
                    spannableStringBuilder.setSpan(new o11(obj2, 0), length, spannableStringBuilder.length(), 33);
                }
            } else if (spannableStringBuilder.length() > length) {
                spannableStringBuilder.setSpan(new xw0(), length, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i10, pageBlock);
        } else if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            if (str2 != null && !str2.isEmpty()) {
                charSequence = textcustomemoji.alt;
            } else {
                charSequence = "😀";
            }
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            a6Var.cacheType = org.telegram.ui.Components.r5.g();
            spannableStringBuilder.setSpan(a6Var, length2, spannableStringBuilder.length(), 33);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length2, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() > length3 && (str = texturl.url) != null) {
                spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                ?? obj3 = new Object();
                obj3.f28650a |= 128;
                spannableStringBuilder.setSpan(new p10(charSequence2, obj3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = s.a(textmath.source, h6.x0(null, h6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
            if (a2 != null) {
                spannableStringBuilder.setSpan(a2, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence3 = textmath.source;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence3);
            }
            if (spannableStringBuilder.length() > length5 && i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length5, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i10, pageBlock, z10);
            if (z10 && spannableStringBuilder.length() > length7 && k4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new k4(textbutton), length7, spannableStringBuilder.length(), 33);
            }
        } else {
            if (richText instanceof TL_iv.textBold) {
                i11 = 1;
            } else if (richText instanceof TL_iv.textItalic) {
                i11 = 2;
            } else if (richText instanceof TL_iv.textUnderline) {
                i11 = 16;
            } else if (richText instanceof TL_iv.textStrike) {
                i11 = 8;
            } else if (richText instanceof TL_iv.textFixed) {
                i11 = 4;
            } else if (richText instanceof TL_iv.textSpoiler) {
                i11 = 256;
            } else if (richText instanceof TL_iv.textSubscript) {
                i11 = 16384;
            } else if (richText instanceof TL_iv.textSuperscript) {
                i11 = 32768;
            } else if (richText instanceof TL_iv.textMarked) {
                i11 = 65536;
            }
            if (i11 != 0) {
                a(spannableStringBuilder, richText.text, i10 | i11, pageBlock, z10);
            } else {
                b(spannableStringBuilder, l(richText), i10, pageBlock);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i10, TL_iv.PageBlock pageBlock) {
        if (str != null && !str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static void c(Spannable spannable, int i10, int i11, int i12, TL_iv.PageBlock pageBlock) {
        if (i10 < i11 && i12 != 0) {
            spannable.setSpan(p(i12, pageBlock), i10, i11, 33);
        }
    }

    public static int d(java.lang.CharSequence r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.e6.d(java.lang.CharSequence):int");
    }

    public static int e(Spanned spanned, int i10, int i11) {
        o11[] o11VarArr = (o11[]) spanned.getSpans(i10, i11, o11.class);
        int i12 = 0;
        for (o11 o11Var : o11VarArr) {
            int i13 = o11Var.f28920b.f28650a;
            if ((i13 & 512) != 0) {
                i13 |= 256;
            }
            i12 |= i13;
        }
        return 114975 & i12;
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText f(java.lang.CharSequence r13) {
        throw new UnsupportedOperationException("Method not decompiled: ki.e6.f(java.lang.CharSequence):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static boolean g(Editable editable, int i10, int i11) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && com.google.android.gms.internal.play_billing.k3.s(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, p10.class);
                if (((p10[]) editable.getSpans(max, nextSpanTransition, p10.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i10, int i11) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && com.google.android.gms.internal.play_billing.k3.s(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, n61.class);
                if (((n61[]) editable.getSpans(max, nextSpanTransition, n61.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i10, int i11, int i12, CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, o11.class);
            if ((e(spanned, max, nextSpanTransition) & i12) == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static boolean j(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null || str.isEmpty()) {
                return true;
            }
            return false;
        } else if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        } else {
            if (richText instanceof TL_iv.textMath) {
                String str2 = ((TL_iv.textMath) richText).source;
                if (str2 == null || str2.isEmpty()) {
                    return true;
                }
                return false;
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i10);
                    i10++;
                    if (!j(richText2)) {
                        return false;
                    }
                }
                return true;
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                if (j(textdiff.text) && j(textdiff.old_text)) {
                    return true;
                }
                return false;
            } else {
                return j(richText.text);
            }
        }
    }

    public static n61 k(String str) {
        ?? obj = new Object();
        obj.f28650a = 1024;
        return new n61(str, obj);
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            if (str == null) {
                return "";
            }
            return str;
        } else if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            if (str2 == null) {
                return "";
            }
            return str2;
        } else if (richText instanceof TL_iv.textMath) {
            return " ";
        } else {
            if (richText instanceof TL_iv.textConcat) {
                StringBuilder sb2 = new StringBuilder();
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i10);
                    i10++;
                    sb2.append(l(richText2));
                }
                return sb2.toString();
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                String l4 = l(textdiff.text);
                if (j(textdiff.text)) {
                    return l(textdiff.old_text);
                }
                return l4;
            } else {
                return l(richText.text);
            }
        }
    }

    public static void m(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2) {
            for (p10 p10Var : (p10[]) editable.getSpans(max, max2, p10.class)) {
                editable.removeSpan(p10Var);
            }
        }
    }

    public static void n(Editable editable, int i10, int i11) {
        n61[] n61VarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2) {
            for (n61 n61Var : (n61[]) editable.getSpans(max, max2, n61.class)) {
                int spanStart = editable.getSpanStart(n61Var);
                int spanEnd = editable.getSpanEnd(n61Var);
                editable.removeSpan(n61Var);
                if (spanStart < max) {
                    editable.setSpan(k(n61Var.getURL()), spanStart, max, 33);
                }
                if (spanEnd > max2) {
                    editable.setSpan(k(n61Var.getURL()), max2, spanEnd, 33);
                }
            }
        }
    }

    public static void o(Spannable spannable, int i10, int i11, int i12, boolean z10, TL_iv.PageBlock pageBlock) {
        o11[] o11VarArr;
        int i13;
        int length = spannable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2) {
            for (o11 o11Var : (o11[]) spannable.getSpans(max, max2, o11.class)) {
                int spanStart = spannable.getSpanStart(o11Var);
                int spanEnd = spannable.getSpanEnd(o11Var);
                int i14 = o11Var.f28920b.f28650a;
                spannable.removeSpan(o11Var);
                c(spannable, spanStart, max, i14, pageBlock);
                c(spannable, max2, spanEnd, i14, pageBlock);
                int max3 = Math.max(spanStart, max);
                int min = Math.min(spanEnd, max2);
                if (z10) {
                    i13 = i14 | i12;
                } else {
                    i13 = (~i12) & i14;
                }
                c(spannable, max3, min, i13, pageBlock);
            }
            if (z10) {
                while (max < max2) {
                    int nextSpanTransition = spannable.nextSpanTransition(max, max2, o11.class);
                    if (e(spannable, max, nextSpanTransition) == 0) {
                        c(spannable, max, nextSpanTransition, i12, pageBlock);
                    }
                    max = nextSpanTransition;
                }
            }
        }
    }

    public static o11 p(int i10, TL_iv.PageBlock pageBlock) {
        boolean z10;
        ?? obj = new Object();
        obj.f28650a = i10;
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            z10 = false;
        } else {
            z10 = true;
        }
        obj.e = z10;
        return new o11(obj, 0);
    }

    public static int q(int i10, int i11, CharSequence charSequence) {
        int i12 = 0;
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = f15248a[i13];
            if (i(i10, i11, i14, charSequence)) {
                i12 |= i14;
            }
        }
        return i12;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z10);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, d6 d6Var) {
        TL_iv.textCustomEmoji textcustomemoji;
        k4 k4Var = d6Var.f15238f;
        if (k4Var != null) {
            return k4Var.f15362a;
        }
        if (d6Var.e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = d6Var.e;
            return textmath;
        }
        long j10 = d6Var.d;
        if (j10 != 0) {
            TL_iv.textCustomEmoji textcustomemoji2 = new TL_iv.textCustomEmoji();
            textcustomemoji2.document_id = j10;
            if (str == null) {
                str = "";
            }
            textcustomemoji2.alt = str;
            textcustomemoji = textcustomemoji2;
        } else {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            textcustomemoji = textplain;
        }
        int i10 = d6Var.f15235a;
        TL_iv.RichText richText = textcustomemoji;
        if ((i10 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = textcustomemoji;
            richText = textbold;
        }
        TL_iv.RichText richText2 = richText;
        if ((i10 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText;
            richText2 = textitalic;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i10 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText2;
            richText3 = textunderline;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i10 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText3;
            richText4 = textstrike;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i10 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText4;
            richText5 = textfixed;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i10 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText5;
            richText6 = textspoiler;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i10 & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText6;
            richText7 = textsubscript;
        }
        TL_iv.RichText richText8 = richText7;
        if ((32768 & i10) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText7;
            richText8 = textsuperscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((i10 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText8;
            richText9 = textmarked;
        }
        TL_iv.RichText richText10 = richText9;
        if (d6Var.f15236b != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText9;
            texturl.url = d6Var.f15236b;
            richText10 = texturl;
        }
        p10 p10Var = d6Var.f15237c;
        if (p10Var != null) {
            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = p10Var.f29188b;
            TL_iv.textDate textdate = new TL_iv.textDate();
            textdate.text = richText10;
            textdate.flags = tL_messageEntityFormattedDate.flags;
            textdate.relative = tL_messageEntityFormattedDate.relative;
            textdate.short_time = tL_messageEntityFormattedDate.short_time;
            textdate.long_time = tL_messageEntityFormattedDate.long_time;
            textdate.short_date = tL_messageEntityFormattedDate.short_date;
            textdate.long_date = tL_messageEntityFormattedDate.long_date;
            textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
            textdate.date = tL_messageEntityFormattedDate.date;
            return textdate;
        }
        return richText10;
    }
}
