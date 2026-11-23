package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dk implements Runnable {
    public final int f23533a;
    public final np f23534b;
    public final ArrayList f23535c;
    public final long d;

    public dk(np npVar, long j3, ArrayList arrayList, int i7) {
        this.f23533a = i7;
        this.f23534b = npVar;
        this.d = j3;
        this.f23535c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        long j10;
        int i10 = this.f23533a;
        long j11 = this.d;
        ArrayList arrayList = this.f23535c;
        np npVar = this.f23534b;
        switch (i10) {
            case 0:
                ur messagesStorage = npVar.getMessagesStorage();
                long j12 = this.d;
                ArrayList arrayList2 = this.f23535c;
                npVar.getMessagesStorage().R1(j12, -j12, arrayList2, messagesStorage.P0(j12, arrayList2, false, true, 0, 0));
                return;
            case 1:
                npVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j11), Boolean.FALSE);
                if (j11 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        gj gjVar = (gj) npVar.V.get(((Integer) arrayList.get(i11)).intValue());
                        if (gjVar != null) {
                            gjVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) npVar.S.f(-j11);
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        gj gjVar2 = (gj) arrayList3.get(i12);
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            } else if (gjVar2.e1() == ((Integer) arrayList.get(i13)).intValue()) {
                                gjVar2.Z = true;
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
                    npVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        np messagesController = npVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i7 = message.date;
                        } else {
                            i7 = 0;
                        }
                        long j13 = this.d;
                        if (npVar.E2(j13)) {
                            j3 = n5.o(tL_forumTopic.from_id);
                        } else {
                            j3 = tL_forumTopic.f28450id;
                        }
                        messagesController.q3(j13, i15, 0, i7, false, j3, 0, true, 0);
                        ur messagesStorage2 = npVar.getMessagesStorage();
                        long j14 = -j13;
                        if (npVar.E2(j13)) {
                            j10 = n5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f28450id;
                        }
                        messagesStorage2.d2(j14, j10, tL_forumTopic.top_message, 0);
                    }
                }
                npVar.getMessagesStorage().f27214a.c(new sj(npVar, 20));
                return;
            case 3:
                npVar.x5(0, -j11, arrayList);
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                g0.g3(new dk(this.f23534b, this.d, this.f23535c, 5));
                return;
            default:
                npVar.x5(0, j11, arrayList);
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public dk(np npVar, ArrayList arrayList, long j3, int i7) {
        this.f23533a = i7;
        this.f23534b = npVar;
        this.f23535c = arrayList;
        this.d = j3;
    }
}
