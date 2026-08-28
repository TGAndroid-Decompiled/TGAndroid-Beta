package he;

import d7.u;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class a {
    public static final Pattern f10511a = Pattern.compile("[\\\\&]");
    public static final Pattern f10512b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f10513c;
    public static final u d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f10513c = Pattern.compile("[ \t\r\n]+");
        d = new u(9);
    }

    public static String a(String str) {
        if (f10511a.matcher(str).find()) {
            Matcher matcher = f10512b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i9 = 0;
                do {
                    sb2.append((CharSequence) str, i9, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb2.append((CharSequence) group, 1, group.length());
                    } else {
                        sb2.append(b.a(group));
                    }
                    i9 = matcher.end();
                } while (matcher.find());
                if (i9 != str.length()) {
                    sb2.append((CharSequence) str, i9, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
