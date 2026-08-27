package h3;

public final class j {

    public final com.google.android.exoplayer2.upstream.r f7936a;

    public final long f7937b;

    public final long f7938c;
    public final long d;

    public final long f7939e;

    public final int f7940f;

    public final long f7941g;
    public int h;

    public boolean f7942i;

    public j(com.google.android.exoplayer2.upstream.r rVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f7936a = rVar;
        long j10 = 50000;
        this.f7937b = d5.g0.H(j10);
        this.f7938c = d5.g0.H(j10);
        this.d = d5.g0.H(i10);
        this.f7939e = d5.g0.H(i11);
        this.f7940f = -1;
        this.h = 13107200;
        this.f7941g = d5.g0.H(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        d5.a.e(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final void b(boolean z10) {
        int i10 = this.f7940f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.h = i10;
        this.f7942i = false;
        if (z10) {
            com.google.android.exoplayer2.upstream.r rVar = this.f7936a;
            synchronized (rVar) {
                if (rVar.f3033a) {
                    rVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f10) {
        int i10;
        long j11 = this.f7938c;
        com.google.android.exoplayer2.upstream.r rVar = this.f7936a;
        synchronized (rVar) {
            i10 = rVar.d * rVar.f3034b;
        }
        boolean z10 = i10 >= this.h;
        long jMin = this.f7937b;
        if (f10 > 1.0f) {
            jMin = Math.min(d5.g0.s(jMin, f10), j11);
        }
        if (j10 < Math.max(jMin, 500000L)) {
            this.f7942i = !z10;
            if (z10 && j10 < 500000) {
                d5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f7942i = false;
        }
        return this.f7942i;
    }
}
