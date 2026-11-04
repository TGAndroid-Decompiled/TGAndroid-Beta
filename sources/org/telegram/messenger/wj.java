package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wj implements Runnable {
    public final int f26218a;
    public final hp f26219b;
    public final ArrayList f26220c;
    public final long d;

    public wj(hp hpVar, long j10, ArrayList arrayList, int i3) {
        this.f26218a = i3;
        this.f26219b = hpVar;
        this.d = j10;
        this.f26220c = arrayList;
    }

    @Override
    public final void run() {
        int i3;
        long j10;
        long j11;
        int i10 = this.f26218a;
        long j12 = this.d;
        ArrayList arrayList = this.f26220c;
        hp hpVar = this.f26219b;
        switch (i10) {
            case 0:
                qr messagesStorage = hpVar.getMessagesStorage();
                long j13 = this.d;
                ArrayList arrayList2 = this.f26220c;
                hpVar.getMessagesStorage().R1(j13, -j13, arrayList2, messagesStorage.P0(j13, arrayList2, false, true, 0, 0));
                return;
            case 1:
                hpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j12), Boolean.FALSE);
                if (j12 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        zi ziVar = (zi) hpVar.V.get(((Integer) arrayList.get(i11)).intValue());
                        if (ziVar != null) {
                            ziVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) hpVar.S.f(-j12);
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        zi ziVar2 = (zi) arrayList3.get(i12);
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            } else if (ziVar2.f1() == ((Integer) arrayList.get(i13)).intValue()) {
                                ziVar2.Z = true;
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
                    hpVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        hp messagesController = hpVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i3 = message.date;
                        } else {
                            i3 = 0;
                        }
                        long j14 = this.d;
                        if (hpVar.y2(j14)) {
                            j10 = m5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f27053id;
                        }
                        messagesController.j3(j14, i15, 0, i3, false, j10, 0, true, 0);
                        qr messagesStorage2 = hpVar.getMessagesStorage();
                        long j15 = -j14;
                        if (hpVar.y2(j14)) {
                            j11 = m5.o(tL_forumTopic.from_id);
                        } else {
                            j11 = tL_forumTopic.f27053id;
                        }
                        messagesStorage2.d2(j15, j11, tL_forumTopic.top_message, 0);
                    }
                }
                hpVar.getMessagesStorage().f24934a.c(new mj(hpVar, 20));
                return;
            case 3:
                hpVar.l5(0, -j12, arrayList);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                g0.h3(new wj(this.f26219b, this.d, this.f26220c, 5));
                return;
            default:
                hpVar.l5(0, j12, arrayList);
                hpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public wj(hp hpVar, ArrayList arrayList, long j10, int i3) {
        this.f26218a = i3;
        this.f26219b = hpVar;
        this.f26220c = arrayList;
        this.d = j10;
    }
}
