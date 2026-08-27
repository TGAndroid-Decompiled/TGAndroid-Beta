package ie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w9.d;

public abstract class a {

    public static final Pattern f11220a = Pattern.compile("[\\\\&]");

    public static final Pattern f11221b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    public static final Pattern f11222c;
    public static final d d;

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f11222c = Pattern.compile("[ \t\r\n]+");
        d = new d(9);
    }

    public static String a(String str) {
        if (!f11220a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f11221b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb2.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb2.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb2.append(b.a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb2.append((CharSequence) str, iEnd, str.length());
        }
        return sb2.toString();
    }
}
