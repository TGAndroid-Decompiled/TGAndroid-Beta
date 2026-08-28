package gc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern f7694e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern f7695f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String f7696a;
    public final String f7697b;
    public final String f7698c;

    public b(String str) {
        String str2;
        this.f7696a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f7697b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f7694e.matcher(str);
            if (matcher2.find()) {
                str2 = matcher2.group(2);
            } else {
                str2 = null;
            }
            this.f7698c = str2;
        } else {
            this.f7697b = "";
            this.f7698c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f7697b)) {
            Matcher matcher3 = f7695f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
