package org.telegram.messenger;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ov {
    public final ArrayList f24400a;
    public final int f24401b;

    public ov(int i7, ArrayList arrayList) {
        this.f24400a = arrayList;
        this.f24401b = i7;
    }

    public static void a(TL_iv.RichText richText, ArrayList arrayList) {
        if (richText != null && g(richText) > 0) {
            arrayList.add(richText);
        }
    }

    public static void b(TL_iv.RichText richText, StringBuilder sb2, ArrayList arrayList) {
        TLRPC.MessageEntity messageEntity;
        int length;
        TL_iv.RichText richText2;
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str2 = ((TL_iv.textPlain) richText).text;
            if (str2 != null) {
                sb2.append(str2);
            }
        } else if (richText instanceof TL_iv.textMath) {
            String str3 = ((TL_iv.textMath) richText).source;
            if (str3 != null) {
                sb2.append(str3);
            }
        } else {
            int length2 = sb2.length();
            if (richText instanceof TL_iv.textCustomEmoji) {
                TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                if (TextUtils.isEmpty(textcustomemoji.alt)) {
                    str = "😀";
                } else {
                    str = textcustomemoji.alt;
                }
                sb2.append(str);
                if (arrayList != null) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = textcustomemoji.document_id;
                    int length3 = sb2.length();
                    if (length3 > length2) {
                        tL_messageEntityCustomEmoji.offset = length2;
                        tL_messageEntityCustomEmoji.length = length3 - length2;
                        arrayList.add(tL_messageEntityCustomEmoji);
                    }
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText3 = arrayList2.get(i7);
                    i7++;
                    b(richText3, sb2, arrayList);
                }
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                if (li.c6.j(textdiff.text)) {
                    richText2 = textdiff.old_text;
                } else {
                    richText2 = textdiff.text;
                }
                b(richText2, sb2, arrayList);
            } else {
                b(richText.text, sb2, arrayList);
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
                    if (messageEntity != null && (length = sb2.length()) > length2) {
                        messageEntity.offset = length2;
                        messageEntity.length = length - length2;
                        arrayList.add(messageEntity);
                    }
                }
            }
        }
    }

    public static boolean c(ij ijVar) {
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        kv kvVar;
        if (ijVar != null && (message = ijVar.f23262k) != null && (richMessage = message.rich_message) != null && (kvVar = ijVar.f23309w2) != null && kvVar.f23765c == richMessage) {
            return true;
        }
        return false;
    }

    public static void d(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
                        int i10 = 0;
                        while (i10 < size2) {
                            TL_iv.PageListItem pageListItem = arrayList3.get(i10);
                            i10++;
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
                        int i11 = 0;
                        while (i11 < size3) {
                            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList4.get(i11);
                            i11++;
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
                        int i12 = 0;
                        while (i12 < size4) {
                            TL_iv.pageTableRow pagetablerow = arrayList5.get(i12);
                            i12++;
                            ArrayList<TL_iv.pageTableCell> arrayList6 = pagetablerow.cells;
                            int size5 = arrayList6.size();
                            int i13 = 0;
                            while (i13 < size5) {
                                TL_iv.pageTableCell pagetablecell = arrayList6.get(i13);
                                i13++;
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

    public static int[] f(ij ijVar, String str, int i7) {
        ArrayList arrayList;
        int[] iArr = null;
        if (ijVar == null || ijVar.f23309w2 == null || TextUtils.isEmpty(str)) {
            return null;
        }
        kv kvVar = ijVar.f23309w2;
        TL_iv.RichMessage richMessage = kvVar.f23765c;
        ArrayList arrayList2 = kvVar.f23774n;
        ArrayList e10 = e(richMessage);
        if (e10.isEmpty()) {
            return null;
        }
        int[] iArr2 = new int[e10.size()];
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (i11 > 0) {
                sb2.append('\n');
            }
            iArr2[i11] = sb2.length();
            b((TL_iv.RichText) e10.get(i11), sb2, null);
        }
        int Y = ij.Y(i7, sb2.toString(), str);
        if (Y < 0) {
            return null;
        }
        int length = str.length() + Y;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        int i12 = 0;
        while (i12 < arrayList2.size()) {
            CharSequence l10 = l((org.telegram.ui.Cells.t9) arrayList2.get(i12));
            if (l10 instanceof Spanned) {
                Spanned spanned = (Spanned) l10;
                int intValue = ((Integer) kvVar.f23775o.get(i12)).intValue();
                cu[] cuVarArr = (cu[]) spanned.getSpans(i10, l10.length(), cu.class);
                int length2 = cuVarArr.length;
                int i13 = i10;
                while (i13 < length2) {
                    cu cuVar = cuVarArr[i13];
                    int[] iArr3 = iArr;
                    if (identityHashMap.containsKey(cuVar.f21935a)) {
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        identityHashMap.put(cuVar.f21935a, new int[]{spanned.getSpanStart(cuVar) + intValue, spanned.getSpanEnd(cuVar) + intValue, cuVar.f21936b});
                    }
                    i13++;
                    iArr = iArr3;
                    arrayList2 = arrayList;
                }
            }
            i12++;
            iArr = iArr;
            arrayList2 = arrayList2;
            i10 = 0;
        }
        int[] iArr4 = iArr;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < e10.size(); i16++) {
            int g10 = g((TL_iv.RichText) e10.get(i16)) + iArr2[i16];
            if (i14 < 0 && Y < g10 && identityHashMap.containsKey(e10.get(i16))) {
                i14 = i16;
            }
            if (iArr2[i16] < length && identityHashMap.containsKey(e10.get(i16))) {
                i15 = i16;
            }
        }
        if (i14 >= 0 && i15 >= 0 && i14 <= i15) {
            int[] iArr5 = (int[]) identityHashMap.get(e10.get(i14));
            int[] iArr6 = (int[]) identityHashMap.get(e10.get(i15));
            int i17 = i(kvVar, (TL_iv.RichText) e10.get(i14), iArr5[2], Math.max(0, Y - iArr2[i14]), false);
            int i18 = i(kvVar, (TL_iv.RichText) e10.get(i15), iArr6[2], Math.min(g((TL_iv.RichText) e10.get(i15)), length - iArr2[i15]), true);
            int i19 = iArr5[0];
            int min = Math.min(i17, iArr5[1] - i19) + i19;
            int i20 = iArr6[0];
            int min2 = Math.min(i18, iArr6[1] - i20) + i20;
            if (min2 <= min) {
                return iArr4;
            }
            return new int[]{min, min2};
        }
        return iArr4;
    }

    public static int g(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        b(richText, sb2, null);
        return sb2.toString().length();
    }

    public static String h(ArrayList arrayList, ArrayList arrayList2) {
        StringBuilder sb2 = new StringBuilder();
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (i7 > 0) {
                    sb2.append('\n');
                }
                b((TL_iv.RichText) arrayList.get(i7), sb2, arrayList2);
            }
        }
        return sb2.toString();
    }

    public static int i(kv kvVar, TL_iv.RichText richText, int i7, int i10, boolean z9) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        SpannableStringBuilder o4 = kvVar.o(richText, i7, identityHashMap);
        int j3 = j(richText, identityHashMap, i10, z9, new int[]{0});
        if (j3 < 0) {
            return o4.length();
        }
        return j3;
    }

    public static int j(TL_iv.RichText richText, IdentityHashMap identityHashMap, int i7, boolean z9, int[] iArr) {
        TL_iv.RichText richText2;
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textImage)) {
            return -1;
        }
        int[] iArr2 = (int[]) identityHashMap.get(richText);
        int i10 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            while (i10 < size) {
                TL_iv.RichText richText3 = arrayList.get(i10);
                i10++;
                int j3 = j(richText3, identityHashMap, i7, z9, iArr);
                if (j3 >= 0) {
                    return j3;
                }
            }
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (li.c6.j(textdiff.text)) {
                richText2 = textdiff.old_text;
            } else {
                richText2 = textdiff.text;
            }
            return j(richText2, identityHashMap, i7, z9, iArr);
        } else {
            boolean z10 = richText instanceof TL_iv.textPlain;
            if (!z10 && !(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textButton)) {
                return j(richText.text, identityHashMap, i7, z9, iArr);
            }
            int g10 = g(richText);
            int i11 = iArr[0];
            int i12 = i7 - i11;
            iArr[0] = i11 + g10;
            if (iArr2 != null && (!z9 ? i12 < g10 : i12 <= g10)) {
                if (z10) {
                    int i13 = iArr2[1];
                    int i14 = iArr2[0];
                    if (i13 - i14 == g10) {
                        return Math.max(0, i12) + i14;
                    }
                }
                if (z9 && i12 > 0) {
                    return iArr2[1];
                }
                return iArr2[0];
            }
        }
        return -1;
    }

    public static ov k(int i7, int i10, ij ijVar) {
        int intValue;
        int intValue2;
        nv a10;
        boolean z9;
        int i11;
        TL_iv.RichText b10;
        int i12;
        if (c(ijVar)) {
            kv kvVar = ijVar.f23309w2;
            int i13 = qp.s1(ijVar.I1).o4;
            ArrayList e10 = e(kvVar.f23765c);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            for (int i14 = 0; i14 < e10.size(); i14++) {
                identityHashMap.put((TL_iv.RichText) e10.get(i14), Integer.valueOf(i14));
            }
            boolean z10 = true;
            h2.j0 n10 = n(kvVar, Math.min(i7, i10), true, identityHashMap);
            h2.j0 n11 = n(kvVar, Math.max(i7, i10), false, identityHashMap);
            if (n10 != null) {
                int i15 = n10.f14097a;
                if (n11 != null && (intValue = ((Integer) identityHashMap.get(((cu) n10.f14099c).f21935a)).intValue()) <= (intValue2 = ((Integer) identityHashMap.get(((cu) n11.f14099c).f21935a)).intValue()) && (intValue != intValue2 || i15 < n11.f14097a)) {
                    nv a11 = nv.a(kvVar, n10);
                    if (intValue == intValue2) {
                        a10 = a11;
                    } else {
                        a10 = nv.a(kvVar, n11);
                    }
                    if (a11 != null && a10 != null) {
                        mv mvVar = new mv(kvVar, e10, intValue, n10.f14097a, a11, intValue2, n11.f14097a, a10);
                        if ((intValue2 - intValue) + 1 > 32) {
                            int i16 = intValue + 31;
                            if (i16 != intValue2) {
                                mvVar.h = null;
                            }
                            mvVar.f24091f = i16;
                            mvVar.f24092g = Integer.MAX_VALUE;
                        }
                        int i17 = 0;
                        loop1: while (i17 < 8 && mvVar.f24091f >= intValue) {
                            int i18 = intValue;
                            int i19 = 0;
                            while (i18 <= mvVar.f24091f) {
                                TL_iv.RichText a12 = mvVar.a(i18);
                                StringBuilder sb2 = new StringBuilder();
                                b(a12, sb2, null);
                                String sb3 = sb2.toString();
                                int codePointCount = sb3.codePointCount(0, sb3.length()) + i19;
                                if (codePointCount > i13) {
                                    int i20 = i13 - i19;
                                    int i21 = mvVar.d;
                                    if (i20 <= 0) {
                                        i11 = -1;
                                        z9 = z10;
                                    } else {
                                        int offsetByCodePoints = sb3.offsetByCodePoints(0, i20);
                                        z9 = z10;
                                        nv b11 = mvVar.b(i18);
                                        if (i18 == intValue && i21 > 0 && (b10 = mvVar.f24090e.b(0, i21)) != null) {
                                            offsetByCodePoints += g(b10);
                                        }
                                        i11 = i(mvVar.f24087a, (TL_iv.RichText) mvVar.f24088b.get(i18), b11.d, offsetByCodePoints, false);
                                    }
                                    if (i20 > 0) {
                                        if (i18 != mvVar.f24089c) {
                                            i21 = 0;
                                        }
                                        if (i11 > i21 && (i18 != (i12 = mvVar.f24091f) || i11 < mvVar.f24092g)) {
                                            if (i18 != i12) {
                                                mvVar.h = null;
                                            }
                                            mvVar.f24091f = i18;
                                            mvVar.f24092g = i11;
                                            i17++;
                                            z10 = z9;
                                        }
                                    }
                                    int i22 = i18 - 1;
                                    if (i22 != mvVar.f24091f) {
                                        mvVar.h = null;
                                    }
                                    mvVar.f24091f = i22;
                                    mvVar.f24092g = Integer.MAX_VALUE;
                                    i17++;
                                    z10 = z9;
                                } else {
                                    i18++;
                                    i19 = codePointCount;
                                }
                            }
                        }
                        if (mvVar.f24091f >= intValue) {
                            ArrayList arrayList = new ArrayList();
                            for (int i23 = intValue; i23 <= mvVar.f24091f; i23++) {
                                TL_iv.RichText o4 = o(mvVar.a(i23));
                                if (o4 != null && g(o4) > 0) {
                                    arrayList.add(o4);
                                }
                            }
                            if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                                int i24 = 0;
                                for (int i25 = 0; i25 < intValue; i25++) {
                                    i24 += g((TL_iv.RichText) e10.get(i25)) + 1;
                                }
                                TL_iv.RichText b12 = a11.b(0, i15);
                                if (b12 != null) {
                                    i24 += g(b12);
                                }
                                return new ov(i24, arrayList);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static CharSequence l(org.telegram.ui.Cells.t9 t9Var) {
        Layout a10;
        if (t9Var == null) {
            a10 = null;
        } else {
            a10 = t9Var.a();
        }
        if (a10 == null) {
            return null;
        }
        return a10.getText();
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
            int i7 = 0;
            while (i7 < size) {
                TL_iv.RichText richText2 = arrayList.get(i7);
                i7++;
                if (m(richText2)) {
                    return true;
                }
            }
            return false;
        }
        return m(richText.text);
    }

    public static h2.j0 n(org.telegram.messenger.kv r16, int r17, final boolean r18, java.util.IdentityHashMap r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ov.n(org.telegram.messenger.kv, int, boolean, java.util.IdentityHashMap):h2.j0");
    }

    public static TL_iv.RichText o(TL_iv.RichText richText) {
        TL_iv.RichText richText2;
        if (richText != null && m(richText)) {
            if (richText instanceof TL_iv.textButton) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = kv.x(richText.text);
                return textplain;
            } else if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i7);
                    i7++;
                    textconcat.texts.add(o(richText3));
                }
                return textconcat;
            } else {
                try {
                    richText2 = (TL_iv.RichText) TLObject.deepCopy(richText, new ch(9));
                } catch (Exception e10) {
                    a8.g(e10, true);
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
