package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class qy {
    public String f26485a;
    public TLRPC.InputPeer f26490g;
    public long h;
    public long f26491i;
    public long f26492j;
    public long f26493k;
    public int f26494l;
    public double f26495m;
    public long f26496n;
    public long f26497o;
    public final zy f26499q;
    public ArrayList f26486b = new ArrayList();
    public final HashSet f26487c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26488e = new HashMap();
    public final ArrayList f26489f = new ArrayList();
    public int f26498p = Integer.MAX_VALUE;

    public qy(zy zyVar) {
        this.f26499q = zyVar;
    }

    public static void a(qy qyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = qyVar.f26490g;
        tL_messages_startHistoryImport.import_id = qyVar.f26493k;
        qyVar.f26499q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new py(qyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26488e;
        hashMap.put(str, valueOf);
        this.f26491i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26491i = ((Long) entry.getValue()).longValue() + this.f26491i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26485a)) {
            long j10 = this.f26491i;
            long j11 = this.f26497o;
            if (j10 != j11) {
                long j12 = this.f26496n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26495m;
                    if (d2 == 0.0d) {
                        this.f26495m = d;
                    } else {
                        this.f26495m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26498p = (int) (((this.h - j10) * 1000) / this.f26495m);
                    this.f26497o = j10;
                    this.f26496n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26491i) / ((float) this.h)) * 100.0f);
        if (this.f26494l != i7) {
            this.f26494l = i7;
            this.f26499q.getNotificationCenter().k(ks.f25207v1, Long.valueOf(this.f26492j));
        }
    }

    public final void c(int i7) {
        zy zyVar = this.f26499q;
        if (i7 == 100) {
            zyVar.E.l(this.f26492j);
        }
        zyVar.getNotificationCenter().k(ks.f25207v1, Long.valueOf(this.f26492j));
    }
}
