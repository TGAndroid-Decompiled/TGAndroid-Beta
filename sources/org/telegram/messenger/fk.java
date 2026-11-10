package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fk implements Runnable {
    public final int f22436a;
    public final qp f22437b;
    public final ArrayList f22438c;
    public final long d;

    public fk(qp qpVar, long j3, ArrayList arrayList, int i7) {
        this.f22436a = i7;
        this.f22437b = qpVar;
        this.d = j3;
        this.f22438c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        long j10;
        int i10 = this.f22436a;
        long j11 = this.d;
        ArrayList arrayList = this.f22438c;
        qp qpVar = this.f22437b;
        switch (i10) {
            case 0:
                yr messagesStorage = qpVar.getMessagesStorage();
                long j12 = this.d;
                ArrayList arrayList2 = this.f22438c;
                qpVar.getMessagesStorage().R1(j12, -j12, arrayList2, messagesStorage.P0(j12, arrayList2, false, true, 0, 0));
                return;
            case 1:
                qpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j11), Boolean.FALSE);
                if (j11 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ij ijVar = (ij) qpVar.U.get(((Integer) arrayList.get(i11)).intValue());
                        if (ijVar != null) {
                            ijVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) qpVar.R.f(-j11);
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        ij ijVar2 = (ij) arrayList3.get(i12);
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            } else if (ijVar2.e1() == ((Integer) arrayList.get(i13)).intValue()) {
                                ijVar2.Z = true;
                            } else {
                                i13++;
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (arrayList != null) {
                    qpVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        qp messagesController = qpVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i7 = message.date;
                        } else {
                            i7 = 0;
                        }
                        long j13 = this.d;
                        if (qpVar.y2(j13)) {
                            j3 = m5.o(tL_forumTopic.from_id);
                        } else {
                            j3 = tL_forumTopic.f27012id;
                        }
                        messagesController.j3(j13, i15, 0, i7, false, j3, 0, true, 0);
                        yr messagesStorage2 = qpVar.getMessagesStorage();
                        long j14 = -j13;
                        if (qpVar.y2(j13)) {
                            j10 = m5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f27012id;
                        }
                        messagesStorage2.d2(j14, j10, tL_forumTopic.top_message, 0);
                    }
                }
                qpVar.getMessagesStorage().f26723a.c(new vj(qpVar, 21));
                return;
            case 3:
                qpVar.l5(0, -j11, arrayList);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                g0.h3(new fk(this.f22437b, this.d, this.f22438c, 5));
                return;
            default:
                qpVar.l5(0, j11, arrayList);
                qpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public fk(qp qpVar, ArrayList arrayList, long j3, int i7) {
        this.f22436a = i7;
        this.f22437b = qpVar;
        this.f22438c = arrayList;
        this.d = j3;
    }
}
