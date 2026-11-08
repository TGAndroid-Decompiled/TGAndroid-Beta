package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class jd implements Runnable {
    public final int f23537a;
    public final sd f23538b;

    public jd(sd sdVar, int i7) {
        this.f23537a = i7;
        this.f23538b = sdVar;
    }

    @Override
    public final void run() {
        switch (this.f23537a) {
            case 0:
                sd sdVar = this.f23538b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = sdVar.getMessagesStorage().f26721b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f25276a = queryFinalized.longValue(0);
                        obj.f25277b = queryFinalized.intValue(1);
                        obj.f25278c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f25280f = queryFinalized.intValue(5);
                        obj.f25279e = sdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            ij ijVar = new ij(sdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = ijVar;
                            yr.e(ijVar.f23262k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (m5.z(obj.f25276a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f25276a))) {
                                arrayList5.add(Long.valueOf(-obj.f25276a));
                            }
                        } else if (m5.E(obj.f25276a) && !arrayList4.contains(Long.valueOf(obj.f25276a))) {
                            arrayList4.add(Long.valueOf(obj.f25276a));
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
                sd sdVar2 = this.f23538b;
                sdVar2.I.clear();
                sdVar2.J.b();
                sd.s();
                qs.e().k(280, new Object[0]);
                return;
            case 2:
                sd sdVar3 = this.f23538b;
                sdVar3.H = 0L;
                sdVar3.F.clear();
                sdVar3.f25455a.b();
                sdVar3.f25456b.clear();
                sdVar3.f25462s = null;
                sdVar3.r(true);
                return;
            case 3:
                this.f23538b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                sd sdVar4 = this.f23538b;
                sdVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gf.g) sdVar4.M).f13889b).f();
                    sdVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                sd sdVar5 = this.f23538b;
                sd f10 = sd.f(sdVar5.getAccountInstance().f21765a);
                sdVar5.getNotificationCenter().b(f10, 1);
                sdVar5.getNotificationCenter().b(f10, 7);
                sdVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                sd sdVar6 = this.f23538b;
                ArrayList arrayList6 = sdVar6.f25456b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    rd rdVar = (rd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = sdVar6.getMessagesController().j1(rdVar.f25276a);
                    tL_messages_editMessage.f27040id = rdVar.f25277b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    sdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new kd(sdVar6, 1));
                }
                arrayList6.clear();
                sdVar6.f25455a.b();
                sdVar6.l(null, 2);
                sdVar6.r(true);
                g0.h3(new jd(sdVar6, 1));
                return;
        }
    }
}
