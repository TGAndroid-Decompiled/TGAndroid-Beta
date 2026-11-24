package defpackage;

import java.util.Map;
public final class ua3 implements bg8 {
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
                np5 np5Var = (np5) obj;
                if (!np5Var.b.equals("com.apple.iTunes") || !np5Var.c.equals("iTunSMPB")) {
                    return false;
                }
                return true;
        }
    }
}
