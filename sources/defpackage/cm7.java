package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
public final class cm7 implements Runnable {
    public final byte a;
    public final im7 b;
    public final int c;

    public cm7(im7 im7Var, int i, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                im7Var.getClass();
                kk7.e().k(286, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(147, Integer.valueOf(i));
                return;
            case 1:
                kk7.e().k(286, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(147, Integer.valueOf(i));
                return;
            case 2:
                kk7.e().k(286, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(147, Integer.valueOf(i));
                return;
            case 3:
                kk7.e().k(286, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(147, Integer.valueOf(i));
                return;
            case 4:
                if (im7Var.J == 0) {
                    im7Var.w.clear();
                    kk7.e().k(257, new Object[0]);
                }
                kk7.e().k(286, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(147, Integer.valueOf(i));
                return;
            case 5:
                vf6 vf6Var = im7Var.c;
                ArrayList arrayList = im7Var.a;
                int i2 = 0;
                boolean z = false;
                while (i2 < arrayList.size()) {
                    k27 k27Var = (k27) arrayList.get(i2);
                    if (k27Var.J && Math.abs(k27Var.e1()) == i) {
                        arrayList.remove(i2);
                        SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(k27Var.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k27Var.e1());
                            if (sparseArray.size() <= 0) {
                                vf6Var.l(k27.B0(k27Var.k));
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(k27Var.e1()));
                        im7Var.getMessagesStorage().D(arrayList2, k27.B0(k27Var.k));
                        i2--;
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    im7Var.Z(false);
                    return;
                }
                return;
            case 6:
                im7Var.getClass();
                vf6 vf6Var2 = new vf6();
                vf6Var2.k(tne.a(Integer.valueOf(i)), 0L);
                im7Var.M(vf6Var2, false);
                return;
            case 7:
                if (w01.a) {
                    fa4.b("set last online from other device = " + i);
                }
                im7Var.M = i;
                return;
            default:
                im7Var.h(i);
                return;
        }
    }
}
