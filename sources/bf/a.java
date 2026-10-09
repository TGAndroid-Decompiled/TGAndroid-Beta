package bf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class a {
    public static final Pattern f3882a = Pattern.compile("[\\\\&]");
    public static final Pattern f3883b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f3884c;
    public static final rb.a d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f3884c = Pattern.compile("[ \t\r\n]+");
        d = new rb.a(3);
    }

    public static String a(String str) {
        if (f3882a.matcher(str).find()) {
            Matcher matcher = f3883b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i10 = 0;
                do {
                    sb2.append((CharSequence) str, i10, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb2.append((CharSequence) group, 1, group.length());
                    } else {
                        sb2.append(b.a(group));
                    }
                    i10 = matcher.end();
                } while (matcher.find());
                if (i10 != str.length()) {
                    sb2.append((CharSequence) str, i10, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
