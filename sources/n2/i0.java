package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class i0 {
    public boolean A;
    public long B;
    public final g6.d0 f20205a;
    public final h2.g0 f20206b;
    public final long[] f20207c;
    public final AudioTrack d;
    public final int f20208e;
    public final long f20209f;
    public final boolean f20210g;
    public final z h;
    public float f20211i;
    public long f20212j;
    public long f20213k;
    public long f20214l;
    public Method f20215m;
    public long f20216n;
    public long f20217o;
    public long f20218p;
    public long f20219q;
    public long f20220r;
    public int f20221s;
    public int f20222t;
    public long f20223u;
    public long v;
    public long f20224w;
    public long f20225x;
    public long f20226y;
    public long f20227z;

    public i0(g6.d0 d0Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f20205a = d0Var;
        this.f20206b = g0Var;
        this.d = audioTrack;
        try {
            this.f20215m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20207c = new long[10];
        this.f20227z = -9223372036854775807L;
        this.f20226y = -9223372036854775807L;
        this.h = new z(audioTrack, d0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f20208e = sampleRate;
        boolean M = h2.m0.M(i7);
        this.f20210g = M;
        if (M) {
            j3 = h2.m0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f20209f = j3;
        this.f20219q = 0L;
        this.f20220r = 0L;
        this.A = false;
        this.B = 0L;
        this.f20223u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f20217o = 0L;
        this.f20216n = 0L;
        this.f20211i = 1.0f;
        this.f20212j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f20223u != -9223372036854775807L) {
            return Math.min(this.f20225x, c());
        }
        this.f20206b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f20218p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f20219q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f20219q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f20220r++;
                    }
                }
                this.f20219q = playbackHeadPosition;
            }
            this.f20218p = elapsedRealtime;
        }
        return this.f20219q + this.B + (this.f20220r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f20222t;
        int i10 = this.f20208e;
        if (i7 == 0) {
            if (this.f20223u != -9223372036854775807L) {
                B = h2.m0.Y(i10, c());
            } else {
                B = h2.m0.Y(i10, a());
            }
        } else {
            B = h2.m0.B(j3 + this.f20213k, this.f20211i);
        }
        long max = Math.max(0L, B - this.f20216n);
        if (this.f20223u != -9223372036854775807L) {
            return Math.min(h2.m0.Y(i10, this.f20225x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f20224w;
        }
        this.f20206b.getClass();
        return this.f20224w + h2.m0.a0(h2.m0.B(h2.m0.S(SystemClock.elapsedRealtime()) - this.f20223u, this.f20211i), this.f20208e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f20212j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.m0.F(j3 - j10, this.f20211i);
            this.f20206b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.m0.h0(F);
            this.f20212j = -9223372036854775807L;
            h2.r rVar = ((f0) this.f20205a.f13557b).f20174j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f14141a) {
                rVar.e(-1, new c0(currentTimeMillis));
            }
        }
    }
}
