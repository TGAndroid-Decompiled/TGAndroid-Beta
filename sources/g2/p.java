package g2;

import java.util.Map;
public final class p implements d9.f {
    public final int f8524a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f8524a) {
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
