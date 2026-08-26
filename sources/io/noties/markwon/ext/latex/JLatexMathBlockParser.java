package io.noties.markwon.ext.latex;

import org.commonmark.internal.BlockContinueImpl;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.parser.block.AbstractBlockParser;

public final class JLatexMathBlockParser extends AbstractBlockParser {
    public final JLatexMathBlock block = new JLatexMathBlock();
    public final StringBuilder builder = new StringBuilder();
    public final int signs;

    public JLatexMathBlockParser(int i) {
        this.signs = i;
    }

    @Override
    public final void addLine(CharSequence charSequence) {
        StringBuilder sb = this.builder;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void closeBlock() {
        this.block.latex = this.builder.toString();
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        int i;
        int i2 = documentParser.nextNonSpace;
        CharSequence charSequence = documentParser.line;
        int length = charSequence.length();
        if (documentParser.indent < 4) {
            int i3 = i2;
            while (true) {
                if (i3 >= length) {
                    i = length - i2;
                    break;
                }
                if ('$' != charSequence.charAt(i3)) {
                    i = i3 - i2;
                    break;
                }
                i3++;
            }
            int i4 = this.signs;
            if (i == i4 && Parsing.skip(' ', charSequence, i2 + i4, length) == length) {
                return new BlockContinueImpl(-1, -1, true);
            }
        }
        return BlockContinueImpl.atIndex(documentParser.index);
    }
}
