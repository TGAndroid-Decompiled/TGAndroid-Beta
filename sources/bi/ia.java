package bi;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sy;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class ia implements Runnable {
    public final int f4057a;
    public final long f4058b;
    public final int f4059c;
    public final Object d;

    public ia(Object obj, int i7, long j3, int i10) {
        this.f4057a = i10;
        this.d = obj;
        this.f4059c = i7;
        this.f4058b = j3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ia.a():void");
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f4057a;
        long j3 = this.f4058b;
        int i11 = this.f4059c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    an ra2 = an.ra(l10.longValue());
                    T.presentFragment(ra2);
                    TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new ja(ra2, this.f4058b, M0, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                di.y6 y6Var = (di.y6) obj;
                int max = Math.max(y6Var.f9967f.get(j3, 0), i11);
                y6Var.f9967f.put(j3, max);
                y6Var.f9971k.i(max, j3);
                TL_stories.PeerStories y10 = y6Var.y(j3);
                if (y10 != null && i11 > y10.max_read_id) {
                    y10.max_read_id = i11;
                    Collections.sort(y6Var.f9968g, y6Var.J);
                    qs.f(y6Var.f9963a).k(324, new Object[0]);
                    return;
                }
                return;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = ((org.telegram.messenger.sd) obj).getMessagesStorage().f26698b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
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
                String[] strArr = MediaController.V1;
                ui.b0(i11).B1(this.f4058b, mediaController.n1, null);
                mediaController.L1 = null;
                return;
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase = ((ui) obj).getMessagesStorage().f26698b;
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
                gz C = gz.C(cVar.f21729a);
                ArrayList arrayList = (ArrayList) C.f22758a.get("group_" + j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    sy syVar = (sy) arrayList.get(0);
                    ij ijVar = (ij) jg.g.i(1, syVar.f25555x);
                    syVar.G = ijVar.f1();
                    ijVar.f23244k.params.put("final", "1");
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(ijVar.f23244k);
                    if (!syVar.I && !syVar.J) {
                        yr a02 = yr.a0(cVar.f21729a);
                        long j10 = syVar.f25535a;
                        if (i11 != 0) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        a02.h1(-2, 0, i7, j10, 0L, tL_messages_messages, false);
                    }
                    C.t0(syVar, true);
                    return;
                }
                return;
            case 7:
                m4.d0 d0Var = ((org.telegram.ui.Cells.q1) obj).Wb;
                if (d0Var != null) {
                    if (i11 > 0) {
                        i11 = ((SparseIntArray) d0Var.f19609b).get(i11, 0);
                    }
                    if (i11 != 0) {
                        ((g6.d0) d0Var.f19608a).a0(this.f4058b, 0L, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                xs0.e((xs0) obj, j3, i11);
                return;
        }
    }

    public ia(Object obj, long j3, int i7, int i10) {
        this.f4057a = i10;
        this.d = obj;
        this.f4058b = j3;
        this.f4059c = i7;
    }
}
