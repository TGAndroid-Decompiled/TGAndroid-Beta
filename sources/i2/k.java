package i2;

import java.util.HashMap;
public final class k {
    public final y2.d f10244a;
    public final long f10245b;
    public final long f10246c;
    public final long d;
    public final long e;
    public final int f10247f;
    public final long f10248g;
    public final HashMap h;
    public long f10249i;

    public k(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f10244a = dVar;
        long j3 = 50000;
        this.f10245b = e2.d0.Q(j3);
        this.f10246c = e2.d0.Q(j3);
        this.d = e2.d0.Q(i10);
        this.e = e2.d0.Q(i11);
        this.f10247f = -1;
        this.f10248g = e2.d0.Q(0);
        this.h = new HashMap();
        this.f10249i = -1L;
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
            i10 += jVar.f10238b;
        }
        return i10;
    }

    public final boolean c(o0 o0Var) {
        int i10;
        boolean z10;
        long j3 = this.f10246c;
        j jVar = (j) this.h.get(o0Var.f10315a);
        jVar.getClass();
        y2.d dVar = this.f10244a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.f46411b;
        }
        if (i10 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f10245b;
        float f7 = o0Var.f10317c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.z(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = o0Var.f10316b;
        if (j11 < max) {
            jVar.f10237a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            jVar.f10237a = false;
        }
        return jVar.f10237a;
    }

    public final void d() {
        if (this.h.isEmpty()) {
            y2.d dVar = this.f10244a;
            synchronized (dVar) {
                if (dVar.f46410a) {
                    dVar.a(0);
                }
            }
            return;
        }
        this.f10244a.a(b());
    }
}
