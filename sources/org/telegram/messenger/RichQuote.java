package org.telegram.messenger;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public class RichQuote {
    public static final int MAX_FRAGMENTS = 32;
    public final ArrayList<TL_iv.RichText> fragments;
    public final int offset;

    public static class Position {
        final int offset;
        final RichMessageLayout.QuoteRootSpan root;
        final CharSequence text;
        final int textStart;

        public Position(RichMessageLayout.QuoteRootSpan quoteRootSpan, int i10, CharSequence charSequence, int i11) {
            this.root = quoteRootSpan;
            this.offset = i10;
            this.text = charSequence;
            this.textStart = i11;
        }
    }

    public static class Range {
        final Sliced first;
        final int fromIndex;
        final int fromOffset;
        Sliced last;
        final RichMessageLayout layout;
        final ArrayList<TL_iv.RichText> nodes;
        int toIndex;
        int toOffset;

        public Range(RichMessageLayout richMessageLayout, ArrayList<TL_iv.RichText> arrayList, int i10, int i11, Sliced sliced, int i12, int i13, Sliced sliced2) {
            this.layout = richMessageLayout;
            this.nodes = arrayList;
            this.fromIndex = i10;
            this.fromOffset = i11;
            this.first = sliced;
            this.toIndex = i12;
            this.toOffset = i13;
            this.last = sliced2;
        }

        public int formattedOffset(int i10, int i11) {
            int i12;
            TL_iv.RichText slice;
            Sliced slicer = slicer(i10);
            if (i10 == this.fromIndex && (i12 = this.fromOffset) > 0 && (slice = this.first.slice(0, i12)) != null) {
                i11 += RichQuote.flatLength(slice);
            }
            return RichQuote.flatToFormatted(this.layout, this.nodes.get(i10), slicer.flags, i11, false);
        }

        public TL_iv.RichText fragment(int i10) {
            int i11;
            int startOffset = startOffset(i10);
            if (i10 == this.toIndex) {
                i11 = this.toOffset;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (startOffset == 0 && i11 == Integer.MAX_VALUE) {
                return this.nodes.get(i10);
            }
            return slicer(i10).slice(startOffset, i11);
        }

        public void setEnd(int i10, int i11) {
            if (i10 != this.toIndex) {
                this.last = null;
            }
            this.toIndex = i10;
            this.toOffset = i11;
        }

        public Sliced slicer(int i10) {
            if (i10 == this.fromIndex) {
                return this.first;
            }
            if (i10 == this.toIndex) {
                if (this.last == null) {
                    this.last = Sliced.ofNode(this.layout, this.nodes.get(i10));
                }
                return this.last;
            }
            return Sliced.ofNode(this.layout, this.nodes.get(i10));
        }

        public int startOffset(int i10) {
            if (i10 == this.fromIndex) {
                return this.fromOffset;
            }
            return 0;
        }
    }

    private RichQuote(ArrayList<TL_iv.RichText> arrayList, int i10) {
        this.fragments = arrayList;
        this.offset = i10;
    }

    private static void add(TL_iv.RichText richText, ArrayList<TL_iv.RichText> arrayList) {
        if (richText != null && flatLength(richText) > 0) {
            arrayList.add(richText);
        }
    }

    private static void addCaption(TL_iv.PageCaption pageCaption, ArrayList<TL_iv.RichText> arrayList) {
        if (pageCaption == null) {
            return;
        }
        add(pageCaption.text, arrayList);
        add(pageCaption.credit, arrayList);
    }

    private static void addEntity(ArrayList<TLRPC.MessageEntity> arrayList, TLRPC.MessageEntity messageEntity, int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        messageEntity.offset = i10;
        messageEntity.length = i11 - i10;
        arrayList.add(messageEntity);
    }

    private static void appendFlat(TL_iv.RichText richText, StringBuilder sb2, ArrayList<TLRPC.MessageEntity> arrayList) {
        TLRPC.MessageEntity messageEntity;
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
            int length = sb2.length();
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
                    addEntity(arrayList, tL_messageEntityCustomEmoji, length, sb2.length());
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList2 = richText.texts;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText3 = arrayList2.get(i10);
                    i10++;
                    appendFlat(richText3, sb2, arrayList);
                }
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                if (li.f6.j(textdiff.text)) {
                    richText2 = textdiff.old_text;
                } else {
                    richText2 = textdiff.text;
                }
                appendFlat(richText2, sb2, arrayList);
            } else {
                appendFlat(richText.text, sb2, arrayList);
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
                    if (messageEntity != null) {
                        addEntity(arrayList, messageEntity, length, sb2.length());
                    }
                }
            }
        }
    }

    public static boolean canQuote(MessageObject messageObject) {
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        RichMessageLayout richMessageLayout;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (richMessage = message.rich_message) != null && (richMessageLayout = messageObject.richLayout) != null && richMessageLayout.richMessage == richMessage) {
            return true;
        }
        return false;
    }

    private static void collect(ArrayList<TL_iv.PageBlock> arrayList, ArrayList<TL_iv.RichText> arrayList2) {
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.PageBlock pageBlock = arrayList.get(i10);
            i10++;
            collect(pageBlock, arrayList2);
        }
    }

    public static ArrayList<TL_iv.RichText> collectNodes(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        if (richMessage != null) {
            collect(richMessage.blocks, arrayList);
        }
        return arrayList;
    }

    public static boolean containsQuote(TL_iv.RichMessage richMessage, String str) {
        if (richMessage != null && !TextUtils.isEmpty(str)) {
            ArrayList<TL_iv.RichText> collectNodes = collectNodes(richMessage);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < collectNodes.size(); i10++) {
                if (i10 > 0) {
                    sb2.append('\n');
                }
                appendFlat(collectNodes.get(i10), sb2, null);
            }
            if (sb2.indexOf(str) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static TL_iv.RichText copy(TL_iv.RichText richText) {
        try {
            return (TL_iv.RichText) TLObject.deepCopy(richText, new zg(2));
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static ArrayList<TL_iv.RichText> copyList(ArrayList<TL_iv.RichText> arrayList) {
        if (arrayList == null) {
            return null;
        }
        return new ArrayList<>(arrayList);
    }

    public static boolean equals(ArrayList<TL_iv.RichText> arrayList, ArrayList<TL_iv.RichText> arrayList2) {
        if (arrayList == arrayList2) {
            return true;
        }
        if (arrayList != null && arrayList2 != null) {
            return TextUtils.equals(flatText(arrayList, null), flatText(arrayList2, null));
        }
        return false;
    }

    public static void fillFlat(TLRPC.MessageReplyHeader messageReplyHeader) {
        if (messageReplyHeader != null && messageReplyHeader.quote_rich != null && messageReplyHeader.quote_text == null && !ApplicationLoader.isAndroidTestEnvironment()) {
            ArrayList<TLRPC.MessageEntity> arrayList = new ArrayList<>();
            messageReplyHeader.quote_text = flatText(messageReplyHeader.quote_rich, arrayList);
            messageReplyHeader.flags |= 64;
            messageReplyHeader.quote_entities = arrayList;
            if (!arrayList.isEmpty()) {
                messageReplyHeader.flags |= 128;
            }
        }
    }

    public static ArrayList<RichMessageLayout.RichDetailsBlock> findCollapsedDetails(MessageObject messageObject, String str, int i10) {
        ?? r02;
        ArrayList<RichMessageLayout.RichBlock> arrayList;
        ?? arrayList2 = new ArrayList();
        if (messageObject != null && messageObject.richLayout != null && !TextUtils.isEmpty(str)) {
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            ArrayList<TL_iv.RichText> collectNodes = collectNodes(richMessageLayout.richMessage);
            int[] iArr = new int[collectNodes.size()];
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (int i12 = 0; i12 < collectNodes.size(); i12++) {
                if (i12 > 0) {
                    sb2.append('\n');
                }
                iArr[i12] = sb2.length();
                appendFlat(collectNodes.get(i12), sb2, null);
            }
            int findQuoteStart = MessageObject.findQuoteStart(sb2.toString(), str, i10);
            if (findQuoteStart >= 0) {
                int length = str.length() + findQuoteStart;
                IdentityHashMap identityHashMap = new IdentityHashMap();
                ArrayList<RichMessageLayout.RichBlock> arrayList3 = richMessageLayout.blocks;
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    RichMessageLayout.RichBlock richBlock = arrayList3.get(i13);
                    i13++;
                    RichMessageLayout.RichBlock richBlock2 = richBlock;
                    org.telegram.ui.Cells.da[] text = richBlock2.getText();
                    if (text != null) {
                        int length2 = text.length;
                        int i14 = i11;
                        while (i14 < length2) {
                            CharSequence text2 = getText(text[i14]);
                            if (!(text2 instanceof Spanned)) {
                                arrayList = arrayList3;
                            } else {
                                arrayList = arrayList3;
                                RichMessageLayout.QuoteRootSpan[] quoteRootSpanArr = (RichMessageLayout.QuoteRootSpan[]) ((Spanned) text2).getSpans(i11, text2.length(), RichMessageLayout.QuoteRootSpan.class);
                                int length3 = quoteRootSpanArr.length;
                                int i15 = i11;
                                while (i15 < length3) {
                                    RichMessageLayout.QuoteRootSpan quoteRootSpan = quoteRootSpanArr[i15];
                                    RichMessageLayout.QuoteRootSpan[] quoteRootSpanArr2 = quoteRootSpanArr;
                                    if (!identityHashMap.containsKey(quoteRootSpan.text)) {
                                        identityHashMap.put(quoteRootSpan.text, richBlock2);
                                    }
                                    i15++;
                                    quoteRootSpanArr = quoteRootSpanArr2;
                                }
                            }
                            i14++;
                            arrayList3 = arrayList;
                            i11 = 0;
                        }
                    }
                }
                for (int i16 = 0; i16 < collectNodes.size(); i16++) {
                    if (flatLength(collectNodes.get(i16)) + iArr[i16] > findQuoteStart && iArr[i16] < length && (r02 = (RichMessageLayout.RichBlock) identityHashMap.get(collectNodes.get(i16))) != 0 && !r02.isVisible()) {
                        while (true) {
                            r02 = r02.parentDetails;
                            if (r02 != 0) {
                                if (!r02.isOpen() && !arrayList2.contains(r02)) {
                                    arrayList2.add(r02);
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    private static IdentityHashMap<TL_iv.RichText, int[]> findDisplayed(RichMessageLayout richMessageLayout) {
        RichMessageLayout.QuoteRootSpan[] quoteRootSpanArr;
        IdentityHashMap<TL_iv.RichText, int[]> identityHashMap = new IdentityHashMap<>();
        for (int i10 = 0; i10 < richMessageLayout.textBlocks.size(); i10++) {
            CharSequence text = getText(richMessageLayout.textBlocks.get(i10));
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int intValue = richMessageLayout.textBlockCharOffsets.get(i10).intValue();
                for (RichMessageLayout.QuoteRootSpan quoteRootSpan : (RichMessageLayout.QuoteRootSpan[]) spanned.getSpans(0, text.length(), RichMessageLayout.QuoteRootSpan.class)) {
                    if (!identityHashMap.containsKey(quoteRootSpan.text)) {
                        identityHashMap.put(quoteRootSpan.text, new int[]{spanned.getSpanStart(quoteRootSpan) + intValue, spanned.getSpanEnd(quoteRootSpan) + intValue, quoteRootSpan.flags});
                    }
                }
            }
        }
        return identityHashMap;
    }

    public static int[] findQuote(MessageObject messageObject, String str, int i10) {
        if (messageObject != null && messageObject.richLayout != null && !TextUtils.isEmpty(str)) {
            RichMessageLayout richMessageLayout = messageObject.richLayout;
            ArrayList<TL_iv.RichText> collectNodes = collectNodes(richMessageLayout.richMessage);
            if (collectNodes.isEmpty()) {
                return null;
            }
            int[] iArr = new int[collectNodes.size()];
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < collectNodes.size(); i11++) {
                if (i11 > 0) {
                    sb2.append('\n');
                }
                iArr[i11] = sb2.length();
                appendFlat(collectNodes.get(i11), sb2, null);
            }
            int findQuoteStart = MessageObject.findQuoteStart(sb2.toString(), str, i10);
            if (findQuoteStart < 0) {
                return null;
            }
            int length = str.length() + findQuoteStart;
            IdentityHashMap<TL_iv.RichText, int[]> findDisplayed = findDisplayed(richMessageLayout);
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < collectNodes.size(); i14++) {
                int flatLength = flatLength(collectNodes.get(i14)) + iArr[i14];
                if (i12 < 0 && findQuoteStart < flatLength && findDisplayed.containsKey(collectNodes.get(i14))) {
                    i12 = i14;
                }
                if (iArr[i14] < length && findDisplayed.containsKey(collectNodes.get(i14))) {
                    i13 = i14;
                }
            }
            if (i12 >= 0 && i13 >= 0 && i12 <= i13) {
                int[] iArr2 = findDisplayed.get(collectNodes.get(i12));
                int[] iArr3 = findDisplayed.get(collectNodes.get(i13));
                int flatToFormatted = flatToFormatted(richMessageLayout, collectNodes.get(i12), iArr2[2], Math.max(0, findQuoteStart - iArr[i12]), false);
                int flatToFormatted2 = flatToFormatted(richMessageLayout, collectNodes.get(i13), iArr3[2], Math.min(flatLength(collectNodes.get(i13)), length - iArr[i13]), true);
                int i15 = iArr2[0];
                int min = Math.min(flatToFormatted, iArr2[1] - i15) + i15;
                int i16 = iArr3[0];
                int min2 = Math.min(flatToFormatted2, iArr3[1] - i16) + i16;
                if (min2 <= min) {
                    return null;
                }
                return new int[]{min, min2};
            }
        }
        return null;
    }

    public static int flatLength(TL_iv.RichText richText) {
        return flatText(richText).length();
    }

    public static String flatText(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        appendFlat(richText, sb2, null);
        return sb2.toString();
    }

    public static int flatToFormatted(RichMessageLayout richMessageLayout, TL_iv.RichText richText, int i10, int i11, boolean z10) {
        IdentityHashMap<TL_iv.RichText, int[]> identityHashMap = new IdentityHashMap<>();
        CharSequence formatTextRecording = richMessageLayout.formatTextRecording(richText, i10, identityHashMap);
        int flatToFormatted = flatToFormatted(richText, identityHashMap, i11, z10, new int[]{0});
        return flatToFormatted < 0 ? formatTextRecording.length() : flatToFormatted;
    }

    public static RichQuote fromSelection(MessageObject messageObject, int i10, int i11) {
        int intValue;
        int intValue2;
        Sliced of2;
        int formattedOffset;
        if (!canQuote(messageObject)) {
            return null;
        }
        RichMessageLayout richMessageLayout = messageObject.richLayout;
        int i12 = MessagesController.getInstance(messageObject.currentAccount).quoteLengthMax;
        ArrayList<TL_iv.RichText> collectNodes = collectNodes(richMessageLayout.richMessage);
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (int i13 = 0; i13 < collectNodes.size(); i13++) {
            identityHashMap.put(collectNodes.get(i13), Integer.valueOf(i13));
        }
        Position resolve = resolve(richMessageLayout, Math.min(i10, i11), true, identityHashMap);
        Position resolve2 = resolve(richMessageLayout, Math.max(i10, i11), false, identityHashMap);
        if (resolve != null && resolve2 != null && (intValue = ((Integer) identityHashMap.get(resolve.root.text)).intValue()) <= (intValue2 = ((Integer) identityHashMap.get(resolve2.root.text)).intValue()) && (intValue != intValue2 || resolve.offset < resolve2.offset)) {
            Sliced of3 = Sliced.of(richMessageLayout, resolve);
            if (intValue == intValue2) {
                of2 = of3;
            } else {
                of2 = Sliced.of(richMessageLayout, resolve2);
            }
            if (of3 != null && of2 != null) {
                Range range = new Range(richMessageLayout, collectNodes, intValue, resolve.offset, of3, intValue2, resolve2.offset, of2);
                int i14 = range.toIndex;
                int i15 = range.fromIndex;
                if ((i14 - i15) + 1 > 32) {
                    range.setEnd(i15 + 31, Integer.MAX_VALUE);
                }
                loop1: for (int i16 = 0; i16 < 8; i16++) {
                    int i17 = range.toIndex;
                    int i18 = range.fromIndex;
                    if (i17 < i18) {
                        break;
                    }
                    int i19 = 0;
                    while (i18 <= range.toIndex) {
                        String flatText = flatText(range.fragment(i18));
                        int codePointCount = flatText.codePointCount(0, flatText.length()) + i19;
                        if (codePointCount > i12) {
                            int i20 = i12 - i19;
                            if (i20 <= 0) {
                                formattedOffset = -1;
                            } else {
                                formattedOffset = range.formattedOffset(i18, flatText.offsetByCodePoints(0, i20));
                            }
                            if (i20 > 0 && formattedOffset > range.startOffset(i18) && (i18 != range.toIndex || formattedOffset < range.toOffset)) {
                                range.setEnd(i18, formattedOffset);
                            } else {
                                range.setEnd(i18 - 1, Integer.MAX_VALUE);
                            }
                        } else {
                            i18++;
                            i19 = codePointCount;
                        }
                    }
                    break loop1;
                }
                if (range.toIndex < range.fromIndex) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (int i21 = range.fromIndex; i21 <= range.toIndex; i21++) {
                    TL_iv.RichText withoutButtons = withoutButtons(range.fragment(i21));
                    if (withoutButtons != null && flatLength(withoutButtons) > 0) {
                        arrayList.add(withoutButtons);
                    }
                }
                if (!arrayList.isEmpty() && arrayList.size() <= 32) {
                    int i22 = 0;
                    for (int i23 = 0; i23 < intValue; i23++) {
                        i22 += flatLength(collectNodes.get(i23)) + 1;
                    }
                    TL_iv.RichText slice = of3.slice(0, resolve.offset);
                    if (slice != null) {
                        i22 += flatLength(slice);
                    }
                    return new RichQuote(arrayList, i22);
                }
            }
        }
        return null;
    }

    private static CharSequence getText(org.telegram.ui.Cells.da daVar) {
        Layout layout;
        if (daVar == null) {
            layout = null;
        } else {
            layout = daVar.getLayout();
        }
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    private static boolean hasButtons(TL_iv.RichText richText) {
        if (richText == null) {
            return false;
        }
        if (richText instanceof TL_iv.textButton) {
            return true;
        }
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                if (hasButtons(richText2)) {
                    return true;
                }
            }
            return false;
        }
        return hasButtons(richText.text);
    }

    public static int lambda$resolve$0(boolean z10, Spanned spanned, RichMessageLayout.QuoteRootSpan quoteRootSpan, RichMessageLayout.QuoteRootSpan quoteRootSpan2) {
        int spanEnd;
        int spanEnd2;
        if (z10) {
            spanEnd = spanned.getSpanStart(quoteRootSpan);
            spanEnd2 = spanned.getSpanStart(quoteRootSpan2);
        } else {
            spanEnd = spanned.getSpanEnd(quoteRootSpan2);
            spanEnd2 = spanned.getSpanEnd(quoteRootSpan);
        }
        return spanEnd - spanEnd2;
    }

    private static org.telegram.messenger.RichQuote.Position resolve(org.telegram.messenger.RichMessageLayout r16, int r17, final boolean r18, java.util.IdentityHashMap<org.telegram.tgnet.tl.TL_iv.RichText, java.lang.Integer> r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.RichQuote.resolve(org.telegram.messenger.RichMessageLayout, int, boolean, java.util.IdentityHashMap):org.telegram.messenger.RichQuote$Position");
    }

    private static TL_iv.RichText withoutButtons(TL_iv.RichText richText) {
        if (richText != null && hasButtons(richText)) {
            if (richText instanceof TL_iv.textButton) {
                TL_iv.textPlain textplain = new TL_iv.textPlain();
                textplain.text = RichMessageLayout.getString(richText.text);
                return textplain;
            } else if (richText instanceof TL_iv.textConcat) {
                TL_iv.textConcat textconcat = new TL_iv.textConcat();
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i10);
                    i10++;
                    textconcat.texts.add(withoutButtons(richText2));
                }
                return textconcat;
            } else {
                TL_iv.RichText copy = copy(richText);
                if (copy == null) {
                    return null;
                }
                copy.text = withoutButtons(richText.text);
                return copy;
            }
        }
        return richText;
    }

    private static void collect(TL_iv.PageBlock pageBlock, ArrayList<TL_iv.RichText> arrayList) {
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockThinking) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            if (pageBlock instanceof TL_iv.pageBlockMath) {
                String str = ((TL_iv.pageBlockMath) pageBlock).source;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                TL_iv.textMath textmath = new TL_iv.textMath();
                textmath.source = str;
                arrayList.add(textmath);
                return;
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                add(pageBlock.text, arrayList);
                add(((TL_iv.pageBlockBlockquote) pageBlock).caption, arrayList);
                return;
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                collect(pageblockblockquoteblocks.blocks, arrayList);
                add(pageblockblockquoteblocks.caption, arrayList);
                return;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                add(pageBlock.text, arrayList);
                add(((TL_iv.pageBlockPullquote) pageBlock).caption, arrayList);
                return;
            } else {
                int i10 = 0;
                if (pageBlock instanceof TL_iv.pageBlockList) {
                    ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        TL_iv.PageListItem pageListItem = arrayList2.get(i10);
                        i10++;
                        TL_iv.PageListItem pageListItem2 = pageListItem;
                        if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                            add(((TL_iv.TL_pageListItemText) pageListItem2).text, arrayList);
                        } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                            collect(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, arrayList);
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                    ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                    int size2 = arrayList3.size();
                    while (i10 < size2) {
                        TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i10);
                        i10++;
                        TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                        if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                            add(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, arrayList);
                        } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                            collect(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, arrayList);
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                    add(pageblocktable.title, arrayList);
                    ArrayList<TL_iv.pageTableRow> arrayList4 = pageblocktable.rows;
                    int size3 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        TL_iv.pageTableRow pagetablerow = arrayList4.get(i11);
                        i11++;
                        ArrayList<TL_iv.pageTableCell> arrayList5 = pagetablerow.cells;
                        int size4 = arrayList5.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            TL_iv.pageTableCell pagetablecell = arrayList5.get(i12);
                            i12++;
                            add(pagetablecell.text, arrayList);
                        }
                    }
                    return;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    add(pageblockdetails.title, arrayList);
                    collect(pageblockdetails.blocks, arrayList);
                    return;
                } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockMap)) {
                    if (pageBlock instanceof TL_iv.pageBlockCollage) {
                        collect(((TL_iv.pageBlockCollage) pageBlock).items, arrayList);
                        addCaption(pageBlock.caption, arrayList);
                        return;
                    } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                        collect(((TL_iv.pageBlockSlideshow) pageBlock).items, arrayList);
                        addCaption(pageBlock.caption, arrayList);
                        return;
                    } else {
                        return;
                    }
                } else {
                    addCaption(pageBlock.caption, arrayList);
                    return;
                }
            }
        }
        add(pageBlock.text, arrayList);
    }

    public static class Sliced {
        final int flags;
        final int length;
        final IdentityHashMap<TL_iv.RichText, int[]> ranges;
        final TL_iv.RichText root;

        public Sliced(TL_iv.RichText richText, IdentityHashMap<TL_iv.RichText, int[]> identityHashMap, int i10, int i11) {
            this.root = richText;
            this.ranges = identityHashMap;
            this.length = i10;
            this.flags = i11;
        }

        public static Sliced of(RichMessageLayout richMessageLayout, Position position) {
            IdentityHashMap<TL_iv.RichText, int[]> identityHashMap = new IdentityHashMap<>();
            RichMessageLayout.QuoteRootSpan quoteRootSpan = position.root;
            CharSequence formatTextRecording = richMessageLayout.formatTextRecording(quoteRootSpan.text, quoteRootSpan.flags, identityHashMap);
            int spanEnd = ((Spanned) position.text).getSpanEnd(position.root) - position.textStart;
            if (formatTextRecording.length() == spanEnd && TextUtils.regionMatches(formatTextRecording, 0, position.text, position.textStart, spanEnd)) {
                return new Sliced(position.root.text, identityHashMap, formatTextRecording.length(), position.root.flags);
            }
            FileLog.e("RichQuote: laid out text doesn't match the formatted one");
            return null;
        }

        public static Sliced ofNode(RichMessageLayout richMessageLayout, TL_iv.RichText richText) {
            IdentityHashMap<TL_iv.RichText, int[]> identityHashMap = new IdentityHashMap<>();
            return new Sliced(richText, identityHashMap, richMessageLayout.formatTextRecording(richText, 0, identityHashMap).length(), 0);
        }

        public TL_iv.RichText slice(int i10, int i11) {
            int max = Math.max(0, i10);
            int min = Math.min(this.length, i11);
            if (max >= min) {
                return null;
            }
            return (max == 0 && min == this.length) ? this.root : slice(this.root, max, min);
        }

        private TL_iv.RichText slice(TL_iv.RichText richText, int i10, int i11) {
            int[] iArr;
            int i12;
            int i13;
            if (richText == null || (iArr = this.ranges.get(richText)) == null || (i12 = iArr[0]) == (i13 = iArr[1]) || i13 <= i10 || i12 >= i11) {
                return null;
            }
            if (i10 > i12 || i13 > i11) {
                if (richText instanceof TL_iv.textPlain) {
                    String str = ((TL_iv.textPlain) richText).text;
                    if (str != null && str.length() == i13 - i12) {
                        int max = Math.max(i10, i12) - i12;
                        int min = Math.min(i11, i13) - i12;
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
                    int i14 = 0;
                    while (i14 < size) {
                        TL_iv.RichText richText2 = arrayList2.get(i14);
                        i14++;
                        TL_iv.RichText slice = slice(richText2, i10, i11);
                        if (slice != null) {
                            arrayList.add(slice);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    if (arrayList.size() == 1) {
                        return arrayList.get(0);
                    }
                    TL_iv.textConcat textconcat = new TL_iv.textConcat();
                    textconcat.texts = arrayList;
                    return textconcat;
                } else {
                    if (!(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textDate) && !(richText instanceof TL_iv.textDiff) && !(richText instanceof TL_iv.textButton)) {
                        TL_iv.RichText richText3 = richText.text;
                        if (richText3 != null) {
                            TL_iv.RichText slice2 = slice(richText3, i10, i11);
                            if (slice2 == null || (richText = RichQuote.copy(richText)) == null) {
                                return null;
                            }
                            richText.text = slice2;
                        }
                    }
                    return richText;
                }
            }
            return richText;
        }
    }

    public static String flatText(ArrayList<TL_iv.RichText> arrayList, ArrayList<TLRPC.MessageEntity> arrayList2) {
        StringBuilder sb2 = new StringBuilder();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    sb2.append('\n');
                }
                appendFlat(arrayList.get(i10), sb2, arrayList2);
            }
        }
        return sb2.toString();
    }

    private static int flatToFormatted(TL_iv.RichText richText, IdentityHashMap<TL_iv.RichText, int[]> identityHashMap, int i10, boolean z10, int[] iArr) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty) && !(richText instanceof TL_iv.textImage)) {
            int[] iArr2 = identityHashMap.get(richText);
            int i11 = 0;
            if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = richText.texts;
                int size = arrayList.size();
                while (i11 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i11);
                    i11++;
                    int flatToFormatted = flatToFormatted(richText2, identityHashMap, i10, z10, iArr);
                    if (flatToFormatted >= 0) {
                        return flatToFormatted;
                    }
                }
                return -1;
            } else if (richText instanceof TL_iv.textDiff) {
                TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                return flatToFormatted(li.f6.j(textdiff.text) ? textdiff.old_text : textdiff.text, identityHashMap, i10, z10, iArr);
            } else {
                boolean z11 = richText instanceof TL_iv.textPlain;
                if (!z11 && !(richText instanceof TL_iv.textMath) && !(richText instanceof TL_iv.textCustomEmoji) && !(richText instanceof TL_iv.textButton)) {
                    return flatToFormatted(richText.text, identityHashMap, i10, z10, iArr);
                }
                int flatLength = flatLength(richText);
                int i12 = iArr[0];
                int i13 = i10 - i12;
                iArr[0] = i12 + flatLength;
                if (iArr2 != null && (!z10 ? i13 < flatLength : i13 <= flatLength)) {
                    if (z11) {
                        int i14 = iArr2[1];
                        int i15 = iArr2[0];
                        if (i14 - i15 == flatLength) {
                            return Math.max(0, i13) + i15;
                        }
                    }
                    return (!z10 || i13 <= 0) ? iArr2[0] : iArr2[1];
                }
            }
        }
        return -1;
    }
}
