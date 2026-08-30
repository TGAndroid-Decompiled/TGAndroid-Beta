package j3;
public final class j {
    public final g5.q f8629a;
    public final long f8630b;
    public final long f8631c;
    public final long d;
    public final long e;
    public final int f8632f;
    public final long f8633g;
    public int h;
    public boolean f8634i;

    public j(g5.q qVar, int i10, int i11) {
        a(i10, 0, "bufferForPlaybackMs", "0");
        a(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, i10, "minBufferMs", "bufferForPlaybackMs");
        a(50000, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f8629a = qVar;
        long j10 = 50000;
        this.f8630b = h5.d0.G(j10);
        this.f8631c = h5.d0.G(j10);
        this.d = h5.d0.G(i10);
        this.e = h5.d0.G(i11);
        this.f8632f = -1;
        this.h = 13107200;
        this.f8633g = h5.d0.G(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        boolean z4;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.e(str + " cannot be less than " + str2, z4);
    }

    public final void b(boolean z4) {
        int i10 = this.f8632f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.h = i10;
        this.f8634i = false;
        if (z4) {
            g5.q qVar = this.f8629a;
            synchronized (qVar) {
                if (qVar.f6410a) {
                    qVar.a(0);
                }
            }
        }
    }

    public final boolean c(long j10, float f10) {
        int i10;
        boolean z4;
        long j11 = this.f8631c;
        g5.q qVar = this.f8629a;
        synchronized (qVar) {
            i10 = qVar.d * qVar.f6411b;
        }
        if (i10 >= this.h) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j12 = this.f8630b;
        if (f10 > 1.0f) {
            j12 = Math.min(h5.d0.t(j12, f10), j11);
        }
        if (j10 < Math.max(j12, 500000L)) {
            this.f8634i = !z4;
            if (z4 && j10 < 500000) {
                h5.a.K("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= j11 || z4) {
            this.f8634i = false;
        }
        return this.f8634i;
    }
}
