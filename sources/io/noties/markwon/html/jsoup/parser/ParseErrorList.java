package io.noties.markwon.html.jsoup.parser;

import java.util.ArrayList;

public class ParseErrorList extends ArrayList {
    private final int maxSize;

    ParseErrorList(int i, int i2) {
        super(i);
        this.maxSize = i2;
    }

    boolean canAddError() {
        return size() < this.maxSize;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }
}
