package defpackage;

import java.util.Map;
public final class gc3 implements di8 {
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
                nr5 nr5Var = (nr5) obj;
                if (!nr5Var.b.equals("com.apple.iTunes") || !nr5Var.c.equals("iTunSMPB")) {
                    return false;
                }
                return true;
        }
    }
}
