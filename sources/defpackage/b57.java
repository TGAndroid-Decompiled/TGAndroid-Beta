package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;
public final class b57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final vf6 c;
    public final vf6 d;

    public b57(na7 na7Var, vf6 vf6Var, vf6 vf6Var2, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = vf6Var;
        this.d = vf6Var2;
    }

    @Override
    public final void run() {
        boolean z;
        char c;
        ArrayList arrayList;
        boolean z2;
        k27 k27Var = null;
        char c2 = 0;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                vf6 vf6Var = this.c;
                vf6 vf6Var2 = this.d;
                if (vf6Var != null) {
                    int i = 0;
                    for (int m = vf6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) vf6Var.n(i);
                        long j = vf6Var.j(i);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        na7Var.W(arrayList2, null, null, j, true, 0, z2, 0L, null, 0);
                        i++;
                    }
                }
                if (vf6Var2 != null) {
                    if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        k27Var = SecretMediaViewer.d().g0;
                    }
                    int m2 = vf6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j2 = vf6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) vf6Var2.n(i2);
                        if (z && k27Var != null && k27Var.K1 == na7Var.currentAccount && k27.B0(k27Var.k) == j2 && arrayList3.contains(Integer.valueOf(k27Var.e1()))) {
                            int e1 = k27Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            k27Var.I0 = true;
                            long R = na7Var.R(e1, j2);
                            arrayList = arrayList3;
                            na7 na7Var2 = na7Var;
                            c = c2;
                            na7Var = na7Var2;
                            SecretMediaViewer.d().o1 = new l30(na7Var2, R, j2, e1, (byte) 4);
                            kk7 notificationCenter = na7Var.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c] = k27Var.k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c = c2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            ad7 messagesStorage = na7Var.getMessagesStorage();
                            messagesStorage.a.c(new jc7(messagesStorage, arrayList, j2, (byte) 2));
                        }
                        i2++;
                        c2 = c;
                    }
                }
                Utilities.d.c(new b57(na7Var, vf6Var, vf6Var2, (byte) 3));
                return;
            case 1:
                na7 na7Var3 = this.b;
                vf6 vf6Var3 = this.c;
                vf6 vf6Var4 = this.d;
                na7Var3.X = vf6Var3;
                na7Var3.Y = vf6Var4;
                return;
            case 2:
                na7 na7Var4 = this.b;
                vf6 vf6Var5 = this.c;
                vf6 vf6Var6 = this.d;
                na7Var4.M1 = true;
                ad7 messagesStorage2 = na7Var4.getMessagesStorage();
                messagesStorage2.a.c(new lo6(messagesStorage2, vf6Var5, vf6Var6, (byte) 25));
                return;
            default:
                na7 na7Var5 = this.b;
                Utilities.d.c(new b57(na7Var5, this.c, this.d, (byte) 2));
                na7Var5.N1 = 0;
                na7Var5.O1 = null;
                na7Var5.P1 = null;
                return;
        }
    }
}
