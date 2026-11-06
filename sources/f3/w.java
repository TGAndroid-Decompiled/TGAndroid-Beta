package f3;

import h2.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f11085c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f11086a = -1;
    public int f11087b = -1;

    public final boolean a(String str) {
        Matcher matcher = f11085c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = m0.f14112a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f11086a = parseInt;
                    this.f11087b = parseInt2;
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
