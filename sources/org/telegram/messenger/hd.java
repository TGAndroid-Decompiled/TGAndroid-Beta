package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class hd implements Runnable {
    public final int f24453a;
    public final qd f24454b;

    public hd(qd qdVar, int i7) {
        this.f24453a = i7;
        this.f24454b = qdVar;
    }

    @Override
    public final void run() {
        switch (this.f24453a) {
            case 0:
                qd qdVar = this.f24454b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = qdVar.getMessagesStorage().f27082b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f26253a = queryFinalized.longValue(0);
                        obj.f26254b = queryFinalized.intValue(1);
                        obj.f26255c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f26257f = queryFinalized.intValue(5);
                        obj.f26256e = qdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            fj fjVar = new fj(qdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = fjVar;
                            tr.e(fjVar.f23993k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (n5.z(obj.f26253a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f26253a))) {
                                arrayList5.add(Long.valueOf(-obj.f26253a));
                            }
                        } else if (n5.E(obj.f26253a) && !arrayList4.contains(Long.valueOf(obj.f26253a))) {
                            arrayList4.add(Long.valueOf(obj.f26253a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        qdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    qdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.g3(new tl(qdVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                qd qdVar2 = this.f24454b;
                qdVar2.J.clear();
                qdVar2.K.b();
                qd.s();
                ks.e().k(283, new Object[0]);
                return;
            case 2:
                qd qdVar3 = this.f24454b;
                qdVar3.I = 0L;
                qdVar3.G.clear();
                qdVar3.f26407a.b();
                qdVar3.f26408b.clear();
                qdVar3.f26414s = null;
                qdVar3.r(true);
                return;
            case 3:
                this.f24454b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                qd qdVar4 = this.f24454b;
                qdVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) qdVar4.N).f6279a.e();
                    qdVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                qd qdVar5 = this.f24454b;
                qd f10 = qd.f(qdVar5.getAccountInstance().f23246a);
                qdVar5.getNotificationCenter().b(f10, 1);
                qdVar5.getNotificationCenter().b(f10, 7);
                qdVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                qd qdVar6 = this.f24454b;
                ArrayList arrayList6 = qdVar6.f26408b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    pd pdVar = (pd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = qdVar6.getMessagesController().l1(pdVar.f26253a);
                    tL_messages_editMessage.f28515id = pdVar.f26254b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    qdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new id(qdVar6, 1));
                }
                arrayList6.clear();
                qdVar6.f26407a.b();
                qdVar6.l(null, 2);
                qdVar6.r(true);
                g0.g3(new hd(qdVar6, 1));
                return;
        }
    }
}
