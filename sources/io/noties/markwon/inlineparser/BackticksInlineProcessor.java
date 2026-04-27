package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.Node;

public class BackticksInlineProcessor extends InlineProcessor {
    private static final Pattern TICKS = Pattern.compile("`+");
    private static final Pattern TICKS_HERE = Pattern.compile("^`+");

    @Override
    public char specialCharacter() {
        return '`';
    }

    @Override
    protected Node parse() {
        String strMatch;
        String strMatch2 = match(TICKS_HERE);
        if (strMatch2 == null) {
            return null;
        }
        int i = this.index;
        do {
            strMatch = match(TICKS);
            if (strMatch == null) {
                this.index = i;
                return text(strMatch2);
            }
        } while (!strMatch.equals(strMatch2));
        Code code = new Code();
        String strReplace = this.input.substring(i, this.index - strMatch2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && Parsing.hasNonSpace(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        code.setLiteral(strReplace);
        return code;
    }
}
