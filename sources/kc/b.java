package kc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f10264f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f10265a;
    public final String f10266b;
    public final String f10267c;

    public b(String str) {
        String str2;
        this.f10265a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f10266b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f10267c = str2;
        } else {
            this.f10266b = "";
            this.f10267c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f10266b)) {
            Matcher matcher3 = f10264f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
