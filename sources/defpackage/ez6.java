package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
public final class ez6 implements Comparator {
    public final ArrayList a;
    public final ArrayList b;

    public ez6(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(jz6 jz6Var) {
        TLRPC.Document document = jz6Var.a;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i)).id == document.id) {
                            return (arrayList2.size() - i) + 1000000;
                        }
                        i++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i2)).id == document.id) {
                return i2 + 2000000;
            } else {
                i2++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        jz6 jz6Var = (jz6) obj;
        jz6 jz6Var2 = (jz6) obj2;
        boolean K2 = k27.K2(jz6Var.a, true);
        if (K2 == k27.K2(jz6Var2.a, true)) {
            int a = a(jz6Var);
            int a2 = a(jz6Var2);
            if (a <= a2) {
                if (a >= a2) {
                    return 0;
                }
            } else {
                return -1;
            }
        } else if (K2) {
            return -1;
        }
        return 1;
    }
}
