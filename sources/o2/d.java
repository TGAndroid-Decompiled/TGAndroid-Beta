package o2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d extends LinkedHashMap {
    public final int f18987a;

    public d(float f7, int i10, int i11, boolean z10) {
        super(i10, f7, z10);
        this.f18987a = i11;
    }

    public static Matcher a(String str, Pattern pattern, d dVar) {
        Matcher matcher = (Matcher) dVar.get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            dVar.put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f18987a) {
            case 0:
                if (size() > 4) {
                    return true;
                }
                return false;
            default:
                if (size() > 32) {
                    return true;
                }
                return false;
        }
    }
}
