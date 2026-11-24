package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
public final class xj9 {
    public final TL_iv.RichText a;
    public final IdentityHashMap b;
    public final int c;
    public final int d;

    public xj9(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i, int i2) {
        this.a = richText;
        this.b = identityHashMap;
        this.c = i;
        this.d = i2;
    }

    public static xj9 a(uj9 uj9Var, ir irVar) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        oi9 oi9Var = (oi9) irVar.c;
        SpannableStringBuilder o = uj9Var.o(oi9Var.a, oi9Var.b, identityHashMap);
        Spanned spanned = (Spanned) irVar.d;
        int spanEnd = spanned.getSpanEnd(oi9Var);
        int i = irVar.b;
        int i2 = spanEnd - i;
        if (o.length() == i2 && TextUtils.regionMatches(o, 0, spanned, i, i2)) {
            return new xj9(oi9Var.a, identityHashMap, o.length(), oi9Var.b);
        }
        fc4.d("RichQuote: laid out text doesn't match the formatted one");
        return null;
    }

    public final TL_iv.RichText b(int i, int i2) {
        int max = Math.max(0, i);
        int i3 = this.c;
        int min = Math.min(i3, i2);
        if (max >= min) {
            return null;
        }
        TL_iv.RichText richText = this.a;
        if (max == 0 && min == i3) {
            return richText;
        }
        return c(richText, max, min);
    }

    public final TL_iv.RichText c(TL_iv.RichText richText, int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        if (richText != null && (iArr = (int[]) this.b.get(richText)) != null && (i3 = iArr[0]) != (i4 = iArr[1]) && i4 > i && i3 < i2) {
            if (i > i3 || i4 > i2) {
                if (richText instanceof TL_iv.textPlain) {
                    String str = ((TL_iv.textPlain) richText).text;
                    if (str != null && str.length() == i4 - i3) {
                        int max = Math.max(i, i3) - i3;
                        int min = Math.min(i2, i4) - i3;
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
                    int i5 = 0;
                    while (i5 < size) {
                        TL_iv.RichText richText2 = arrayList2.get(i5);
                        i5++;
                        TL_iv.RichText c = c(richText2, i, i2);
                        if (c != null) {
                            arrayList.add(c);
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
                            TL_iv.RichText c2 = c(richText3, i, i2);
                            if (c2 != null) {
                                try {
                                    richText = (TL_iv.RichText) TLObject.deepCopy(richText, new i98((byte) 21));
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    richText = null;
                                }
                                if (richText != null) {
                                    richText.text = c2;
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
