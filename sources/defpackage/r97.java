package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r97 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public int f;
    public int g;

    public r97(int i, long j) {
        long j2;
        int i2;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = -1;
        this.a = i;
        this.b = j;
        if (!this.c && !this.d) {
            boolean isEmpty = arrayList.isEmpty();
            this.c = true;
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            tL_messages_getCommonChats.user_id = na7.q1(i).m1(j);
            if (arrayList.isEmpty()) {
                j2 = 0;
            } else {
                j2 = ((TLRPC.Chat) b00.f(1, arrayList)).id;
            }
            tL_messages_getCommonChats.max_id = j2;
            if (isEmpty) {
                i2 = 15;
            } else {
                i2 = 30;
            }
            tL_messages_getCommonChats.limit = i2;
            int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCommonChats, new mi1(this, r7, isEmpty, (byte) 9));
            this.f = sendRequest;
            int[] iArr = {sendRequest};
        }
    }
}
