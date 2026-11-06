package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class to {
    public final int f25645a;
    public final long f25646b;
    public boolean f25647c;
    public boolean d;
    public final ArrayList f25648e;
    public int f25649f;
    public int f25650g;

    public to(int i7, long j3) {
        long j10;
        int i10;
        ArrayList arrayList = new ArrayList();
        this.f25648e = arrayList;
        this.f25649f = -1;
        this.f25645a = i7;
        this.f25646b = j3;
        if (!this.f25647c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.f25647c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = qp.s1(i7).o1(j3);
            if (arrayList.isEmpty()) {
                j10 = 0;
            } else {
                j10 = ((TLRPC.Chat) jg.g.i(1, arrayList)).f26953id;
            }
            tL_messages_getCommonChats.max_id = j10;
            if (isEmpty) {
                i10 = 15;
            } else {
                i10 = 30;
            }
            tL_messages_getCommonChats.limit = i10;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCommonChats, new n3(this, r7, isEmpty, 4));
            this.f25649f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
