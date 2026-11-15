package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class qo {
    public final int f26114a;
    public final long f26115b;
    public boolean f26116c;
    public boolean d;
    public final ArrayList f26117e;
    public int f26118f;
    public int f26119g;

    public qo(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f26117e = arrayList;
        this.f26118f = -1;
        this.f26114a = i7;
        this.f26115b = j3;
        if (!this.f26116c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f26116c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = np.s1(i7).o1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) i5.c.h(1, arrayList)).f28051id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new n3(this, r7, isEmpty, 4));
            this.f26118f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
