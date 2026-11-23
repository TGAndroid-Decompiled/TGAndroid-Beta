package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class qy {
    public String f26595a;
    public TLRPC.InputPeer f26600g;
    public long h;
    public long f26601i;
    public long f26602j;
    public long f26603k;
    public int f26604l;
    public double f26605m;
    public long f26606n;
    public long f26607o;
    public final zy f26609q;
    public ArrayList f26596b = new ArrayList();
    public final HashSet f26597c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26598e = new HashMap();
    public final ArrayList f26599f = new ArrayList();
    public int f26608p = Integer.MAX_VALUE;

    public qy(zy zyVar) {
        this.f26609q = zyVar;
    }

    public static void a(qy qyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = qyVar.f26600g;
        tL_messages_startHistoryImport.import_id = qyVar.f26603k;
        qyVar.f26609q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new py(qyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26598e;
        hashMap.put(str, valueOf);
        this.f26601i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26601i = ((Long) entry.getValue()).longValue() + this.f26601i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26595a)) {
            long j10 = this.f26601i;
            long j11 = this.f26607o;
            if (j10 != j11) {
                long j12 = this.f26606n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26605m;
                    if (d2 == 0.0d) {
                        this.f26605m = d;
                    } else {
                        this.f26605m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26608p = (int) (((this.h - j10) * 1000) / this.f26605m);
                    this.f26607o = j10;
                    this.f26606n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26601i) / ((float) this.h)) * 100.0f);
        if (this.f26604l != i7) {
            this.f26604l = i7;
            this.f26609q.getNotificationCenter().k(ks.f25304v1, Long.valueOf(this.f26602j));
        }
    }

    public final void c(int i7) {
        zy zyVar = this.f26609q;
        if (i7 == 100) {
            zyVar.E.l(this.f26602j);
        }
        zyVar.getNotificationCenter().k(ks.f25304v1, Long.valueOf(this.f26602j));
    }
}
