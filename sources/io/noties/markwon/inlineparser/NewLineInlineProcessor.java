package io.noties.markwon.inlineparser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;

public class NewLineInlineProcessor extends InlineProcessor {
    private static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    @Override
    public char specialCharacter() {
        return '\n';
    }

    @Override
    protected Node parse() {
        this.index++;
        Node lastChild = this.block.getLastChild();
        if (lastChild instanceof Text) {
            Text text = (Text) lastChild;
            if (text.getLiteral().endsWith(" ")) {
                String literal = text.getLiteral();
                Matcher matcher = FINAL_SPACE.matcher(literal);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    text.setLiteral(literal.substring(0, literal.length() - iEnd));
                }
                if (iEnd >= 2) {
                    return new HardLineBreak();
                }
                return new SoftLineBreak();
            }
        }
        return new SoftLineBreak();
    }
}
