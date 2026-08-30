package kc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f10284f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f10285a;
    public final String f10286b;
    public final String f10287c;

    public b(String str) {
        String str2;
        this.f10285a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f10286b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f10287c = str2;
        } else {
            this.f10286b = "";
            this.f10287c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f10286b)) {
            Matcher matcher3 = f10284f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
