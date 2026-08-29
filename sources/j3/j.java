package j3;
public final class j {
    public final com.google.android.exoplayer2.upstream.r f10543a;
    public final long f10544b;
    public final long f10545c;
    public final long d;
    public final long f10546e;
    public final int f10547f;
    public final long f10548g;
    public int h;
    public boolean f10549i;

    public j(com.google.android.exoplayer2.upstream.r rVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f10543a = rVar;
        long j10 = 50000;
        this.f10544b = f5.d0.H(j10);
        this.f10545c = f5.d0.H(j10);
        this.d = f5.d0.H(i10);
        this.f10546e = f5.d0.H(i11);
        this.f10547f = -1;
        this.h = 13107200;
        this.f10548g = f5.d0.H(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.e(str + " cannot be less than " + str2, z10);
    }

    public final void b(boolean z10) {
        int i10 = this.f10547f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.h = i10;
        this.f10549i = false;
        if (z10) {
            com.google.android.exoplayer2.upstream.r rVar = this.f10543a;
            synchronized (rVar) {
                if (rVar.f3610a) {
                    rVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f9) {
        int i10;
        boolean z10;
        long j11 = this.f10545c;
        com.google.android.exoplayer2.upstream.r rVar = this.f10543a;
        synchronized (rVar) {
            i10 = rVar.d * rVar.f3611b;
        }
        if (i10 >= this.h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j12 = this.f10544b;
        if (f9 > 1.0f) {
            j12 = Math.min(f5.d0.s(j12, f9), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.f10549i = !z10;
            if (z10 && j10 < 500000) {
                f5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z10) {
            this.f10549i = false;
        }
        return this.f10549i;
    }
}
