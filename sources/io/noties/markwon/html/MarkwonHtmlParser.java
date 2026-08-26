package io.noties.markwon.html;

public abstract class MarkwonHtmlParser {
    public abstract void processFragment(Appendable appendable, String str);
}
