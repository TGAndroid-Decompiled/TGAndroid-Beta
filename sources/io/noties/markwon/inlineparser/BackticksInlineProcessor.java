package io.noties.markwon.inlineparser;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.regex.Pattern;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Code;
import org.commonmark.node.Node;

public final class BackticksInlineProcessor extends InlineProcessor {
    public static final Pattern TICKS = Pattern.compile("`+");
    public static final Pattern TICKS_HERE = Pattern.compile("^`+");

    @Override
    public final Node parse() {
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
        Code code = new Code(0);
        String strReplace = this.input.substring(i, this.index - strMatch2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
            int length = strReplace.length();
            if (Parsing.skip(' ', strReplace, 0, length) != length) {
                strReplace = SurfaceContainer$$ExternalSyntheticOutline0.m(1, 1, strReplace);
            }
        }
        code.literal = strReplace;
        return code;
    }

    @Override
    public final char specialCharacter() {
        return '`';
    }
}
