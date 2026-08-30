package a5;

import android.graphics.PointF;
import h5.d0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d {
    public static final Pattern f110a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern f111b;
    public static final Pattern f112c;
    public static final Pattern d;

    static {
        int i10 = d0.f6937a;
        Locale locale = Locale.US;
        f111b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f112c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f111b.matcher(str);
        Matcher matcher2 = f112c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                h5.a.v("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
