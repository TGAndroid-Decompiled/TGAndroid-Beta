package kg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class x0 implements Comparator {
    public final ArrayList f17230a;
    public final ArrayList f17231b;

    public x0(ArrayList arrayList, ArrayList arrayList2) {
        this.f17230a = arrayList;
        this.f17231b = arrayList2;
    }

    public final int a(d1 d1Var) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17230a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f17231b;
                    if (i3 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i3)).f27007id == d1Var.f16949a.f27007id) {
                            return (arrayList2.size() - i3) + 1000000;
                        }
                        i3++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i10)).f27007id == d1Var.f16949a.f27007id) {
                return i10 + 2000000;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        d1 d1Var2 = (d1) obj2;
        boolean L2 = zi.L2(d1Var.f16949a, true);
        if (L2 == zi.L2(d1Var2.f16949a, true)) {
            int a10 = a(d1Var);
            int a11 = a(d1Var2);
            if (a10 <= a11) {
                if (a10 >= a11) {
                    return 0;
                }
            } else {
                return -1;
            }
        } else if (L2) {
            return -1;
        }
        return 1;
    }
}
