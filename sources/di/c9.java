package di;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.ly;
import org.telegram.messenger.mp;
import org.telegram.messenger.qd;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.it0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class c9 implements Runnable {
    public final int f8610a;
    public final long f8611b;
    public final int f8612c;
    public final Object d;

    public c9(Object obj, int i7, long j3, int i10) {
        this.f8610a = i10;
        this.d = obj;
        this.f8612c = i7;
        this.f8611b = j3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: di.c9.a():void");
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f8610a;
        long j3 = this.f8611b;
        int i11 = this.f8612c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    bn ua2 = bn.ua(l10.longValue());
                    T.presentFragment(ua2);
                    TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-l10.longValue()));
                    if (O0 != null) {
                        org.telegram.messenger.g0.h3(new d9(ua2, this.f8611b, O0, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fi.p6 p6Var = (fi.p6) obj;
                int max = Math.max(p6Var.f12391f.get(j3, 0), i11);
                p6Var.f12391f.put(j3, max);
                p6Var.f12395k.i(max, j3);
                TL_stories.PeerStories y10 = p6Var.y(j3);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(p6Var.f12392g, p6Var.J);
                    ks.f(p6Var.f12387a).k(327, new Object[0]);
                    return;
                }
                return;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = ((qd) obj).getMessagesStorage().f27151b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
                    executeFast.requery();
                    executeFast.bindInteger(1, i11);
                    executeFast.bindLong(2, j3);
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 3:
                MediaController mediaController = (MediaController) obj;
                String[] strArr = MediaController.W1;
                ri.d0(i11).F1(this.f8611b, mediaController.f22823o1, null);
                mediaController.M1 = null;
                return;
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase = ((ri) obj).getMessagesStorage().f27151b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j3 + " AND type = " + i11).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj;
                zy C = zy.C(cVar.f23343a);
                ArrayList arrayList = (ArrayList) C.f28477a.get("group_" + j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    ly lyVar = (ly) arrayList.get(0);
                    fj fjVar = (fj) i5.c.h(1, lyVar.f25594x);
                    lyVar.G = fjVar.e1();
                    fjVar.f24073k.params.put("final", "1");
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(fjVar.f24073k);
                    if (!lyVar.I && !lyVar.J) {
                        tr a02 = tr.a0(cVar.f23343a);
                        long j10 = lyVar.f25574a;
                        if (i11 != 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        a02.h1(-2, 0, i7, j10, 0L, tL_messages_messages, false);
                    }
                    C.t0(lyVar, true);
                    return;
                }
                return;
            case 7:
                jb.m mVar = ((org.telegram.ui.Cells.r1) obj).Xb;
                if (mVar != null) {
                    if (i11 > 0) {
                        i11 = ((SparseIntArray) mVar.f17465c).get(i11, 0);
                    }
                    if (i11 != 0) {
                        ((hi.u0) mVar.f17464b).F0(this.f8611b, 0L, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                it0.e((it0) obj, j3, i11);
                return;
        }
    }

    public c9(Object obj, long j3, int i7, int i10) {
        this.f8610a = i10;
        this.d = obj;
        this.f8611b = j3;
        this.f8612c = i7;
    }
}
