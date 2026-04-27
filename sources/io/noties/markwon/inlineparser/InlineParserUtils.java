package io.noties.markwon.inlineparser;

import org.commonmark.node.Node;
import org.commonmark.node.Text;

public abstract class InlineParserUtils {
    public static void mergeTextNodesBetweenExclusive(Node node, Node node2) {
        if (node == node2 || node.getNext() == node2) {
            return;
        }
        mergeTextNodesInclusive(node.getNext(), node2.getPrevious());
    }

    public static void mergeChildTextNodes(Node node) {
        if (node.getFirstChild() == node.getLastChild()) {
            return;
        }
        mergeTextNodesInclusive(node.getFirstChild(), node.getLastChild());
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
                length += text2.getLiteral().length();
            } else {
                mergeIfNeeded(text, text2, length);
                text = null;
                text2 = null;
                length = 0;
            }
            if (node == node2) {
                break;
            } else {
                node = node.getNext();
            }
        }
        mergeIfNeeded(text, text2, length);
    }

    public static void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.getLiteral());
        Node next = text.getNext();
        Node next2 = text2.getNext();
        while (next != next2) {
            sb.append(((Text) next).getLiteral());
            Node next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        text.setLiteral(sb.toString());
    }
}
