package di;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qy;
import org.telegram.messenger.rd;
import org.telegram.messenger.si;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class y8 implements Runnable {
    public final int f9794a;
    public final long f9795b;
    public final int f9796c;
    public final Object d;

    public y8(Object obj, int i7, long j3, int i10) {
        this.f9794a = i10;
        this.d = obj;
        this.f9796c = i7;
        this.f9795b = j3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: di.y8.a():void");
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f9794a;
        long j3 = this.f9795b;
        int i11 = this.f9796c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    an ua2 = an.ua(l10.longValue());
                    T.presentFragment(ua2);
                    TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new z8(ua2, this.f9795b, M0, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fi.s6 s6Var = (fi.s6) obj;
                int max = Math.max(s6Var.f12323f.get(j3, 0), i11);
                s6Var.f12323f.put(j3, max);
                s6Var.f12327k.i(max, j3);
                TL_stories.PeerStories y10 = s6Var.y(j3);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(s6Var.f12324g, s6Var.J);
                    ns.f(s6Var.f12319a).k(324, new Object[0]);
                    return;
                }
                return;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = ((rd) obj).getMessagesStorage().f27221b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
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
                si.b0(i11).B1(this.f9795b, mediaController.f22362o1, null);
                mediaController.M1 = null;
                return;
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase = ((si) obj).getMessagesStorage().f27221b;
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
                ez C = ez.C(cVar.f22782a);
                ArrayList arrayList = (ArrayList) C.f23389a.get("group_" + j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    qy qyVar = (qy) arrayList.get(0);
                    gj gjVar = (gj) i5.c.h(1, qyVar.f26175x);
                    qyVar.G = gjVar.e1();
                    gjVar.f23819k.params.put("final", "1");
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(gjVar.f23819k);
                    if (!qyVar.I && !qyVar.J) {
                        vr a02 = vr.a0(cVar.f22782a);
                        long j10 = qyVar.f26155a;
                        if (i11 != 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        a02.h1(-2, 0, i7, j10, 0L, tL_messages_messages, false);
                    }
                    C.t0(qyVar, true);
                    return;
                }
                return;
            case 7:
                k8.a aVar = ((org.telegram.ui.Cells.q1) obj).Xb;
                if (aVar != null) {
                    if (i11 > 0) {
                        i11 = ((SparseIntArray) aVar.f17789c).get(i11, 0);
                    }
                    if (i11 != 0) {
                        ((ia.d) aVar.f17788b).W(this.f9795b, 0L, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ys0.e((ys0) obj, j3, i11);
                return;
        }
    }

    public y8(Object obj, long j3, int i7, int i10) {
        this.f9794a = i10;
        this.d = obj;
        this.f9795b = j3;
        this.f9796c = i7;
    }
}
