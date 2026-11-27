package defpackage;

import java.util.ArrayList;
public final class t22 implements z22 {
    public final byte a;
    public final iv2 b;

    public t22(iv2 iv2Var, byte b) {
        this.a = b;
        this.b = iv2Var;
    }

    @Override
    public final String run() {
        byte b = this.a;
        iv2 iv2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = iv2Var.e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return f78.f().e((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = iv2Var.e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return f78.f().e((String) arrayList2.get(0));
        }
    }
}
