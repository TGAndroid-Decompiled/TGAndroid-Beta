package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class uc6 implements Runnable {
    public final byte a;
    public final dd6 b;

    public uc6(dd6 dd6Var, byte b) {
        this.a = b;
        this.b = dd6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        dd6 dd6Var = this.b;
        switch (b) {
            case 0:
                dd6 dd6Var2 = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = dd6Var2.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        ?? obj = new Object();
                        obj.a = queryFinalized.longValue(0);
                        obj.b = queryFinalized.intValue(1);
                        obj.c = queryFinalized.intValue(2);
                        obj.d = queryFinalized.intValue(3);
                        obj.f = queryFinalized.intValue(5);
                        obj.e = dd6Var2.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            k47 k47Var = new k47(dd6Var2.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            obj.h = k47Var;
                            cf7.d(k47Var.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(obj);
                        boolean y = pg3.y(obj.a);
                        long j = obj.a;
                        if (y) {
                            if (!arrayList5.contains(Long.valueOf(-j))) {
                                arrayList5.add(Long.valueOf(-obj.a));
                            }
                        } else if (pg3.D(j) && !arrayList4.contains(Long.valueOf(obj.a))) {
                            arrayList4.add(Long.valueOf(obj.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        dd6Var2.getMessagesStorage().P(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    dd6Var2.getMessagesStorage().k0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    gm.c3(new d65(dd6Var2, arrayList2, arrayList3, arrayList, (byte) 14));
                    return;
                }
                return;
            case 1:
                dd6Var.J.clear();
                dd6Var.K.b();
                dd6.s();
                nm7.e().k(285, new Object[0]);
                return;
            case 2:
                dd6Var.I = 0L;
                dd6Var.G.clear();
                dd6Var.a.b();
                dd6Var.b.clear();
                dd6Var.s = null;
                dd6Var.r(true);
                return;
            case 3:
                dd6Var.a(true);
                return;
            case 4:
                dd6Var.L = Boolean.FALSE;
                try {
                    ((o3d) ((fk3) dd6Var.N).a).d();
                    dd6Var.p();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                dd6 f = dd6.f(dd6Var.getAccountInstance().a);
                dd6Var.getNotificationCenter().a(f, 1);
                dd6Var.getNotificationCenter().a(f, 7);
                dd6Var.getNotificationCenter().a(f, 50);
                return;
            default:
                ArrayList arrayList6 = dd6Var.b;
                for (int i = 0; i < arrayList6.size(); i++) {
                    cd6 cd6Var = (cd6) arrayList6.get(i);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = dd6Var.getMessagesController().i1(cd6Var.a);
                    tL_messages_editMessage.id = cd6Var.b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    dd6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new vc6(dd6Var, (byte) 1));
                }
                arrayList6.clear();
                dd6Var.a.b();
                dd6Var.l(null, 2);
                dd6Var.r(true);
                gm.c3(new uc6(dd6Var, (byte) 1));
                return;
        }
    }
}
