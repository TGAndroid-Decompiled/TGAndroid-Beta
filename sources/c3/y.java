package c3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class y {
    public static final Pattern f4678c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f4679a = -1;
    public int f4680b = -1;

    public final boolean a(String str) {
        Matcher matcher = f4678c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = e2.m0.f8259a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f4679a = parseInt;
                    this.f4680b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(b2.t0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: c3.y.b(b2.t0):void");
    }
}
