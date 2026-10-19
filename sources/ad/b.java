package ad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f497f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f498a;
    public final String f499b;
    public final String f500c;

    public b(String str) {
        String str2;
        this.f498a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f499b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f500c = str2;
        } else {
            this.f499b = "";
            this.f500c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f499b)) {
            Matcher matcher3 = f497f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
