package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class i0 {
    public boolean A;
    public long B;
    public final g6.d0 f20197a;
    public final h2.g0 f20198b;
    public final long[] f20199c;
    public final AudioTrack d;
    public final int f20200e;
    public final long f20201f;
    public final boolean f20202g;
    public final z h;
    public float f20203i;
    public long f20204j;
    public long f20205k;
    public long f20206l;
    public Method f20207m;
    public long f20208n;
    public long f20209o;
    public long f20210p;
    public long f20211q;
    public long f20212r;
    public int f20213s;
    public int f20214t;
    public long f20215u;
    public long v;
    public long f20216w;
    public long f20217x;
    public long f20218y;
    public long f20219z;

    public i0(g6.d0 d0Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f20197a = d0Var;
        this.f20198b = g0Var;
        this.d = audioTrack;
        try {
            this.f20207m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20199c = new long[10];
        this.f20219z = -9223372036854775807L;
        this.f20218y = -9223372036854775807L;
        this.h = new z(audioTrack, d0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f20200e = sampleRate;
        boolean M = h2.m0.M(i7);
        this.f20202g = M;
        if (M) {
            j3 = h2.m0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f20201f = j3;
        this.f20211q = 0L;
        this.f20212r = 0L;
        this.A = false;
        this.B = 0L;
        this.f20215u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f20209o = 0L;
        this.f20208n = 0L;
        this.f20203i = 1.0f;
        this.f20204j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f20215u != -9223372036854775807L) {
            return Math.min(this.f20217x, c());
        }
        this.f20198b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f20210p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f20211q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f20211q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f20212r++;
                    }
                }
                this.f20211q = playbackHeadPosition;
            }
            this.f20210p = elapsedRealtime;
        }
        return this.f20211q + this.B + (this.f20212r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f20214t;
        int i10 = this.f20200e;
        if (i7 == 0) {
            if (this.f20215u != -9223372036854775807L) {
                B = h2.m0.Y(i10, c());
            } else {
                B = h2.m0.Y(i10, a());
            }
        } else {
            B = h2.m0.B(j3 + this.f20205k, this.f20203i);
        }
        long max = Math.max(0L, B - this.f20208n);
        if (this.f20215u != -9223372036854775807L) {
            return Math.min(h2.m0.Y(i10, this.f20217x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f20216w;
        }
        this.f20198b.getClass();
        return this.f20216w + h2.m0.a0(h2.m0.B(h2.m0.S(SystemClock.elapsedRealtime()) - this.f20215u, this.f20203i), this.f20200e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f20204j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.m0.F(j3 - j10, this.f20203i);
            this.f20198b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.m0.h0(F);
            this.f20204j = -9223372036854775807L;
            h2.r rVar = ((f0) this.f20197a.f13555b).f20166j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f14139a) {
                rVar.e(-1, new c0(currentTimeMillis));
            }
        }
    }
}
