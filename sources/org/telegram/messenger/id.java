package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class id implements Runnable {
    public final int f24670a;
    public final rd f24671b;

    public id(rd rdVar, int i7) {
        this.f24670a = i7;
        this.f24671b = rdVar;
    }

    @Override
    public final void run() {
        switch (this.f24670a) {
            case 0:
                rd rdVar = this.f24671b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = rdVar.getMessagesStorage().f27216b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f26398a = queryFinalized.longValue(0);
                        obj.f26399b = queryFinalized.intValue(1);
                        obj.f26400c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f26402f = queryFinalized.intValue(5);
                        obj.f26401e = rdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            gj gjVar = new gj(rdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = gjVar;
                            ur.e(gjVar.f24177k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (n5.z(obj.f26398a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f26398a))) {
                                arrayList5.add(Long.valueOf(-obj.f26398a));
                            }
                        } else if (n5.E(obj.f26398a) && !arrayList4.contains(Long.valueOf(obj.f26398a))) {
                            arrayList4.add(Long.valueOf(obj.f26398a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        rdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    rdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.g3(new ul(rdVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                rd rdVar2 = this.f24671b;
                rdVar2.J.clear();
                rdVar2.K.b();
                rd.s();
                ls.e().k(283, new Object[0]);
                return;
            case 2:
                rd rdVar3 = this.f24671b;
                rdVar3.I = 0L;
                rdVar3.G.clear();
                rdVar3.f26554a.b();
                rdVar3.f26555b.clear();
                rdVar3.f26561s = null;
                rdVar3.r(true);
                return;
            case 3:
                this.f24671b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                rd rdVar4 = this.f24671b;
                rdVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) rdVar4.N).f6245a.e();
                    rdVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                rd rdVar5 = this.f24671b;
                rd f10 = rd.f(rdVar5.getAccountInstance().f23166a);
                rdVar5.getNotificationCenter().b(f10, 1);
                rdVar5.getNotificationCenter().b(f10, 7);
                rdVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                rd rdVar6 = this.f24671b;
                ArrayList arrayList6 = rdVar6.f26555b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    qd qdVar = (qd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar6.getMessagesController().l1(qdVar.f26398a);
                    tL_messages_editMessage.f28482id = qdVar.f26399b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar6, 1));
                }
                arrayList6.clear();
                rdVar6.f26554a.b();
                rdVar6.l(null, 2);
                rdVar6.r(true);
                g0.g3(new id(rdVar6, 1));
                return;
        }
    }
}
