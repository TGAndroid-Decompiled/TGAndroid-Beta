package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class ry {
    public String f26658a;
    public TLRPC.InputPeer f26663g;
    public long h;
    public long f26664i;
    public long f26665j;
    public long f26666k;
    public int f26667l;
    public double f26668m;
    public long f26669n;
    public long f26670o;
    public final az f26672q;
    public ArrayList f26659b = new ArrayList();
    public final HashSet f26660c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f26661e = new HashMap();
    public final ArrayList f26662f = new ArrayList();
    public int f26671p = Integer.MAX_VALUE;

    public ry(az azVar) {
        this.f26672q = azVar;
    }

    public static void a(ry ryVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = ryVar.f26663g;
        tL_messages_startHistoryImport.import_id = ryVar.f26666k;
        ryVar.f26672q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new qy(ryVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f26661e;
        hashMap.put(str, valueOf);
        this.f26664i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f26664i = ((Long) entry.getValue()).longValue() + this.f26664i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f26658a)) {
            long j10 = this.f26664i;
            long j11 = this.f26670o;
            if (j10 != j11) {
                long j12 = this.f26669n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f26668m;
                    if (d2 == 0.0d) {
                        this.f26668m = d;
                    } else {
                        this.f26668m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f26671p = (int) (((this.h - j10) * 1000) / this.f26668m);
                    this.f26670o = j10;
                    this.f26669n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f26664i) / ((float) this.h)) * 100.0f);
        if (this.f26667l != i7) {
            this.f26667l = i7;
            this.f26672q.getNotificationCenter().k(ls.f25363v1, Long.valueOf(this.f26665j));
        }
    }

    public final void c(int i7) {
        az azVar = this.f26672q;
        if (i7 == 100) {
            azVar.E.l(this.f26665j);
        }
        azVar.getNotificationCenter().k(ls.f25363v1, Long.valueOf(this.f26665j));
    }
}
