package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Node;

public final class HtmlInlineProcessor extends InlineProcessor {
    public static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final Node parse() {
        String strMatch = match(HTML_TAG);
        if (strMatch == null) {
            return null;
        }
        HtmlInline htmlInline = new HtmlInline();
        htmlInline.literal = strMatch;
        return htmlInline;
    }

    @Override
    public final char specialCharacter() {
        return '<';
    }
}
