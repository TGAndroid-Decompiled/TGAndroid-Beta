package kc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f11049e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f11050f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f11051a;
    public final String f11052b;
    public final String f11053c;

    public b(String str) {
        String str2;
        this.f11051a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f11052b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f11049e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f11053c = str2;
        } else {
            this.f11052b = "";
            this.f11053c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f11052b)) {
            Matcher matcher3 = f11050f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
