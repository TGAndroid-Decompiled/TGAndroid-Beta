package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class cd implements Runnable {
    public final int f22009a;
    public final ld f22010b;

    public cd(ld ldVar, int i3) {
        this.f22009a = i3;
        this.f22010b = ldVar;
    }

    @Override
    public final void run() {
        switch (this.f22009a) {
            case 0:
                ld ldVar = this.f22010b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = ldVar.getMessagesStorage().f24936b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f23810a = queryFinalized.longValue(0);
                        obj.f23811b = queryFinalized.intValue(1);
                        obj.f23812c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f23814f = queryFinalized.intValue(5);
                        obj.f23813e = ldVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            zi ziVar = new zi(ldVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = ziVar;
                            qr.e(ziVar.f26868k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (m5.z(obj.f23810a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f23810a))) {
                                arrayList5.add(Long.valueOf(-obj.f23810a));
                            }
                        } else if (m5.E(obj.f23810a) && !arrayList4.contains(Long.valueOf(obj.f23810a))) {
                            arrayList4.add(Long.valueOf(obj.f23810a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        ldVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    ldVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.h3(new ul(ldVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                ld ldVar2 = this.f22010b;
                ldVar2.J.clear();
                ldVar2.K.b();
                ld.s();
                hs.e().k(280, new Object[0]);
                return;
            case 2:
                ld ldVar3 = this.f22010b;
                ldVar3.I = 0L;
                ldVar3.G.clear();
                ldVar3.f23974a.b();
                ldVar3.f23975b.clear();
                ldVar3.f23981s = null;
                ldVar3.r(true);
                return;
            case 3:
                this.f22010b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                ld ldVar4 = this.f22010b;
                ldVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gi.v5) ldVar4.N).f13688b).g();
                    ldVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                ld ldVar5 = this.f22010b;
                ld f10 = ld.f(ldVar5.getAccountInstance().f21919a);
                ldVar5.getNotificationCenter().b(f10, 1);
                ldVar5.getNotificationCenter().b(f10, 7);
                ldVar5.getNotificationCenter().b(f10, 49);
                return;
            default:
                ld ldVar6 = this.f22010b;
                ArrayList arrayList6 = ldVar6.f23975b;
                for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                    kd kdVar = (kd) arrayList6.get(i3);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ldVar6.getMessagesController().j1(kdVar.f23810a);
                    tL_messages_editMessage.f27085id = kdVar.f23811b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ldVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new dd(ldVar6, 1));
                }
                arrayList6.clear();
                ldVar6.f23974a.b();
                ldVar6.l(null, 2);
                ldVar6.r(true);
                g0.h3(new cd(ldVar6, 1));
                return;
        }
    }
}
