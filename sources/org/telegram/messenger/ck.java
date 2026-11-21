package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ck implements Runnable {
    public final int f23397a;
    public final mp f23398b;
    public final ArrayList f23399c;
    public final long d;

    public ck(mp mpVar, long j3, ArrayList arrayList, int i7) {
        this.f23397a = i7;
        this.f23398b = mpVar;
        this.d = j3;
        this.f23399c = arrayList;
    }

    @Override
    public final void run() {
        int i7;
        long j3;
        long j10;
        int i10 = this.f23397a;
        long j11 = this.d;
        ArrayList arrayList = this.f23399c;
        mp mpVar = this.f23398b;
        switch (i10) {
            case 0:
                tr messagesStorage = mpVar.getMessagesStorage();
                long j12 = this.d;
                ArrayList arrayList2 = this.f23399c;
                mpVar.getMessagesStorage().R1(j12, -j12, arrayList2, messagesStorage.P0(j12, arrayList2, false, true, 0, 0));
                return;
            case 1:
                mpVar.getNotificationCenter().k(7, arrayList, Long.valueOf(j11), Boolean.FALSE);
                if (j11 == 0) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        fj fjVar = (fj) mpVar.V.get(((Integer) arrayList.get(i11)).intValue());
                        if (fjVar != null) {
                            fjVar.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) mpVar.S.f(-j11);
                if (arrayList3 != null) {
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        fj fjVar2 = (fj) arrayList3.get(i12);
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            } else if (fjVar2.e1() == ((Integer) arrayList.get(i13)).intValue()) {
                                fjVar2.Z = true;
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
                    mpVar.getClass();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i14);
                        mp messagesController = mpVar.getMessagesController();
                        int i15 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i7 = message.date;
                        } else {
                            i7 = 0;
                        }
                        long j13 = this.d;
                        if (mpVar.E2(j13)) {
                            j3 = n5.o(tL_forumTopic.from_id);
                        } else {
                            j3 = tL_forumTopic.f28483id;
                        }
                        messagesController.q3(j13, i15, 0, i7, false, j3, 0, true, 0);
                        tr messagesStorage2 = mpVar.getMessagesStorage();
                        long j14 = -j13;
                        if (mpVar.E2(j13)) {
                            j10 = n5.o(tL_forumTopic.from_id);
                        } else {
                            j10 = tL_forumTopic.f28483id;
                        }
                        messagesStorage2.d2(j14, j10, tL_forumTopic.top_message, 0);
                    }
                }
                mpVar.getMessagesStorage().f27080a.c(new rj(mpVar, 20));
                return;
            case 3:
                mpVar.x5(0, -j11, arrayList);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
            case 4:
                g0.g3(new ck(this.f23398b, this.d, this.f23399c, 5));
                return;
            default:
                mpVar.x5(0, j11, arrayList);
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public ck(mp mpVar, ArrayList arrayList, long j3, int i7) {
        this.f23397a = i7;
        this.f23398b = mpVar;
        this.f23399c = arrayList;
        this.d = j3;
    }
}
