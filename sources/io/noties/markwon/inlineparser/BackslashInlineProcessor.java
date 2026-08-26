package io.noties.markwon.inlineparser;

import java.util.regex.Pattern;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.Node;
import org.commonmark.node.Text;

public final class BackslashInlineProcessor extends InlineProcessor {
    public static final Pattern ESCAPABLE = MarkwonInlineParser.ESCAPABLE;

    @Override
    public final Node parse() {
        this.index++;
        if (peek() == '\n') {
            HardLineBreak hardLineBreak = new HardLineBreak();
            this.index++;
            return hardLineBreak;
        }
        if (this.index < this.input.length()) {
            String str = this.input;
            int i = this.index;
            if (ESCAPABLE.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.input;
                int i2 = this.index;
                Text text = text(str2, i2, i2 + 1);
                this.index++;
                return text;
            }
        }
        return text("\\");
    }

    @Override
    public final char specialCharacter() {
        return '\\';
    }
}
