package j2;

import java.util.Map;
public final class p implements g9.l {
    public final int f17296a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.f17296a) {
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
