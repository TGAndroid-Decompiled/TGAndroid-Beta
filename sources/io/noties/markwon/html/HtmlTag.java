package io.noties.markwon.html;

import java.util.Map;

public interface HtmlTag {

    public interface Block extends HtmlTag {
    }

    Map attributes();
}
