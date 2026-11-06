package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class xy {
    public String f26529a;
    public TLRPC.InputPeer f26534g;
    public long h;
    public long f26535i;
    public long f26536j;
    public long f26537k;
    public int f26538l;
    public double f26539m;
    public long f26540n;
    public long f26541o;
    public final gz f26543q;
    public ArrayList f26530b = new ArrayList();
    public final HashSet f26531c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26532e = new HashMap();
    public final ArrayList f26533f = new ArrayList();
    public int f26542p = Integer.MAX_VALUE;

    public xy(gz gzVar) {
        this.f26543q = gzVar;
    }

    public static void a(xy xyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = xyVar.f26534g;
        tL_messages_startHistoryImport.import_id = xyVar.f26537k;
        xyVar.f26543q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new wy(xyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26532e;
        hashMap.put(str, valueOf);
        this.f26535i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26535i = ((Long) entry.getValue()).longValue() + this.f26535i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26529a)) {
            long j10 = this.f26535i;
            long j11 = this.f26541o;
            if (j10 != j11) {
                long j12 = this.f26540n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26539m;
                    if (d2 == 0.0d) {
                        this.f26539m = d;
                    } else {
                        this.f26539m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26542p = (int) (((this.h - j10) * 1000) / this.f26539m);
                    this.f26541o = j10;
                    this.f26540n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26535i) / ((float) this.h)) * 100.0f);
        if (this.f26538l != i7) {
            this.f26538l = i7;
            this.f26543q.getNotificationCenter().k(qs.f25074v1, Long.valueOf(this.f26536j));
        }
    }

    public final void c(int i7) {
        gz gzVar = this.f26543q;
        if (i7 == 100) {
            gzVar.D.l(this.f26536j);
        }
        gzVar.getNotificationCenter().k(qs.f25074v1, Long.valueOf(this.f26536j));
    }
}
