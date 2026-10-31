package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ok implements Runnable {
    public final int f17277a;
    public final vp f17278b;
    public final ArrayList f17279c;
    public final long d;

    public ok(vp vpVar, long j10, ArrayList arrayList, int i10) {
        this.f17277a = i10;
        this.f17278b = vpVar;
        this.d = j10;
        this.f17279c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        long j10;
        long j11;
        int i11 = this.f17277a;
        long j12 = this.d;
        ArrayList arrayList = this.f17279c;
        vp vpVar = this.f17278b;
        switch (i11) {
            case 0:
                hs messagesStorage = vpVar.getMessagesStorage();
                long j13 = this.d;
                ArrayList arrayList2 = this.f17279c;
                vpVar.getMessagesStorage().R1(j13, -j13, arrayList2, messagesStorage.P0(j13, arrayList2, false, true, 0, 0));
                return;
            case 1:
                vpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j12), Boolean.FALSE);
                if (j12 == 0) {
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        jj jjVar = (jj) vpVar.U.get(((Integer) arrayList.get(i12)).intValue());
                        if (jjVar != null) {
                            jjVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) vpVar.R.f(-j12);
                if (arrayList3 != null) {
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        jj jjVar2 = (jj) arrayList3.get(i13);
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                break;
                            } else if (jjVar2.f1() == ((Integer) arrayList.get(i14)).intValue()) {
                                jjVar2.Z = true;
                            } else {
                                i14++;
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (arrayList != null) {
                    vpVar.getClass();
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i15);
                        vp messagesController = vpVar.getMessagesController();
                        int i16 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i10 = message.date;
                        } else {
                            i10 = 0;
                        }
                        long j14 = this.d;
                        if (vpVar.x2(j14)) {
                            j10 = o5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f19845id;
                        }
                        messagesController.h3(j14, i16, 0, i10, false, j10, 0, true, 0);
                        hs messagesStorage2 = vpVar.getMessagesStorage();
                        long j15 = -j14;
                        if (vpVar.x2(j14)) {
                            j11 = o5.o(tL_forumTopic.from_id);
                        } else {
                            j11 = tL_forumTopic.f19845id;
                        }
                        messagesStorage2.d2(j15, j11, tL_forumTopic.top_message, 0);
                    }
                }
                vpVar.getMessagesStorage().f15938a.c(new zj(vpVar, 19));
                return;
            case 3:
                vpVar.i5(0, -j12, arrayList);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                i0.g3(new ok(this.f17278b, this.d, this.f17279c, 5));
                return;
            default:
                vpVar.i5(0, j12, arrayList);
                vpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public ok(vp vpVar, ArrayList arrayList, long j10, int i10) {
        this.f17277a = i10;
        this.f17278b = vpVar;
        this.f17279c = arrayList;
        this.d = j10;
    }
}
