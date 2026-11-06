package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class id implements Runnable {
    public final int f23160a;
    public final sd f23161b;

    public id(sd sdVar, int i7) {
        this.f23160a = i7;
        this.f23161b = sdVar;
    }

    @Override
    public final void run() {
        switch (this.f23160a) {
            case 0:
                sd sdVar = this.f23161b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = sdVar.getMessagesStorage().f26690b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f25265a = queryFinalized.longValue(0);
                        obj.f25266b = queryFinalized.intValue(1);
                        obj.f25267c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f25269f = queryFinalized.intValue(5);
                        obj.f25268e = sdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            ij ijVar = new ij(sdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = ijVar;
                            yr.e(ijVar.f23237k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (m5.z(obj.f25265a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f25265a))) {
                                arrayList5.add(Long.valueOf(-obj.f25265a));
                            }
                        } else if (m5.E(obj.f25265a) && !arrayList4.contains(Long.valueOf(obj.f25265a))) {
                            arrayList4.add(Long.valueOf(obj.f25265a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        sdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    sdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.h3(new em(sdVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                sd sdVar2 = this.f23161b;
                sdVar2.I.clear();
                sdVar2.J.b();
                sd.s();
                qs.e().k(280, new Object[0]);
                return;
            case 2:
                sd sdVar3 = this.f23161b;
                sdVar3.H = 0L;
                sdVar3.F.clear();
                sdVar3.f25441a.b();
                sdVar3.f25442b.clear();
                sdVar3.f25448s = null;
                sdVar3.r(true);
                return;
            case 3:
                this.f23161b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                sd sdVar4 = this.f23161b;
                sdVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gf.g) sdVar4.M).f13889b).f();
                    sdVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                sd sdVar5 = this.f23161b;
                sd f10 = sd.f(sdVar5.getAccountInstance().f21723a);
                sdVar5.getNotificationCenter().b(f10, 1);
                sdVar5.getNotificationCenter().b(f10, 7);
                sdVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                sd sdVar6 = this.f23161b;
                ArrayList arrayList6 = sdVar6.f25442b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    rd rdVar = (rd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = sdVar6.getMessagesController().j1(rdVar.f25265a);
                    tL_messages_editMessage.f27036id = rdVar.f25266b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    sdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(sdVar6, 1));
                }
                arrayList6.clear();
                sdVar6.f25441a.b();
                sdVar6.l(null, 2);
                sdVar6.r(true);
                g0.h3(new id(sdVar6, 1));
                return;
        }
    }
}
