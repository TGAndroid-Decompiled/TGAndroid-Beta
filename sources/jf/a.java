package jf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class a {
    public static final Pattern f16656a = Pattern.compile("[\\\\&]");
    public static final Pattern f16657b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f16658c;
    public static final pb.b d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f16658c = Pattern.compile("[ \t\r\n]+");
        d = new pb.b(12);
    }

    public static String a(String str) {
        if (f16656a.matcher(str).find()) {
            Matcher matcher = f16657b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i7 = 0;
                do {
                    sb2.append((CharSequence) str, i7, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb2.append((CharSequence) group, 1, group.length());
                    } else {
                        sb2.append(b.a(group));
                    }
                    i7 = matcher.end();
                } while (matcher.find());
                if (i7 != str.length()) {
                    sb2.append((CharSequence) str, i7, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
