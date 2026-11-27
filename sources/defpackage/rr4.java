package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class rr4 extends LinkedHashMap {
    public static final int b = 0;
    public final byte a;

    public rr4(int i, float f, boolean z, byte b2) {
        super(i, f, z);
        this.a = b2;
    }

    public final Matcher b(Pattern pattern, String str) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > 4) {
                    return true;
                }
                return false;
            case 1:
                if (size() > 32) {
                    return true;
                }
                return false;
            case 2:
                if (size() > 512) {
                    return true;
                }
                return false;
            default:
                if (size() > 8192) {
                    return true;
                }
                return false;
        }
    }
}
