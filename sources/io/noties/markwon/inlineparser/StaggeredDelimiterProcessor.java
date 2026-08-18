package io.noties.markwon.inlineparser;

import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;
import org.commonmark.parser.delimiter.DelimiterRun;

class StaggeredDelimiterProcessor implements DelimiterProcessor {
    private final char delim;
    private int minLength = 0;
    private LinkedList processors = new LinkedList();

    StaggeredDelimiterProcessor(char c) {
        this.delim = c;
    }

    @Override
    public char getOpeningCharacter() {
        return this.delim;
    }

    @Override
    public char getClosingCharacter() {
        return this.delim;
    }

    @Override
    public int getMinLength() {
        return this.minLength;
    }

    void add(DelimiterProcessor delimiterProcessor) {
        int minLength = delimiterProcessor.getMinLength();
        ListIterator listIterator = this.processors.listIterator();
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
        this.processors.add(delimiterProcessor);
        this.minLength = minLength;
    }

    private DelimiterProcessor findProcessor(int i) {
        for (DelimiterProcessor delimiterProcessor : this.processors) {
            if (delimiterProcessor.getMinLength() <= i) {
                return delimiterProcessor;
            }
        }
        return (DelimiterProcessor) this.processors.getFirst();
    }

    @Override
    public int getDelimiterUse(DelimiterRun delimiterRun, DelimiterRun delimiterRun2) {
        return findProcessor(delimiterRun.length()).getDelimiterUse(delimiterRun, delimiterRun2);
    }

    @Override
    public void process(Text text, Text text2, int i) {
        findProcessor(i).process(text, text2, i);
    }
}
