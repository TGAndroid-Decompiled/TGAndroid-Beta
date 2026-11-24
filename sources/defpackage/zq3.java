package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zq3 implements Runnable {
    public final byte a;
    public final er3 b;
    public final TLRPC.Document c;
    public final k47 d;

    public zq3(er3 er3Var, TLRPC.Document document, k47 k47Var, byte b) {
        this.a = b;
        this.b = er3Var;
        this.c = document;
        this.d = k47Var;
    }

    @Override
    public final void run() {
        boolean z;
        TLRPC.Document F0;
        TLRPC.Document F02;
        byte b = this.a;
        k47 k47Var = this.d;
        TLRPC.Document document = this.c;
        er3 er3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = er3Var.I;
                ArrayList arrayList2 = er3Var.H;
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (((k47) arrayList2.get(i)).F0() != null && ((k47) arrayList2.get(i)).F0().id == document.id) {
                        arrayList2.remove(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 < arrayList.size()) {
                                if (((k47) arrayList.get(i2)).F0() == null || ((k47) arrayList.get(i2)).F0().id != document.id) {
                                    i2++;
                                }
                            } else {
                                arrayList.add(0, k47Var);
                                er3Var.J.put(k47Var.e1(), k47Var);
                                o1 o1Var = er3Var.T;
                                gm.r(o1Var);
                                gm.d3(o1Var, 60000L);
                            }
                        }
                        er3Var.getNotificationCenter().k(309, new Object[0]);
                        er3Var.getMessagesStorage().a.c(new ar3(er3Var, k47Var, (byte) 0));
                        return;
                    }
                }
                return;
            default:
                ArrayList arrayList3 = er3Var.I;
                ArrayList arrayList4 = er3Var.H;
                int i3 = 0;
                while (true) {
                    if (i3 < arrayList3.size()) {
                        k47 k47Var2 = (k47) arrayList3.get(i3);
                        if (k47Var2 != null && (F02 = k47Var2.F0()) != null && F02.id == document.id) {
                            z = true;
                        } else {
                            i3++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList4.size()) {
                            k47 k47Var3 = (k47) arrayList4.get(i4);
                            if (k47Var3 != null && (F0 = k47Var3.F0()) != null && F0.id == document.id) {
                                z = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                if (!z) {
                    arrayList4.add(0, k47Var);
                    er3Var.getMessagesStorage().a.c(new ar3(er3Var, k47Var, (byte) 1));
                }
                er3Var.getNotificationCenter().k(309, new Object[0]);
                return;
        }
    }
}
