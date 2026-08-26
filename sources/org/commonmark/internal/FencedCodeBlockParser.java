package org.commonmark.internal;

import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.block.AbstractBlockParser;

public final class FencedCodeBlockParser extends AbstractBlockParser {
    public final FencedCodeBlock block;
    public String firstLine;
    public final StringBuilder otherLines;

    public FencedCodeBlockParser(char c, int i, int i2) {
        FencedCodeBlock fencedCodeBlock = new FencedCodeBlock();
        this.block = fencedCodeBlock;
        this.otherLines = new StringBuilder();
        fencedCodeBlock.fenceChar = c;
        fencedCodeBlock.fenceLength = i;
        fencedCodeBlock.fenceIndent = i2;
    }

    @Override
    public final void addLine(CharSequence charSequence) {
        if (this.firstLine == null) {
            this.firstLine = charSequence.toString();
            return;
        }
        StringBuilder sb = this.otherLines;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override
    public final void closeBlock() {
        String strUnescapeString = Escaping.unescapeString(this.firstLine.trim());
        FencedCodeBlock fencedCodeBlock = this.block;
        fencedCodeBlock.info = strUnescapeString;
        fencedCodeBlock.literal = this.otherLines.toString();
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        int i = documentParser.nextNonSpace;
        int i2 = documentParser.index;
        CharSequence charSequence = documentParser.line;
        int i3 = documentParser.indent;
        FencedCodeBlock fencedCodeBlock = this.block;
        if (i3 < 4) {
            char c = fencedCodeBlock.fenceChar;
            int i4 = fencedCodeBlock.fenceLength;
            int iSkip = Parsing.skip(c, charSequence, i, charSequence.length()) - i;
            if (iSkip >= i4 && Parsing.skipSpaceTab(charSequence, i + iSkip, charSequence.length()) == charSequence.length()) {
                return new BlockContinueImpl(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = fencedCodeBlock.fenceIndent; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return BlockContinueImpl.atIndex(i2);
    }
}
