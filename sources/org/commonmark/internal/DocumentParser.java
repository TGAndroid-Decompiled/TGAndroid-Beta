package org.commonmark.internal;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.stripe.android.Stripe;
import io.noties.markwon.ext.latex.JLatexMathBlockParser;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Pattern;
import org.commonmark.ext.gfm.tables.TableCell;
import org.commonmark.ext.gfm.tables.internal.TableBlockParser;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListBlock;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.block.AbstractBlockParser;

public final class DocumentParser {
    public static final LinkedHashSet CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
    public static final Map NODES_TO_CORE_FACTORIES;
    public boolean blank;
    public final ArrayList blockParserFactories;
    public boolean columnIsInTab;
    public final ArrayList delimiterProcessors;
    public final DocumentBlockParser documentBlockParser;
    public final InlineParserFactory inlineParserFactory;
    public CharSequence line;
    public int index = 0;
    public int column = 0;
    public int nextNonSpace = 0;
    public int nextNonSpaceColumn = 0;
    public int indent = 0;
    public final LinkedHashMap definitions = new LinkedHashMap();
    public final ArrayList activeBlockParsers = new ArrayList();
    public final LinkedHashSet allBlockParsers = new LinkedHashSet();

    static {
        HashMap map = new HashMap();
        map.put(BlockQuote.class, new HeadingParser.Factory(3));
        map.put(Heading.class, new HeadingParser.Factory(0));
        map.put(FencedCodeBlock.class, new HeadingParser.Factory(4));
        map.put(HtmlBlock.class, new HeadingParser.Factory(5));
        map.put(ThematicBreak.class, new HeadingParser.Factory(8));
        map.put(ListBlock.class, new HeadingParser.Factory(7));
        map.put(IndentedCodeBlock.class, new HeadingParser.Factory(6));
        NODES_TO_CORE_FACTORIES = DesugarCollections.unmodifiableMap(map);
    }

    public DocumentParser(ArrayList arrayList, InlineParserFactory inlineParserFactory, ArrayList arrayList2) {
        this.blockParserFactories = arrayList;
        this.inlineParserFactory = inlineParserFactory;
        this.delimiterProcessors = arrayList2;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser(0);
        this.documentBlockParser = documentBlockParser;
        this.activeBlockParsers.add(documentBlockParser);
        this.allBlockParsers.add(documentBlockParser);
    }

