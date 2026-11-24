package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m57 implements Runnable {
    public final byte a;
    public final na7 b;
    public final ArrayList c;
    public final long d;

    public m57(na7 na7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = na7Var;
        this.d = j;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        int i;
        long j;
        long j2;
        byte b = this.a;
        long j3 = this.d;
        ArrayList arrayList = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                ad7 messagesStorage = na7Var.getMessagesStorage();
                long j4 = this.d;
                ArrayList arrayList2 = this.c;
                na7Var.getMessagesStorage().O1(j4, -j4, arrayList2, messagesStorage.M0(j4, arrayList2, false, true, 0, 0));
                return;
            case 1:
                na7Var.getNotificationCenter().k(7, arrayList, Long.valueOf(j3), Boolean.FALSE);
                if (j3 == 0) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        k27 k27Var = (k27) na7Var.V.get(((Integer) arrayList.get(i2)).intValue());
                        if (k27Var != null) {
                            k27Var.Z = true;
                        }
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) na7Var.S.f(-j3);
                if (arrayList3 != null) {
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        k27 k27Var2 = (k27) arrayList3.get(i3);
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            } else if (k27Var2.e1() == ((Integer) arrayList.get(i4)).intValue()) {
                                k27Var2.Z = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                if (arrayList != null) {
                    na7Var.getClass();
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i5);
                        na7 messagesController = na7Var.getMessagesController();
                        int i6 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        if (message != null) {
                            i = message.date;
                        } else {
                            i = 0;
                        }
                        long j5 = this.d;
                        if (na7Var.x2(j5)) {
                            j = cf3.n(tL_forumTopic.from_id);
                        } else {
                            j = tL_forumTopic.id;
                        }
                        messagesController.k3(j5, i6, 0, i, false, j, 0, true, 0);
                        ad7 messagesStorage2 = na7Var.getMessagesStorage();
                        long j6 = -j5;
                        if (na7Var.x2(j5)) {
                            j2 = cf3.n(tL_forumTopic.from_id);
                        } else {
                            j2 = tL_forumTopic.id;
                        }
                        messagesStorage2.a2(tL_forumTopic.top_message, 0, j6, j2);
                    }
                }
                na7Var.getMessagesStorage().a.c(new f67(na7Var, (byte) 28));
                return;
            case 3:
                gl.d3(new m57(this.b, this.d, this.c, (byte) 5));
                return;
            case 4:
                na7Var.q5(0, -j3, arrayList);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                na7Var.q5(0, j3, arrayList);
                na7Var.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }

    public m57(na7 na7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = arrayList;
        this.d = j;
    }
}
