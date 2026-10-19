package c3;

import e2.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f4669c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f4670a = -1;
    public int f4671b = -1;

    public final boolean a(String str) {
        Matcher matcher = f4669c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = m0.f8252a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f4670a = parseInt;
                    this.f4671b = parseInt2;
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
        throw new UnsupportedOperationException("Method not decompiled: c3.w.b(b2.t0):void");
    }
}
