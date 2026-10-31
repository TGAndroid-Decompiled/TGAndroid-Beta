package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class hz {
    public String f15982a;
    public TLRPC.InputPeer f15986g;
    public long h;
    public long f15987i;
    public long f15988j;
    public long f15989k;
    public int f15990l;
    public double f15991m;
    public long f15992n;
    public long f15993o;
    public final qz f15995q;
    public ArrayList f15983b = new ArrayList();
    public final HashSet f15984c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f15985f = new ArrayList();
    public int f15994p = Integer.MAX_VALUE;

    public hz(qz qzVar) {
        this.f15995q = qzVar;
    }

    public static void a(hz hzVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = hzVar.f15986g;
        tL_messages_startHistoryImport.import_id = hzVar.f15989k;
        hzVar.f15995q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new gz(hzVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j10, float f7) {
        this.d.put(str, Float.valueOf(f7));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.f15987i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f15987i = ((Long) entry.getValue()).longValue() + this.f15987i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f15982a)) {
            long j11 = this.f15987i;
            long j12 = this.f15993o;
            if (j11 != j12) {
                long j13 = this.f15992n;
                if (elapsedRealtime != j13) {
                    double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                    double d10 = this.f15991m;
                    if (d10 == 0.0d) {
                        this.f15991m = d;
                    } else {
                        this.f15991m = (0.99d * d10) + (d * 0.01d);
                    }
                    this.f15994p = (int) (((this.h - j11) * 1000) / this.f15991m);
                    this.f15993o = j11;
                    this.f15992n = elapsedRealtime;
                }
            }
        }
        int i10 = (int) ((((float) this.f15987i) / ((float) this.h)) * 100.0f);
        if (this.f15990l != i10) {
            this.f15990l = i10;
            this.f15995q.getNotificationCenter().k(zs.f19705v1, Long.valueOf(this.f15988j));
        }
    }

    public final void c(int i10) {
        qz qzVar = this.f15995q;
        if (i10 == 100) {
            qzVar.D.l(this.f15988j);
        }
        qzVar.getNotificationCenter().k(zs.f19705v1, Long.valueOf(this.f15988j));
    }
}
