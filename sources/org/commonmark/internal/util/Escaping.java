package org.commonmark.internal.util;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Escaping {
    private static final Pattern BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
    private static final Pattern ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern ESCAPE_IN_URI = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern WHITESPACE = Pattern.compile("[ \t\r\n]+");
    private static final Replacer UNESCAPE_REPLACER = new Replacer() {
        @Override
        public void replace(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(Html5Entities.entityToString(str));
            }
        }
    };
    private static final Replacer URI_REPLACER = new Replacer() {
        @Override
        public void replace(String str, StringBuilder sb) {
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb.append(str);
                    return;
                } else {
                    sb.append("%25");
                    sb.append((CharSequence) str, 1, str.length());
                    return;
                }
            }
            for (byte b : str.getBytes(Charset.forName("UTF-8"))) {
                sb.append('%');
                sb.append(Escaping.HEX_DIGITS[(b >> 4) & 15]);
                sb.append(Escaping.HEX_DIGITS[b & 15]);
            }
        }
    };

    private interface Replacer {
        void replace(String str, StringBuilder sb);
    }

    public static String unescapeString(String str) {
        return BACKSLASH_OR_AMP.matcher(str).find() ? replaceAll(ENTITY_OR_ESCAPED_CHAR, str, UNESCAPE_REPLACER) : str;
    }

    public static String normalizeReference(String str) {
        return normalizeLabelContent(str.substring(1, str.length() - 1));
    }

    public static String normalizeLabelContent(String str) {
        return WHITESPACE.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    private static String replaceAll(Pattern pattern, String str, Replacer replacer) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            replacer.replace(matcher.group(), sb);
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
