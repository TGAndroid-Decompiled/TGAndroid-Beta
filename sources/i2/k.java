package i2;

import java.util.HashMap;
public final class k {
    public final y2.d f10761a;
    public final long f10762b;
    public final long f10763c;
    public final long d;
    public final long e;
    public final int f10764f;
    public final long f10765g;
    public final HashMap h;
    public long f10766i;

    public k(y2.d dVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f10761a = dVar;
        long j3 = 50000;
        this.f10762b = e2.d0.Q(j3);
        this.f10763c = e2.d0.Q(j3);
        this.d = e2.d0.Q(i10);
        this.e = e2.d0.Q(i11);
        this.f10764f = -1;
        this.f10765g = e2.d0.Q(0);
        this.h = new HashMap();
        this.f10766i = -1L;
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
            i10 += jVar.f10753b;
        }
        return i10;
    }

    public final boolean c(p0 p0Var) {
        int i10;
        boolean z10;
        long j3 = this.f10763c;
        j jVar = (j) this.h.get(p0Var.f10856a);
        jVar.getClass();
        y2.d dVar = this.f10761a;
        synchronized (dVar) {
            i10 = dVar.d * dVar.f46285b;
        }
        if (i10 >= b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f10762b;
        float f7 = p0Var.f10858c;
        if (f7 > 1.0f) {
            j10 = Math.min(e2.d0.z(j10, f7), j3);
        }
        long max = Math.max(j10, 500000L);
        long j11 = p0Var.f10857b;
        if (j11 < max) {
            jVar.f10752a = !z10;
            if (z10 && j11 < 500000) {
                e2.a.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j3 || z10) {
            jVar.f10752a = false;
        }
        return jVar.f10752a;
    }

    public final void d() {
        if (this.h.isEmpty()) {
            y2.d dVar = this.f10761a;
            synchronized (dVar) {
                if (dVar.f46284a) {
                    dVar.a(0);
                }
            }
            return;
        }
        this.f10761a.a(b());
    }
}
