package g2;

import java.util.Map;
public final class p implements d9.g {
    public final int f10349a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f10349a) {
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
