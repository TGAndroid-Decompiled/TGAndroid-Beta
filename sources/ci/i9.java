package ci;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ky;
import org.telegram.messenger.ld;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class i9 implements Runnable {
    public final int f5308a;
    public final long f5309b;
    public final int f5310c;
    public final Object d;

    public i9(Object obj, int i3, long j10, int i10) {
        this.f5308a = i10;
        this.d = obj;
        this.f5310c = i3;
        this.f5309b = j10;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ci.i9.a():void");
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f5308a;
        long j10 = this.f5309b;
        int i11 = this.f5310c;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    wm ra2 = wm.ra(l10.longValue());
                    T.presentFragment(ra2);
                    TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new j9(ra2, this.f5309b, M0, 0), 250L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ei.z6 z6Var = (ei.z6) obj;
                int max = Math.max(z6Var.f11278f.get(j10, 0), i11);
                z6Var.f11278f.put(j10, max);
                z6Var.f11282k.i(max, j10);
                TL_stories.PeerStories y9 = z6Var.y(j10);
                if (y9 != null && i11 > y9.max_read_id) {
                    y9.max_read_id = i11;
                    Collections.sort(z6Var.f11279g, z6Var.J);
                    hs.f(z6Var.f11274a).k(324, new Object[0]);
                    return;
                }
                return;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = ((ld) obj).getMessagesStorage().f24936b.executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
                    executeFast.requery();
                    executeFast.bindInteger(1, i11);
                    executeFast.bindLong(2, j10);
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
                li.b0(i11).B1(this.f5309b, mediaController.f21333o1, null);
                mediaController.M1 = null;
                return;
            case 4:
                try {
                    SQLiteDatabase sQLiteDatabase = ((li) obj).getMessagesStorage().f24936b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM chat_hints WHERE did = " + j10 + " AND type = " + i11).stepThis().dispose();
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
                yy C = yy.C(cVar.f21919a);
                ArrayList arrayList = (ArrayList) C.f26678a.get("group_" + j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    ky kyVar = (ky) arrayList.get(0);
                    zi ziVar = (zi) k2.p1.h(1, kyVar.f23911x);
                    kyVar.G = ziVar.f1();
                    ziVar.f26868k.params.put("final", "1");
                    TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                    tL_messages_messages.messages.add(ziVar.f26868k);
                    if (!kyVar.I && !kyVar.J) {
                        qr a02 = qr.a0(cVar.f21919a);
                        long j11 = kyVar.f23891a;
                        if (i11 != 0) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        a02.h1(-2, 0, i3, j11, 0L, tL_messages_messages, false);
                    }
                    C.t0(kyVar, true);
                    return;
                }
                return;
            case 7:
                m2.t tVar = ((org.telegram.ui.Cells.q1) obj).Wb;
                if (tVar != null) {
                    if (i11 > 0) {
                        i11 = ((SparseIntArray) tVar.f19007c).get(i11, 0);
                    }
                    if (i11 != 0) {
                        ((gi.w5) tVar.f19006b).b0(this.f5309b, 0L, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                ws0.e((ws0) obj, j10, i11);
                return;
        }
    }

    public i9(Object obj, long j10, int i3, int i10) {
        this.f5308a = i10;
        this.d = obj;
        this.f5309b = j10;
        this.f5310c = i3;
    }
}
