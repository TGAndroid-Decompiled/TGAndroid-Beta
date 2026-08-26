package org.commonmark.internal;

import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public final class StaggeredDelimiterProcessor implements DelimiterProcessor {
    public final char delim;
    public int minLength = 0;
    public final LinkedList processors = new LinkedList();

    public StaggeredDelimiterProcessor(char c) {
        this.delim = c;
    }

    public final void add(DelimiterProcessor delimiterProcessor) {
        int minLength = delimiterProcessor.getMinLength();
        LinkedList linkedList = this.processors;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int minLength2 = ((DelimiterProcessor) listIterator.next()).getMinLength();
            if (minLength > minLength2) {
                listIterator.previous();
                listIterator.add(delimiterProcessor);
                return;
            } else if (minLength == minLength2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.delim + "' and minimum length " + minLength);
            }
        }
        linkedList.add(delimiterProcessor);
        this.minLength = minLength;
    }

    @Override
    public final char getClosingCharacter() {
        return this.delim;
    }

    @Override
    public final int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2) {
        int i = delimiter.length;
        LinkedList<DelimiterProcessor> linkedList = this.processors;
        for (DelimiterProcessor delimiterProcessor : linkedList) {
            if (delimiterProcessor.getMinLength() <= i) {
                return delimiterProcessor.getDelimiterUse(delimiter, delimiter2);
            }
        }
        delimiterProcessor = (DelimiterProcessor) linkedList.getFirst();
        return delimiterProcessor.getDelimiterUse(delimiter, delimiter2);
    }

    @Override
    public final int getMinLength() {
        return this.minLength;
    }

    @Override
    public final char getOpeningCharacter() {
        return this.delim;
    }

    @Override
    public final void process(Text text, Text text2, int i) {
        LinkedList<DelimiterProcessor> linkedList = this.processors;
        for (DelimiterProcessor delimiterProcessor : linkedList) {
            if (delimiterProcessor.getMinLength() <= i) {
                delimiterProcessor.process(text, text2, i);
            }
        }
        delimiterProcessor = (DelimiterProcessor) linkedList.getFirst();
        delimiterProcessor.process(text, text2, i);
    }
}
