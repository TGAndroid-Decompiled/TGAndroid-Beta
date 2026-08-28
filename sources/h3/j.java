package h3;
public final class j {
    public final com.google.android.exoplayer2.upstream.r f9506a;
    public final long f9507b;
    public final long f9508c;
    public final long d;
    public final long f9509e;
    public final int f9510f;
    public final long f9511g;
    public int h;
    public boolean f9512i;

    public j(com.google.android.exoplayer2.upstream.r rVar, int i9, int i10) {
        a(i9, 0, "bufferForPlaybackMs", "0");
        a(i10, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i9, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i10, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f9506a = rVar;
        long j10 = 50000;
        this.f9507b = d5.f0.H(j10);
        this.f9508c = d5.f0.H(j10);
        this.d = d5.f0.H(i9);
        this.f9509e = d5.f0.H(i10);
        this.f9510f = -1;
        this.h = 13107200;
        this.f9511g = d5.f0.H(0);
    }

    public static void a(int i9, int i10, String str, String str2) {
        boolean z10;
        if (i9 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.e(str + " cannot be less than " + str2, z10);
    }

    public final void b(boolean z10) {
        int i9 = this.f9510f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        this.h = i9;
        this.f9512i = false;
        if (z10) {
            com.google.android.exoplayer2.upstream.r rVar = this.f9506a;
            synchronized (rVar) {
                if (rVar.f2596a) {
                    rVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f10) {
        int i9;
        boolean z10;
        long j11 = this.f9508c;
        com.google.android.exoplayer2.upstream.r rVar = this.f9506a;
        synchronized (rVar) {
            i9 = rVar.d * rVar.f2597b;
        }
        if (i9 >= this.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = this.f9507b;
        if (f10 > 1.0f) {
            j12 = Math.min(d5.f0.s(j12, f10), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.f9512i = !z10;
            if (z10 && j10 < 500000) {
                d5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f9512i = false;
        }
        return this.f9512i;
    }
}
