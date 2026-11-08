package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class i0 {
    public boolean A;
    public long B;
    public final g6.d0 f20200a;
    public final h2.g0 f20201b;
    public final long[] f20202c;
    public final AudioTrack d;
    public final int f20203e;
    public final long f20204f;
    public final boolean f20205g;
    public final z h;
    public float f20206i;
    public long f20207j;
    public long f20208k;
    public long f20209l;
    public Method f20210m;
    public long f20211n;
    public long f20212o;
    public long f20213p;
    public long f20214q;
    public long f20215r;
    public int f20216s;
    public int f20217t;
    public long f20218u;
    public long v;
    public long f20219w;
    public long f20220x;
    public long f20221y;
    public long f20222z;

    public i0(g6.d0 d0Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f20200a = d0Var;
        this.f20201b = g0Var;
        this.d = audioTrack;
        try {
            this.f20210m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20202c = new long[10];
        this.f20222z = -9223372036854775807L;
        this.f20221y = -9223372036854775807L;
        this.h = new z(audioTrack, d0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f20203e = sampleRate;
        boolean M = h2.m0.M(i7);
        this.f20205g = M;
        if (M) {
            j3 = h2.m0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f20204f = j3;
        this.f20214q = 0L;
        this.f20215r = 0L;
        this.A = false;
        this.B = 0L;
        this.f20218u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f20212o = 0L;
        this.f20211n = 0L;
        this.f20206i = 1.0f;
        this.f20207j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f20218u != -9223372036854775807L) {
            return Math.min(this.f20220x, c());
        }
        this.f20201b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f20213p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f20214q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f20214q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f20215r++;
                    }
                }
                this.f20214q = playbackHeadPosition;
            }
            this.f20213p = elapsedRealtime;
        }
        return this.f20214q + this.B + (this.f20215r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f20217t;
        int i10 = this.f20203e;
        if (i7 == 0) {
            if (this.f20218u != -9223372036854775807L) {
                B = h2.m0.Y(i10, c());
            } else {
                B = h2.m0.Y(i10, a());
            }
        } else {
            B = h2.m0.B(j3 + this.f20208k, this.f20206i);
        }
        long max = Math.max(0L, B - this.f20211n);
        if (this.f20218u != -9223372036854775807L) {
            return Math.min(h2.m0.Y(i10, this.f20220x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f20219w;
        }
        this.f20201b.getClass();
        return this.f20219w + h2.m0.a0(h2.m0.B(h2.m0.S(SystemClock.elapsedRealtime()) - this.f20218u, this.f20206i), this.f20203e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f20207j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.m0.F(j3 - j10, this.f20206i);
            this.f20201b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.m0.h0(F);
            this.f20207j = -9223372036854775807L;
            h2.r rVar = ((f0) this.f20200a.f13555b).f20169j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f14139a) {
                rVar.e(-1, new c0(currentTimeMillis));
            }
        }
    }
}
