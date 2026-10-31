package bi;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.wh0;
public abstract class n5 {
    public static Object a(Spanned spanned, int i10, int i11, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i10, Math.max(i10, i11), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i10 && spanEnd >= i11) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i10;
        di.i iVar;
        wh0 wh0Var;
        wh0 wh0Var2;
        int i11;
        boolean z10;
        boolean z11;
        Object a2;
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
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (charSequence.charAt(i12) == '\n') {
                arrayList2.add(Integer.valueOf(i12 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i13 = 0; i13 < size; i13++) {
            iArr[i13] = ((Integer) arrayList2.get(i13)).intValue();
        }
        int length = charSequence.length();
        int i14 = 0;
        while (i14 < size) {
            int i15 = iArr[i14];
            i14++;
            boolean z12 = true;
            if (i14 < size) {
                i10 = iArr[i14] - 1;
            } else {
                i10 = length;
            }
            if (spanned == null) {
                iVar = null;
            } else {
                iVar = (di.i) a(spanned, i15, i10, di.i.class);
            }
            if (spanned != null && iVar == null) {
                wh0Var = (wh0) a(spanned, i15, i10, wh0.class);
            } else {
                wh0Var = null;
            }
            if (iVar == null && wh0Var == null) {
                CharSequence subSequence = charSequence.subSequence(i15, i10);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = s6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                if (iVar != null) {
                    wh0Var2 = iVar;
                } else {
                    wh0Var2 = wh0Var;
                }
                while (true) {
                    if (i14 < size) {
                        int i16 = iArr[i14];
                        z10 = z12;
                        int i17 = i14 + 1;
                        if (i17 < size) {
                            i11 = length;
                            length = iArr[i17] - 1;
                        } else {
                            i11 = length;
                        }
                        if (iVar != null) {
                            a2 = a(spanned, i16, length, di.i.class);
                        } else {
                            a2 = a(spanned, i16, length, wh0.class);
                        }
                        if (a2 != wh0Var2) {
                            break;
                        }
                        i10 = length;
                        i14 = i17;
                        z12 = z10;
                        length = i11;
                    } else {
                        i11 = length;
                        z10 = z12;
                        break;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i15, i10);
                if (iVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = s6.f(subSequence2);
                    String str = iVar.f5965a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = s6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    if (wh0Var != null && wh0Var.e) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    pageblockblockquote.collapsed = z11;
                    arrayList.add(pageblockblockquote);
                }
                length = i11;
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
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
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
        boolean c10;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c10 = false;
                    continue;
                } else {
                    ArrayList arrayList2 = aVar.f2824k;
                    if (!aVar.f2822i && aVar.f2819c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f2818b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z10 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z10 ? 1 : 0) <= 1 && (!z10 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || s6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !s6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z10) {
                                    c10 = c(pageBlock.text);
                                    continue;
                                }
                            }
                        }
                    }
                    c10 = true;
                    continue;
                }
                if (c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(a aVar, boolean z10) {
        SpannableStringBuilder r10;
        TL_iv.RichText richText = null;
        if (z10) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r10 = s6.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f2818b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r10 = s6.r(richText, pageBlock2, true);
        }
        if (aVar.f2818b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
            spannableStringBuilder.setSpan(new di.i(((TL_iv.pageBlockPreformatted) aVar.f2818b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r10;
    }

    public static SpannableStringBuilder f(List list, boolean z10) {
        SpannableStringBuilder r10;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (list != null && i10 < list.size()) {
            a aVar = (a) list.get(i10);
            if (!aVar.f2824k.isEmpty()) {
                long longValue = ((Long) aVar.f2824k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = i10;
                while (i11 < list.size() && !((a) list.get(i11)).f2824k.isEmpty() && ((Long) ((a) list.get(i11)).f2824k.get(0)).longValue() == longValue) {
                    if (i11 > i10) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) e((a) list.get(i11), z10));
                    i11++;
                }
                if (spannableStringBuilder.length() > 0) {
                    wh0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i10 = i11;
            } else {
                TL_iv.PageBlock pageBlock = aVar.f2818b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList.add(e(aVar, z10));
                } else {
                    boolean z11 = true;
                    if (z10) {
                        r10 = s6.r(pageBlock.text, pageBlock, false);
                    } else {
                        r10 = s6.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r10);
                    TL_iv.PageBlock pageBlock2 = aVar.f2818b;
                    z11 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        wh0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z11);
                    }
                    arrayList.add(spannableStringBuilder2);
                }
                i10++;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (i12 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList.get(i12));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        s6.o(spannableStringBuilder, 0, length, 65536, false, null);
        s6.o(spannableStringBuilder, 0, length, 16384, false, null);
        s6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (v vVar : (v[]) spannableStringBuilder.getSpans(0, length, v.class)) {
            spannableStringBuilder.removeSpan(vVar);
        }
        return spannableStringBuilder;
    }
}
