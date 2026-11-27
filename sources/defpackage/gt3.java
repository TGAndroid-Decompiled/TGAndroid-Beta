package defpackage;

import java.util.ArrayList;
public final class gt3 {
    public final byte a;
    public final Object b;

    public gt3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        wa waVar;
        byte b = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((it3) obj).b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    ((gt3) obj2).a(i, z);
                }
                return;
            case 1:
                vy4 vy4Var = (vy4) obj;
                vy4Var.h++;
                int i4 = vy4Var.j;
                if (!z) {
                    i2 = -1;
                }
                vy4Var.j = i4 + i2;
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            default:
                uqc uqcVar = (uqc) obj;
                bva bvaVar = uqcVar.w;
                if ((i == 1 || i == 3) && (waVar = uqcVar.a) != null) {
                    uqcVar.s = z;
                    waVar.removeCallbacks(bvaVar);
                    bvaVar.run();
                    return;
                }
                return;
        }
    }
}
