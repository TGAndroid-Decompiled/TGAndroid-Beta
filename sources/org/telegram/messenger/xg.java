package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class xg implements Runnable {
    public final int f27895a;
    public final si f27896b;
    public final long f27897c;

    public xg(si siVar, long j3, int i7) {
        this.f27895a = i7;
        this.f27896b = siVar;
        this.f27897c = j3;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f27895a;
        si siVar = this.f27896b;
        long j3 = this.f27897c;
        int i11 = 0;
        switch (i10) {
            case 0:
                a0.h hVar = siVar.f26869z1;
                ArrayList arrayList = (ArrayList) hVar.f(j3);
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        int i13 = siVar.currentAccount;
                        tr a10 = tr.a(j3, gj.b2(i13, (TLRPC.Message) arrayList.get(i12), v3.b0(i13, j3), false));
                        siVar.A1.remove(a10);
                        siVar.getNotificationCenter().k(69, null, a10);
                    }
                }
                hVar.l(j3);
                return;
            case 1:
                siVar.f26846q1.l(j3);
                return;
            case 2:
                final long j10 = this.f27897c;
                final si siVar2 = this.f27896b;
                siVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar2.getMessagesStorage().f27252b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i11 = queryFinalized.intValue(0);
                        i7 = queryFinalized.intValue(1);
                    } else {
                        i7 = 0;
                    }
                    queryFinalized.dispose();
                    if (i11 > 0 && siVar2.getUserConfig().E != 0) {
                        d = i7 - siVar2.getUserConfig().E;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                final double d2 = d;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        si siVar3;
                        long j11;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i14 = 0;
                        while (true) {
                            siVar3 = si.this;
                            int size = siVar3.f26834j1.size();
                            j11 = j10;
                            if (i14 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) siVar3.f26834j1.get(i14);
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
                            siVar3.f26834j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / siVar3.getMessagesController().f25816c3) + tL_topPeer.rating;
                        Collections.sort(siVar3.f26834j1, new jg.w(21));
                        siVar3.getMessagesStorage().f27250a.c(new ch(siVar3, j11, 0, tL_topPeer.rating));
                        siVar3.getNotificationCenter().k(ls.S0, new Object[0]);
                    }
                });
                return;
            default:
                si siVar3 = this.f27896b;
                ArrayList[] arrayListArr = siVar3.f26857v0;
                arrayListArr[0].remove(Long.valueOf(j3));
                siVar3.f26860w0[0].remove(Long.valueOf(j3));
                long[] jArr = siVar3.f26845q0;
                ArrayList[] arrayListArr2 = siVar3.f26853t0;
                jArr[0] = siVar3.q(arrayListArr2[0], false);
                siVar3.getNotificationCenter().k(62, new Object[0]);
                siVar3.L1(false, arrayListArr2[0], arrayListArr[0], siVar3.f26848r0[0], jArr[0], siVar3.f26851s0);
                return;
        }
    }
}
