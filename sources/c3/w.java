package c3;

import e2.n0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f6106c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f6107a = -1;
    public int f6108b = -1;

    public final boolean a(String str) {
        Matcher matcher = f6106c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = n0.f9691a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f6107a = parseInt;
                    this.f6108b = parseInt2;
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
