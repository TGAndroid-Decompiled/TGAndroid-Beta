package e3;

import g2.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f9521c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f9522a = -1;
    public int f9523b = -1;

    public final boolean a(String str) {
        Matcher matcher = f9521c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = n0.f11873a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f9522a = parseInt;
                    this.f9523b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(d2.s0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: e3.w.b(d2.s0):void");
    }
}
