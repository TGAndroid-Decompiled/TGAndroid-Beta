package org.commonmark.ext.gfm.strikethrough.internal;

import org.commonmark.ext.gfm.strikethrough.Strikethrough;
import org.commonmark.internal.Delimiter;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public final class StrikethroughDelimiterProcessor implements DelimiterProcessor {
    @Override
    public final char getClosingCharacter() {
        return '~';
    }

    @Override
    public final int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2) {
        return (delimiter.length < 2 || delimiter2.length < 2) ? 0 : 2;
    }

    @Override
    public final int getMinLength() {
        return 2;
    }

    @Override
    public final char getOpeningCharacter() {
        return '~';
    }

    @Override
    public final void process(Text text, Text text2, int i) {
        Strikethrough strikethrough = new Strikethrough();
        Node node = (Node) text.next;
        while (node != null && node != text2) {
            Node node2 = (Node) node.next;
            strikethrough.appendChild(node);
            node = node2;
        }
        strikethrough.unlink();
        Node node3 = (Node) text.next;
        strikethrough.next = node3;
        if (node3 != null) {
            node3.prev = strikethrough;
        }
        strikethrough.prev = text;
        text.next = strikethrough;
        Node node4 = (Node) text.parent;
        strikethrough.parent = node4;
        if (((Node) strikethrough.next) == null) {
            node4.lastChild = strikethrough;
        }
    }
}
