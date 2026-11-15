package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public String f27265a;
    public TLRPC.InputPeer f27270g;
    public long h;
    public long f27271i;
    public long f27272j;
    public long f27273k;
    public int f27274l;
    public double f27275m;
    public long f27276n;
    public long f27277o;
    public final ez f27279q;
    public ArrayList f27266b = new ArrayList();
    public final HashSet f27267c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap f27268e = new HashMap();
    public final ArrayList f27269f = new ArrayList();
    public int f27278p = Integer.MAX_VALUE;

    public vy(ez ezVar) {
        this.f27279q = ezVar;
    }

    public static void a(vy vyVar) {
        TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
        tL_messages_startHistoryImport.peer = vyVar.f27270g;
        tL_messages_startHistoryImport.import_id = vyVar.f27273k;
        vyVar.f27279q.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new uy(vyVar, tL_messages_startHistoryImport));
    }

    public final void b(String str, long j3, float f10) {
        this.d.put(str, Float.valueOf(f10));
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f27268e;
        hashMap.put(str, valueOf);
        this.f27271i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f27271i = ((Long) entry.getValue()).longValue() + this.f27271i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.f27265a)) {
            long j10 = this.f27271i;
            long j11 = this.f27277o;
            if (j10 != j11) {
                long j12 = this.f27276n;
                if (elapsedRealtime != j12) {
                    double d = (j10 - j11) / ((elapsedRealtime - j12) / 1000.0d);
                    double d2 = this.f27275m;
                    if (d2 == 0.0d) {
                        this.f27275m = d;
                    } else {
                        this.f27275m = (0.99d * d2) + (d * 0.01d);
                    }
                    this.f27278p = (int) (((this.h - j10) * 1000) / this.f27275m);
                    this.f27277o = j10;
                    this.f27276n = elapsedRealtime;
                }
            }
        }
        int i7 = (int) ((((float) this.f27271i) / ((float) this.h)) * 100.0f);
        if (this.f27274l != i7) {
            this.f27274l = i7;
            this.f27279q.getNotificationCenter().k(ns.f25588v1, Long.valueOf(this.f27272j));
        }
    }

    public final void c(int i7) {
        ez ezVar = this.f27279q;
        if (i7 == 100) {
            ezVar.E.l(this.f27272j);
        }
        ezVar.getNotificationCenter().k(ns.f25588v1, Long.valueOf(this.f27272j));
    }
}
