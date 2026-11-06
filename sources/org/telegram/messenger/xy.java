package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class xy {
    public String f26537a;
    public TLRPC.InputPeer f26542g;
    public long h;
    public long f26543i;
    public long f26544j;
    public long f26545k;
    public int f26546l;
    public double f26547m;
    public long f26548n;
    public long f26549o;
    public final gz f26551q;
    public ArrayList f26538b = new ArrayList();
    public final HashSet f26539c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26540e = new HashMap();
    public final ArrayList f26541f = new ArrayList();
    public int f26550p = Integer.MAX_VALUE;

    public xy(gz gzVar) {
        this.f26551q = gzVar;
    }

    public static void a(xy xyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = xyVar.f26542g;
        tL_messages_startHistoryImport.import_id = xyVar.f26545k;
        xyVar.f26551q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new wy(xyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26540e;
        hashMap.put(str, valueOf);
        this.f26543i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26543i = ((Long) entry.getValue()).longValue() + this.f26543i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26537a)) {
            long j10 = this.f26543i;
            long j11 = this.f26549o;
            if (j10 != j11) {
                long j12 = this.f26548n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26547m;
                    if (d2 == 0.0d) {
                        this.f26547m = d;
                    } else {
                        this.f26547m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26550p = (int) (((this.h - j10) * 1000) / this.f26547m);
                    this.f26549o = j10;
                    this.f26548n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26543i) / ((float) this.h)) * 100.0f);
        if (this.f26546l != i7) {
            this.f26546l = i7;
            this.f26551q.getNotificationCenter().k(qs.f25082v1, Long.valueOf(this.f26544j));
        }
    }

    public final void c(int i7) {
        gz gzVar = this.f26551q;
        if (i7 == 100) {
            gzVar.D.l(this.f26544j);
        }
        gzVar.getNotificationCenter().k(qs.f25082v1, Long.valueOf(this.f26544j));
    }
}
