package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class po {
    public final int f26278a;
    public final long f26279b;
    public boolean f26280c;
    public boolean d;
    public final ArrayList f26281e;
    public int f26282f;
    public int f26283g;

    public po(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f26281e = arrayList;
        this.f26282f = -1;
        this.f26278a = i7;
        this.f26279b = j3;
        if (!this.f26280c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f26280c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = mp.u1(i7).q1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) i5.c.h(1, arrayList)).f28403id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new p3(this, r7, isEmpty, 4));
            this.f26282f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
