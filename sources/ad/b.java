package ad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f495f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f496a;
    public final String f497b;
    public final String f498c;

    public b(String str) {
        String str2;
        this.f496a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f497b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f498c = str2;
        } else {
            this.f497b = "";
            this.f498c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f497b)) {
            Matcher matcher3 = f495f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
