package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class rj implements Runnable {
    public final int f26297a;
    public final np f26298b;
    public final a0.h f26299c;
    public final a0.h d;

    public rj(np npVar, a0.h hVar, a0.h hVar2, int i7) {
        this.f26297a = i7;
        this.f26298b = npVar;
        this.f26299c = hVar;
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
        switch (this.f26297a) {
            case 0:
                np npVar = this.f26298b;
                a0.h hVar = this.f26299c;
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
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gjVar = SecretMediaViewer.f().f43285g0;
                    } else {
                        gjVar = null;
                    }
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j10 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (z10 && gjVar != null && gjVar.K1 == npVar.currentAccount && gj.B0(gjVar.f23817k) == j10 && arrayList3.contains(Integer.valueOf(gjVar.e1()))) {
                            int e12 = gjVar.e1();
                            arrayList3.remove(Integer.valueOf(e12));
                            gjVar.I0 = true;
                            long V = npVar.V(e12, j10);
                            c10 = c11;
                            arrayList = arrayList3;
                            np npVar2 = npVar;
                            npVar = npVar2;
                            SecretMediaViewer.f().f43300o1 = new tk(e12, V, j10, npVar2);
                            ns notificationCenter = npVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = gjVar.f23817k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            vr messagesStorage = npVar.getMessagesStorage();
                            messagesStorage.f27220a.c(new ir(messagesStorage, arrayList, j10, 1));
                        }
                        i10++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new rj(npVar, hVar, hVar3, 3));
                return;
            case 1:
                np npVar3 = this.f26298b;
                a0.h hVar4 = this.f26299c;
                a0.h hVar5 = this.d;
                npVar3.X = hVar4;
                npVar3.Y = hVar5;
                return;
            case 2:
                np npVar4 = this.f26298b;
                a0.h hVar6 = this.f26299c;
                a0.h hVar7 = this.d;
                npVar4.U1 = true;
                vr messagesStorage2 = npVar4.getMessagesStorage();
                messagesStorage2.f27220a.c(new kg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                np npVar5 = this.f26298b;
                Utilities.d.c(new rj(npVar5, this.f26299c, this.d, 2));
                npVar5.V1 = 0;
                npVar5.W1 = null;
                npVar5.X1 = null;
                return;
        }
    }
}
