package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_iv;
public abstract class uj9 {
    public static Object a(Spanned spanned, int i, int i2, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i, Math.max(i, i2), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i && spanEnd >= i2) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i;
        jk2 jk2Var;
        r19 r19Var;
        r19 r19Var2;
        int i2;
        boolean z;
        boolean z2;
        Object a;
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        if (charSequence instanceof Spanned) {
            spanned = (Spanned) charSequence;
        } else {
            spanned = null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (charSequence.charAt(i3) == '\n') {
                arrayList2.add(Integer.valueOf(i3 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = ((Integer) arrayList2.get(i4)).intValue();
        }
        int length = charSequence.length();
        int i5 = 0;
        while (i5 < size) {
            int i6 = iArr[i5];
            i5++;
            boolean z3 = true;
            if (i5 < size) {
                i = iArr[i5] - 1;
            } else {
                i = length;
            }
            if (spanned == null) {
                jk2Var = null;
            } else {
                jk2Var = (jk2) a(spanned, i6, i, jk2.class);
            }
            if (spanned != null && jk2Var == null) {
                r19Var = (r19) a(spanned, i6, i, r19.class);
            } else {
                r19Var = null;
            }
            if (jk2Var == null) {
                if (r19Var == null) {
                    CharSequence subSequence = charSequence.subSequence(i6, i);
                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                    pageblockparagraph2.text = mm9.f(subSequence);
                    arrayList.add(pageblockparagraph2);
                } else {
                    r19Var2 = r19Var;
                }
            } else {
                r19Var2 = jk2Var;
            }
            while (true) {
                if (i5 < size) {
                    int i7 = iArr[i5];
                    z = z3;
                    int i8 = i5 + 1;
                    if (i8 < size) {
                        i2 = length;
                        length = iArr[i8] - 1;
                    } else {
                        i2 = length;
                    }
                    if (jk2Var != null) {
                        a = a(spanned, i7, length, jk2.class);
                    } else {
                        a = a(spanned, i7, length, r19.class);
                    }
                    if (a != r19Var2) {
                        break;
                    }
                    i = length;
                    i5 = i8;
                    z3 = z;
                    length = i2;
                } else {
                    i2 = length;
                    z = z3;
                    break;
                }
            }
            CharSequence subSequence2 = charSequence.subSequence(i6, i);
            if (jk2Var != null) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                pageblockpreformatted.text = mm9.f(subSequence2);
                String str = jk2Var.a;
                if (str == null) {
                    str = "";
                }
                pageblockpreformatted.language = str;
                arrayList.add(pageblockpreformatted);
            } else {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.text = mm9.f(subSequence2);
                pageblockblockquote.caption = new TL_iv.textEmpty();
                if (r19Var != null && r19Var.e) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                pageblockblockquote.collapsed = z2;
                arrayList.add(pageblockblockquote);
            }
            length = i2;
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static boolean c(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_iv.RichText richText2 = arrayList.get(i);
                i++;
                if (c(richText2)) {
                    return true;
                }
            }
            return false;
        } else if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
            return true;
        } else {
            return c(richText.text);
        }
    }

    public static boolean d(ArrayList arrayList, HashMap hashMap) {
        boolean z;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                mk0 mk0Var = (mk0) obj;
                if (mk0Var == null) {
                    z = false;
                    continue;
                } else {
                    ArrayList arrayList2 = mk0Var.k;
                    if (!mk0Var.i && mk0Var.c <= 0) {
                        TL_iv.PageBlock pageBlock = mk0Var.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z2 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z2 ? 1 : 0) <= 1 && (!z2 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || mm9.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        Object obj2 = arrayList2.get(i2);
                                        i2++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !mm9.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z2) {
                                    z = c(pageBlock.text);
                                    continue;
                                }
                            }
                        }
                    }
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(mk0 mk0Var, boolean z) {
        SpannableStringBuilder r;
        TL_iv.RichText richText = null;
        if (z) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r = mm9.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = mk0Var.b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r = mm9.r(richText, pageBlock2, true);
        }
        if (mk0Var.b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r);
            spannableStringBuilder.setSpan(new jk2(((TL_iv.pageBlockPreformatted) mk0Var.b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r;
    }

    public static SpannableStringBuilder f(ArrayList arrayList, boolean z) {
        SpannableStringBuilder r;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (arrayList != null && i < arrayList.size()) {
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (!mk0Var.k.isEmpty()) {
                long longValue = ((Long) mk0Var.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i2 = i;
                while (i2 < arrayList.size() && !((mk0) arrayList.get(i2)).k.isEmpty() && ((Long) ((mk0) arrayList.get(i2)).k.get(0)).longValue() == longValue) {
                    if (i2 > i) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) e((mk0) arrayList.get(i2), z));
                    i2++;
                }
                if (spannableStringBuilder.length() > 0) {
                    r19.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList2.add(spannableStringBuilder);
                i = i2;
            } else {
                TL_iv.PageBlock pageBlock = mk0Var.b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList2.add(e(mk0Var, z));
                } else {
                    boolean z2 = true;
                    if (z) {
                        r = mm9.r(pageBlock.text, pageBlock, false);
                    } else {
                        r = mm9.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r);
                    TL_iv.PageBlock pageBlock2 = mk0Var.b;
                    z2 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        r19.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z2);
                    }
                    arrayList2.add(spannableStringBuilder2);
                }
                i++;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            if (i3 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList2.get(i3));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        mm9.o(spannableStringBuilder, 0, length, 65536, false, null);
        mm9.o(spannableStringBuilder, 0, length, 16384, false, null);
        mm9.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (nl6 nl6Var : (nl6[]) spannableStringBuilder.getSpans(0, length, nl6.class)) {
            spannableStringBuilder.removeSpan(nl6Var);
        }
        return spannableStringBuilder;
    }
}
