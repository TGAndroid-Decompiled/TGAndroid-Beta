package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

public class ThematicBreakParser extends AbstractBlockParser {
    private final ThematicBreak block = new ThematicBreak();

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        return BlockContinue.none();
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            if (parserState.getIndent() >= 4) {
                return BlockStart.none();
            }
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            CharSequence line = parserState.getLine();
            return ThematicBreakParser.isThematicBreak(line, nextNonSpaceIndex) ? BlockStart.of(new ThematicBreakParser()).atIndex(line.length()) : BlockStart.none();
        }
    }

    public static boolean isThematicBreak(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i4++;
                } else if (cCharAt == '-') {
                    i2++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
    }
}
