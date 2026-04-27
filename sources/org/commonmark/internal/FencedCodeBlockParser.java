package org.commonmark.internal;

import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.block.AbstractBlockParser;
import org.commonmark.parser.block.AbstractBlockParserFactory;
import org.commonmark.parser.block.BlockContinue;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;

public class FencedCodeBlockParser extends AbstractBlockParser {
    private final FencedCodeBlock block;
    private String firstLine;
    private StringBuilder otherLines;

    public FencedCodeBlockParser(char c, int i, int i2) {
        FencedCodeBlock fencedCodeBlock = new FencedCodeBlock();
        this.block = fencedCodeBlock;
        this.otherLines = new StringBuilder();
        fencedCodeBlock.setFenceChar(c);
        fencedCodeBlock.setFenceLength(i);
        fencedCodeBlock.setFenceIndent(i2);
    }

    @Override
    public Block getBlock() {
        return this.block;
    }

    @Override
    public BlockContinue tryContinue(ParserState parserState) {
        int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
        int index = parserState.getIndex();
        CharSequence line = parserState.getLine();
        if (parserState.getIndent() < Parsing.CODE_BLOCK_INDENT && isClosing(line, nextNonSpaceIndex)) {
            return BlockContinue.finished();
        }
        int length = line.length();
        for (int fenceIndent = this.block.getFenceIndent(); fenceIndent > 0 && index < length && line.charAt(index) == ' '; fenceIndent--) {
            index++;
        }
        return BlockContinue.atIndex(index);
    }

    @Override
    public void addLine(CharSequence charSequence) {
        if (this.firstLine == null) {
            this.firstLine = charSequence.toString();
        } else {
            this.otherLines.append(charSequence);
            this.otherLines.append('\n');
        }
    }

    @Override
    public void closeBlock() {
        this.block.setInfo(Escaping.unescapeString(this.firstLine.trim()));
        this.block.setLiteral(this.otherLines.toString());
    }

    public static class Factory extends AbstractBlockParserFactory {
        @Override
        public BlockStart tryStart(ParserState parserState, MatchedBlockParser matchedBlockParser) {
            int indent = parserState.getIndent();
            if (indent >= Parsing.CODE_BLOCK_INDENT) {
                return BlockStart.none();
            }
            int nextNonSpaceIndex = parserState.getNextNonSpaceIndex();
            FencedCodeBlockParser fencedCodeBlockParserCheckOpener = FencedCodeBlockParser.checkOpener(parserState.getLine(), nextNonSpaceIndex, indent);
            if (fencedCodeBlockParserCheckOpener != null) {
                return BlockStart.of(fencedCodeBlockParserCheckOpener).atIndex(nextNonSpaceIndex + fencedCodeBlockParserCheckOpener.block.getFenceLength());
            }
            return BlockStart.none();
        }
    }

    public static FencedCodeBlockParser checkOpener(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '`') {
                i3++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (Parsing.find('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new FencedCodeBlockParser('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new FencedCodeBlockParser('~', i4, i2);
    }

    private boolean isClosing(CharSequence charSequence, int i) {
        char fenceChar = this.block.getFenceChar();
        int fenceLength = this.block.getFenceLength();
        int iSkip = Parsing.skip(fenceChar, charSequence, i, charSequence.length()) - i;
        return iSkip >= fenceLength && Parsing.skipSpaceTab(charSequence, i + iSkip, charSequence.length()) == charSequence.length();
    }
}
