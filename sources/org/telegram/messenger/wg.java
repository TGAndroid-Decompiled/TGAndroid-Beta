package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class wg implements Runnable {
    public final int f27789a;
    public final ri f27790b;
    public final long f27791c;

    public wg(ri riVar, long j3, int i7) {
        this.f27789a = i7;
        this.f27790b = riVar;
        this.f27791c = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f27789a;
        ri riVar = this.f27790b;
        long j3 = this.f27791c;
        int i11 = 0;
        switch (i10) {
            case 0:
                a0.h hVar = riVar.f26756z1;
                ArrayList arrayList = (ArrayList) hVar.f(j3);
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        int i13 = riVar.currentAccount;
                        sr a10 = sr.a(j3, fj.b2(i13, (TLRPC.Message) arrayList.get(i12), v3.b0(i13, j3), false));
                        riVar.A1.remove(a10);
                        riVar.getNotificationCenter().k(69, null, a10);
                    }
                }
                hVar.l(j3);
                return;
            case 1:
                riVar.f26733q1.l(j3);
                return;
            case 2:
                final long j10 = this.f27791c;
                final ri riVar2 = this.f27790b;
                riVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = riVar2.getMessagesStorage().f27151b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i11 = queryFinalized.intValue(0);
                        i7 = queryFinalized.intValue(1);
                    } else {
                        i7 = 0;
                    }
                    queryFinalized.dispose();
                    if (i11 > 0 && riVar2.getUserConfig().E != 0) {
                        d = i7 - riVar2.getUserConfig().E;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                final double d2 = d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        ri riVar3;
                        long j11;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i14 = 0;
                        while (true) {
                            riVar3 = ri.this;
                            int size = riVar3.f26721j1.size();
                            j11 = j10;
                            if (i14 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) riVar3.f26721j1.get(i14);
                                if (tL_topPeer.peer.user_id == j11) {
                                    break;
                                }
                                i14++;
                            } else {
                                tL_topPeer = null;
                                break;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j11;
                            riVar3.f26721j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / riVar3.getMessagesController().f25712c3) + tL_topPeer.rating;
                        Collections.sort(riVar3.f26721j1, new jg.w(21));
                        riVar3.getMessagesStorage().f27149a.c(new bh(riVar3, j11, 0, tL_topPeer.rating));
                        riVar3.getNotificationCenter().k(ks.S0, new Object[0]);
                    }
                });
                return;
            default:
                ri riVar3 = this.f27790b;
                ArrayList[] arrayListArr = riVar3.f26744v0;
                arrayListArr[0].remove(Long.valueOf(j3));
                riVar3.f26747w0[0].remove(Long.valueOf(j3));
                long[] jArr = riVar3.f26732q0;
                ArrayList[] arrayListArr2 = riVar3.f26740t0;
                jArr[0] = riVar3.q(arrayListArr2[0], false);
                riVar3.getNotificationCenter().k(62, new Object[0]);
                riVar3.L1(false, arrayListArr2[0], arrayListArr[0], riVar3.f26735r0[0], jArr[0], riVar3.f26738s0);
                return;
        }
    }
}
