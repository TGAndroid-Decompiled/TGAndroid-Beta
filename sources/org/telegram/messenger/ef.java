package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ef {
    public final int f22216a;
    public TLRPC.TL_inputDocument f22217b;
    public long f22218c = -9223372036854775807L;
    public final ArrayList d = new ArrayList();
    public final a f22219e = new a(this, 19);

    public ef(int i7) {
        this.f22216a = i7;
    }

    public static void a(ef efVar, long j3, long j10) {
        ArrayList arrayList = efVar.d;
        int i7 = 0;
        while (i7 < arrayList.size() && ((Long) ((Pair) arrayList.get(i7)).first).longValue() <= j3) {
            i7++;
        }
        arrayList.add(i7, new Pair(Long.valueOf(j3), Long.valueOf(j10)));
        int max = Math.max(0, i7 - 1);
        while (max < arrayList.size() - 1) {
            Pair pair = (Pair) arrayList.get(max);
            int i10 = max + 1;
            Pair pair2 = (Pair) arrayList.get(i10);
            if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                arrayList.set(max, new Pair((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                arrayList.remove(i10);
            } else {
                max = i10;
            }
        }
    }

    public final void b() {
        if (this.f22217b == null) {
            return;
        }
        d();
        this.f22217b = null;
    }

    public final long c() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j3 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj;
            j3 += ((Long) pair.second).longValue() - ((Long) pair.first).longValue();
        }
        return j3;
    }

    public final void d() {
        g0.r(this.f22219e);
        if (this.f22217b == null || c() < 3000) {
            return;
        }
        TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
        tL_messages_reportMusicListen.f27063id = this.f22217b;
        tL_messages_reportMusicListen.listened_duration = (int) Math.round(c() / 1000.0d);
        ConnectionsManager.getInstance(this.f22216a).sendRequest(tL_messages_reportMusicListen, null);
        this.f22218c = -9223372036854775807L;
        this.d.clear();
    }
}
