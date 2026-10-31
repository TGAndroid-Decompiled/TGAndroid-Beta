package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class xj implements Runnable {
    public final int f19257a;
    public final vp f19258b;
    public final a0.h f19259c;
    public final a0.h d;

    public xj(vp vpVar, a0.h hVar, a0.h hVar2, int i10) {
        this.f19257a = i10;
        this.f19258b = vpVar;
        this.f19259c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z10;
        jj jjVar;
        char c10;
        ArrayList arrayList;
        boolean z11;
        char c11 = 0;
        switch (this.f19257a) {
            case 0:
                vp vpVar = this.f19258b;
                a0.h hVar = this.f19259c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i10 = 0;
                    for (int m10 = hVar.m(); i10 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i10);
                        long j10 = hVar.j(i10);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        vpVar.a0(arrayList2, null, null, j10, true, 0, z11, 0L, null, 0);
                        i10++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f34016s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        jjVar = SecretMediaViewer.f().f33990f0;
                    } else {
                        jjVar = null;
                    }
                    int m11 = hVar3.m();
                    int i11 = 0;
                    while (i11 < m11) {
                        long j11 = hVar3.j(i11);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i11);
                        if (z10 && jjVar != null && jjVar.I1 == vpVar.currentAccount && jj.B0(jjVar.f16337k) == j11 && arrayList3.contains(Integer.valueOf(jjVar.f1()))) {
                            int f12 = jjVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            jjVar.G0 = true;
                            long V = vpVar.V(f12, j11);
                            c10 = c11;
                            arrayList = arrayList3;
                            vp vpVar2 = vpVar;
                            vpVar = vpVar2;
                            SecretMediaViewer.f().f34006n1 = new fk(f12, V, j11, vpVar2);
                            zs notificationCenter = vpVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = jjVar.f16337k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            hs messagesStorage = vpVar.getMessagesStorage();
                            messagesStorage.f15938a.c(new tr(messagesStorage, arrayList, j11, 1));
                        }
                        i11++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new xj(vpVar, hVar, hVar3, 3));
                return;
            case 1:
                vp vpVar3 = this.f19258b;
                a0.h hVar4 = this.f19259c;
                a0.h hVar5 = this.d;
                vpVar3.W = hVar4;
                vpVar3.X = hVar5;
                return;
            case 2:
                vp vpVar4 = this.f19258b;
                a0.h hVar6 = this.f19259c;
                a0.h hVar7 = this.d;
                vpVar4.T1 = true;
                hs messagesStorage2 = vpVar4.getMessagesStorage();
                messagesStorage2.f15938a.c(new kg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                vp vpVar5 = this.f19258b;
                Utilities.d.c(new xj(vpVar5, this.f19259c, this.d, 2));
                vpVar5.U1 = 0;
                vpVar5.V1 = null;
                vpVar5.W1 = null;
                return;
        }
    }
}
