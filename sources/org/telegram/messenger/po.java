package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class po {
    public final int f26280a;
    public final long f26281b;
    public boolean f26282c;
    public boolean d;
    public final ArrayList f26283e;
    public int f26284f;
    public int f26285g;

    public po(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f26283e = arrayList;
        this.f26284f = -1;
        this.f26280a = i7;
        this.f26281b = j3;
        if (!this.f26282c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f26282c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = mp.u1(i7).q1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) i5.c.h(1, arrayList)).f28405id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new p3(this, r7, isEmpty, 4));
            this.f26284f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
