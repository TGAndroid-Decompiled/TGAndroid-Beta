package li;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ug0;
public abstract class a5 {
    public static Object a(Spanned spanned, int i7, int i10, Class cls) {
        Object[] spans;
        for (Object obj : spanned.getSpans(i7, Math.max(i7, i10), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i7 && spanEnd >= i10) {
                return obj;
            }
        }
        return null;
    }

    public static ArrayList b(CharSequence charSequence) {
        Spanned spanned;
        int i7;
        ni.j jVar;
        ug0 ug0Var;
        ug0 ug0Var2;
        int i10;
        boolean z9;
        boolean z10;
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
            boolean z11 = true;
            if (i13 < size) {
                i7 = iArr[i13] - 1;
            } else {
                i7 = length;
            }
            if (spanned == null) {
                jVar = null;
            } else {
                jVar = (ni.j) a(spanned, i14, i7, ni.j.class);
            }
            if (spanned != null && jVar == null) {
                ug0Var = (ug0) a(spanned, i14, i7, ug0.class);
            } else {
                ug0Var = null;
            }
            if (jVar == null && ug0Var == null) {
                CharSequence subSequence = charSequence.subSequence(i14, i7);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = c6.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                if (jVar != null) {
                    ug0Var2 = jVar;
                } else {
                    ug0Var2 = ug0Var;
                }
                while (true) {
                    if (i13 < size) {
                        int i15 = iArr[i13];
                        z9 = z11;
                        int i16 = i13 + 1;
                        if (i16 < size) {
                            i10 = length;
                            length = iArr[i16] - 1;
                        } else {
                            i10 = length;
                        }
                        if (jVar != null) {
                            a10 = a(spanned, i15, length, ni.j.class);
                        } else {
                            a10 = a(spanned, i15, length, ug0.class);
                        }
                        if (a10 != ug0Var2) {
                            break;
                        }
                        i7 = length;
                        i13 = i16;
                        z11 = z9;
                        length = i10;
                    } else {
                        i10 = length;
                        z9 = z11;
                        break;
                    }
                }
                CharSequence subSequence2 = charSequence.subSequence(i14, i7);
                if (jVar != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = c6.f(subSequence2);
                    String str = jVar.f20624a;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = c6.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    if (ug0Var != null && ug0Var.f38636e) {
                        z10 = z9;
                    } else {
                        z10 = false;
                    }
                    pageblockblockquote.collapsed = z10;
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
            int i7 = 0;
            while (i7 < size) {
                TL_iv.RichText richText2 = arrayList.get(i7);
                i7++;
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                a aVar = (a) obj;
                if (aVar == null) {
                    c10 = false;
                    continue;
                } else {
                    ArrayList arrayList2 = aVar.f18396k;
                    if (!aVar.f18394i && aVar.f18390c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.f18389b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z9 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z9 ? 1 : 0) <= 1 && (!z9 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || c6.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i10 = 0;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList2.get(i10);
                                        i10++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !c6.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z9) {
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

    public static SpannableStringBuilder e(a aVar, boolean z9) {
        SpannableStringBuilder r10;
        TL_iv.RichText richText = null;
        if (z9) {
            TL_iv.PageBlock pageBlock = aVar.f18389b;
            if (pageBlock != null) {
                richText = pageBlock.text;
            }
            r10 = c6.r(richText, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.f18389b;
            if (pageBlock2 != null) {
                richText = pageBlock2.text;
            }
            r10 = c6.r(richText, pageBlock2, true);
        }
        if (aVar.f18389b instanceof TL_iv.pageBlockPreformatted) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
            spannableStringBuilder.setSpan(new ni.j(((TL_iv.pageBlockPreformatted) aVar.f18389b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        return r10;
    }

    public static SpannableStringBuilder f(List list, boolean z9) {
        SpannableStringBuilder r10;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (list != null && i7 < list.size()) {
            a aVar = (a) list.get(i7);
            if (!aVar.f18396k.isEmpty()) {
                long longValue = ((Long) aVar.f18396k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i10 = i7;
                while (i10 < list.size() && !((a) list.get(i10)).f18396k.isEmpty() && ((Long) ((a) list.get(i10)).f18396k.get(0)).longValue() == longValue) {
                    if (i10 > i7) {
                        spannableStringBuilder.append('\n');
                    }
                    spannableStringBuilder.append((CharSequence) e((a) list.get(i10), z9));
                    i10++;
                }
                if (spannableStringBuilder.length() > 0) {
                    ug0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), false);
                }
                arrayList.add(spannableStringBuilder);
                i7 = i10;
            } else {
                TL_iv.PageBlock pageBlock = aVar.f18389b;
                if (!(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    arrayList.add(e(aVar, z9));
                } else {
                    boolean z10 = true;
                    if (z9) {
                        r10 = c6.r(pageBlock.text, pageBlock, false);
                    } else {
                        r10 = c6.r(pageBlock.text, pageBlock, true);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r10);
                    TL_iv.PageBlock pageBlock2 = aVar.f18389b;
                    z10 = ((pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed) ? false : false;
                    if (spannableStringBuilder2.length() > 0) {
                        ug0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), z10);
                    }
                    arrayList.add(spannableStringBuilder2);
                }
                i7++;
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
        c6.o(spannableStringBuilder, 0, length, 65536, false, null);
        c6.o(spannableStringBuilder, 0, length, 16384, false, null);
        c6.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (r rVar : (r[]) spannableStringBuilder.getSpans(0, length, r.class)) {
            spannableStringBuilder.removeSpan(rVar);
        }
        return spannableStringBuilder;
    }
}
