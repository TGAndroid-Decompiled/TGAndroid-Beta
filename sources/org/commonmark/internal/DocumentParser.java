package org.commonmark.internal;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.FencedCodeBlockParser;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.HtmlBlockParser;
import org.commonmark.internal.IndentedCodeBlockParser;
import org.commonmark.internal.ListBlockParser;
import org.commonmark.internal.ThematicBreakParser;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.Document;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockParserFactory;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

public class DocumentParser implements ParserState {
    private static final Set CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
    private static final Map NODES_TO_CORE_FACTORIES;
    private boolean blank;
    private final List blockParserFactories;
    private boolean columnIsInTab;
    private final List delimiterProcessors;
    private final DocumentBlockParser documentBlockParser;
    private final InlineParserFactory inlineParserFactory;
    private CharSequence line;
    private int index = 0;
    private int column = 0;
    private int nextNonSpace = 0;
    private int nextNonSpaceColumn = 0;
    private int indent = 0;
    private final Map definitions = new LinkedHashMap();
    private List activeBlockParsers = new ArrayList();
    private Set allBlockParsers = new LinkedHashSet();

    static {
        HashMap map = new HashMap();
        map.put(BlockQuote.class, new BlockQuoteParser.Factory());
        map.put(Heading.class, new HeadingParser.Factory());
        map.put(FencedCodeBlock.class, new FencedCodeBlockParser.Factory());
        map.put(HtmlBlock.class, new HtmlBlockParser.Factory());
        map.put(ThematicBreak.class, new ThematicBreakParser.Factory());
        map.put(ListBlock.class, new ListBlockParser.Factory());
        map.put(IndentedCodeBlock.class, new IndentedCodeBlockParser.Factory());
        NODES_TO_CORE_FACTORIES = DesugarCollections.unmodifiableMap(map);
    }

    public DocumentParser(List list, InlineParserFactory inlineParserFactory, List list2) {
        this.blockParserFactories = list;
        this.inlineParserFactory = inlineParserFactory;
        this.delimiterProcessors = list2;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser();
        this.documentBlockParser = documentBlockParser;
        activateBlockParser(documentBlockParser);
    }

    public static Set getDefaultBlockParserTypes() {
        return CORE_FACTORY_TYPES;
    }

    public static List calculateBlockParserFactories(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(NODES_TO_CORE_FACTORIES.get((Class) it.next()));
        }
        return arrayList;
    }

    public Document parse(String str) {
        int i = 0;
        while (true) {
            int iFindLineBreak = Parsing.findLineBreak(str, i);
            if (iFindLineBreak == -1) {
                break;
            }
            incorporateLine(str.substring(i, iFindLineBreak));
            i = iFindLineBreak + 1;
            if (i < str.length() && str.charAt(iFindLineBreak) == '\r' && str.charAt(i) == '\n') {
                i = iFindLineBreak + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            incorporateLine(str.substring(i));
        }
        return finalizeAndProcess();
    }

    @Override
    public CharSequence getLine() {
        return this.line;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public int getIndent() {
        return this.indent;
    }

    @Override
    public boolean isBlank() {
        return this.blank;
    }

    @Override
    public BlockParser getActiveBlockParser() {
        return (BlockParser) this.activeBlockParsers.get(r0.size() - 1);
    }

    private void incorporateLine(java.lang.CharSequence r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.DocumentParser.incorporateLine(java.lang.CharSequence):void");
    }

    private void findNextNonSpace() {
        int i = this.index;
        int i2 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (true) {
            if (i >= length) {
                break;
            }
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

    private void setNewIndex(int i) {
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

    private void setNewColumn(int i) {
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
        if (i2 > i) {
            this.index--;
            this.column = i;
            this.columnIsInTab = true;
            return;
        }
        this.columnIsInTab = false;
    }

    private void advance() {
        if (this.line.charAt(this.index) == '\t') {
            this.index++;
            int i = this.column;
            this.column = i + Parsing.columnsToNextTabStop(i);
        } else {
            this.index++;
            this.column++;
        }
    }

    private void addLine() {
        CharSequence charSequenceSubSequence;
        if (this.columnIsInTab) {
            int i = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int iColumnsToNextTabStop = Parsing.columnsToNextTabStop(this.column);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + iColumnsToNextTabStop);
            for (int i2 = 0; i2 < iColumnsToNextTabStop; i2++) {
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

    private BlockStartImpl findBlockStart(BlockParser blockParser) {
        MatchedBlockParserImpl matchedBlockParserImpl = new MatchedBlockParserImpl(blockParser);
        Iterator it = this.blockParserFactories.iterator();
        while (it.hasNext()) {
            BlockStart blockStartTryStart = ((BlockParserFactory) it.next()).tryStart(this, matchedBlockParserImpl);
            if (blockStartTryStart instanceof BlockStartImpl) {
                return (BlockStartImpl) blockStartTryStart;
            }
        }
        return null;
    }

    private void finalize(BlockParser blockParser) {
        if (getActiveBlockParser() == blockParser) {
            deactivateBlockParser();
        }
        if (blockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) blockParser);
        }
        blockParser.closeBlock();
    }

    private void addDefinitionsFrom(ParagraphParser paragraphParser) {
        for (LinkReferenceDefinition linkReferenceDefinition : paragraphParser.getDefinitions()) {
            paragraphParser.getBlock().insertBefore(linkReferenceDefinition);
            String label = linkReferenceDefinition.getLabel();
            if (!this.definitions.containsKey(label)) {
                this.definitions.put(label, linkReferenceDefinition);
            }
        }
    }

    private void processInlines() {
        InlineParser inlineParserCreate = this.inlineParserFactory.create(new InlineParserContextImpl(this.delimiterProcessors, this.definitions));
        Iterator it = this.allBlockParsers.iterator();
        while (it.hasNext()) {
            ((BlockParser) it.next()).parseInlines(inlineParserCreate);
        }
    }

    private BlockParser addChild(BlockParser blockParser) {
        while (!getActiveBlockParser().canContain(blockParser.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(blockParser.getBlock());
        activateBlockParser(blockParser);
        return blockParser;
    }

    private void activateBlockParser(BlockParser blockParser) {
        this.activeBlockParsers.add(blockParser);
        this.allBlockParsers.add(blockParser);
    }

    private void deactivateBlockParser() {
        this.activeBlockParsers.remove(r0.size() - 1);
    }

    private void prepareActiveBlockParserForReplacement() {
        BlockParser activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        this.allBlockParsers.remove(activeBlockParser);
        if (activeBlockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) activeBlockParser);
        }
        activeBlockParser.getBlock().unlink();
    }

    private void finalizeBlocks(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize((BlockParser) list.get(size));
        }
    }

    private Document finalizeAndProcess() {
        finalizeBlocks(this.activeBlockParsers);
        processInlines();
        return this.documentBlockParser.getBlock();
    }

    private static class MatchedBlockParserImpl implements MatchedBlockParser {
        private final BlockParser matchedBlockParser;

        public MatchedBlockParserImpl(BlockParser blockParser) {
            this.matchedBlockParser = blockParser;
        }

        @Override
        public BlockParser getMatchedBlockParser() {
            return this.matchedBlockParser;
        }

        @Override
        public CharSequence getParagraphContent() {
            BlockParser blockParser = this.matchedBlockParser;
            if (!(blockParser instanceof ParagraphParser)) {
                return null;
            }
            CharSequence contentString = ((ParagraphParser) blockParser).getContentString();
            if (contentString.length() == 0) {
                return null;
            }
            return contentString;
        }
    }
}
