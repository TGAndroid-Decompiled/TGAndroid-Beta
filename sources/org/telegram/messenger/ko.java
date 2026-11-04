package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ko {
    public final int f23854a;
    public final long f23855b;
    public boolean f23856c;
    public boolean d;
    public final ArrayList f23857e;
    public int f23858f;
    public int f23859g;

    public ko(int i3, long j10) {
        long j11;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f23857e = arrayList;
        this.f23858f = -1;
        this.f23854a = i3;
        this.f23855b = j10;
        if (!this.f23856c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f23856c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = hp.s1(i3).o1(j10);
            if (arrayList.isEmpty()) {
                j11 = 0;
            } else {
                j11 = ((TLRPC.Chat) k2.p1.h(1, arrayList)).f27001id;
            }
            tL_messages_getCommonChats.max_id = j11;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getCommonChats, new n3(this, r7, isEmpty, 4));
            this.f23858f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
