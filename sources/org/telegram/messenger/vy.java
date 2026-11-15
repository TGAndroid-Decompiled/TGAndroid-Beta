package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public String f27266a;
    public TLRPC.InputPeer f27271g;
    public long h;
    public long f27272i;
    public long f27273j;
    public long f27274k;
    public int f27275l;
    public double f27276m;
    public long f27277n;
    public long f27278o;
    public final ez f27280q;
    public ArrayList f27267b = new ArrayList();
    public final HashSet f27268c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f27269e = new HashMap();
    public final ArrayList f27270f = new ArrayList();
    public int f27279p = Integer.MAX_VALUE;

    public vy(ez ezVar) {
        this.f27280q = ezVar;
    }

    public static void a(vy vyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = vyVar.f27271g;
        tL_messages_startHistoryImport.import_id = vyVar.f27274k;
        vyVar.f27280q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new uy(vyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27269e;
        hashMap.put(str, valueOf);
        this.f27272i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27272i = ((Long) entry.getValue()).longValue() + this.f27272i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f27266a)) {
            long j10 = this.f27272i;
            long j11 = this.f27278o;
            if (j10 != j11) {
                long j12 = this.f27277n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f27276m;
                    if (d2 == 0.0d) {
                        this.f27276m = d;
                    } else {
                        this.f27276m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f27279p = (int) (((this.h - j10) * 1000) / this.f27276m);
                    this.f27278o = j10;
                    this.f27277n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f27272i) / ((float) this.h)) * 100.0f);
        if (this.f27275l != i7) {
            this.f27275l = i7;
            this.f27280q.getNotificationCenter().k(ns.f25587v1, Long.valueOf(this.f27273j));
        }
    }

    public final void c(int i7) {
        ez ezVar = this.f27280q;
        if (i7 == 100) {
            ezVar.E.l(this.f27273j);
        }
        ezVar.getNotificationCenter().k(ns.f25587v1, Long.valueOf(this.f27273j));
    }
}
