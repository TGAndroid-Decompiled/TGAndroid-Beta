package io.noties.markwon.inlineparser;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;

public final class NewLineInlineProcessor extends InlineProcessor {
    public static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    @Override
    public final Node parse() {
        this.index++;
        Node node = this.block.lastChild;
        if (node instanceof Text) {
            Text text = (Text) node;
            if (text.literal.endsWith(" ")) {
                String str = text.literal;
                Matcher matcher = FINAL_SPACE.matcher(str);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    text.literal = Fragment$$ExternalSyntheticOutline0.m(iEnd, 0, str);
                }
                return iEnd >= 2 ? new HardLineBreak() : new SoftLineBreak();
            }
        }
        return new SoftLineBreak();
    }

    @Override
    public final char specialCharacter() {
        return '\n';
    }
}
