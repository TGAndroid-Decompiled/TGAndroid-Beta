package hc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    public static final Pattern d = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

    public static final Pattern f8865e = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public static final Pattern f8866f = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

    public final String f8867a;

    public final String f8868b;

    public final String f8869c;

    public b(String str) {
        this.f8867a = str;
        if (str != null) {
            Matcher matcher = d.matcher(str);
            this.f8868b = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = f8865e.matcher(str);
            this.f8869c = matcher2.find() ? matcher2.group(2) : null;
        } else {
            this.f8868b = "";
            this.f8869c = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.f8868b)) {
            Matcher matcher3 = f8866f.matcher(str);
            if (matcher3.find()) {
                matcher3.group(2);
            }
        }
    }
}
