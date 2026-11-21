package jg;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
public final class a1 implements Comparator {
    public final ArrayList f17425a;
    public final ArrayList f17426b;

    public a1(ArrayList arrayList, ArrayList arrayList2) {
        this.f17425a = arrayList;
        this.f17426b = arrayList2;
    }

    public final int a(g1 g1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17425a;
            if (i10 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.f17426b;
                    if (i7 < Math.min(20, arrayList2.size())) {
                        if (((TLRPC.Document) arrayList2.get(i7)).f28437id == g1Var.f17488a.f28437id) {
                            return (arrayList2.size() - i7) + 1000000;
                        }
                        i7++;
                    } else {
                        return -1;
                    }
                }
            } else if (((TLRPC.Document) arrayList.get(i10)).f28437id == g1Var.f17488a.f28437id) {
                return i10 + 2000000;
            } else {
                i10++;
            }
        }
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        g1 g1Var = (g1) obj;
        g1 g1Var2 = (g1) obj2;
        boolean K2 = fj.K2(g1Var.f17488a, true);
        if (K2 == fj.K2(g1Var2.f17488a, true)) {
            int a10 = a(g1Var);
            int a11 = a(g1Var2);
            if (a10 <= a11) {
                if (a10 >= a11) {
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
