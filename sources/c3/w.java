package c3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f3701c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f3702a = -1;
    public int f3703b = -1;

    public final boolean a(String str) {
        Matcher matcher = f3701c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = e2.l0.f6165a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f3702a = parseInt;
                    this.f3703b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(b2.u0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: c3.w.b(b2.u0):void");
    }
}
