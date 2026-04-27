package io.noties.markwon.ext.latex;

import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

class JLatexMathBlockParser extends AbstractBlockParser {
    private final JLatexMathBlock block = new JLatexMathBlock();
    private final StringBuilder builder = new StringBuilder();
    private final int signs;

    JLatexMathBlockParser(int i) {
        this.signs = i;
    }

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
        CharSequence line = parserState.getLine();
        int length = line.length();
        if (parserState.getIndent() < Parsing.CODE_BLOCK_INDENT) {
            int iConsume = consume('$', line, nextNonSpaceIndex, length);
            int i = this.signs;
            if (iConsume == i && Parsing.skip(' ', line, nextNonSpaceIndex + i, length) == length) {
                return BlockContinue.finished();
            }
        }
        return BlockContinue.atIndex(parserState.getIndex());
    }

    @Override
    public void addLine(CharSequence charSequence) {
        this.builder.append(charSequence);
        this.builder.append('\n');
    }

    @Override
    public void closeBlock() {
        this.block.latex(this.builder.toString());
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            if (parserState.getIndent() >= Parsing.CODE_BLOCK_INDENT) {
                return BlockStart.none();
            }
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            CharSequence line = parserState.getLine();
            int length = line.length();
            int iConsume = JLatexMathBlockParser.consume('$', line, nextNonSpaceIndex, length);
            if (iConsume < 2) {
                return BlockStart.none();
            }
            if (Parsing.skip(' ', line, nextNonSpaceIndex + iConsume, length) != length) {
                return BlockStart.none();
            }
            return BlockStart.of(new JLatexMathBlockParser(iConsume)).atIndex(length + 1);
        }
    }

    public static int consume(char c, CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (c != charSequence.charAt(i3)) {
                return i3 - i;
            }
        }
        return i2 - i;
    }
}
