package org.commonmark.internal;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.Heading;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

public class HeadingParser extends AbstractBlockParser {
    private final Heading block;
    private final String content;

    public HeadingParser(int i, String str) {
        Heading heading = new Heading();
        this.block = heading;
        heading.setLevel(i);
        this.content = str;
    }

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        return BlockContinue.none();
    }

    @Override
    public void parseInlines(InlineParser inlineParser) {
        inlineParser.parse(this.content, this.block);
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            CharSequence paragraphContent;
            if (parserState.getIndent() >= Parsing.CODE_BLOCK_INDENT) {
                return BlockStart.none();
            }
            CharSequence line = parserState.getLine();
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            HeadingParser atxHeading = HeadingParser.getAtxHeading(line, nextNonSpaceIndex);
            if (atxHeading != null) {
                return BlockStart.of(atxHeading).atIndex(line.length());
            }
            int setextHeadingLevel = HeadingParser.getSetextHeadingLevel(line, nextNonSpaceIndex);
            if (setextHeadingLevel > 0 && (paragraphContent = matchedBlockParser.getParagraphContent()) != null) {
                return BlockStart.of(new HeadingParser(setextHeadingLevel, paragraphContent.toString())).atIndex(line.length()).replaceActiveBlockParser();
            }
            return BlockStart.none();
        }
    }

    public static HeadingParser getAtxHeading(CharSequence charSequence, int i) {
        int iSkip = Parsing.skip('#', charSequence, i, charSequence.length()) - i;
        if (iSkip == 0 || iSkip > 6) {
            return null;
        }
        int i2 = i + iSkip;
        if (i2 >= charSequence.length()) {
            return new HeadingParser(iSkip, "");
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iSkipSpaceTabBackwards = Parsing.skipSpaceTabBackwards(charSequence, charSequence.length() - 1, i2);
        int iSkipBackwards = Parsing.skipBackwards('#', charSequence, iSkipSpaceTabBackwards, i2);
        int iSkipSpaceTabBackwards2 = Parsing.skipSpaceTabBackwards(charSequence, iSkipBackwards, i2);
        if (iSkipSpaceTabBackwards2 != iSkipBackwards) {
            return new HeadingParser(iSkip, charSequence.subSequence(i2, iSkipSpaceTabBackwards2 + 1).toString());
        }
        return new HeadingParser(iSkip, charSequence.subSequence(i2, iSkipSpaceTabBackwards + 1).toString());
    }

    public static int getSetextHeadingLevel(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (isSetextHeadingRest(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return isSetextHeadingRest(charSequence, i + 1, '-') ? 2 : 0;
    }

    private static boolean isSetextHeadingRest(CharSequence charSequence, int i, char c) {
        return Parsing.skipSpaceTab(charSequence, Parsing.skip(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }
}
