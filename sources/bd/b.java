package bd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f3853f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f3854a;
    public final String f3855b;
    public final String f3856c;

    public b(String str) {
        String str2;
        this.f3854a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f3855b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f3856c = str2;
        } else {
            this.f3855b = "";
            this.f3856c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f3855b)) {
            Matcher matcher3 = f3853f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
