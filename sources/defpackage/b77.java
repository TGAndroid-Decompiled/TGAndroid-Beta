package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;
public final class b77 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final vh6 c;
    public final vh6 d;

    public b77(oc7 oc7Var, vh6 vh6Var, vh6 vh6Var2, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = vh6Var;
        this.d = vh6Var2;
    }

    @Override
    public final void run() {
        boolean z;
        char c;
        ArrayList arrayList;
        boolean z2;
        k47 k47Var = null;
        char c2 = 0;
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                vh6 vh6Var = this.c;
                vh6 vh6Var2 = this.d;
                if (vh6Var != null) {
                    int i = 0;
                    for (int m = vh6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) vh6Var.n(i);
                        long j = vh6Var.j(i);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        oc7Var.W(arrayList2, null, null, j, true, 0, z2, 0L, null, 0);
                        i++;
                    }
                }
                if (vh6Var2 != null) {
                    if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        k47Var = SecretMediaViewer.d().g0;
                    }
                    int m2 = vh6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j2 = vh6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) vh6Var2.n(i2);
                        if (z && k47Var != null && k47Var.K1 == oc7Var.currentAccount && k47.B0(k47Var.k) == j2 && arrayList3.contains(Integer.valueOf(k47Var.e1()))) {
                            int e1 = k47Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            k47Var.I0 = true;
                            long R = oc7Var.R(e1, j2);
                            arrayList = arrayList3;
                            oc7 oc7Var2 = oc7Var;
                            c = c2;
                            oc7Var = oc7Var2;
                            SecretMediaViewer.d().o1 = new l40(oc7Var2, R, j2, e1, (byte) 4);
                            nm7 notificationCenter = oc7Var.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c] = k47Var.k;
                            notificationCenter.k(49, objArr);
                        } else {
                            c = c2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            cf7 messagesStorage = oc7Var.getMessagesStorage();
                            messagesStorage.a.c(new me7(messagesStorage, arrayList, j2, (byte) 2));
                        }
                        i2++;
                        c2 = c;
                    }
                }
                Utilities.d.c(new b77(oc7Var, vh6Var, vh6Var2, (byte) 3));
                return;
            case 1:
                oc7 oc7Var3 = this.b;
                vh6 vh6Var3 = this.c;
                vh6 vh6Var4 = this.d;
                oc7Var3.X = vh6Var3;
                oc7Var3.Y = vh6Var4;
                return;
            case 2:
                oc7 oc7Var4 = this.b;
                vh6 vh6Var5 = this.c;
                vh6 vh6Var6 = this.d;
                oc7Var4.M1 = true;
                cf7 messagesStorage2 = oc7Var4.getMessagesStorage();
                messagesStorage2.a.c(new fp6(messagesStorage2, vh6Var5, vh6Var6, (byte) 28));
                return;
            default:
                oc7 oc7Var5 = this.b;
                Utilities.d.c(new b77(oc7Var5, this.c, this.d, (byte) 2));
                oc7Var5.N1 = 0;
                oc7Var5.O1 = null;
                oc7Var5.P1 = null;
                return;
        }
    }
}
