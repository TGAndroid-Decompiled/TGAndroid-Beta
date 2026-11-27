package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class lq6 implements Runnable {
    public final byte a;
    public final ls6 b;
    public final long c;

    public lq6(ls6 ls6Var, long j, byte b) {
        this.a = b;
        this.b = ls6Var;
        this.c = j;
    }

    @Override
    public final void run() {
        int i;
        byte b = this.a;
        ls6 ls6Var = this.b;
        long j = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                zh6 zh6Var = ls6Var.z1;
                ArrayList arrayList = (ArrayList) zh6Var.f(j);
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        int i4 = ls6Var.currentAccount;
                        if7 a = if7.a(j, r47.b2(i4, (TLRPC.Message) arrayList.get(i3), xc2.b0(i4, j), false));
                        ls6Var.A1.remove(a);
                        ls6Var.getNotificationCenter().k(70, null, a);
                    }
                }
                zh6Var.l(j);
                return;
            case 1:
                ls6 ls6Var2 = this.b;
                ArrayList[] arrayListArr = ls6Var2.v0;
                arrayListArr[0].remove(Long.valueOf(j));
                ls6Var2.w0[0].remove(Long.valueOf(j));
                long[] jArr = ls6Var2.q0;
                ArrayList[] arrayListArr2 = ls6Var2.t0;
                jArr[0] = ls6Var2.q(arrayListArr2[0], false);
                ls6Var2.getNotificationCenter().k(63, new Object[0]);
                ls6Var2.J1(false, arrayListArr2[0], arrayListArr[0], ls6Var2.r0[0], jArr[0], ls6Var2.s0);
                return;
            case 2:
                final long j2 = this.c;
                final ls6 ls6Var3 = this.b;
                ls6Var3.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = ls6Var3.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j2 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i2 = queryFinalized.intValue(0);
                        i = queryFinalized.intValue(1);
                    } else {
                        i = 0;
                    }
                    queryFinalized.dispose();
                    if (i2 > 0 && ls6Var3.getUserConfig().E != 0) {
                        d = i - ls6Var3.getUserConfig().E;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                final double d2 = d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        ls6 ls6Var4;
                        long j3;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i5 = 0;
                        while (true) {
                            ls6Var4 = ls6.this;
                            int size = ls6Var4.j1.size();
                            j3 = j2;
                            if (i5 < size) {
                                tL_topPeer = (TLRPC.TL_topPeer) ls6Var4.j1.get(i5);
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
                            ls6Var4.j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / ls6Var4.getMessagesController().S2) + tL_topPeer.rating;
                        Collections.sort(ls6Var4.j1, new vk6((byte) 5));
                        ls6Var4.getMessagesStorage().a.c(new dr6(ls6Var4, j3, 0, tL_topPeer.rating));
                        ls6Var4.getNotificationCenter().k(jn7.S0, new Object[0]);
                    }
                });
                return;
            default:
                ls6Var.q1.l(j);
                return;
        }
    }
}
