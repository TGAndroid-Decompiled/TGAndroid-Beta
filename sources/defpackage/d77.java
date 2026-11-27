package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;
public final class d77 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final zh6 c;
    public final zh6 d;

    public d77(uc7 uc7Var, zh6 zh6Var, zh6 zh6Var2, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = zh6Var;
        this.d = zh6Var2;
    }

    @Override
    public final void run() {
        boolean z;
        char c;
        ArrayList arrayList;
        boolean z2;
        r47 r47Var = null;
        char c2 = 0;
        switch (this.a) {
            case 0:
                uc7 uc7Var = this.b;
                zh6 zh6Var = this.c;
                zh6 zh6Var2 = this.d;
                if (zh6Var != null) {
                    int i = 0;
                    for (int m = zh6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) zh6Var.n(i);
                        long j = zh6Var.j(i);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        uc7Var.Y(arrayList2, null, null, j, true, 0, z2, 0L, null, 0);
                        i++;
                    }
                }
                if (zh6Var2 != null) {
                    if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        r47Var = SecretMediaViewer.d().g0;
                    }
                    int m2 = zh6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j2 = zh6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) zh6Var2.n(i2);
                        if (z && r47Var != null && r47Var.K1 == uc7Var.currentAccount && r47.B0(r47Var.k) == j2 && arrayList3.contains(Integer.valueOf(r47Var.e1()))) {
                            int e1 = r47Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            r47Var.I0 = true;
                            long T = uc7Var.T(e1, j2);
                            arrayList = arrayList3;
                            uc7 uc7Var2 = uc7Var;
                            c = c2;
                            uc7Var = uc7Var2;
                            SecretMediaViewer.d().o1 = new m30(uc7Var2, T, j2, e1, (byte) 4);
                            jn7 notificationCenter = uc7Var.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c] = r47Var.k;
                            notificationCenter.k(49, objArr);
                        } else {
                            c = c2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            jf7 messagesStorage = uc7Var.getMessagesStorage();
                            messagesStorage.a.c(new se7(messagesStorage, arrayList, j2, (byte) 1));
                        }
                        i2++;
                        c2 = c;
                    }
                }
                Utilities.d.c(new d77(uc7Var, zh6Var, zh6Var2, (byte) 3));
                return;
            case 1:
                uc7 uc7Var3 = this.b;
                zh6 zh6Var3 = this.c;
                zh6 zh6Var4 = this.d;
                uc7Var3.X = zh6Var3;
                uc7Var3.Y = zh6Var4;
                return;
            case 2:
                uc7 uc7Var4 = this.b;
                zh6 zh6Var5 = this.c;
                zh6 zh6Var6 = this.d;
                uc7Var4.M1 = true;
                jf7 messagesStorage2 = uc7Var4.getMessagesStorage();
                messagesStorage2.a.c(new fd7(messagesStorage2, zh6Var5, zh6Var6, (byte) 1));
                return;
            default:
                uc7 uc7Var5 = this.b;
                Utilities.d.c(new d77(uc7Var5, this.c, this.d, (byte) 2));
                uc7Var5.N1 = 0;
                uc7Var5.O1 = null;
                uc7Var5.P1 = null;
                return;
        }
    }
}
