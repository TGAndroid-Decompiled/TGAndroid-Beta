package org.commonmark.parser.delimiter;

import org.commonmark.internal.Delimiter;
import org.commonmark.node.Text;

public interface DelimiterProcessor {
    char getClosingCharacter();

    int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2);

    int getMinLength();

    char getOpeningCharacter();

    void process(Text text, Text text2, int i);
}
