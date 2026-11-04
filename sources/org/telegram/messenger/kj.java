package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class kj implements Runnable {
    public final int f23832a;
    public final hp f23833b;
    public final a0.h f23834c;
    public final a0.h d;

    public kj(hp hpVar, a0.h hVar, a0.h hVar2, int i3) {
        this.f23832a = i3;
        this.f23833b = hpVar;
        this.f23834c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z10;
        zi ziVar;
        char c2;
        ArrayList arrayList;
        boolean z11;
        char c10 = 0;
        switch (this.f23832a) {
            case 0:
                hp hpVar = this.f23833b;
                a0.h hVar = this.f23834c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i3 = 0;
                    for (int m10 = hVar.m(); i3 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i3);
                        long j10 = hVar.j(i3);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        hpVar.a0(arrayList2, null, null, j10, true, 0, z11, 0L, null, 0);
                        i3++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        ziVar = SecretMediaViewer.f().f41942g0;
                    } else {
                        ziVar = null;
                    }
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j11 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (z10 && ziVar != null && ziVar.I1 == hpVar.currentAccount && zi.B0(ziVar.f26868k) == j11 && arrayList3.contains(Integer.valueOf(ziVar.f1()))) {
                            int f12 = ziVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            ziVar.G0 = true;
                            long V = hpVar.V(f12, j11);
                            c2 = c10;
                            arrayList = arrayList3;
                            hp hpVar2 = hpVar;
                            hpVar = hpVar2;
                            SecretMediaViewer.f().f41957o1 = new mk(f12, V, j11, hpVar2);
                            hs notificationCenter = hpVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c2] = ziVar.f26868k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c2 = c10;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            qr messagesStorage = hpVar.getMessagesStorage();
                            messagesStorage.f24934a.c(new dr(messagesStorage, arrayList, j11, 1));
                        }
                        i10++;
                        c10 = c2;
                    }
                }
                Utilities.d.c(new kj(hpVar, hVar, hVar3, 3));
                return;
            case 1:
                hp hpVar3 = this.f23833b;
                a0.h hVar4 = this.f23834c;
                a0.h hVar5 = this.d;
                hpVar3.X = hVar4;
                hpVar3.Y = hVar5;
                return;
            case 2:
                hp hpVar4 = this.f23833b;
                a0.h hVar6 = this.f23834c;
                a0.h hVar7 = this.d;
                hpVar4.U1 = true;
                qr messagesStorage2 = hpVar4.getMessagesStorage();
                messagesStorage2.f24934a.c(new dg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                hp hpVar5 = this.f23833b;
                Utilities.d.c(new kj(hpVar5, this.f23834c, this.d, 2));
                hpVar5.V1 = 0;
                hpVar5.W1 = null;
                hpVar5.X1 = null;
                return;
        }
    }
}
