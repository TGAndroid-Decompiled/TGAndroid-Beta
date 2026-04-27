package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.node.Node;

public class EntityInlineProcessor extends InlineProcessor {
    private static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public char specialCharacter() {
        return '&';
    }

    @Override
    protected Node parse() {
        String strMatch = match(ENTITY_HERE);
        if (strMatch != null) {
            return text(Html5Entities.entityToString(strMatch));
        }
        return null;
    }
}
