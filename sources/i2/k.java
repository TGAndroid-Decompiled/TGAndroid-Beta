package i2;

import java.util.HashMap;
public final class k {
    public final y2.d f11759a;
    public final long f11760b;
    public final long f11761c;
    public final long d;
    public final long f11762e;
    public final int f11763f;
    public final long f11764g;
    public final HashMap h;
    public long f11765i;

    public k(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f11759a = dVar;
        long j3 = 50000;
        this.f11760b = e2.d0.P(j3);
        this.f11761c = e2.d0.P(j3);
        this.d = e2.d0.P(i10);
        this.f11762e = e2.d0.P(i11);
        this.f11763f = -1;
        this.f11764g = e2.d0.P(0);
        this.h = new HashMap();
        this.f11765i = -1L;
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
            i10 += jVar.f11757b;
        }
        return i10;
    }

    public final boolean c(q0 q0Var) {
        int i10;
        boolean z10;
        long j3 = this.f11761c;
        j jVar = (j) this.h.get(q0Var.f11869a);
        jVar.getClass();
        y2.d dVar = this.f11759a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.f51662b;
        }
        if (i10 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f11760b;
        float f7 = q0Var.f11871c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.y(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = q0Var.f11870b;
        if (j11 < max) {
            jVar.f11756a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            jVar.f11756a = false;
        }
        return jVar.f11756a;
    }

    public final void d() {
        if (this.h.isEmpty()) {
            y2.d dVar = this.f11759a;
            synchronized (dVar) {
                if (dVar.f51661a) {
                    dVar.a(0);
                }
            }
            return;
        }
        this.f11759a.a(b());
    }
}
