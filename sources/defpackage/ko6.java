package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class ko6 implements Runnable {
    public final byte a;
    public final hq6 b;
    public final long c;

    public ko6(hq6 hq6Var, long j, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = j;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        hq6 hq6Var = this.b;
        long j = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                vf6 vf6Var = hq6Var.z1;
                ArrayList arrayList = (ArrayList) vf6Var.f(j);
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        int i4 = hq6Var.currentAccount;
                        zc7 a = zc7.a(j, k27.b2(i4, (TLRPC.Message) arrayList.get(i3), hc2.b0(i4, j), false));
                        hq6Var.A1.remove(a);
                        hq6Var.getNotificationCenter().k(69, null, a);
                    }
                }
                vf6Var.l(j);
                return;
            case 1:
                hq6Var.q1.l(j);
                return;
            case 2:
                final long j2 = this.c;
                final hq6 hq6Var2 = this.b;
                hq6Var2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = hq6Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j2 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i2 = queryFinalized.intValue(0);
                        i = queryFinalized.intValue(1);
                    } else {
                        i = 0;
                    }
                    queryFinalized.dispose();
                    if (i2 > 0 && hq6Var2.getUserConfig().E != 0) {
                        d = i - hq6Var2.getUserConfig().E;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                final double d2 = d;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        hq6 hq6Var3;
                        long j3;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i5 = 0;
                        while (true) {
                            hq6Var3 = hq6.this;
                            int size = hq6Var3.j1.size();
                            j3 = j2;
                            if (i5 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) hq6Var3.j1.get(i5);
                                if (tL_topPeer.peer.user_id == j3) {
                                    break;
                                }
                                i5++;
                            } else {
                                tL_topPeer = null;
                                break;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                            hq6Var3.j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / hq6Var3.getMessagesController().S2) + tL_topPeer.rating;
                        Collections.sort(hq6Var3.j1, new el6((byte) 5));
                        hq6Var3.getMessagesStorage().a.c(new po6(hq6Var3, j3, 0, tL_topPeer.rating));
                        hq6Var3.getNotificationCenter().k(kk7.R0, new Object[0]);
                    }
                });
                return;
            default:
                hq6 hq6Var3 = this.b;
                ArrayList[] arrayListArr = hq6Var3.v0;
                arrayListArr[0].remove(Long.valueOf(j));
                hq6Var3.w0[0].remove(Long.valueOf(j));
                long[] jArr = hq6Var3.q0;
                ArrayList[] arrayListArr2 = hq6Var3.t0;
                jArr[0] = hq6Var3.q(arrayListArr2[0], false);
                hq6Var3.getNotificationCenter().k(62, new Object[0]);
                hq6Var3.J1(false, arrayListArr2[0], arrayListArr[0], hq6Var3.r0[0], jArr[0], hq6Var3.s0);
                return;
        }
    }
}
