package mi;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.xg0;
public abstract class b5 {
    public static Object a(Spanned spanned, int i3, int i10, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i3, Math.max(i3, i10), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i3 && spanEnd >= i10) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i3;
        oi.h hVar;
        xg0 xg0Var;
        xg0 xg0Var2;
        int i10;
        boolean z10;
        boolean z11;
        Object a10;
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
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == '\n') {
                arrayList2.add(Integer.valueOf(i11 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < size) {
            int i14 = iArr[i13];
            i13++;
            boolean z12 = true;
            if (i13 < size) {
                i3 = iArr[i13] - 1;
            } else {
                i3 = length;
            }
            if (spanned == null) {
                hVar = null;
            } else {
                hVar = (oi.h) a(spanned, i14, i3, oi.h.class);
            }
            if (spanned != null && hVar == null) {
                xg0Var = (xg0) a(spanned, i14, i3, xg0.class);
            } else {
                xg0Var = null;
            }
            if (hVar == null && xg0Var == null) {
                CharSequence subSequence = charSequence.subSequence(i14, i3);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = d6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                if (hVar != null) {
                    xg0Var2 = hVar;
                } else {
                    xg0Var2 = xg0Var;
                }
                while (true) {
                    if (i13 < size) {
                        int i15 = iArr[i13];
                        z10 = z12;
                        int i16 = i13 + 1;
                        if (i16 < size) {
                            i10 = length;
                            length = iArr[i16] - 1;
                        } else {
                            i10 = length;
                        }
                        if (hVar != null) {
                            a10 = a(spanned, i15, length, oi.h.class);
                        } else {
                            a10 = a(spanned, i15, length, xg0.class);
                        }
                        if (a10 != xg0Var2) {
                            break;
                        }
                        i3 = length;
                        i13 = i16;
                        z12 = z10;
                        length = i10;
                    } else {
                        i10 = length;
                        z10 = z12;
                        break;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i14, i3);
                if (hVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = d6.f(subSequence2);
                    String str = hVar.f21141a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = d6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    if (xg0Var != null && xg0Var.f40357e) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    pageblockblockquote.collapsed = z11;
                    arrayList.add(pageblockblockquote);
                }
                length = i10;
            }
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
            int i3 = 0;
            while (i3 < size) {
                TL_iv.RichText richText2 = arrayList.get(i3);
                i3++;
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
        boolean c2;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c2 = false;
                    continue;
                } else {
                    ArrayList arrayList2 = aVar.f19438k;
                    if (!aVar.f19436i && aVar.f19432c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f19431b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || d6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i10 = 0;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList2.get(i10);
                                        i10++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !d6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
                                    c2 = c(pageBlock.text);
                                    continue;
                                }
                            }
                        }
                    }
                    c2 = true;
                    continue;
                }
                if (c2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(a aVar, boolean z10) {
        SpannableStringBuilder r5;
        TL_iv.RichText richText = null;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r5 = d6.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f19431b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r5 = d6.r(richText, pageBlock2, true);
        }
        if (aVar.f19431b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r5);
            spannableStringBuilder.setSpan(new oi.h(((TL_iv.pageBlockPreformatted) aVar.f19431b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r5;
    }

    public static SpannableStringBuilder f(List list, boolean z10) {
        SpannableStringBuilder r5;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (list != null && i3 < list.size()) {
            a aVar = (a) list.get(i3);
            if (!aVar.f19438k.isEmpty()) {
                long longValue = ((Long) aVar.f19438k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i10 = i3;
                while (i10 < list.size() && !((a) list.get(i10)).f19438k.isEmpty() && ((Long) ((a) list.get(i10)).f19438k.get(0)).longValue() == longValue) {
                    if (i10 > i3) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) e((a) list.get(i10), z10));
                    i10++;
                }
                if (spannableStringBuilder.length() > 0) {
                    xg0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i3 = i10;
            } else {
                TL_iv.PageBlock pageBlock = aVar.f19431b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList.add(e(aVar, z10));
                } else {
                    boolean z11 = true;
                    if (z10) {
                        r5 = d6.r(pageBlock.text, pageBlock, false);
                    } else {
                        r5 = d6.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r5);
                    TL_iv.PageBlock pageBlock2 = aVar.f19431b;
                    z11 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        xg0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder2);
                }
                i3++;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i11 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList.get(i11));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        d6.o(spannableStringBuilder, 0, length, 65536, false, null);
        d6.o(spannableStringBuilder, 0, length, 16384, false, null);
        d6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }
}
