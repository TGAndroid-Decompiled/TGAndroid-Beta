package io.noties.markwon.inlineparser;

import org.commonmark.node.Node;
import org.commonmark.node.Text;

public abstract class InlineParserUtils {
    public static void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.literal);
        Node node = text.next;
        Node node2 = text2.next;
        while (node != node2) {
            sb.append(((Text) node).literal);
            Node node3 = node.next;
            node.unlink();
            node = node3;
        }
        text.literal = sb.toString();
    }

    public static void mergeTextNodesInclusive(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        int length = 0;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
                length = text2.literal.length() + length;
            } else {
                mergeIfNeeded(text, text2, length);
                text = null;
                text2 = null;
                length = 0;
            }
            if (node == node2) {
                break;
            } else {
                node = node.next;
            }
        }
        mergeIfNeeded(text, text2, length);
    }
}
