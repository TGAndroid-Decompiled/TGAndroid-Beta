package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
public final class r5a {
    public String a;
    public TLRPC.InputPeer g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public double m;
    public long n;
    public long o;
    public final a6a q;
    public ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public int p = Integer.MAX_VALUE;

    public r5a(a6a a6aVar) {
        this.q = a6aVar;
    }

    public final void a(String str, long j, float f) {
        this.d.put(str, Float.valueOf(f));
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.i = 0L;
        for (Map.Entry entry : hashMap.entrySet()) {
            this.i = ((Long) entry.getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.a)) {
            long j2 = this.i;
            long j3 = this.o;
            if (j2 != j3) {
                long j4 = this.n;
                if (elapsedRealtime != j4) {
                    double d = (j2 - j3) / ((elapsedRealtime - j4) / 1000.0d);
                    double d2 = this.m;
                    if (d2 == 0.0d) {
                        this.m = d;
                    } else {
                        d = (d * 0.01d) + (0.99d * d2);
                        this.m = d;
                    }
                    this.p = (int) (((this.h - j2) * 1000) / d);
                    this.o = j2;
                    this.n = elapsedRealtime;
                }
            }
        }
        int i = (int) ((((float) this.i) / ((float) this.h)) * 100.0f);
        if (this.l != i) {
            this.l = i;
            this.q.getNotificationCenter().k(nm7.v1, Long.valueOf(this.j));
        }
    }

    public final void b(int i) {
        a6a a6aVar = this.q;
        if (i == 100) {
            a6aVar.E.l(this.j);
        }
        a6aVar.getNotificationCenter().k(nm7.v1, Long.valueOf(this.j));
    }
}
