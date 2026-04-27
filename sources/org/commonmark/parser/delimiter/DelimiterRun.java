package org.commonmark.parser.delimiter;

public interface DelimiterRun {
    boolean canClose();

    boolean canOpen();

    int length();

    int originalLength();
}
