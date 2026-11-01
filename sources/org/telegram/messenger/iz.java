package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class iz {
    public String f16374a;
    public TLRPC.InputPeer f16378g;
    public long h;
    public long f16379i;
    public long f16380j;
    public long f16381k;
    public int f16382l;
    public double f16383m;
    public long f16384n;
    public long f16385o;
    public final rz f16387q;
    public ArrayList f16375b = new ArrayList();
    public final HashSet f16376c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f16377f = new ArrayList();
    public int f16386p = Integer.MAX_VALUE;

    public iz(rz rzVar) {
        this.f16387q = rzVar;
    }

    public static void a(iz izVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = izVar.f16378g;
        tL_messages_startHistoryImport.import_id = izVar.f16381k;
        izVar.f16387q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new hz(izVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j10, float f7) {
        this.d.put(str, Float.valueOf(f7));
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.f16379i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f16379i = ((Long) entry.getValue()).longValue() + this.f16379i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f16374a)) {
            long j11 = this.f16379i;
            long j12 = this.f16385o;
            if (j11 != j12) {
                long j13 = this.f16384n;
                if (elapsedRealtime != j13) {
                    double d = (j11 - j12) / ((elapsedRealtime - j13) / 1000.0d);
                    double d10 = this.f16383m;
                    if (d10 == 0.0d) {
                        this.f16383m = d;
                    } else {
                        this.f16383m = (0.99d * d10) + (d * 0.01d);
                    }
                    this.f16386p = (int) (((this.h - j11) * 1000) / this.f16383m);
                    this.f16385o = j11;
                    this.f16384n = elapsedRealtime;
                }
            }
        }
        int i10 = (int) ((((float) this.f16379i) / ((float) this.h)) * 100.0f);
        if (this.f16382l != i10) {
            this.f16382l = i10;
            this.f16387q.getNotificationCenter().k(at.f14801v1, Long.valueOf(this.f16380j));
        }
    }

    public final void c(int i10) {
        rz rzVar = this.f16387q;
        if (i10 == 100) {
            rzVar.D.l(this.f16380j);
        }
        rzVar.getNotificationCenter().k(at.f14801v1, Long.valueOf(this.f16380j));
    }
}
