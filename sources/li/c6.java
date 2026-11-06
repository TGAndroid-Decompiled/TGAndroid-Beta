package li;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.zz;
public abstract class c6 {
    public static final int[] f18504a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i7, TL_iv.PageBlock pageBlock, boolean z9) {
        String str;
        CharSequence charSequence;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i10 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                a(spannableStringBuilder, richText2, i7, pageBlock, z9);
            }
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j3 = j(textdiff.text);
            boolean j10 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j3) {
                a(spannableStringBuilder, textdiff.old_text, i7, pageBlock, z9);
                if (spannableStringBuilder.length() > length) {
                    ?? obj = new Object();
                    obj.f38442a = 8192;
                    spannableStringBuilder.setSpan(new uy0(obj, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i7, pageBlock, z9);
            if (j10) {
                if (spannableStringBuilder.length() > length) {
                    ?? obj2 = new Object();
                    obj2.f38442a = 4096;
                    spannableStringBuilder.setSpan(new uy0(obj2, 0), length, spannableStringBuilder.length(), 33);
                }
            } else if (spannableStringBuilder.length() > length) {
                spannableStringBuilder.setSpan(new eu0(), length, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i7, pageBlock);
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
            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            r5Var.cacheType = org.telegram.ui.Components.i5.f();
            spannableStringBuilder.setSpan(r5Var, length2, spannableStringBuilder.length(), 33);
            if (i7 != 0) {
                spannableStringBuilder.setSpan(p(i7, pageBlock), length2, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i7, pageBlock, z9);
            if (spannableStringBuilder.length() > length3 && (str = texturl.url) != null) {
                spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i7, pageBlock, z9);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                ?? obj3 = new Object();
                obj3.f38442a |= 128;
                spannableStringBuilder.setSpan(new zz(charSequence2, obj3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a10 = r.a(textmath.source, k6.x0(null, k6.G6, false), org.telegram.messenger.g0.L(iz.W0 + 4));
            if (a10 != null) {
                spannableStringBuilder.setSpan(a10, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence3 = textmath.source;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence3);
            }
            if (spannableStringBuilder.length() > length5 && i7 != 0) {
                spannableStringBuilder.setSpan(p(i7, pageBlock), length5, spannableStringBuilder.length(), 33);
            }
        } else if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i7, pageBlock, z9);
            if (z9 && spannableStringBuilder.length() > length7 && i4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new i4(textbutton), length7, spannableStringBuilder.length(), 33);
            }
        } else {
            if (richText instanceof TL_iv.textBold) {
                i10 = 1;
            } else if (richText instanceof TL_iv.textItalic) {
                i10 = 2;
            } else if (richText instanceof TL_iv.textUnderline) {
                i10 = 16;
            } else if (richText instanceof TL_iv.textStrike) {
                i10 = 8;
            } else if (richText instanceof TL_iv.textFixed) {
                i10 = 4;
            } else if (richText instanceof TL_iv.textSpoiler) {
                i10 = 256;
            } else if (richText instanceof TL_iv.textSubscript) {
                i10 = 16384;
            } else if (richText instanceof TL_iv.textSuperscript) {
                i10 = 32768;
            } else if (richText instanceof TL_iv.textMarked) {
                i10 = 65536;
            }
            if (i10 != 0) {
                a(spannableStringBuilder, richText.text, i7 | i10, pageBlock, z9);
            } else {
                b(spannableStringBuilder, l(richText), i7, pageBlock);
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i7, TL_iv.PageBlock pageBlock) {
        if (str != null && !str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            if (i7 != 0) {
                spannableStringBuilder.setSpan(p(i7, pageBlock), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static void c(Spannable spannable, int i7, int i10, int i11, TL_iv.PageBlock pageBlock) {
        if (i7 < i10 && i11 != 0) {
            spannable.setSpan(p(i11, pageBlock), i7, i10, 33);
        }
    }

    public static int d(java.lang.CharSequence r14) {
        throw new UnsupportedOperationException("Method not decompiled: li.c6.d(java.lang.CharSequence):int");
    }

    public static int e(Spanned spanned, int i7, int i10) {
        uy0[] uy0VarArr = (uy0[]) spanned.getSpans(i7, i10, uy0.class);
        int i11 = 0;
        for (uy0 uy0Var : uy0VarArr) {
            int i12 = uy0Var.f38768b.f38442a;
            if ((i12 & 512) != 0) {
                i12 |= 256;
            }
            i11 |= i12;
        }
        return 114975 & i11;
    }

    public static org.telegram.tgnet.tl.TL_iv.RichText f(java.lang.CharSequence r13) {
        throw new UnsupportedOperationException("Method not decompiled: li.c6.f(java.lang.CharSequence):org.telegram.tgnet.tl.TL_iv$RichText");
    }

    public static boolean g(Editable editable, int i7, int i10) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, zz.class);
                if (((zz[]) editable.getSpans(max, nextSpanTransition, zz.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i7, int i10) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, x31.class);
                if (((x31[]) editable.getSpans(max, nextSpanTransition, x31.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i7, int i10, int i11, CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, uy0.class);
            if ((e(spanned, max, nextSpanTransition) & i11) == 0) {
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
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i7);
                    i7++;
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

    public static x31 k(String str) {
        ?? obj = new Object();
        obj.f38442a = 1024;
        return new x31(str, obj);
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
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i7);
                    i7++;
                    sb2.append(l(richText2));
                }
                return sb2.toString();
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                String l10 = l(textdiff.text);
                if (j(textdiff.text)) {
                    return l(textdiff.old_text);
                }
                return l10;
            } else {
                return l(richText.text);
            }
        }
    }

    public static void m(Editable editable, int i7, int i10) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2) {
            for (zz zzVar : (zz[]) editable.getSpans(max, max2, zz.class)) {
                editable.removeSpan(zzVar);
            }
        }
    }

    public static void n(Editable editable, int i7, int i10) {
        x31[] x31VarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2) {
            for (x31 x31Var : (x31[]) editable.getSpans(max, max2, x31.class)) {
                int spanStart = editable.getSpanStart(x31Var);
                int spanEnd = editable.getSpanEnd(x31Var);
                editable.removeSpan(x31Var);
                if (spanStart < max) {
                    editable.setSpan(k(x31Var.getURL()), spanStart, max, 33);
                }
                if (spanEnd > max2) {
                    editable.setSpan(k(x31Var.getURL()), max2, spanEnd, 33);
                }
            }
        }
    }

    public static void o(Spannable spannable, int i7, int i10, int i11, boolean z9, TL_iv.PageBlock pageBlock) {
        uy0[] uy0VarArr;
        int i12;
        int length = spannable.length();
        int max = Math.max(0, Math.min(i7, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2) {
            for (uy0 uy0Var : (uy0[]) spannable.getSpans(max, max2, uy0.class)) {
                int spanStart = spannable.getSpanStart(uy0Var);
                int spanEnd = spannable.getSpanEnd(uy0Var);
                int i13 = uy0Var.f38768b.f38442a;
                spannable.removeSpan(uy0Var);
                c(spannable, spanStart, max, i13, pageBlock);
                c(spannable, max2, spanEnd, i13, pageBlock);
                int max3 = Math.max(spanStart, max);
                int min = Math.min(spanEnd, max2);
                if (z9) {
                    i12 = i13 | i11;
                } else {
                    i12 = (~i11) & i13;
                }
                c(spannable, max3, min, i12, pageBlock);
            }
            if (z9) {
                while (max < max2) {
                    int nextSpanTransition = spannable.nextSpanTransition(max, max2, uy0.class);
                    if (e(spannable, max, nextSpanTransition) == 0) {
                        c(spannable, max, nextSpanTransition, i11, pageBlock);
                    }
                    max = nextSpanTransition;
                }
            }
        }
    }

    public static uy0 p(int i7, TL_iv.PageBlock pageBlock) {
        boolean z9;
        ?? obj = new Object();
        obj.f38442a = i7;
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            z9 = false;
        } else {
            z9 = true;
        }
        obj.f38445e = z9;
        return new uy0(obj, 0);
    }

    public static int q(int i7, int i10, CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = f18504a[i12];
            if (i(i7, i10, i13, charSequence)) {
                i11 |= i13;
            }
        }
        return i11;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z9);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, b6 b6Var) {
        TL_iv.textCustomEmoji textcustomemoji;
        i4 i4Var = (i4) b6Var.f18482f;
        if (i4Var != null) {
            return i4Var.f18638a;
        }
        if (((String) b6Var.d) != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = (String) b6Var.d;
            return textmath;
        }
        long j3 = b6Var.f18479b;
        if (j3 != 0) {
            TL_iv.textCustomEmoji textcustomemoji2 = new TL_iv.textCustomEmoji();
            textcustomemoji2.document_id = j3;
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
        int i7 = b6Var.f18478a;
        TL_iv.RichText richText = textcustomemoji;
        if ((i7 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = textcustomemoji;
            richText = textbold;
        }
        TL_iv.RichText richText2 = richText;
        if ((i7 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText;
            richText2 = textitalic;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i7 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText2;
            richText3 = textunderline;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i7 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText3;
            richText4 = textstrike;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i7 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText4;
            richText5 = textfixed;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i7 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText5;
            richText6 = textspoiler;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i7 & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText6;
            richText7 = textsubscript;
        }
        TL_iv.RichText richText8 = richText7;
        if ((32768 & i7) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText7;
            richText8 = textsuperscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((i7 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText8;
            richText9 = textmarked;
        }
        TL_iv.RichText richText10 = richText9;
        if (((String) b6Var.f18480c) != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText9;
            texturl.url = (String) b6Var.f18480c;
            richText10 = texturl;
        }
        zz zzVar = (zz) b6Var.f18481e;
        if (zzVar != null) {
            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = zzVar.f41137b;
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
