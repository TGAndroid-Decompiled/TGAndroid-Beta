package io.noties.markwon.ext.latex;

import io.noties.markwon.inlineparser.InlineProcessor;
import java.util.regex.Pattern;
import org.commonmark.node.Node;

class JLatexMathInlineProcessor extends InlineProcessor {
    private static final Pattern RE = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public char specialCharacter() {
        return '$';
    }

    JLatexMathInlineProcessor() {
    }

    @Override
    protected Node parse() {
        String strMatch = match(RE);
        if (strMatch == null) {
            return null;
        }
        JLatexMathNode jLatexMathNode = new JLatexMathNode();
        jLatexMathNode.latex(strMatch.substring(2, strMatch.length() - 2));
        return jLatexMathNode;
    }
}
