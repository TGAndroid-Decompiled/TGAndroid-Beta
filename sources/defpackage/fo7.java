package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
public final class fo7 implements Runnable {
    public final byte a;
    public final lo7 b;
    public final int c;

    public fo7(lo7 lo7Var, int i, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                lo7Var.getClass();
                nm7.e().k(288, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 1:
                nm7.e().k(288, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 2:
                nm7.e().k(288, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 3:
                nm7.e().k(288, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 4:
                if (lo7Var.J == 0) {
                    lo7Var.w.clear();
                    nm7.e().k(259, new Object[0]);
                }
                nm7.e().k(288, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 5:
                vh6 vh6Var = lo7Var.c;
                ArrayList arrayList = lo7Var.a;
                int i2 = 0;
                boolean z = false;
                while (i2 < arrayList.size()) {
                    k47 k47Var = (k47) arrayList.get(i2);
                    if (k47Var.J && Math.abs(k47Var.e1()) == i) {
                        arrayList.remove(i2);
                        SparseArray sparseArray = (SparseArray) vh6Var.f(k47.B0(k47Var.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k47Var.e1());
                            if (sparseArray.size() <= 0) {
                                vh6Var.l(k47.B0(k47Var.k));
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(k47Var.e1()));
                        lo7Var.getMessagesStorage().D(arrayList2, k47.B0(k47Var.k));
                        i2--;
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    lo7Var.Z(false);
                    return;
                }
                return;
            case 6:
                lo7Var.getClass();
                vh6 vh6Var2 = new vh6();
                vh6Var2.k(wpe.a(Integer.valueOf(i)), 0L);
                lo7Var.M(vh6Var2, false);
                return;
            case 7:
                if (e21.a) {
                    fc4.b("set last online from other device = " + i);
                }
                lo7Var.M = i;
                return;
            default:
                lo7Var.h(i);
                return;
        }
    }
}
