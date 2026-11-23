package f3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f11210c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f11211a = -1;
    public int f11212b = -1;

    public final boolean a(String str) {
        Matcher matcher = f11210c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = h2.l0.f13778a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f11211a = parseInt;
                    this.f11212b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(e2.q0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: f3.w.b(e2.q0):void");
    }
}
