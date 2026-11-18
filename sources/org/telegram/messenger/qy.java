package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class qy {
    public String f26483a;
    public TLRPC.InputPeer f26488g;
    public long h;
    public long f26489i;
    public long f26490j;
    public long f26491k;
    public int f26492l;
    public double f26493m;
    public long f26494n;
    public long f26495o;
    public final zy f26497q;
    public ArrayList f26484b = new ArrayList();
    public final HashSet f26485c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26486e = new HashMap();
    public final ArrayList f26487f = new ArrayList();
    public int f26496p = Integer.MAX_VALUE;

    public qy(zy zyVar) {
        this.f26497q = zyVar;
    }

    public static void a(qy qyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = qyVar.f26488g;
        tL_messages_startHistoryImport.import_id = qyVar.f26491k;
        qyVar.f26497q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new py(qyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26486e;
        hashMap.put(str, valueOf);
        this.f26489i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26489i = ((Long) entry.getValue()).longValue() + this.f26489i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26483a)) {
            long j10 = this.f26489i;
            long j11 = this.f26495o;
            if (j10 != j11) {
                long j12 = this.f26494n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26493m;
                    if (d2 == 0.0d) {
                        this.f26493m = d;
                    } else {
                        this.f26493m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26496p = (int) (((this.h - j10) * 1000) / this.f26493m);
                    this.f26495o = j10;
                    this.f26494n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26489i) / ((float) this.h)) * 100.0f);
        if (this.f26492l != i7) {
            this.f26492l = i7;
            this.f26497q.getNotificationCenter().k(ks.f25205v1, Long.valueOf(this.f26490j));
        }
    }

    public final void c(int i7) {
        zy zyVar = this.f26497q;
        if (i7 == 100) {
            zyVar.E.l(this.f26490j);
        }
        zyVar.getNotificationCenter().k(ks.f25205v1, Long.valueOf(this.f26490j));
    }
}
