package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class fd implements Runnable {
    public final int f15718a;
    public final od f15719b;

    public fd(od odVar, int i10) {
        this.f15718a = i10;
        this.f15719b = odVar;
    }

    @Override
    public final void run() {
        switch (this.f15718a) {
            case 0:
                od odVar = this.f15719b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = odVar.getMessagesStorage().f16333b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.f17282a = queryFinalized.longValue(0);
                        obj.f17283b = queryFinalized.intValue(1);
                        obj.f17284c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f17285f = queryFinalized.intValue(5);
                        obj.e = odVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            kj kjVar = new kj(odVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = kjVar;
                            is.e(kjVar.f16690k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        if (o5.z(obj.f17282a)) {
                            if (!arrayList5.contains(Long.valueOf(-obj.f17282a))) {
                                arrayList5.add(Long.valueOf(-obj.f17282a));
                            }
                        } else if (o5.E(obj.f17282a) && !arrayList4.contains(Long.valueOf(obj.f17282a))) {
                            arrayList4.add(Long.valueOf(obj.f17282a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        odVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    odVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    i0.g3(new vl(odVar, arrayList2, arrayList3, arrayList, 10));
                    return;
                }
                return;
            case 1:
                od odVar2 = this.f15719b;
                odVar2.I.clear();
                odVar2.J.b();
                od.s();
                at.e().k(280, new Object[0]);
                return;
            case 2:
                od odVar3 = this.f15719b;
                odVar3.H = 0L;
                odVar3.F.clear();
                odVar3.f17419a.b();
                odVar3.f17420b.clear();
                odVar3.f17425s = null;
                odVar3.r(true);
                return;
            case 3:
                this.f15719b.a(true);
                return;
            case 4:
                Boolean bool = Boolean.FALSE;
                od odVar4 = this.f15719b;
                odVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.h0) odVar4.M).f4415a.e();
                    odVar4.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                od odVar5 = this.f15719b;
                od f7 = od.f(odVar5.getAccountInstance().f15043a);
                odVar5.getNotificationCenter().b(f7, 1);
                odVar5.getNotificationCenter().b(f7, 7);
                odVar5.getNotificationCenter().b(f7, 49);
                return;
            default:
                od odVar6 = this.f15719b;
                ArrayList arrayList6 = odVar6.f17420b;
                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                    nd ndVar = (nd) arrayList6.get(i10);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = odVar6.getMessagesController().i1(ndVar.f17282a);
                    tL_messages_editMessage.f19878id = ndVar.f17283b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    odVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new gd(odVar6, 1));
                }
                arrayList6.clear();
                odVar6.f17419a.b();
                odVar6.l(null, 2);
                odVar6.r(true);
                i0.g3(new fd(odVar6, 1));
                return;
        }
    }
}
