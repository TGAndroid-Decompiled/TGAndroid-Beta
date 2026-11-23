package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qo {
    public final int f26451a;
    public final long f26452b;
    public boolean f26453c;
    public boolean d;
    public final ArrayList f26454e;
    public int f26455f;
    public int f26456g;

    public qo(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f26454e = arrayList;
        this.f26455f = -1;
        this.f26451a = i7;
        this.f26452b = j3;
        if (!this.f26453c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f26453c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = np.u1(i7).q1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) i5.c.h(1, arrayList)).f28398id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new p3(this, r7, isEmpty, 4));
            this.f26455f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
