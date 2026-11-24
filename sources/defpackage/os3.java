package defpackage;

import java.util.ArrayList;
public final class os3 {
    public final byte a;
    public final Object b;

    public os3(Object obj, byte b) {
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
                ArrayList arrayList = ((qs3) obj).b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    ((os3) obj2).a(i, z);
                }
                return;
            case 1:
                qw4 qw4Var = (qw4) obj;
                qw4Var.h++;
                int i4 = qw4Var.j;
                if (!z) {
                    i2 = -1;
                }
                qw4Var.j = i4 + i2;
                return;
            case 2:
                ((Runnable) obj).run();
                return;
            default:
                hmc hmcVar = (hmc) obj;
                xia xiaVar = hmcVar.w;
                if ((i == 1 || i == 3) && (vaVar = hmcVar.a) != null) {
                    hmcVar.s = z;
                    vaVar.removeCallbacks(xiaVar);
                    xiaVar.run();
                    return;
                }
                return;
        }
    }
}
