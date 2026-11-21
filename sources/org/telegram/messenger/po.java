package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class po {
    public final int f26306a;
    public final long f26307b;
    public boolean f26308c;
    public boolean d;
    public final ArrayList f26309e;
    public int f26310f;
    public int f26311g;

    public po(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f26309e = arrayList;
        this.f26310f = -1;
        this.f26306a = i7;
        this.f26307b = j3;
        if (!this.f26308c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f26308c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = mp.u1(i7).q1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) i5.c.h(1, arrayList)).f28431id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new p3(this, r7, isEmpty, 4));
            this.f26310f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
