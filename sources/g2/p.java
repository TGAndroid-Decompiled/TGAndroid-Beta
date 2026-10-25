package g2;

import java.util.Map;
public final class p implements e9.l {
    public final int f12274a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f12274a) {
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
