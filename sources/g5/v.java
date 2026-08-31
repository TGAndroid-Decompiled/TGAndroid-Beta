package g5;

import java.util.Map;
public final class v implements r8.f {
    public final int f6951a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f6951a) {
            case 0:
                if (((String) obj) != null) {
                    return true;
                }
                return false;
            default:
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
        }
    }
}
