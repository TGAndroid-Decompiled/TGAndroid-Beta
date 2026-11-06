package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Comparator {
    public final ArrayList f16662a;
    public final ArrayList f16663b;

    public a1(ArrayList arrayList, ArrayList arrayList2) {
        this.f16662a = arrayList;
        this.f16663b = arrayList2;
    }

    public final int a(h1 h1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16662a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f16663b;
                    if (i7 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i7)).f26959id == h1Var.f16768a.f26959id) {
                            return (arrayList2.size() - i7) + 1000000;
                        }
                        i7++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i10)).f26959id == h1Var.f16768a.f26959id) {
                return i10 + 2000000;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        h1 h1Var = (h1) obj;
        h1 h1Var2 = (h1) obj2;
        boolean L2 = ij.L2(h1Var.f16768a, true);
        if (L2 == ij.L2(h1Var2.f16768a, true)) {
            int a10 = a(h1Var);
            int a11 = a(h1Var2);
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