    public final void addChild(AbstractBlockParser abstractBlockParser) {
        while (!getActiveBlockParser().canContain(abstractBlockParser.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(abstractBlockParser.getBlock());
        this.activeBlockParsers.add(abstractBlockParser);
        this.allBlockParsers.add(abstractBlockParser);
    }

    public final void addDefinitionsFrom(ParagraphParser paragraphParser) {
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = paragraphParser.linkReferenceDefinitionParser;
        linkReferenceDefinitionParser.finishReference();
        ArrayList arrayList = linkReferenceDefinitionParser.definitions;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) obj;
            Paragraph paragraph = paragraphParser.block;
            linkReferenceDefinition.unlink();
            Node node = (Node) paragraph.prev;
            linkReferenceDefinition.prev = node;
            if (node != null) {
                node.next = linkReferenceDefinition;
            }
            linkReferenceDefinition.next = paragraph;
            paragraph.prev = linkReferenceDefinition;
            Node node2 = (Node) paragraph.parent;
            linkReferenceDefinition.parent = node2;
            if (((Node) linkReferenceDefinition.prev) == null) {
                node2.firstChild = linkReferenceDefinition;
            }
            LinkedHashMap linkedHashMap = this.definitions;
            String str = linkReferenceDefinition.label;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, linkReferenceDefinition);
            }
        }
    }

    public final void addLine() {
        CharSequence charSequenceSubSequence;
        if (this.columnIsInTab) {
            int i = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.column % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.line;
            charSequenceSubSequence = charSequence2.subSequence(this.index, charSequence2.length());
        }
        getActiveBlockParser().addLine(charSequenceSubSequence);
    }

    public final void advance() {
        if (this.line.charAt(this.index) != '\t') {
            this.index++;
            this.column++;
        } else {
            this.index++;
            int i = this.column;
            this.column = (4 - (i % 4)) + i;
        }
    }

    public final void finalize(AbstractBlockParser abstractBlockParser) {
        if (getActiveBlockParser() == abstractBlockParser) {
            SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, this.activeBlockParsers);
        }
        if (abstractBlockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) abstractBlockParser);
        }
        abstractBlockParser.closeBlock();
    }

    public final void finalizeBlocks(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            finalize((AbstractBlockParser) arrayList.get(size));
        }
    }

    public final void findNextNonSpace() {
        int i = this.index;
        int i2 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (i < length) {
            char cCharAt = this.line.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.blank = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.nextNonSpace = i;
        this.nextNonSpaceColumn = i2;
        this.indent = i2 - this.column;
    }

    public final AbstractBlockParser getActiveBlockParser() {
        return (AbstractBlockParser) SurfaceContainer$$ExternalSyntheticOutline0.m(1, this.activeBlockParsers);
    }

    public final void incorporateLine(String str) {
        AbstractBlockParser abstractBlockParser;
        char c;
        BlockStartImpl blockStartImpl;
        int i;
        int i2;
        HeadingParser headingParser;
        int i3;
        StringBuilder paragraphContent;
        char c2;
        int i4;
        int i5;
        StringBuilder sb;
        BlockStartImpl blockStartImpl2;
        boolean z;
        boolean z2;
        TableCell.Alignment alignment;
        char cCharAt;
        int i6;
        FencedCodeBlockParser fencedCodeBlockParser;
        char c3;
        int i7;
        int i8;
        ListBlockParser.ListData listData;
        char cCharAt2;
        ListBlockParser.ListData listData2;
        boolean z3;
        int i9;
        String string = str;
        ArrayList arrayList = this.activeBlockParsers;
        char c4 = '\t';
        char c5 = ' ';
        int i10 = 4;
        int length = string.length();
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt3 = string.charAt(i11);
            if (cCharAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) string, 0, i11);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt3);
            }
        }
        if (sb2 != null) {
            string = sb2.toString();
        }
        this.line = string;
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        int i12 = 1;
        for (AbstractBlockParser abstractBlockParser2 : arrayList.subList(1, arrayList.size())) {
            findNextNonSpace();
            BlockContinueImpl blockContinueImplTryContinue = abstractBlockParser2.tryContinue(this);
            if (blockContinueImplTryContinue == null) {
                break;
            }
            if (blockContinueImplTryContinue.finalize) {
                finalize(abstractBlockParser2);
                return;
            }
            int i13 = blockContinueImplTryContinue.newIndex;
            if (i13 != -1) {
                setNewIndex(i13);
            } else {
                int i14 = blockContinueImplTryContinue.newColumn;
                if (i14 != -1) {
                    setNewColumn(i14);
                }
            }
            i12++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i12, arrayList.size()));
        AbstractBlockParser abstractBlockParser3 = (AbstractBlockParser) arrayList.get(i12 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zIsContainer = (abstractBlockParser3.getBlock() instanceof Paragraph) || abstractBlockParser3.isContainer();
        while (true) {
            if (zIsContainer) {
                findNextNonSpace();
                if (!this.blank) {
                    if (this.indent < i10) {
                        c = 0;
                        if (Character.isLetter(Character.codePointAt(this.line, this.nextNonSpace))) {
                        }
                    } else {
                        c = 0;
                    }
                    Stripe.AnonymousClass1 anonymousClass1 = new Stripe.AnonymousClass1(abstractBlockParser3, 16);
                    ArrayList arrayList3 = this.blockParserFactories;
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            Object obj = arrayList3.get(i15);
                            i15++;
                            switch (((HeadingParser.Factory) obj).$r8$classId) {
                                case 0:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    if (this.indent < 4) {
                                        CharSequence charSequence = this.line;
                                        int i16 = this.nextNonSpace;
                                        int iSkip = Parsing.skip('#', charSequence, i16, charSequence.length()) - i16;
                                        if (iSkip == 0 || iSkip > 6) {
                                            i2 = 1;
                                            headingParser = null;
                                        } else {
                                            int i17 = i16 + iSkip;
                                            if (i17 >= charSequence.length()) {
                                                headingParser = new HeadingParser(iSkip, "");
                                                i2 = 1;
                                            } else {
                                                char cCharAt4 = charSequence.charAt(i17);
                                                if (cCharAt4 != ' ') {
                                                    c2 = '\t';
                                                    if (cCharAt4 != '\t') {
                                                        i2 = 1;
                                                        headingParser = null;
                                                    }
                                                } else {
                                                    c2 = '\t';
                                                }
                                                int length2 = charSequence.length() - 1;
                                                while (true) {
                                                    if (length2 < i17) {
                                                        length2 = i17 - 1;
                                                    } else {
                                                        char cCharAt5 = charSequence.charAt(length2);
                                                        if (cCharAt5 == c2 || cCharAt5 == ' ') {
                                                            length2--;
                                                            c2 = '\t';
                                                        }
                                                    }
                                                }
                                                int i18 = length2;
                                                while (true) {
                                                    if (i18 < i17) {
                                                        i18 = i17 - 1;
                                                    } else if (charSequence.charAt(i18) == '#') {
                                                        i18--;
                                                    }
                                                }
                                                int i19 = i18;
                                                while (true) {
                                                    if (i19 >= i17) {
                                                        char cCharAt6 = charSequence.charAt(i19);
                                                        int i20 = i19;
                                                        if (cCharAt6 != '\t' && cCharAt6 != ' ') {
                                                            i4 = i20;
                                                            i2 = 1;
                                                        }
                                                        i19 = i20 - 1;
                                                    } else {
                                                        i2 = 1;
                                                        i4 = i17 - 1;
                                                    }
                                                }
                                                headingParser = i4 != i18 ? new HeadingParser(iSkip, charSequence.subSequence(i17, i4 + i2).toString()) : new HeadingParser(iSkip, charSequence.subSequence(i17, length2 + i2).toString());
                                            }
                                        }
                                        if (headingParser != null) {
                                            AbstractBlockParser[] abstractBlockParserArr = new AbstractBlockParser[i2];
                                            abstractBlockParserArr[c] = headingParser;
                                            BlockStartImpl blockStartImpl3 = new BlockStartImpl(abstractBlockParserArr);
                                            blockStartImpl3.newIndex = charSequence.length();
                                            blockStartImpl = blockStartImpl3;
                                            break;
                                        } else {
                                            char cCharAt7 = charSequence.charAt(i16);
                                            if (cCharAt7 != '-') {
                                                if (cCharAt7 == '=') {
                                                    if (Parsing.skipSpaceTab(Parsing.skip('=', charSequence, i16 + 1, charSequence.length()), charSequence.length(), charSequence) >= charSequence.length()) {
                                                        i3 = 1;
                                                    }
                                                }
                                                if (i3 <= 0 && (paragraphContent = anonymousClass1.getParagraphContent()) != null) {
                                                    HeadingParser headingParser2 = new HeadingParser(i3, paragraphContent.toString());
                                                    AbstractBlockParser[] abstractBlockParserArr2 = new AbstractBlockParser[1];
                                                    abstractBlockParserArr2[c] = headingParser2;
                                                    BlockStartImpl blockStartImpl4 = new BlockStartImpl(abstractBlockParserArr2);
                                                    blockStartImpl4.newIndex = charSequence.length();
                                                    blockStartImpl4.replaceActiveBlockParser = true;
                                                    blockStartImpl = blockStartImpl4;
                                                    break;
                                                }
                                            }
                                            i3 = Parsing.skipSpaceTab(Parsing.skip('-', charSequence, i16 + 1, charSequence.length()), charSequence.length(), charSequence) >= charSequence.length() ? 2 : 0;
                                            if (i3 <= 0) {
                                            }
                                        }
                                    }
                                    blockStartImpl = null;
                                    break;
                                case 1:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    if (this.indent < 4) {
                                        int i21 = this.nextNonSpace;
                                        CharSequence charSequence2 = this.line;
                                        int length3 = charSequence2.length();
                                        int i22 = i21;
                                        while (true) {
                                            if (i22 >= length3) {
                                                i5 = length3 - i21;
                                            } else if ('$' != charSequence2.charAt(i22)) {
                                                i5 = i22 - i21;
                                            } else {
                                                i22++;
                                            }
                                        }
                                        if (i5 >= 2 && Parsing.skip(' ', charSequence2, i21 + i5, length3) == length3) {
                                            AbstractBlockParser[] abstractBlockParserArr3 = new AbstractBlockParser[1];
                                            abstractBlockParserArr3[c] = new JLatexMathBlockParser(i5);
                                            blockStartImpl = new BlockStartImpl(abstractBlockParserArr3);
                                            blockStartImpl.newIndex = length3 + 1;
                                        }
                                        break;
                                    }
                                    blockStartImpl = null;
                                    break;
                                case 2:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    CharSequence charSequence3 = this.line;
                                    StringBuilder paragraphContent2 = anonymousClass1.getParagraphContent();
                                    if (paragraphContent2 != null && paragraphContent2.toString().contains("|") && !paragraphContent2.toString().contains("\n")) {
                                        CharSequence charSequenceSubSequence = charSequence3.subSequence(this.index, charSequence3.length());
                                        ArrayList arrayList4 = new ArrayList();
                                        boolean z4 = false;
                                        int i23 = 0;
                                        int i24 = 0;
                                        while (true) {
                                            if (i23 < charSequenceSubSequence.length()) {
                                                char cCharAt8 = charSequenceSubSequence.charAt(i23);
                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                    sb = paragraphContent2;
                                                    i23++;
                                                } else {
                                                    sb = paragraphContent2;
                                                    if (cCharAt8 == '-' || cCharAt8 == ':') {
                                                        if (i24 != 0 || arrayList4.isEmpty()) {
                                                            if (cCharAt8 == ':') {
                                                                i23++;
                                                                z = true;
                                                            } else {
                                                                z = false;
                                                            }
                                                            boolean z5 = false;
                                                            while (i23 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i23) == '-') {
                                                                i23++;
                                                                z5 = true;
                                                            }
                                                            if (z5) {
                                                                if (i23 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i23) != ':') {
                                                                    z2 = false;
                                                                } else {
                                                                    i23++;
                                                                    z2 = true;
                                                                }
                                                                if (z && z2) {
                                                                    alignment = TableCell.Alignment.CENTER;
                                                                } else if (z) {
                                                                    alignment = TableCell.Alignment.LEFT;
                                                                } else {
                                                                    alignment = z2 ? TableCell.Alignment.RIGHT : null;
                                                                }
                                                                arrayList4.add(alignment);
                                                                i24 = 0;
                                                            }
                                                        }
                                                    } else if (cCharAt8 == '|') {
                                                        i23++;
                                                        i24++;
                                                        if (i24 <= 1) {
                                                            z4 = true;
                                                        }
                                                    }
                                                }
                                                paragraphContent2 = sb;
                                            } else {
                                                sb = paragraphContent2;
                                                if (!z4) {
                                                }
                                            }
                                            arrayList4 = null;
                                        }
                                        if (arrayList4 != null && !arrayList4.isEmpty()) {
                                            ArrayList arrayListSplit = TableBlockParser.split(sb);
                                            if (arrayList4.size() >= arrayListSplit.size()) {
                                                TableBlockParser tableBlockParser = new TableBlockParser(arrayList4, arrayListSplit);
                                                AbstractBlockParser[] abstractBlockParserArr4 = new AbstractBlockParser[1];
                                                abstractBlockParserArr4[c] = tableBlockParser;
                                                blockStartImpl2 = new BlockStartImpl(abstractBlockParserArr4);
                                                blockStartImpl2.newIndex = this.index;
                                                blockStartImpl2.replaceActiveBlockParser = true;
                                                blockStartImpl = blockStartImpl2;
                                            }
                                        }
                                    }
                                    blockStartImpl = null;
                                    break;
                                case 3:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    int i25 = this.nextNonSpace;
                                    if (BlockQuoteParser.isMarker(this, i25)) {
                                        int i26 = this.column + this.indent;
                                        int i27 = i26 + 1;
                                        CharSequence charSequence4 = this.line;
                                        int i28 = i25 + 1;
                                        if (i28 < charSequence4.length() && ((cCharAt = charSequence4.charAt(i28)) == '\t' || cCharAt == ' ')) {
                                            i27 = i26 + 2;
                                        }
                                        AbstractBlockParser[] abstractBlockParserArr5 = new AbstractBlockParser[1];
                                        abstractBlockParserArr5[c] = new BlockQuoteParser();
                                        blockStartImpl = new BlockStartImpl(abstractBlockParserArr5);
                                        blockStartImpl.newColumn = i27;
                                    } else {
                                        blockStartImpl = null;
                                    }
                                    break;
                                case 4:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    int i29 = this.indent;
                                    if (i29 < 4) {
                                        int i30 = this.nextNonSpace;
                                        CharSequence charSequence5 = this.line;
                                        int length4 = charSequence5.length();
                                        int i31 = i30;
                                        int i32 = 0;
                                        int i33 = 0;
                                        while (true) {
                                            i6 = i30;
                                            if (i31 < length4) {
                                                char cCharAt9 = charSequence5.charAt(i31);
                                                if (cCharAt9 == '`') {
                                                    i32++;
                                                } else if (cCharAt9 == '~') {
                                                    i33++;
                                                }
                                                i31++;
                                                i30 = i6;
                                            }
                                        }
                                        int i34 = 3;
                                        if (i32 < 3) {
                                            if (i33 >= i34 || i32 != 0) {
                                                fencedCodeBlockParser = null;
                                            } else {
                                                fencedCodeBlockParser = new FencedCodeBlockParser('~', i33, i29);
                                            }
                                        } else if (i33 == 0) {
                                            int i35 = i6 + i32;
                                            int length5 = charSequence5.length();
                                            while (true) {
                                                if (i35 < length5) {
                                                    c3 = '`';
                                                    if (charSequence5.charAt(i35) != '`') {
                                                        i35++;
                                                    }
                                                } else {
                                                    c3 = '`';
                                                    i35 = -1;
                                                }
                                            }
                                            if (i35 != -1) {
                                                fencedCodeBlockParser = null;
                                            } else {
                                                fencedCodeBlockParser = new FencedCodeBlockParser(c3, i32, i29);
                                            }
                                        } else {
                                            i34 = 3;
                                            if (i33 >= i34) {
                                                fencedCodeBlockParser = null;
                                            } else {
                                                fencedCodeBlockParser = null;
                                            }
                                        }
                                        if (fencedCodeBlockParser != null) {
                                            AbstractBlockParser[] abstractBlockParserArr6 = new AbstractBlockParser[1];
                                            abstractBlockParserArr6[c] = fencedCodeBlockParser;
                                            BlockStartImpl blockStartImpl5 = new BlockStartImpl(abstractBlockParserArr6);
                                            blockStartImpl5.newIndex = i6 + fencedCodeBlockParser.block.fenceLength;
                                            blockStartImpl = blockStartImpl5;
                                        }
                                        break;
                                    }
                                    blockStartImpl = null;
                                    break;
                                case 5:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    int i36 = this.nextNonSpace;
                                    CharSequence charSequence6 = this.line;
                                    if (this.indent >= 4 || charSequence6.charAt(i36) != '<') {
                                        blockStartImpl = null;
                                    } else {
                                        int i37 = 1;
                                        while (true) {
                                            if (i37 <= 7) {
                                                if (i37 == 7 && (((AbstractBlockParser) anonymousClass1.this$0).getBlock() instanceof Paragraph)) {
                                                    i7 = 1;
                                                } else {
                                                    Pattern[] patternArr = HtmlBlockParser.BLOCK_PATTERNS[i37];
                                                    Pattern pattern = patternArr[c];
                                                    i7 = 1;
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence6.subSequence(i36, charSequence6.length())).find()) {
                                                        AbstractBlockParser[] abstractBlockParserArr7 = new AbstractBlockParser[1];
                                                        abstractBlockParserArr7[c] = new HtmlBlockParser(pattern2);
                                                        blockStartImpl = new BlockStartImpl(abstractBlockParserArr7);
                                                        blockStartImpl.newIndex = this.index;
                                                    }
                                                }
                                                i37 += i7;
                                            } else {
                                                blockStartImpl = null;
                                            }
                                        }
                                    }
                                    break;
                                case 6:
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    if (this.indent < 4 || this.blank || (getActiveBlockParser().getBlock() instanceof Paragraph)) {
                                        blockStartImpl = null;
                                    } else {
                                        AbstractBlockParser[] abstractBlockParserArr8 = new AbstractBlockParser[1];
                                        abstractBlockParserArr8[c] = new HeadingParser();
                                        blockStartImpl = new BlockStartImpl(abstractBlockParserArr8);
                                        blockStartImpl.newColumn = this.column + 4;
                                    }
                                    break;
                                case 7:
                                    AbstractBlockParser abstractBlockParser4 = (AbstractBlockParser) anonymousClass1.this$0;
                                    int i38 = this.indent;
                                    if (i38 < 4) {
                                        int i39 = this.nextNonSpace;
                                        int i40 = this.column + i38;
                                        boolean z6 = anonymousClass1.getParagraphContent() != null;
                                        CharSequence charSequence7 = this.line;
                                        char cCharAt10 = charSequence7.charAt(i39);
                                        boolean z7 = z6;
                                        if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                            abstractBlockParser = abstractBlockParser3;
                                            i8 = i40;
                                            i = size;
                                            int i41 = i39 + 1;
                                            if (i41 >= charSequence7.length() || (cCharAt2 = charSequence7.charAt(i41)) == '\t' || cCharAt2 == ' ') {
                                                BulletList bulletList = new BulletList();
                                                bulletList.bulletMarker = cCharAt10;
                                                listData = new ListBlockParser.ListData(bulletList, i41);
                                            } else {
                                                listData = null;
                                            }
                                        } else {
                                            int length6 = charSequence7.length();
                                            abstractBlockParser = abstractBlockParser3;
                                            int i42 = i39;
                                            int i43 = 0;
                                            while (true) {
                                                if (i42 < length6) {
                                                    int i44 = length6;
                                                    char cCharAt11 = charSequence7.charAt(i42);
                                                    i8 = i40;
                                                    if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                        switch (cCharAt11) {
                                                            case '0':
                                                            case '1':
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                            case '9':
                                                                i43++;
                                                                if (i43 <= 9) {
                                                                    i42++;
                                                                    length6 = i44;
                                                                    i40 = i8;
                                                                }
                                                                break;
                                                            default:
                                                                break;
                                                        }
                                                    } else {
                                                        if (i43 >= 1) {
                                                            int i45 = i42 + 1;
                                                            if (i45 < charSequence7.length()) {
                                                                char cCharAt12 = charSequence7.charAt(i45);
                                                                i = size;
                                                                if (cCharAt12 == '\t' || cCharAt12 == ' ') {
                                                                }
                                                            } else {
                                                                i = size;
                                                            }
                                                            String string2 = charSequence7.subSequence(i39, i42).toString();
                                                            OrderedList orderedList = new OrderedList();
                                                            orderedList.startNumber = Integer.parseInt(string2);
                                                            orderedList.delimiter = cCharAt11;
                                                            listData = new ListBlockParser.ListData(orderedList, i45);
                                                        }
                                                        listData = null;
                                                    }
                                                } else {
                                                    i8 = i40;
                                                }
                                                i = size;
                                                listData = null;
                                            }
                                        }
                                        if (listData == null) {
                                            listData2 = null;
                                        } else {
                                            int i46 = listData.contentColumn;
                                            int i47 = (i46 - i39) + i8;
                                            int length7 = charSequence7.length();
                                            int i48 = i47;
                                            while (true) {
                                                if (i46 < length7) {
                                                    char cCharAt13 = charSequence7.charAt(i46);
                                                    int i49 = i46;
                                                    if (cCharAt13 == '\t') {
                                                        i48 = (4 - (i48 % 4)) + i48;
                                                    } else if (cCharAt13 == ' ') {
                                                        i48++;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    i46 = i49 + 1;
                                                } else {
                                                    z3 = false;
                                                }
                                            }
                                            ListBlock listBlock = listData.listBlock;
                                            if (!z7 || ((!(listBlock instanceof OrderedList) || ((OrderedList) listBlock).startNumber == 1) && z3)) {
                                                if (!z3 || i48 - i47 > 4) {
                                                    i48 = i47 + 1;
                                                }
                                                listData2 = new ListBlockParser.ListData(listBlock, i48);
                                            } else {
                                                listData2 = null;
                                            }
                                        }
                                        if (listData2 != null) {
                                            int i50 = this.column;
                                            int i51 = listData2.contentColumn;
                                            ListItemParser listItemParser = new ListItemParser(i51 - i50);
                                            boolean z8 = abstractBlockParser4 instanceof ListBlockParser;
                                            ListBlock listBlock2 = listData2.listBlock;
                                            if (z8) {
                                                ListBlock listBlock3 = ((ListBlockParser) abstractBlockParser4).block;
                                                if (((listBlock3 instanceof BulletList) && (listBlock2 instanceof BulletList)) ? Character.valueOf(((BulletList) listBlock3).bulletMarker).equals(Character.valueOf(((BulletList) listBlock2).bulletMarker)) : ((listBlock3 instanceof OrderedList) && (listBlock2 instanceof OrderedList)) ? Character.valueOf(((OrderedList) listBlock3).delimiter).equals(Character.valueOf(((OrderedList) listBlock2).delimiter)) : false) {
                                                    AbstractBlockParser[] abstractBlockParserArr9 = new AbstractBlockParser[1];
                                                    abstractBlockParserArr9[c] = listItemParser;
                                                    blockStartImpl2 = new BlockStartImpl(abstractBlockParserArr9);
                                                    blockStartImpl2.newColumn = i51;
                                                    blockStartImpl = blockStartImpl2;
                                                }
                                            }
                                            AbstractBlockParser[] abstractBlockParserArr10 = new AbstractBlockParser[2];
                                            abstractBlockParserArr10[c] = new ListBlockParser(listBlock2);
                                            abstractBlockParserArr10[1] = listItemParser;
                                            blockStartImpl = new BlockStartImpl(abstractBlockParserArr10);
                                            blockStartImpl.newColumn = i51;
                                        }
                                    } else {
                                        abstractBlockParser = abstractBlockParser3;
                                        i = size;
                                    }
                                    blockStartImpl = null;
                                    break;
                                default:
                                    if (this.indent >= i10) {
                                        blockStartImpl = null;
                                    } else {
                                        int i52 = this.nextNonSpace;
                                        CharSequence charSequence8 = this.line;
                                        int length8 = charSequence8.length();
                                        int i53 = 0;
                                        int i54 = 0;
                                        int i55 = 0;
                                        while (true) {
                                            if (i52 >= length8) {
                                                int i56 = i53;
                                                int i57 = i54;
                                                int i58 = i55;
                                                if ((i56 >= 3 && i57 == 0 && i58 == 0) || ((i57 >= 3 && i56 == 0 && i58 == 0) || (i58 >= 3 && i56 == 0 && i57 == 0))) {
                                                    AbstractBlockParser[] abstractBlockParserArr11 = new AbstractBlockParser[1];
                                                    abstractBlockParserArr11[c] = new DocumentBlockParser(1);
                                                    blockStartImpl = new BlockStartImpl(abstractBlockParserArr11);
                                                    blockStartImpl.newIndex = charSequence8.length();
                                                }
                                            } else {
                                                char cCharAt14 = charSequence8.charAt(i52);
                                                if (cCharAt14 == c4 || cCharAt14 == c5) {
                                                    i9 = i54;
                                                    i55 = i55;
                                                    i53 = i53;
                                                } else if (cCharAt14 == '*') {
                                                    i9 = i54;
                                                    i55++;
                                                } else if (cCharAt14 == '-') {
                                                    i9 = i54;
                                                    i53++;
                                                } else if (cCharAt14 == '_') {
                                                    i9 = i54 + 1;
                                                }
                                                i52++;
                                                i54 = i9;
                                                c4 = '\t';
                                                c5 = ' ';
                                            }
                                            blockStartImpl = null;
                                        }
                                    }
                                    abstractBlockParser = abstractBlockParser3;
                                    i = size;
                                    break;
                            }
                            if (blockStartImpl == null) {
                                abstractBlockParser3 = abstractBlockParser;
                                size = i;
                                c4 = '\t';
                                c5 = ' ';
                                i10 = 4;
                            }
                        } else {
                            abstractBlockParser = abstractBlockParser3;
                            blockStartImpl = null;
                        }
                    }
                    if (blockStartImpl == null) {
                        setNewIndex(this.nextNonSpace);
                    } else {
                        if (!zIsEmpty) {
                            finalizeBlocks(arrayList2);
                            zIsEmpty = true;
                        }
                        int i59 = blockStartImpl.newIndex;
                        if (i59 != -1) {
                            setNewIndex(i59);
                        } else {
                            int i60 = blockStartImpl.newColumn;
                            if (i60 != -1) {
                                setNewColumn(i60);
                            }
                        }
                        if (blockStartImpl.replaceActiveBlockParser) {
                            AbstractBlockParser activeBlockParser = getActiveBlockParser();
                            SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList);
                            this.allBlockParsers.remove(activeBlockParser);
                            if (activeBlockParser instanceof ParagraphParser) {
                                addDefinitionsFrom((ParagraphParser) activeBlockParser);
                            }
                            activeBlockParser.getBlock().unlink();
                        }
                        AbstractBlockParser[] abstractBlockParserArr12 = (AbstractBlockParser[]) blockStartImpl.blockParsers;
                        int length9 = abstractBlockParserArr12.length;
                        int i61 = 0;
                        while (i61 < length9) {
                            AbstractBlockParser abstractBlockParser5 = abstractBlockParserArr12[i61];
                            addChild(abstractBlockParser5);
                            zIsContainer = abstractBlockParser5.isContainer();
                            i61++;
                            abstractBlockParser = abstractBlockParser5;
                        }
                        abstractBlockParser3 = abstractBlockParser;
                        c4 = '\t';
                        c5 = ' ';
                        i10 = 4;
                    }
                }
                abstractBlockParser = abstractBlockParser3;
                setNewIndex(this.nextNonSpace);
            } else {
                abstractBlockParser = abstractBlockParser3;
            }
            if (!zIsEmpty && !this.blank && getActiveBlockParser().canHaveLazyContinuationLines()) {
                addLine();
                return;
            }
            if (!zIsEmpty) {
                finalizeBlocks(arrayList2);
            }
            if (!abstractBlockParser.isContainer()) {
                addLine();
                return;
            } else {
                if (this.blank) {
                    return;
                }
                addChild(new ParagraphParser());
                addLine();
                return;
            }
        }
    }

    public final void setNewColumn(int i) {
        int i2;
        int i3 = this.nextNonSpaceColumn;
        if (i >= i3) {
            this.index = this.nextNonSpace;
            this.column = i3;
        }
        int length = this.line.length();
        while (true) {
            i2 = this.column;
            if (i2 >= i || this.index == length) {
                break;
            } else {
                advance();
            }
        }
        if (i2 <= i) {
            this.columnIsInTab = false;
            return;
        }
        this.index--;
        this.column = i;
        this.columnIsInTab = true;
    }

    public final void setNewIndex(int i) {
        int i2 = this.nextNonSpace;
        if (i >= i2) {
            this.index = i2;
            this.column = this.nextNonSpaceColumn;
        }
        int length = this.line.length();
        while (true) {
            int i3 = this.index;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }
}
