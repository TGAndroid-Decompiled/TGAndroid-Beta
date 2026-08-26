package io.noties.markwon.inlineparser;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.regex.Pattern;
import org.commonmark.node.Link;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public final class AutolinkInlineProcessor extends InlineProcessor {
    public static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final Node parse() {
        String strMatch = match(EMAIL_AUTOLINK);
        if (strMatch != null) {
            String strM = Fragment$$ExternalSyntheticOutline0.m(1, 1, strMatch);
            Link link = new Link(Fragment$$ExternalSyntheticOutline0.m("mailto:", strM), null);
            link.appendChild(new Text(strM));
            return link;
        }
        String strMatch2 = match(AUTOLINK);
        if (strMatch2 == null) {
            return null;
        }
        String strM2 = Fragment$$ExternalSyntheticOutline0.m(1, 1, strMatch2);
        Link link2 = new Link(strM2, null);
        link2.appendChild(new Text(strM2));
        return link2;
    }

    @Override
    public final char specialCharacter() {
        return '<';
    }
}
