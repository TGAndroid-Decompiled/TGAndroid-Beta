package g2;

import java.util.Map;
public final class q implements d9.l {
    public final int f7331a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f7331a) {
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
