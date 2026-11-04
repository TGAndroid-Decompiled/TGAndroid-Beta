package org.telegram.messenger;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
public final class fv {
    public final TL_iv.RichText f22554a;
    public final IdentityHashMap f22555b;
    public final int f22556c;
    public final int d;

    public fv(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i3, int i10) {
        this.f22554a = richText;
        this.f22555b = identityHashMap;
        this.f22556c = i3;
        this.d = i10;
    }

    public static fv a(cv cvVar, g2.k0 k0Var) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ut utVar = (ut) k0Var.f11860c;
        SpannableStringBuilder o10 = cvVar.o(utVar.f25776a, utVar.f25777b, identityHashMap);
        Spanned spanned = (Spanned) k0Var.d;
        int spanEnd = spanned.getSpanEnd(utVar);
        int i3 = k0Var.f11859b;
        int i10 = spanEnd - i3;
        if (o10.length() == i10 && TextUtils.regionMatches(o10, 0, spanned, i3, i10)) {
            return new fv(utVar.f25776a, identityHashMap, o10.length(), utVar.f25777b);
        }
        a8.d("RichQuote: laid out text doesn't match the formatted one");
        return null;
    }

    public final TL_iv.RichText b(int i3, int i10) {
        int max = Math.max(0, i3);
        int i11 = this.f22556c;
        int min = Math.min(i11, i10);
        if (max >= min) {
            return null;
        }
        TL_iv.RichText richText = this.f22554a;
        if (max == 0 && min == i11) {
            return richText;
        }
        return c(richText, max, min);
    }

    public final TL_iv.RichText c(TL_iv.RichText richText, int i3, int i10) {
        int[] iArr;
        int i11;
        int i12;
        if (richText != null && (iArr = (int[]) this.f22555b.get(richText)) != null && (i11 = iArr[0]) != (i12 = iArr[1]) && i12 > i3 && i11 < i10) {
            if (i3 > i11 || i12 > i10) {
                if (richText instanceof TL_iv.textPlain) {
                    String str = ((TL_iv.textPlain) richText).text;
                    if (str != null && str.length() == i12 - i11) {
                        int max = Math.max(i3, i11) - i11;
                        int min = Math.min(i10, i12) - i11;
                        if (max > 0 && max < str.length() && Character.isLowSurrogate(str.charAt(max))) {
                            max--;
                        }
                        if (min > 0 && min < str.length() && Character.isLowSurrogate(str.charAt(min))) {
                            min++;
                        }
                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                        textplain.text = str.substring(max, min);
                        return textplain;
                    }
                } else if (richText instanceof TL_iv.textConcat) {
                    ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
                    ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.RichText richText2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.RichText c2 = c(richText2, i3, i10);
                        if (c2 != null) {
                            arrayList.add(c2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() == 1) {
                            return arrayList.get(0);
                        }
                        TL_iv.textConcat textconcat = new TL_iv.textConcat();
                        textconcat.texts = arrayList;
                        return textconcat;
                    }
                } else {
                    if (!(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textDate) && !(richText instanceof TL_iv.textDiff) && !(richText instanceof TL_iv.textButton)) {
                        TL_iv.RichText richText3 = richText.text;
                        if (richText3 != null) {
                            TL_iv.RichText c10 = c(richText3, i3, i10);
                            if (c10 != null) {
                                try {
                                    richText = (TL_iv.RichText) TLObject.deepCopy(richText, new go(6));
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                    richText = null;
                                }
                                if (richText != null) {
                                    richText.text = c10;
                                }
                            }
                        }
                    }
                    return richText;
                }
            }
            return richText;
        }
        return null;
    }
}
