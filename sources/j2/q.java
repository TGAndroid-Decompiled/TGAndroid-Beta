package j2;

import java.util.Map;
public final class q implements g9.m {
    public final int f16469a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f16469a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            default:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
        }
    }
}
