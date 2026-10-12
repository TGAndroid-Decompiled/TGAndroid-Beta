package i2;

import java.util.HashMap;
public final class k {
    public final y2.d f11757a;
    public final long f11758b;
    public final long f11759c;
    public final long d;
    public final long f11760e;
    public final int f11761f;
    public final long f11762g;
    public final HashMap h;
    public long f11763i;

    public k(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f11757a = dVar;
        long j3 = 50000;
        this.f11758b = e2.d0.P(j3);
        this.f11759c = e2.d0.P(j3);
        this.d = e2.d0.P(i10);
        this.f11760e = e2.d0.P(i11);
        this.f11761f = -1;
        this.f11762g = e2.d0.P(0);
        this.h = new HashMap();
        this.f11763i = -1L;
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
            i10 += jVar.f11755b;
        }
        return i10;
    }

    public final boolean c(q0 q0Var) {
        int i10;
        boolean z10;
        long j3 = this.f11759c;
        j jVar = (j) this.h.get(q0Var.f11867a);
        jVar.getClass();
        y2.d dVar = this.f11757a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.f51894b;
        }
        if (i10 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f11758b;
        float f7 = q0Var.f11869c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.y(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = q0Var.f11868b;
        if (j11 < max) {
            jVar.f11754a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            jVar.f11754a = false;
        }
        return jVar.f11754a;
    }

    public final void d() {
        if (this.h.isEmpty()) {
            y2.d dVar = this.f11757a;
            synchronized (dVar) {
                if (dVar.f51893a) {
                    dVar.a(0);
                }
            }
            return;
        }
        this.f11757a.a(b());
    }
}
