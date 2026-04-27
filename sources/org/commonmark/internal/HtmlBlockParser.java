package org.commonmark.internal;

import java.util.regex.Pattern;
import org.commonmark.node.Block;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

public class HtmlBlockParser extends AbstractBlockParser {
    private static final Pattern[][] BLOCK_PATTERNS = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final HtmlBlock block;
    private final Pattern closingPattern;
    private BlockContent content;
    private boolean finished;

    private HtmlBlockParser(Pattern pattern) {
        this.block = new HtmlBlock();
        this.finished = false;
        this.content = new BlockContent();
        this.closingPattern = pattern;
    }

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        if (this.finished) {
            return BlockContinue.none();
        }
        if (parserState.isBlank() && this.closingPattern == null) {
            return BlockContinue.none();
        }
        return BlockContinue.atIndex(parserState.getIndex());
    }

    @Override
    public void addLine(CharSequence charSequence) {
        this.content.add(charSequence);
        Pattern pattern = this.closingPattern;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.finished = true;
    }

    @Override
    public void closeBlock() {
        this.block.setLiteral(this.content.getString());
        this.content = null;
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            CharSequence line = parserState.getLine();
            if (parserState.getIndent() < 4 && line.charAt(nextNonSpaceIndex) == '<') {
                for (int i = 1; i <= 7; i++) {
                    if (i != 7 || !(matchedBlockParser.getMatchedBlockParser().getBlock() instanceof Paragraph)) {
                        Pattern pattern = HtmlBlockParser.BLOCK_PATTERNS[i][0];
                        Pattern pattern2 = HtmlBlockParser.BLOCK_PATTERNS[i][1];
                        if (pattern.matcher(line.subSequence(nextNonSpaceIndex, line.length())).find()) {
                            return BlockStart.of(new HtmlBlockParser(pattern2)).atIndex(parserState.getIndex());
                        }
                    }
                }
            }
            return BlockStart.none();
        }
    }
}
