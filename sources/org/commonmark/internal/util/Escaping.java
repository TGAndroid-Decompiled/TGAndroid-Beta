package org.commonmark.internal.util;

import com.stripe.android.time.Clock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Escaping {
    public static final Pattern BACKSLASH_OR_AMP = Pattern.compile("[\\\\&]");
    public static final Pattern ENTITY_OR_ESCAPED_CHAR = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Clock UNESCAPE_REPLACER;
    public static final Pattern WHITESPACE;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        WHITESPACE = Pattern.compile("[ \t\r\n]+");
        UNESCAPE_REPLACER = new Clock(21);
    }

    public static String unescapeString(String str) {
        if (!BACKSLASH_OR_AMP.matcher(str).find()) {
            return str;
        }
        Matcher matcher = ENTITY_OR_ESCAPED_CHAR.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            UNESCAPE_REPLACER.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb.append(Html5Entities.entityToString(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb.append((CharSequence) str, iEnd, str.length());
        }
        return sb.toString();
    }
}
