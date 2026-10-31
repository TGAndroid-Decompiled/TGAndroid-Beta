package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class ed implements Runnable {
    public final int f15377a;
    public final nd f15378b;

    public ed(nd ndVar, int i10) {
        this.f15377a = i10;
        this.f15378b = ndVar;
    }

    @Override
    public final void run() {
        switch (this.f15377a) {
            case 0:
                nd ndVar = this.f15378b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = ndVar.getMessagesStorage().f15940b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f16940a = queryFinalized.longValue(0);
                        obj.f16941b = queryFinalized.intValue(1);
                        obj.f16942c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f16943f = queryFinalized.intValue(5);
                        obj.e = ndVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            jj jjVar = new jj(ndVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = jjVar;
                            hs.e(jjVar.f16337k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (o5.z(obj.f16940a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f16940a))) {
                                arrayList5.add(Long.valueOf(-obj.f16940a));
                            }
                        } else if (o5.E(obj.f16940a) && !arrayList4.contains(Long.valueOf(obj.f16940a))) {
                            arrayList4.add(Long.valueOf(obj.f16940a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        ndVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    ndVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    i0.g3(new ul(ndVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                nd ndVar2 = this.f15378b;
                ndVar2.I.clear();
                ndVar2.J.b();
                nd.s();
                zs.e().k(280, new Object[0]);
                return;
            case 2:
                nd ndVar3 = this.f15378b;
                ndVar3.H = 0L;
                ndVar3.F.clear();
                ndVar3.f17082a.b();
                ndVar3.f17083b.clear();
                ndVar3.f17088s = null;
                ndVar3.r(true);
                return;
            case 3:
                this.f15378b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                nd ndVar4 = this.f15378b;
                ndVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.h0) ndVar4.M).f4415a.e();
                    ndVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                nd ndVar5 = this.f15378b;
                nd f7 = nd.f(ndVar5.getAccountInstance().f14863a);
                ndVar5.getNotificationCenter().b(f7, 1);
                ndVar5.getNotificationCenter().b(f7, 7);
                ndVar5.getNotificationCenter().b(f7, 49);
                return;
            default:
                nd ndVar6 = this.f15378b;
                ArrayList arrayList6 = ndVar6.f17083b;
                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                    md mdVar = (md) arrayList6.get(i10);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ndVar6.getMessagesController().i1(mdVar.f16940a);
                    tL_messages_editMessage.f19877id = mdVar.f16941b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ndVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new fd(ndVar6, 1));
                }
                arrayList6.clear();
                ndVar6.f17082a.b();
                ndVar6.l(null, 2);
                ndVar6.r(true);
                i0.g3(new ed(ndVar6, 1));
                return;
        }
    }
}
