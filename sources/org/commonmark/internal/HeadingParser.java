package org.commonmark.internal;

import java.io.Serializable;
import java.util.ArrayList;
import org.commonmark.node.Block;
import org.commonmark.node.Heading;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;

public final class HeadingParser extends AbstractBlockParser {
    public final int $r8$classId;
    public final Block block;
    public final Serializable content;

    public final class Factory {
        public final int $r8$classId;

        public Factory(int i) {
            this.$r8$classId = i;
        }
    }

    public HeadingParser() {
        this.$r8$classId = 1;
        this.block = new IndentedCodeBlock();
        this.content = new ArrayList();
    }

    @Override
    public void addLine(CharSequence charSequence) {
        switch (this.$r8$classId) {
            case 1:
                ((ArrayList) this.content).add(charSequence);
                break;
        }
    }

    @Override
    public void closeBlock() {
        int i;
        switch (this.$r8$classId) {
            case 1:
                ArrayList arrayList = (ArrayList) this.content;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                        if (i2 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (i = 0; i < size + 1; i++) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((IndentedCodeBlock) this.block).literal = sb.toString();
                break;
        }
    }

    @Override
    public final Block getBlock() {
        switch (this.$r8$classId) {
            case 0:
                return (Heading) this.block;
            default:
                return (IndentedCodeBlock) this.block;
        }
    }

    @Override
    public void parseInlines(InlineParser inlineParser) {
        switch (this.$r8$classId) {
            case 0:
                inlineParser.parse((String) this.content, (Heading) this.block);
                break;
        }
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        switch (this.$r8$classId) {
            case 0:
                return null;
            default:
                if (documentParser.indent >= 4) {
                    return new BlockContinueImpl(-1, documentParser.column + 4, false);
                }
                if (documentParser.blank) {
                    return BlockContinueImpl.atIndex(documentParser.nextNonSpace);
                }
                return null;
        }
    }

    public HeadingParser(int i, String str) {
        this.$r8$classId = 0;
        Heading heading = new Heading();
        this.block = heading;
        heading.level = i;
        this.content = str;
    }
}
