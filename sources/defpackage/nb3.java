package defpackage;

import java.util.Map;
public final class nb3 implements pj8 {
    public final byte a;

    @Override
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            case 1:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            default:
                qr5 qr5Var = (qr5) obj;
                if (!qr5Var.b.equals("com.apple.iTunes") || !qr5Var.c.equals("iTunSMPB")) {
                    return false;
                }
                return true;
        }
    }
}
