package defpackage;

import java.util.ArrayList;
public final class o32 implements u32 {
    public final byte a;
    public final yv2 b;

    public o32(yv2 yv2Var, byte b) {
        this.a = b;
        this.b = yv2Var;
    }

    @Override
    public final String run() {
        byte b = this.a;
        yv2 yv2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = yv2Var.e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return r58.f().e((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = yv2Var.e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return r58.f().e((String) arrayList2.get(0));
        }
    }
}
