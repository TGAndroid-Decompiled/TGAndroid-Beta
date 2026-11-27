package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ll9 {
    public final ArrayList a;
    public final int b;

    public ll9(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public static void a(TL_iv.RichText richText, ArrayList arrayList) {
        if (richText != null && g(richText) > 0) {
            arrayList.add(richText);
        }
    }

    public static void b(TL_iv.RichText richText, StringBuilder sb, ArrayList arrayList) {
        TLRPC.MessageEntity messageEntity;
        int length;
        TL_iv.RichText richText2;
        String str;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !(richText instanceof TL_iv.textImage)) {
            if (richText instanceof TL_iv.textPlain) {
                String str2 = ((TL_iv.textPlain) richText).text;
                if (str2 != null) {
                    sb.append(str2);
                }
            } else if (richText instanceof TL_iv.textMath) {
                String str3 = ((TL_iv.textMath) richText).source;
                if (str3 != null) {
                    sb.append(str3);
                }
            } else {
                int length2 = sb.length();
                if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    if (TextUtils.isEmpty(textcustomemoji.alt)) {
                        str = "😀";
                    } else {
                        str = textcustomemoji.alt;
                    }
                    sb.append(str);
                    if (arrayList != null) {
                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                        tL_messageEntityCustomEmoji.document_id = textcustomemoji.document_id;
                        int length3 = sb.length();
                        if (length3 > length2) {
                            tL_messageEntityCustomEmoji.offset = length2;
                            tL_messageEntityCustomEmoji.length = length3 - length2;
                            arrayList.add(tL_messageEntityCustomEmoji);
                        }
                    }
                } else if (richText instanceof TL_iv.textConcat) {
                    ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        TL_iv.RichText richText3 = arrayList2.get(i);
                        i++;
                        b(richText3, sb, arrayList);
                    }
                } else if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    if (mm9.j(textdiff.text)) {
                        richText2 = textdiff.old_text;
                    } else {
                        richText2 = textdiff.text;
                    }
                    b(richText2, sb, arrayList);
                } else {
                    b(richText.text, sb, arrayList);
                    if (arrayList != null) {
                        if (richText instanceof TL_iv.textBold) {
                            messageEntity = new TLRPC.TL_messageEntityBold();
                        } else if (richText instanceof TL_iv.textItalic) {
                            messageEntity = new TLRPC.TL_messageEntityItalic();
                        } else if (richText instanceof TL_iv.textUnderline) {
                            messageEntity = new TLRPC.TL_messageEntityUnderline();
                        } else if (richText instanceof TL_iv.textStrike) {
                            messageEntity = new TLRPC.TL_messageEntityStrike();
                        } else if (richText instanceof TL_iv.textFixed) {
                            messageEntity = new TLRPC.TL_messageEntityCode();
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            messageEntity = new TLRPC.TL_messageEntitySpoiler();
                        } else if (richText instanceof TL_iv.textUrl) {
                            TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                            tL_messageEntityTextUrl.url = ((TL_iv.textUrl) richText).url;
                            messageEntity = tL_messageEntityTextUrl;
                        } else {
                            messageEntity = null;
                        }
                        if (messageEntity != null && (length = sb.length()) > length2) {
                            messageEntity.offset = length2;
                            messageEntity.length = length - length2;
                            arrayList.add(messageEntity);
                        }
                    }
                }
            }
        }
    }

    public static boolean c(r47 r47Var) {
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        hl9 hl9Var;
        if (r47Var != null && (message = r47Var.k) != null && (richMessage = message.rich_message) != null && (hl9Var = r47Var.y2) != null && hl9Var.c == richMessage) {
            return true;
        }
        return false;
    }

    public static void d(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockThinking) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        String str = ((TL_iv.pageBlockMath) pageBlock).source;
                        if (!TextUtils.isEmpty(str)) {
                            TL_iv.textMath textmath = new TL_iv.textMath();
                            textmath.source = str;
                            arrayList2.add(textmath);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                        a(pageBlock.text, arrayList2);
                        a(((TL_iv.pageBlockBlockquote) pageBlock).caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        d(pageblockblockquoteblocks.blocks, arrayList2);
                        a(pageblockblockquoteblocks.caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        a(pageBlock.text, arrayList2);
                        a(((TL_iv.pageBlockPullquote) pageBlock).caption, arrayList2);
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
                        int size2 = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            TL_iv.PageListItem pageListItem = arrayList3.get(i2);
                            i2++;
                            TL_iv.PageListItem pageListItem2 = pageListItem;
                            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                                a(((TL_iv.TL_pageListItemText) pageListItem2).text, arrayList2);
                            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                                d(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        ArrayList<TL_iv.PageListOrderedItem> arrayList4 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                        int size3 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList4.get(i3);
                            i3++;
                            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                                a(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, arrayList2);
                            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                                d(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                        a(pageblocktable.title, arrayList2);
                        ArrayList<TL_iv.pageTableRow> arrayList5 = pageblocktable.rows;
                        int size4 = arrayList5.size();
                        int i4 = 0;
                        while (i4 < size4) {
                            TL_iv.pageTableRow pagetablerow = arrayList5.get(i4);
                            i4++;
                            ArrayList<TL_iv.pageTableCell> arrayList6 = pagetablerow.cells;
                            int size5 = arrayList6.size();
                            int i5 = 0;
                            while (i5 < size5) {
                                TL_iv.pageTableCell pagetablecell = arrayList6.get(i5);
                                i5++;
                                a(pagetablecell.text, arrayList2);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        a(pageblockdetails.title, arrayList2);
                        d(pageblockdetails.blocks, arrayList2);
                    } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockMap)) {
                        if (pageBlock instanceof TL_iv.pageBlockCollage) {
                            d(((TL_iv.pageBlockCollage) pageBlock).items, arrayList2);
                            TL_iv.PageCaption pageCaption = pageBlock.caption;
                            if (pageCaption != null) {
                                a(pageCaption.text, arrayList2);
                                a(pageCaption.credit, arrayList2);
                            }
                        } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            d(((TL_iv.pageBlockSlideshow) pageBlock).items, arrayList2);
                            TL_iv.PageCaption pageCaption2 = pageBlock.caption;
                            if (pageCaption2 != null) {
                                a(pageCaption2.text, arrayList2);
                                a(pageCaption2.credit, arrayList2);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        TL_iv.PageCaption pageCaption3 = pageBlock.caption;
                        if (pageCaption3 != null) {
                            a(pageCaption3.text, arrayList2);
                            a(pageCaption3.credit, arrayList2);
                        }
                    }
                } else {
                    a(pageBlock.text, arrayList2);
                }
            }
        }
    }

    public static ArrayList e(TL_iv.RichMessage richMessage) {
        ArrayList arrayList = new ArrayList();
        if (richMessage != null) {
            d(richMessage.blocks, arrayList);
        }
        return arrayList;
    }

    public static int[] f(r47 r47Var, String str, int i) {
        ArrayList arrayList;
        int[] iArr = null;
        if (r47Var == null || r47Var.y2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        hl9 hl9Var = r47Var.y2;
        TL_iv.RichMessage richMessage = hl9Var.c;
        ArrayList arrayList2 = hl9Var.n;
        ArrayList e = e(richMessage);
        if (e.isEmpty()) {
            return null;
        }
        int[] iArr2 = new int[e.size()];
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (int i3 = 0; i3 < e.size(); i3++) {
            if (i3 > 0) {
                sb.append('\n');
            }
            iArr2[i3] = sb.length();
            b((TL_iv.RichText) e.get(i3), sb, null);
        }
        int Y = r47.Y(i, sb.toString(), str);
        if (Y < 0) {
            return null;
        }
        int length = str.length() + Y;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        int i4 = 0;
        while (i4 < arrayList2.size()) {
            CharSequence l = l((kmb) arrayList2.get(i4));
            if (l instanceof Spanned) {
                Spanned spanned = (Spanned) l;
                int intValue = ((Integer) hl9Var.o.get(i4)).intValue();
                bk9[] bk9VarArr = (bk9[]) spanned.getSpans(i2, l.length(), bk9.class);
                int length2 = bk9VarArr.length;
                int i5 = i2;
                while (i5 < length2) {
                    bk9 bk9Var = bk9VarArr[i5];
                    int[] iArr3 = iArr;
                    if (identityHashMap.containsKey(bk9Var.a)) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        identityHashMap.put(bk9Var.a, new int[]{spanned.getSpanStart(bk9Var) + intValue, spanned.getSpanEnd(bk9Var) + intValue, bk9Var.b});
                    }
                    i5++;
                    iArr = iArr3;
                    arrayList2 = arrayList;
                }
            }
            i4++;
            iArr = iArr;
            arrayList2 = arrayList2;
            i2 = 0;
        }
        int[] iArr4 = iArr;
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < e.size(); i8++) {
            int g = g((TL_iv.RichText) e.get(i8)) + iArr2[i8];
            if (i6 < 0 && Y < g && identityHashMap.containsKey(e.get(i8))) {
                i6 = i8;
            }
            if (iArr2[i8] < length && identityHashMap.containsKey(e.get(i8))) {
                i7 = i8;
            }
        }
        if (i6 >= 0 && i7 >= 0 && i6 <= i7) {
            int[] iArr5 = (int[]) identityHashMap.get(e.get(i6));
            int[] iArr6 = (int[]) identityHashMap.get(e.get(i7));
            int i9 = i(hl9Var, (TL_iv.RichText) e.get(i6), iArr5[2], Math.max(0, Y - iArr2[i6]), false);
            int i10 = i(hl9Var, (TL_iv.RichText) e.get(i7), iArr6[2], Math.min(g((TL_iv.RichText) e.get(i7)), length - iArr2[i7]), true);
            int i11 = iArr5[0];
            int min = Math.min(i9, iArr5[1] - i11) + i11;
            int i12 = iArr6[0];
            int min2 = Math.min(i10, iArr6[1] - i12) + i12;
            if (min2 <= min) {
                return iArr4;
            }
            return new int[]{min, min2};
        }
        return iArr4;
    }

    public static int g(TL_iv.RichText richText) {
        StringBuilder sb = new StringBuilder();
        b(richText, sb, null);
        return sb.toString().length();
    }

    public static String h(ArrayList arrayList, ArrayList arrayList2) {
        StringBuilder sb = new StringBuilder();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    sb.append('\n');
                }
                b((TL_iv.RichText) arrayList.get(i), sb, arrayList2);
            }
        }
        return sb.toString();
    }

    public static int i(hl9 hl9Var, TL_iv.RichText richText, int i, int i2, boolean z) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        SpannableStringBuilder o = hl9Var.o(richText, i, identityHashMap);
        int j = j(richText, identityHashMap, i2, z, new int[]{0});
        if (j < 0) {
            return o.length();
        }
        return j;
    }

    public static int j(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i, boolean z, int[] iArr) {
        TL_iv.RichText richText2;
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !(richText instanceof TL_iv.textImage)) {
            int[] iArr2 = (int[]) identityHashMap.get(richText);
            int i2 = 0;
            if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                while (i2 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i2);
                    i2++;
                    int j = j(richText3, identityHashMap, i, z, iArr);
                    if (j >= 0) {
                        return j;
                    }
                }
                return -1;
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                if (mm9.j(textdiff.text)) {
                    richText2 = textdiff.old_text;
                } else {
                    richText2 = textdiff.text;
                }
                return j(richText2, identityHashMap, i, z, iArr);
            } else {
                boolean z2 = richText instanceof TL_iv.textPlain;
                if (!z2 && !(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textButton)) {
                    return j(richText.text, identityHashMap, i, z, iArr);
                }
                int g = g(richText);
                int i3 = iArr[0];
                int i4 = i - i3;
                iArr[0] = i3 + g;
                if (iArr2 != null) {
                    if (z) {
                        if (i4 > g) {
                            return -1;
                        }
                    } else if (i4 >= g) {
                        return -1;
                    }
                    if (z2) {
                        int i5 = iArr2[1];
                        int i6 = iArr2[0];
                        if (i5 - i6 == g) {
                            return Math.max(0, i4) + i6;
                        }
                    }
                    if (z && i4 > 0) {
                        return iArr2[1];
                    }
                    return iArr2[0];
                }
                return -1;
            }
        }
        return -1;
    }

    public static ll9 k(int i, int i2, r47 r47Var) {
        int intValue;
        int intValue2;
        kl9 a;
        boolean z;
        int i3;
        TL_iv.RichText b;
        int i4;
        if (c(r47Var)) {
            hl9 hl9Var = r47Var.y2;
            int f = uc7.s1(r47Var.K1).k4.V1.f();
            ArrayList e = e(hl9Var.c);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            for (int i5 = 0; i5 < e.size(); i5++) {
                identityHashMap.put((TL_iv.RichText) e.get(i5), Integer.valueOf(i5));
            }
            boolean z2 = true;
            jq n = n(hl9Var, Math.min(i, i2), true, identityHashMap);
            jq n2 = n(hl9Var, Math.max(i, i2), false, identityHashMap);
            if (n != null) {
                int i6 = n.a;
                if (n2 != null && (intValue = ((Integer) identityHashMap.get(((bk9) n.c).a)).intValue()) <= (intValue2 = ((Integer) identityHashMap.get(((bk9) n2.c).a)).intValue()) && (intValue != intValue2 || i6 < n2.a)) {
                    kl9 a2 = kl9.a(hl9Var, n);
                    if (intValue == intValue2) {
                        a = a2;
                    } else {
                        a = kl9.a(hl9Var, n2);
                    }
                    if (a2 != null && a != null) {
                        jl9 jl9Var = new jl9(hl9Var, e, intValue, n.a, a2, intValue2, n2.a, a);
                        if ((intValue2 - intValue) + 1 > 32) {
                            int i7 = intValue + 31;
                            if (i7 != intValue2) {
                                jl9Var.h = null;
                            }
                            jl9Var.f = i7;
                            jl9Var.g = Integer.MAX_VALUE;
                        }
                        int i8 = 0;
                        loop1: while (i8 < 8 && jl9Var.f >= intValue) {
                            int i9 = intValue;
                            int i10 = 0;
                            while (i9 <= jl9Var.f) {
                                TL_iv.RichText a3 = jl9Var.a(i9);
                                StringBuilder sb = new StringBuilder();
                                b(a3, sb, null);
                                String sb2 = sb.toString();
                                int codePointCount = sb2.codePointCount(0, sb2.length()) + i10;
                                if (codePointCount > f) {
                                    int i11 = f - i10;
                                    int i12 = jl9Var.d;
                                    if (i11 <= 0) {
                                        i3 = -1;
                                        z = z2;
                                    } else {
                                        int offsetByCodePoints = sb2.offsetByCodePoints(0, i11);
                                        z = z2;
                                        kl9 b2 = jl9Var.b(i9);
                                        if (i9 == intValue && i12 > 0 && (b = jl9Var.e.b(0, i12)) != null) {
                                            offsetByCodePoints += g(b);
                                        }
                                        i3 = i(jl9Var.a, (TL_iv.RichText) jl9Var.b.get(i9), b2.d, offsetByCodePoints, false);
                                    }
                                    if (i11 > 0) {
                                        if (i9 != jl9Var.c) {
                                            i12 = 0;
                                        }
                                        if (i3 > i12 && (i9 != (i4 = jl9Var.f) || i3 < jl9Var.g)) {
                                            if (i9 != i4) {
                                                jl9Var.h = null;
                                            }
                                            jl9Var.f = i9;
                                            jl9Var.g = i3;
                                            i8++;
                                            z2 = z;
                                        }
                                    }
                                    int i13 = i9 - 1;
                                    if (i13 != jl9Var.f) {
                                        jl9Var.h = null;
                                    }
                                    jl9Var.f = i13;
                                    jl9Var.g = Integer.MAX_VALUE;
                                    i8++;
                                    z2 = z;
                                } else {
                                    i9++;
                                    i10 = codePointCount;
                                }
                            }
                        }
                        if (jl9Var.f >= intValue) {
                            ArrayList arrayList = new ArrayList();
                            for (int i14 = intValue; i14 <= jl9Var.f; i14++) {
                                TL_iv.RichText o = o(jl9Var.a(i14));
                                if (o != null && g(o) > 0) {
                                    arrayList.add(o);
                                }
                            }
                            if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                                int i15 = 0;
                                for (int i16 = 0; i16 < intValue; i16++) {
                                    i15 += g((TL_iv.RichText) e.get(i16)) + 1;
                                }
                                TL_iv.RichText b3 = a2.b(0, i6);
                                if (b3 != null) {
                                    i15 += g(b3);
                                }
                                return new ll9(arrayList, i15);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static CharSequence l(kmb kmbVar) {
        Layout a;
        if (kmbVar == null) {
            a = null;
        } else {
            a = kmbVar.a();
        }
        if (a == null) {
            return null;
        }
        return a.getText();
    }

    public static boolean m(TL_iv.RichText richText) {
        if (richText == null) {
            return false;
        }
        if (richText instanceof TL_iv.textButton) {
            return true;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TL_iv.RichText richText2 = arrayList.get(i);
                i++;
                if (m(richText2)) {
                    return true;
                }
            }
            return false;
        }
        return m(richText.text);
    }

    public static defpackage.jq n(defpackage.hl9 r16, int r17, final boolean r18, java.util.IdentityHashMap r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ll9.n(hl9, int, boolean, java.util.IdentityHashMap):jq");
    }

    public static TL_iv.RichText o(TL_iv.RichText richText) {
        TL_iv.RichText richText2;
        if (richText != null && m(richText)) {
            if (richText instanceof TL_iv.textButton) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = hl9.w(richText.text);
                return textplain;
            } else if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    TL_iv.RichText richText3 = arrayList.get(i);
                    i++;
                    textconcat.texts.add(o(richText3));
                }
                return textconcat;
            } else {
                try {
                    richText2 = (TL_iv.RichText) TLObject.deepCopy(richText, new iy8((byte) 11));
                } catch (Exception e) {
                    cc4.g(e, true);
                    richText2 = null;
                }
                if (richText2 == null) {
                    return null;
                }
                richText2.text = o(richText.text);
                return richText2;
            }
        }
        return richText;
    }
}
