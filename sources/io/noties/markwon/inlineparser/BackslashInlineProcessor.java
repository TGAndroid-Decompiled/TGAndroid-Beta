package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public class BackslashInlineProcessor extends InlineProcessor {
    private static final Pattern ESCAPABLE = MarkwonInlineParser.ESCAPABLE;

    @Override
    public char specialCharacter() {
        return '\\';
    }

    @Override
    protected Node parse() {
        this.index++;
        if (peek() == '\n') {
            HardLineBreak hardLineBreak = new HardLineBreak();
            this.index++;
            return hardLineBreak;
        }
        if (this.index < this.input.length()) {
            Pattern pattern = ESCAPABLE;
            String str = this.input;
            int i = this.index;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.input;
                int i2 = this.index;
                Text text = text(str2, i2, i2 + 1);
                this.index++;
                return text;
            }
        }
        return text("\\");
    }
}
