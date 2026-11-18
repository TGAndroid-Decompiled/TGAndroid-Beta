package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class pj implements Runnable {
    public final int f26256a;
    public final mp f26257b;
    public final a0.h f26258c;
    public final a0.h d;

    public pj(mp mpVar, a0.h hVar, a0.h hVar2, int i7) {
        this.f26256a = i7;
        this.f26257b = mpVar;
        this.f26258c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z10;
        fj fjVar;
        char c10;
        ArrayList arrayList;
        boolean z11;
        char c11 = 0;
        switch (this.f26256a) {
            case 0:
                mp mpVar = this.f26257b;
                a0.h hVar = this.f26258c;
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
                        mpVar.a0(arrayList2, null, null, j3, true, 0, z11, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f43754s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        fjVar = SecretMediaViewer.f().f43731g0;
                    } else {
                        fjVar = null;
                    }
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j10 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (z10 && fjVar != null && fjVar.K1 == mpVar.currentAccount && fj.B0(fjVar.f23968k) == j10 && arrayList3.contains(Integer.valueOf(fjVar.e1()))) {
                            int e12 = fjVar.e1();
                            arrayList3.remove(Integer.valueOf(e12));
                            fjVar.I0 = true;
                            long V = mpVar.V(e12, j10);
                            c10 = c11;
                            arrayList = arrayList3;
                            mp mpVar2 = mpVar;
                            mpVar = mpVar2;
                            SecretMediaViewer.f().f43746o1 = new uj(e12, V, j10, mpVar2);
                            ks notificationCenter = mpVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = fjVar.f23968k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            tr messagesStorage = mpVar.getMessagesStorage();
                            messagesStorage.f27054a.c(new gr(messagesStorage, arrayList, j10, 2));
                        }
                        i10++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new pj(mpVar, hVar, hVar3, 3));
                return;
            case 1:
                mp mpVar3 = this.f26257b;
                a0.h hVar4 = this.f26258c;
                a0.h hVar5 = this.d;
                mpVar3.X = hVar4;
                mpVar3.Y = hVar5;
                return;
            case 2:
                mp mpVar4 = this.f26257b;
                a0.h hVar6 = this.f26258c;
                a0.h hVar7 = this.d;
                mpVar4.W1 = true;
                tr messagesStorage2 = mpVar4.getMessagesStorage();
                messagesStorage2.f27054a.c(new kg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                mp mpVar5 = this.f26257b;
                Utilities.d.c(new pj(mpVar5, this.f26258c, this.d, 2));
                mpVar5.X1 = 0;
                mpVar5.Y1 = null;
                mpVar5.Z1 = null;
                return;
        }
    }
}
