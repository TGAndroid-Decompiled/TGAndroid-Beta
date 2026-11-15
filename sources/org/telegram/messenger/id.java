package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class id implements Runnable {
    public final int f24376a;
    public final rd f24377b;

    public id(rd rdVar, int i7) {
        this.f24376a = i7;
        this.f24377b = rdVar;
    }

    @Override
    public final void run() {
        switch (this.f24376a) {
            case 0:
                rd rdVar = this.f24377b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = rdVar.getMessagesStorage().f27221b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f26078a = queryFinalized.longValue(0);
                        obj.f26079b = queryFinalized.intValue(1);
                        obj.f26080c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f26082f = queryFinalized.intValue(5);
                        obj.f26081e = rdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            gj gjVar = new gj(rdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = gjVar;
                            vr.e(gjVar.f23819k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (m5.z(obj.f26078a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f26078a))) {
                                arrayList5.add(Long.valueOf(-obj.f26078a));
                            }
                        } else if (m5.E(obj.f26078a) && !arrayList4.contains(Long.valueOf(obj.f26078a))) {
                            arrayList4.add(Long.valueOf(obj.f26078a));
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
                    g0.h3(new bm(rdVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                rd rdVar2 = this.f24377b;
                rdVar2.J.clear();
                rdVar2.K.b();
                rd.s();
                ns.e().k(280, new Object[0]);
                return;
            case 2:
                rd rdVar3 = this.f24377b;
                rdVar3.I = 0L;
                rdVar3.G.clear();
                rdVar3.f26277a.b();
                rdVar3.f26278b.clear();
                rdVar3.f26284s = null;
                rdVar3.r(true);
                return;
            case 3:
                this.f24377b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                rd rdVar4 = this.f24377b;
                rdVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) rdVar4.N).f5970a.e();
                    rdVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                rd rdVar5 = this.f24377b;
                rd f10 = rd.f(rdVar5.getAccountInstance().f22782a);
                rdVar5.getNotificationCenter().b(f10, 1);
                rdVar5.getNotificationCenter().b(f10, 7);
                rdVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                rd rdVar6 = this.f24377b;
                ArrayList arrayList6 = rdVar6.f26278b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    qd qdVar = (qd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar6.getMessagesController().j1(qdVar.f26078a);
                    tL_messages_editMessage.f28135id = qdVar.f26079b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar6, 1));
                }
                arrayList6.clear();
                rdVar6.f26277a.b();
                rdVar6.l(null, 2);
                rdVar6.r(true);
                g0.h3(new id(rdVar6, 1));
                return;
        }
    }
}
