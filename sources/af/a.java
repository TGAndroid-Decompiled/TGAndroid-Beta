package af;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t7.u;
public abstract class a {
    public static final Pattern f399a = Pattern.compile("[\\\\&]");
    public static final Pattern f400b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f401c;
    public static final u d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f401c = Pattern.compile("[ \t\r\n]+");
        d = new Object();
    }

    public static String a(String str) {
        if (f399a.matcher(str).find()) {
            Matcher matcher = f400b.matcher(str);
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
