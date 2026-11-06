package org.telegram.messenger;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
public final class nv {
    public final TL_iv.RichText f24220a;
    public final IdentityHashMap f24221b;
    public final int f24222c;
    public final int d;

    public nv(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i7, int i10) {
        this.f24220a = richText;
        this.f24221b = identityHashMap;
        this.f24222c = i7;
        this.d = i10;
    }

    public static nv a(kv kvVar, h2.j0 j0Var) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        cu cuVar = (cu) j0Var.f14099c;
        SpannableStringBuilder o4 = kvVar.o(cuVar.f21900a, cuVar.f21901b, identityHashMap);
        Spanned spanned = (Spanned) j0Var.d;
        int spanEnd = spanned.getSpanEnd(cuVar);
        int i7 = j0Var.f14098b;
        int i10 = spanEnd - i7;
        if (o4.length() == i10 && TextUtils.regionMatches(o4, 0, spanned, i7, i10)) {
            return new nv(cuVar.f21900a, identityHashMap, o4.length(), cuVar.f21901b);
        }
        a8.d("RichQuote: laid out text doesn't match the formatted one");
        return null;
    }

    public final TL_iv.RichText b(int i7, int i10) {
        int max = Math.max(0, i7);
        int i11 = this.f24222c;
        int min = Math.min(i11, i10);
        if (max >= min) {
            return null;
        }
        TL_iv.RichText richText = this.f24220a;
        if (max == 0 && min == i11) {
            return richText;
        }
        return c(richText, max, min);
    }

    public final TL_iv.RichText c(TL_iv.RichText richText, int i7, int i10) {
        int[] iArr;
        int i11;
        int i12;
        if (richText != null && (iArr = (int[]) this.f24221b.get(richText)) != null && (i11 = iArr[0]) != (i12 = iArr[1]) && i12 > i7 && i11 < i10) {
            if (i7 > i11 || i12 > i10) {
                if (richText instanceof TL_iv.textPlain) {
                    String str = ((TL_iv.textPlain) richText).text;
                    if (str != null && str.length() == i12 - i11) {
                        int max = Math.max(i7, i11) - i11;
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
                        TL_iv.RichText c10 = c(richText2, i7, i10);
                        if (c10 != null) {
                            arrayList.add(c10);
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
                            TL_iv.RichText c11 = c(richText3, i7, i10);
                            if (c11 != null) {
                                try {
                                    richText = (TL_iv.RichText) TLObject.deepCopy(richText, new ch(9));
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                    richText = null;
                                }
                                if (richText != null) {
                                    richText.text = c11;
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
