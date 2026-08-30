package me;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class a {
    public static final Pattern f13923a = Pattern.compile("[\\\\&]");
    public static final Pattern f13924b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f13925c;
    public static final ab.a d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f13925c = Pattern.compile("[ \t\r\n]+");
        d = new ab.a(13);
    }

    public static String a(String str) {
        if (f13923a.matcher(str).find()) {
            Matcher matcher = f13924b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int i10 = 0;
                do {
                    sb.append((CharSequence) str, i10, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb.append((CharSequence) group, 1, group.length());
                    } else {
                        sb.append(b.a(group));
                    }
                    i10 = matcher.end();
                } while (matcher.find());
                if (i10 != str.length()) {
                    sb.append((CharSequence) str, i10, str.length());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
