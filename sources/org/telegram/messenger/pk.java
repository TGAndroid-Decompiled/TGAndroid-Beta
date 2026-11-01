package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pk implements Runnable {
    public final int f17610a;
    public final wp f17611b;
    public final ArrayList f17612c;
    public final long d;

    public pk(wp wpVar, long j10, ArrayList arrayList, int i10) {
        this.f17610a = i10;
        this.f17611b = wpVar;
        this.d = j10;
        this.f17612c = arrayList;
    }

    @Override
    public final void run() {
        int i10;
        long j10;
        long j11;
        int i11 = this.f17610a;
        long j12 = this.d;
        ArrayList arrayList = this.f17612c;
        wp wpVar = this.f17611b;
        switch (i11) {
            case 0:
                is messagesStorage = wpVar.getMessagesStorage();
                long j13 = this.d;
                ArrayList arrayList2 = this.f17612c;
                wpVar.getMessagesStorage().R1(j13, -j13, arrayList2, messagesStorage.P0(j13, arrayList2, false, true, 0, 0));
                return;
            case 1:
                wpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j12), Boolean.FALSE);
                if (j12 == 0) {
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        kj kjVar = (kj) wpVar.U.get(((Integer) arrayList.get(i12)).intValue());
                        if (kjVar != null) {
                            kjVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) wpVar.R.f(-j12);
                if (arrayList3 != null) {
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        kj kjVar2 = (kj) arrayList3.get(i13);
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                break;
                            } else if (kjVar2.f1() == ((Integer) arrayList.get(i14)).intValue()) {
                                kjVar2.Z = true;
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
                    wpVar.getClass();
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i15);
                        wp messagesController = wpVar.getMessagesController();
                        int i16 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i10 = message.date;
                        } else {
                            i10 = 0;
                        }
                        long j14 = this.d;
                        if (wpVar.x2(j14)) {
                            j10 = o5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f19846id;
                        }
                        messagesController.h3(j14, i16, 0, i10, false, j10, 0, true, 0);
                        is messagesStorage2 = wpVar.getMessagesStorage();
                        long j15 = -j14;
                        if (wpVar.x2(j14)) {
                            j11 = o5.o(tL_forumTopic.from_id);
                        } else {
                            j11 = tL_forumTopic.f19846id;
                        }
                        messagesStorage2.d2(j15, j11, tL_forumTopic.top_message, 0);
                    }
                }
                wpVar.getMessagesStorage().f16331a.c(new ak(wpVar, 19));
                return;
            case 3:
                wpVar.i5(0, -j12, arrayList);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                i0.g3(new pk(this.f17611b, this.d, this.f17612c, 5));
                return;
            default:
                wpVar.i5(0, j12, arrayList);
                wpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public pk(wp wpVar, ArrayList arrayList, long j10, int i10) {
        this.f17610a = i10;
        this.f17611b = wpVar;
        this.f17612c = arrayList;
        this.d = j10;
    }
}
