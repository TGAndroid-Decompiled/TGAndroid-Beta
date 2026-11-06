package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class tj implements Runnable {
    public final int f25622a;
    public final qp f25623b;
    public final a0.h f25624c;
    public final a0.h d;

    public tj(qp qpVar, a0.h hVar, a0.h hVar2, int i7) {
        this.f25622a = i7;
        this.f25623b = qpVar;
        this.f25624c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z9;
        ij ijVar;
        char c10;
        ArrayList arrayList;
        boolean z10;
        char c11 = 0;
        switch (this.f25622a) {
            case 0:
                qp qpVar = this.f25623b;
                a0.h hVar = this.f25624c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i7 = 0;
                    for (int m10 = hVar.m(); i7 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i7);
                        long j3 = hVar.j(i7);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        qpVar.a0(arrayList2, null, null, j3, true, 0, z10, 0L, null, 0);
                        i7++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f41934s) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        ijVar = SecretMediaViewer.f().f41909f0;
                    } else {
                        ijVar = null;
                    }
                    int m11 = hVar3.m();
                    int i10 = 0;
                    while (i10 < m11) {
                        long j10 = hVar3.j(i10);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i10);
                        if (z9 && ijVar != null && ijVar.I1 == qpVar.currentAccount && ij.B0(ijVar.f23237k) == j10 && arrayList3.contains(Integer.valueOf(ijVar.f1()))) {
                            int f12 = ijVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            ijVar.G0 = true;
                            long V = qpVar.V(f12, j10);
                            c10 = c11;
                            arrayList = arrayList3;
                            qp qpVar2 = qpVar;
                            qpVar = qpVar2;
                            SecretMediaViewer.f().n1 = new wk(f12, V, j10, qpVar2);
                            qs notificationCenter = qpVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = ijVar.f23237k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            yr messagesStorage = qpVar.getMessagesStorage();
                            messagesStorage.f26688a.c(new lr(messagesStorage, arrayList, j10, 1));
                        }
                        i10++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new tj(qpVar, hVar, hVar3, 3));
                return;
            case 1:
                qp qpVar3 = this.f25623b;
                a0.h hVar4 = this.f25624c;
                a0.h hVar5 = this.d;
                qpVar3.W = hVar4;
                qpVar3.X = hVar5;
                return;
            case 2:
                qp qpVar4 = this.f25623b;
                a0.h hVar6 = this.f25624c;
                a0.h hVar7 = this.d;
                qpVar4.T1 = true;
                yr messagesStorage2 = qpVar4.getMessagesStorage();
                messagesStorage2.f26688a.c(new lg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                qp qpVar5 = this.f25623b;
                Utilities.d.c(new tj(qpVar5, this.f25624c, this.d, 2));
                qpVar5.U1 = 0;
                qpVar5.V1 = null;
                qpVar5.W1 = null;
                return;
        }
    }
}
