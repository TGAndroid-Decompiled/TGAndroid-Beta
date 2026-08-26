package org.commonmark.internal.inline;

import org.commonmark.internal.Delimiter;
import org.commonmark.node.Emphasis;
import org.commonmark.node.Node;
import org.commonmark.node.StrongEmphasis;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public final class AsteriskDelimiterProcessor implements DelimiterProcessor {
    public final char delimiterChar;

    public AsteriskDelimiterProcessor(int i) {
        this('*');
        switch (i) {
            case 1:
                this('_');
                break;
            default:
                break;
        }
    }

    @Override
    public final char getClosingCharacter() {
        return this.delimiterChar;
    }

    @Override
    public final int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2) {
        if (delimiter.canClose || delimiter2.canOpen) {
            int i = delimiter2.originalLength;
            if (i % 3 != 0 && (delimiter.originalLength + i) % 3 == 0) {
                return 0;
            }
        }
        return (delimiter.length < 2 || delimiter2.length < 2) ? 1 : 2;
    }

    @Override
    public final int getMinLength() {
        return 1;
    }

    @Override
    public final char getOpeningCharacter() {
        return this.delimiterChar;
    }

    @Override
    public final void process(Text text, Text text2, int i) {
        String.valueOf(this.delimiterChar);
        Node emphasis = i == 1 ? new Emphasis() : new StrongEmphasis();
        Node node = text.next;
        while (node != null && node != text2) {
            Node node2 = node.next;
            emphasis.appendChild(node);
            node = node2;
        }
        emphasis.unlink();
        Node node3 = text.next;
        emphasis.next = node3;
        if (node3 != null) {
            node3.prev = emphasis;
        }
        emphasis.prev = text;
        text.next = emphasis;
        Node node4 = text.parent;
        emphasis.parent = node4;
        if (emphasis.next == null) {
            node4.lastChild = emphasis;
        }
    }

    public AsteriskDelimiterProcessor(char c) {
        this.delimiterChar = c;
    }
}
