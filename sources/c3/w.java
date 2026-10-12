package c3;

import e2.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f4293c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f4294a = -1;
    public int f4295b = -1;

    public final boolean a(String str) {
        Matcher matcher = f4293c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = m0.f8372a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f4294a = parseInt;
                    this.f4295b = parseInt2;
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
