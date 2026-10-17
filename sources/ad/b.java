package ad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f498f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f499a;
    public final String f500b;
    public final String f501c;

    public b(String str) {
        String str2;
        this.f499a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f500b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f501c = str2;
        } else {
            this.f500b = "";
            this.f501c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f500b)) {
            Matcher matcher3 = f498f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
