package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ef {
    public final int f15556a;
    public TLRPC.TL_inputDocument f15557b;
    public long f15558c = -9223372036854775807L;
    public final ArrayList d = new ArrayList();
    public final a e = new a(this, 18);

    public ef(int i10) {
        this.f15556a = i10;
    }

    public static void a(ef efVar, long j10, long j11) {
        ArrayList arrayList = efVar.d;
        int i10 = 0;
        while (i10 < arrayList.size() && ((Long) ((Pair) arrayList.get(i10)).first).longValue() <= j10) {
            i10++;
        }
        arrayList.add(i10, new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        int max = Math.max(0, i10 - 1);
        while (max < arrayList.size() - 1) {
            Pair pair = (Pair) arrayList.get(max);
            int i11 = max + 1;
            Pair pair2 = (Pair) arrayList.get(i11);
            if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                arrayList.set(max, new Pair((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                arrayList.remove(i11);
            } else {
                max = i11;
            }
        }
    }

    public final void b() {
        if (this.f15557b == null) {
            return;
        }
        d();
        this.f15557b = null;
    }

    public final long c() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            j10 += ((Long) pair.second).longValue() - ((Long) pair.first).longValue();
        }
        return j10;
    }

    public final void d() {
        i0.r(this.e);
        if (this.f15557b == null || c() < 3000) {
            return;
        }
        TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
        tL_messages_reportMusicListen.f19901id = this.f15557b;
        tL_messages_reportMusicListen.listened_duration = (int) Math.round(c() / 1000.0d);
        ConnectionsManager.getInstance(this.f15556a).sendRequest(tL_messages_reportMusicListen, null);
        this.f15558c = -9223372036854775807L;
        this.d.clear();
    }
}
