package defpackage;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class yi9 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i, TL_iv.PageBlock pageBlock, boolean z) {
        String str;
        CharSequence charSequence;
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            int i2 = 0;
            if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                while (i2 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i2);
                    i2++;
                    a(spannableStringBuilder, richText2, i, pageBlock, z);
                }
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                boolean j = j(textdiff.text);
                boolean j2 = j(textdiff.old_text);
                int length = spannableStringBuilder.length();
                if (j) {
                    a(spannableStringBuilder, textdiff.old_text, i, pageBlock, z);
                    if (spannableStringBuilder.length() > length) {
                        ?? obj = new Object();
                        obj.a = 8192;
                        spannableStringBuilder.setSpan(new wib(obj, 0), length, spannableStringBuilder.length(), 33);
                        return;
                    }
                    return;
                }
                a(spannableStringBuilder, textdiff.text, i, pageBlock, z);
                if (j2) {
                    if (spannableStringBuilder.length() > length) {
                        ?? obj2 = new Object();
                        obj2.a = 4096;
                        spannableStringBuilder.setSpan(new wib(obj2, 0), length, spannableStringBuilder.length(), 33);
                    }
                } else if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new ama(), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textPlain) {
                b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i, pageBlock);
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
                gm gmVar = new gm(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
                gmVar.cacheType = vl.f();
                spannableStringBuilder.setSpan(gmVar, length2, spannableStringBuilder.length(), 33);
                if (i != 0) {
                    spannableStringBuilder.setSpan(p(i, pageBlock), length2, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textUrl) {
                TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
                int length3 = spannableStringBuilder.length();
                a(spannableStringBuilder, texturl.text, i, pageBlock, z);
                if (spannableStringBuilder.length() > length3 && (str = texturl.url) != null) {
                    spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textDate) {
                TL_iv.textDate textdate = (TL_iv.textDate) richText;
                int length4 = spannableStringBuilder.length();
                a(spannableStringBuilder, textdate.text, i, pageBlock, z);
                if (spannableStringBuilder.length() > length4) {
                    String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                    TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                    tL_messageEntityFormattedDate.flags = textdate.flags;
                    tL_messageEntityFormattedDate.date = textdate.date;
                    tL_messageEntityFormattedDate.applyFlags();
                    ?? obj3 = new Object();
                    obj3.a |= 128;
                    spannableStringBuilder.setSpan(new im4(charSequence2, obj3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textMath) {
                TL_iv.textMath textmath = (TL_iv.textMath) richText;
                int length5 = spannableStringBuilder.length();
                spannableStringBuilder.append(" ");
                Object a2 = ij6.a(textmath.source, bkb.w0(null, bkb.F6, false), gl.L(gba.S0 + 4));
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
                if (spannableStringBuilder.length() > length5 && i != 0) {
                    spannableStringBuilder.setSpan(p(i, pageBlock), length5, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textButton) {
                TL_iv.textButton textbutton = (TL_iv.textButton) richText;
                int length7 = spannableStringBuilder.length();
                a(spannableStringBuilder, textbutton.text, i, pageBlock, z);
                if (z && spannableStringBuilder.length() > length7 && mf9.c(textbutton.type)) {
                    spannableStringBuilder.setSpan(new mf9(textbutton), length7, spannableStringBuilder.length(), 33);
                }
            } else {
                if (richText instanceof TL_iv.textBold) {
                    i2 = 1;
                } else if (richText instanceof TL_iv.textItalic) {
                    i2 = 2;
                } else if (richText instanceof TL_iv.textUnderline) {
                    i2 = 16;
                } else if (richText instanceof TL_iv.textStrike) {
                    i2 = 8;
                } else if (richText instanceof TL_iv.textFixed) {
                    i2 = 4;
                } else if (richText instanceof TL_iv.textSpoiler) {
                    i2 = 256;
                } else if (richText instanceof TL_iv.textSubscript) {
                    i2 = 16384;
                } else if (richText instanceof TL_iv.textSuperscript) {
                    i2 = 32768;
                } else if (richText instanceof TL_iv.textMarked) {
                    i2 = 65536;
                }
                if (i2 != 0) {
                    a(spannableStringBuilder, richText.text, i | i2, pageBlock, z);
                } else {
                    b(spannableStringBuilder, l(richText), i, pageBlock);
                }
            }
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i, TL_iv.PageBlock pageBlock) {
        if (str != null && !str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            if (i != 0) {
                spannableStringBuilder.setSpan(p(i, pageBlock), length, spannableStringBuilder.length(), 33);
            }
        }
    }

    public static void c(Spannable spannable, int i, int i2, int i3, TL_iv.PageBlock pageBlock) {
        if (i < i2 && i3 != 0) {
            spannable.setSpan(p(i3, pageBlock), i, i2, 33);
        }
    }

    public static int d(java.lang.CharSequence r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi9.d(java.lang.CharSequence):int");
    }

    public static int e(Spanned spanned, int i, int i2) {
        wib[] wibVarArr = (wib[]) spanned.getSpans(i, i2, wib.class);
        int i3 = 0;
        for (wib wibVar : wibVarArr) {
            int i4 = wibVar.b.a;
            if ((i4 & 512) != 0) {
                i4 |= 256;
            }
            i3 |= i4;
        }
        return i3 & 114975;
    }

    public static TL_iv.RichText f(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        if (length == 0) {
            return new TL_iv.textEmpty();
        }
        if (!(charSequence instanceof Spanned)) {
            String charSequence2 = charSequence.toString();
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = charSequence2;
            return textplain;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        xi9 xi9Var = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i, length, CharacterStyle.class);
            ?? obj = new Object();
            obj.a = e(spanned, i, nextSpanTransition);
            if (((f4c[]) spanned.getSpans(i, nextSpanTransition, f4c.class)).length > 0) {
                obj.a |= 4;
            }
            i4c[] i4cVarArr = (i4c[]) spanned.getSpans(i, nextSpanTransition, i4c.class);
            if (i4cVarArr.length > 0) {
                obj.c = i4cVarArr[0].getURL();
            }
            im4[] im4VarArr = (im4[]) spanned.getSpans(i, nextSpanTransition, im4.class);
            if (im4VarArr.length > 0) {
                obj.e = im4VarArr[0];
            }
            gm[] gmVarArr = (gm[]) spanned.getSpans(i, nextSpanTransition, gm.class);
            if (gmVarArr.length > 0) {
                obj.b = gmVarArr[0].getDocumentId();
            }
            ij6[] ij6VarArr = (ij6[]) spanned.getSpans(i, nextSpanTransition, ij6.class);
            if (ij6VarArr.length > 0) {
                obj.d = ij6VarArr[0].a;
            }
            mf9[] mf9VarArr = (mf9[]) spanned.getSpans(i, nextSpanTransition, mf9.class);
            if (mf9VarArr.length > 0) {
                obj.f = mf9VarArr[0];
            }
            if (xi9Var != null) {
                mf9 mf9Var = (mf9) xi9Var.f;
                mf9 mf9Var2 = (mf9) obj.f;
                if (mf9Var == null) {
                    if (mf9Var2 == null && xi9Var.b == 0 && obj.b == 0 && ((String) xi9Var.d) == null && ((String) obj.d) == null && xi9Var.a == obj.a) {
                        String str = (String) xi9Var.c;
                        String str2 = (String) obj.c;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            if (((im4) xi9Var.e) == ((im4) obj.e)) {
                                i = nextSpanTransition;
                                xi9Var = xi9Var;
                            }
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i2, i).toString(), xi9Var));
                    i2 = i;
                } else {
                    if (mf9Var == mf9Var2) {
                        i = nextSpanTransition;
                        xi9Var = xi9Var;
                    }
                    arrayList.add(s(charSequence.subSequence(i2, i).toString(), xi9Var));
                    i2 = i;
                }
            }
            xi9Var = obj;
            i = nextSpanTransition;
            xi9Var = xi9Var;
        }
        String charSequence3 = charSequence.subSequence(i2, length).toString();
        xi9 xi9Var2 = xi9Var;
        if (xi9Var == null) {
            xi9Var2 = new Object();
        }
        arrayList.add(s(charSequence3, xi9Var2));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i, int i2) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2 && ug8.A(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, im4.class);
                if (((im4[]) editable.getSpans(max, nextSpanTransition, im4.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i, int i2) {
        int length;
        if (editable == null) {
            length = 0;
        } else {
            length = editable.length();
        }
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2 && ug8.A(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, i4c.class);
                if (((i4c[]) editable.getSpans(max, nextSpanTransition, i4c.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i, int i2, int i3, CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, wib.class);
            if ((e(spanned, max, nextSpanTransition) & i3) == 0) {
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
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText2 = arrayList.get(i);
                    i++;
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

    public static i4c k(String str) {
        ?? obj = new Object();
        obj.a = 1024;
        return new i4c(str, obj);
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
                StringBuilder sb = new StringBuilder();
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText2 = arrayList.get(i);
                    i++;
                    sb.append(l(richText2));
                }
                return sb.toString();
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                String l = l(textdiff.text);
                if (j(textdiff.text)) {
                    return l(textdiff.old_text);
                }
                return l;
            } else {
                return l(richText.text);
            }
        }
    }

    public static void m(Editable editable, int i, int i2) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (im4 im4Var : (im4[]) editable.getSpans(max, max2, im4.class)) {
                editable.removeSpan(im4Var);
            }
        }
    }

    public static void n(Editable editable, int i, int i2) {
        i4c[] i4cVarArr;
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (i4c i4cVar : (i4c[]) editable.getSpans(max, max2, i4c.class)) {
                int spanStart = editable.getSpanStart(i4cVar);
                int spanEnd = editable.getSpanEnd(i4cVar);
                editable.removeSpan(i4cVar);
                if (spanStart < max) {
                    editable.setSpan(k(i4cVar.getURL()), spanStart, max, 33);
                }
                if (spanEnd > max2) {
                    editable.setSpan(k(i4cVar.getURL()), max2, spanEnd, 33);
                }
            }
        }
    }

    public static void o(Spannable spannable, int i, int i2, int i3, boolean z, TL_iv.PageBlock pageBlock) {
        wib[] wibVarArr;
        int i4;
        int length = spannable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (wib wibVar : (wib[]) spannable.getSpans(max, max2, wib.class)) {
                int spanStart = spannable.getSpanStart(wibVar);
                int spanEnd = spannable.getSpanEnd(wibVar);
                int i5 = wibVar.b.a;
                spannable.removeSpan(wibVar);
                c(spannable, spanStart, max, i5, pageBlock);
                c(spannable, max2, spanEnd, i5, pageBlock);
                int max3 = Math.max(spanStart, max);
                int min = Math.min(spanEnd, max2);
                if (z) {
                    i4 = i5 | i3;
                } else {
                    i4 = i5 & (~i3);
                }
                c(spannable, max3, min, i4, pageBlock);
            }
            if (z) {
                while (max < max2) {
                    int nextSpanTransition = spannable.nextSpanTransition(max, max2, wib.class);
                    if (e(spannable, max, nextSpanTransition) == 0) {
                        c(spannable, max, nextSpanTransition, i3, pageBlock);
                    }
                    max = nextSpanTransition;
                }
            }
        }
    }

    public static wib p(int i, TL_iv.PageBlock pageBlock) {
        boolean z;
        ?? obj = new Object();
        obj.a = i;
        if (!(pageBlock instanceof TL_iv.pageBlockTitle) && !(pageBlock instanceof TL_iv.pageBlockSubheader) && !(pageBlock instanceof TL_iv.pageBlockHeader) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            z = false;
        } else {
            z = true;
        }
        obj.e = z;
        return new wib(obj, 0);
    }

    public static int q(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = a[i4];
            if (i(i, i2, i5, charSequence)) {
                i3 |= i5;
            }
        }
        return i3;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, xi9 xi9Var) {
        TL_iv.textCustomEmoji textcustomemoji;
        mf9 mf9Var = (mf9) xi9Var.f;
        if (mf9Var != null) {
            return mf9Var.a;
        }
        if (((String) xi9Var.d) != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = (String) xi9Var.d;
            return textmath;
        }
        long j = xi9Var.b;
        if (j != 0) {
            TL_iv.textCustomEmoji textcustomemoji2 = new TL_iv.textCustomEmoji();
            textcustomemoji2.document_id = j;
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
        int i = xi9Var.a;
        TL_iv.RichText richText = textcustomemoji;
        if ((i & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = textcustomemoji;
            richText = textbold;
        }
        TL_iv.RichText richText2 = richText;
        if ((i & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText;
            richText2 = textitalic;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText2;
            richText3 = textunderline;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText3;
            richText4 = textstrike;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText4;
            richText5 = textfixed;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText5;
            richText6 = textspoiler;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText6;
            richText7 = textsubscript;
        }
        TL_iv.RichText richText8 = richText7;
        if ((32768 & i) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText7;
            richText8 = textsuperscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((i & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText8;
            richText9 = textmarked;
        }
        TL_iv.RichText richText10 = richText9;
        if (((String) xi9Var.c) != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText9;
            texturl.url = (String) xi9Var.c;
            richText10 = texturl;
        }
        im4 im4Var = (im4) xi9Var.e;
        if (im4Var != null) {
            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = im4Var.b;
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
