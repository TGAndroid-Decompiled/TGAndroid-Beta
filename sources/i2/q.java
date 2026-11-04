package i2;

import java.util.Map;
public final class q implements f9.l {
    public final int f14584a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f14584a) {
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
