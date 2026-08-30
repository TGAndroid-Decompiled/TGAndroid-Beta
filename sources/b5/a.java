package b5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v4.e;
public final class a extends e {
    public static final Pattern f1554p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern f1555q = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f1556n;
    public final ArrayList f1557o;

    public a() {
        super("SubripDecoder");
        this.f1556n = new StringBuilder();
        this.f1557o = new ArrayList();
    }

    public static long l(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final v4.f k(int r32, boolean r33, byte[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: b5.a.k(int, boolean, byte[]):v4.f");
    }
}
