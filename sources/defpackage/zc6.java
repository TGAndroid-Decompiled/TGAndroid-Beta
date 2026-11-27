package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class zc6 implements Runnable {
    public final byte a;
    public final id6 b;

    public zc6(id6 id6Var, byte b) {
        this.a = b;
        this.b = id6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id6 id6Var = this.b;
        switch (b) {
            case 0:
                id6 id6Var2 = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = id6Var2.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.a = queryFinalized.longValue(0);
                        obj.b = queryFinalized.intValue(1);
                        obj.c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f = queryFinalized.intValue(5);
                        obj.e = id6Var2.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            r47 r47Var = new r47(id6Var2.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = r47Var;
                            kf7.d(r47Var.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        boolean y = wf3.y(obj.a);
                        long j = obj.a;
                        if (y) {
                            if (!arrayList5.contains(Long.valueOf(-j))) {
                                arrayList5.add(Long.valueOf(-obj.a));
                            }
                        } else if (wf3.D(j) && !arrayList4.contains(Long.valueOf(obj.a))) {
                            arrayList4.add(Long.valueOf(obj.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        id6Var2.getMessagesStorage().R(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    id6Var2.getMessagesStorage().m0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    hl.c3(new g65(id6Var2, arrayList2, arrayList3, arrayList, (byte) 14));
                    return;
                }
                return;
            case 1:
                id6Var.J.clear();
                id6Var.K.b();
                id6.s();
                jn7.e().k(284, new Object[0]);
                return;
            case 2:
                id6Var.I = 0L;
                id6Var.G.clear();
                id6Var.a.b();
                id6Var.b.clear();
                id6Var.s = null;
                id6Var.r(true);
                return;
            case 3:
                id6Var.L = Boolean.FALSE;
                try {
                    ((d6d) ((aj3) id6Var.N).b).d();
                    id6Var.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                id6 f = id6.f(id6Var.getAccountInstance().a);
                id6Var.getNotificationCenter().a(f, 1);
                id6Var.getNotificationCenter().a(f, 7);
                id6Var.getNotificationCenter().a(f, 50);
                return;
            case 5:
                ArrayList arrayList6 = id6Var.b;
                for (int i = 0; i < arrayList6.size(); i++) {
                    hd6 hd6Var = (hd6) arrayList6.get(i);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = id6Var.getMessagesController().j1(hd6Var.a);
                    tL_messages_editMessage.id = hd6Var.b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    id6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new ad6(id6Var, (byte) 0));
                }
                arrayList6.clear();
                id6Var.a.b();
                id6Var.l(null, 2);
                id6Var.r(true);
                hl.c3(new zc6(id6Var, (byte) 1));
                return;
            default:
                id6Var.a(true);
                return;
        }
    }
}
