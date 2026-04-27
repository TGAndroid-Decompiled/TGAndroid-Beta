package org.commonmark.parser;

import org.commonmark.node.Node;

public interface InlineParser {
    void parse(String str, Node node);
}
