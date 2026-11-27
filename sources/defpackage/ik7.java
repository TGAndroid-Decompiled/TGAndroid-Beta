package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class ik7 {
    public static final Pattern c = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern d = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String a;
    public final String b;

    public ik7(String str) {
        String str2;
        String str3;
        this.a = str;
        str2 = "";
        if (str != null) {
            Matcher matcher = c.matcher(str);
            str2 = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = d.matcher(str);
            if (matcher2.find()) {
                str3 = matcher2.group(2);
            } else {
                str3 = null;
            }
            this.b = str3;
        } else {
            this.b = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(str2)) {
            Matcher matcher3 = e.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
