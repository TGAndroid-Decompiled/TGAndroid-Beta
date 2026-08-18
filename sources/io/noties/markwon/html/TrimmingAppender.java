package io.noties.markwon.html;

abstract class TrimmingAppender {
    abstract void append(Appendable appendable, String str);

    TrimmingAppender() {
    }

    static TrimmingAppender create() {
        return new Impl();
    }

    static class Impl extends TrimmingAppender {
        Impl() {
        }

        @Override
        void append(Appendable appendable, String str) {
            int length;
            CharSequence charSequence = (CharSequence) appendable;
            int length2 = charSequence.length();
            int length3 = str.length();
            boolean z = false;
            for (int i = 0; i < length3; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isWhitespace(cCharAt)) {
                    z = true;
                } else {
                    if (z && (length = charSequence.length()) > 0 && !Character.isWhitespace(charSequence.charAt(length - 1))) {
                        AppendableUtils.appendQuietly(appendable, ' ');
                    }
                    AppendableUtils.appendQuietly(appendable, cCharAt);
                    z = false;
                }
            }
            if (!z || length2 >= charSequence.length()) {
                return;
            }
            AppendableUtils.appendQuietly(appendable, ' ');
        }
    }
}
