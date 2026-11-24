package defpackage;

import java.util.ArrayList;
public final class yt3 {
    public final byte a;
    public final Object b;

    public yt3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a(int i, boolean z) {
        va vaVar;
        byte b = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((au3) obj).b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    ((yt3) obj2).a(i, z);
                }
                return;
            case 1:
                sy4 sy4Var = (sy4) obj;
                sy4Var.h++;
                int i4 = sy4Var.j;
                if (!z) {
                    i2 = -1;
                }
                sy4Var.j = i4 + i2;
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            default:
                goc gocVar = (goc) obj;
                zka zkaVar = gocVar.w;
                if ((i == 1 || i == 3) && (vaVar = gocVar.a) != null) {
                    gocVar.s = z;
                    vaVar.removeCallbacks(zkaVar);
                    zkaVar.run();
                    return;
                }
                return;
        }
    }
}
