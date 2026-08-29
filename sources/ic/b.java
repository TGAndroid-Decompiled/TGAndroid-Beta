package ic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f8829e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f8830f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f8831a;
    public final String f8832b;
    public final String f8833c;

    public b(String str) {
        String str2;
        this.f8831a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f8832b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f8829e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f8833c = str2;
        } else {
            this.f8832b = "";
            this.f8833c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f8832b)) {
            Matcher matcher3 = f8830f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
