package defpackage;

import java.util.ArrayList;
public final class c22 implements i22 {
    public final byte a;
    public final nu2 b;

    public c22(nu2 nu2Var, byte b) {
        this.a = b;
        this.b = nu2Var;
    }

    @Override
    public final String run() {
        byte b = this.a;
        nu2 nu2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = nu2Var.e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return p38.f().e((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = nu2Var.e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return p38.f().e((String) arrayList2.get(0));
        }
    }
}
