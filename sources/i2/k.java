package i2;

import java.util.HashMap;
public final class k {
    public final y2.d f11758a;
    public final long f11759b;
    public final long f11760c;
    public final long d;
    public final long f11761e;
    public final int f11762f;
    public final long f11763g;
    public final HashMap h;
    public long f11764i;

    public k(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f11758a = dVar;
        long j3 = 50000;
        this.f11759b = e2.d0.P(j3);
        this.f11760c = e2.d0.P(j3);
        this.d = e2.d0.P(i10);
        this.f11761e = e2.d0.P(i11);
        this.f11762f = -1;
        this.f11763g = e2.d0.P(0);
        this.h = new HashMap();
        this.f11764i = -1L;
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.a(str + " cannot be less than " + str2, z10);
    }

    public final int b() {
        int i10 = 0;
        for (j jVar : this.h.values()) {
            i10 += jVar.f11756b;
        }
        return i10;
    }

    public final boolean c(q0 q0Var) {
        int i10;
        boolean z10;
        long j3 = this.f11760c;
        j jVar = (j) this.h.get(q0Var.f11868a);
        jVar.getClass();
        y2.d dVar = this.f11758a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.f51783b;
        }
        if (i10 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f11759b;
        float f7 = q0Var.f11870c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.y(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = q0Var.f11869b;
        if (j11 < max) {
            jVar.f11755a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            jVar.f11755a = false;
        }
        return jVar.f11755a;
    }

    public final void d() {
        if (this.h.isEmpty()) {
            y2.d dVar = this.f11758a;
            synchronized (dVar) {
                if (dVar.f51782a) {
                    dVar.a(0);
                }
            }
            return;
        }
        this.f11758a.a(b());
    }
}
