package io.noties.markwon.html.jsoup.parser;

public class ParseError {
    private String errorMsg;
    private int pos;

    ParseError(int i, String str) {
        this.pos = i;
        this.errorMsg = str;
    }

    ParseError(int i, String str, Object... objArr) {
        this.errorMsg = String.format(str, objArr);
        this.pos = i;
    }

    public String toString() {
        return this.pos + ": " + this.errorMsg;
    }
}
