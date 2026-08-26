package io.noties.markwon.ext.latex;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import io.noties.markwon.inlineparser.InlineProcessor;
import java.util.regex.Pattern;
import org.commonmark.node.Node;

public final class JLatexMathInlineProcessor extends InlineProcessor {
    public static final Pattern RE = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final Node parse() {
        String strMatch = match(RE);
        if (strMatch == null) {
            return null;
        }
        JLatexMathNode jLatexMathNode = new JLatexMathNode();
        jLatexMathNode.latex = Fragment$$ExternalSyntheticOutline0.m(2, 2, strMatch);
        return jLatexMathNode;
    }

    @Override
    public final char specialCharacter() {
        return '$';
    }
}
