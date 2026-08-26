package io.noties.markwon.html;

import java.io.IOException;

public abstract class AppendableUtils {
    public static void appendQuietly(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
