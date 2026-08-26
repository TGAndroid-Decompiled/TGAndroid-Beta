package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.parser.block.AbstractBlockParser;

public final class BlockQuoteParser extends AbstractBlockParser {
    public final BlockQuote block = new BlockQuote();

    public static boolean isMarker(DocumentParser documentParser, int i) {
        CharSequence charSequence = documentParser.line;
        return documentParser.indent < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        char cCharAt;
        int i = documentParser.nextNonSpace;
        if (!isMarker(documentParser, i)) {
            return null;
        }
        int i2 = documentParser.column + documentParser.indent;
        int i3 = i2 + 1;
        CharSequence charSequence = documentParser.line;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new BlockContinueImpl(-1, i3, false);
    }
}
