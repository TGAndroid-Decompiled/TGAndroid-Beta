package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class qj implements Runnable {
    public final int f26427a;
    public final np f26428b;
    public final a0.h f26429c;
    public final a0.h d;

    public qj(np npVar, a0.h hVar, a0.h hVar2, int i7) {
        this.f26427a = i7;
        this.f26428b = npVar;
        this.f26429c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z10;
        gj gjVar;
        char c10;
        ArrayList arrayList;
        boolean z11;
        char c11 = 0;
        switch (this.f26427a) {
            case 0:
                np npVar = this.f26428b;
                a0.h hVar = this.f26429c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i7 = 0;
                    for (int m10 = hVar.m(); i7 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i7);
                        long j3 = hVar.j(i7);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        npVar.a0(arrayList2, null, null, j3, true, 0, z11, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f43764s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gjVar = SecretMediaViewer.f().f43741g0;
                    } else {
                        gjVar = null;
                    }
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j10 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (z10 && gjVar != null && gjVar.K1 == npVar.currentAccount && gj.B0(gjVar.f24177k) == j10 && arrayList3.contains(Integer.valueOf(gjVar.e1()))) {
                            int e12 = gjVar.e1();
                            arrayList3.remove(Integer.valueOf(e12));
                            gjVar.I0 = true;
                            long V = npVar.V(e12, j10);
                            c10 = c11;
                            arrayList = arrayList3;
                            np npVar2 = npVar;
                            npVar = npVar2;
                            SecretMediaViewer.f().f43756o1 = new vj(e12, V, j10, npVar2);
                            ls notificationCenter = npVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = gjVar.f24177k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            ur messagesStorage = npVar.getMessagesStorage();
                            messagesStorage.f27214a.c(new hr(messagesStorage, arrayList, j10, 2));
                        }
                        i10++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new qj(npVar, hVar, hVar3, 3));
                return;
            case 1:
                np npVar3 = this.f26428b;
                a0.h hVar4 = this.f26429c;
                a0.h hVar5 = this.d;
                npVar3.X = hVar4;
                npVar3.Y = hVar5;
                return;
            case 2:
                np npVar4 = this.f26428b;
                a0.h hVar6 = this.f26429c;
                a0.h hVar7 = this.d;
                npVar4.W1 = true;
                ur messagesStorage2 = npVar4.getMessagesStorage();
                messagesStorage2.f27214a.c(new lg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                np npVar5 = this.f26428b;
                Utilities.d.c(new qj(npVar5, this.f26429c, this.d, 2));
                npVar5.X1 = 0;
                npVar5.Y1 = null;
                npVar5.Z1 = null;
                return;
        }
    }
}
