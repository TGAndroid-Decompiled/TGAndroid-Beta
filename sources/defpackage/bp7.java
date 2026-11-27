package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
public final class bp7 implements Runnable {
    public final byte a;
    public final ip7 b;
    public final int c;

    public bp7(ip7 ip7Var, int i, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                ip7Var.getClass();
                jn7.e().k(287, Integer.valueOf(ip7Var.currentAccount));
                ip7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 1:
                jn7.e().k(287, Integer.valueOf(ip7Var.currentAccount));
                ip7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 2:
                jn7.e().k(287, Integer.valueOf(ip7Var.currentAccount));
                ip7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 3:
                jn7.e().k(287, Integer.valueOf(ip7Var.currentAccount));
                ip7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 4:
                if (ip7Var.J == 0) {
                    ip7Var.w.clear();
                    jn7.e().k(258, new Object[0]);
                }
                jn7.e().k(287, Integer.valueOf(ip7Var.currentAccount));
                ip7Var.getNotificationCenter().k(148, Integer.valueOf(i));
                return;
            case 5:
                zh6 zh6Var = ip7Var.c;
                ArrayList arrayList = ip7Var.a;
                int i2 = 0;
                boolean z = false;
                while (i2 < arrayList.size()) {
                    r47 r47Var = (r47) arrayList.get(i2);
                    if (r47Var.J && Math.abs(r47Var.e1()) == i) {
                        arrayList.remove(i2);
                        SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(r47Var.k));
                        if (sparseArray != null) {
                            sparseArray.remove(r47Var.e1());
                            if (sparseArray.size() <= 0) {
                                zh6Var.l(r47.B0(r47Var.k));
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(r47Var.e1()));
                        ip7Var.getMessagesStorage().D(arrayList2, r47.B0(r47Var.k));
                        i2--;
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    ip7Var.Z(false);
                    return;
                }
                return;
            case 6:
                ip7Var.getClass();
                zh6 zh6Var2 = new zh6();
                zh6Var2.k(0L, ose.a(Integer.valueOf(i)));
                ip7Var.M(zh6Var2, false);
                return;
            case 7:
                if (f11.a) {
                    cc4.b("set last online from other device = " + i);
                }
                ip7Var.M = i;
                return;
            default:
                ip7Var.h(i);
                return;
        }
    }
}
