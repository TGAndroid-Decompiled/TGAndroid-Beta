package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class z34 {
    public static final Pattern a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;
    public static final c6e d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        d = new Object();
    }

    public static String a(String str) {
        if (a.matcher(str).find()) {
            Matcher matcher = b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int i = 0;
                do {
                    sb.append((CharSequence) str, i, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb.append((CharSequence) group, 1, group.length());
                    } else {
                        sb.append(bg5.a(group));
                    }
                    i = matcher.end();
                } while (matcher.find());
                if (i != str.length()) {
                    sb.append((CharSequence) str, i, str.length());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
