package io.noties.markwon.html;

import java.io.IOException;

abstract class AppendableUtils {
    static void appendQuietly(Appendable appendable, char c) throws IOException {
        try {
            appendable.append(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void appendQuietly(Appendable appendable, CharSequence charSequence) throws IOException {
        try {
            appendable.append(charSequence);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
