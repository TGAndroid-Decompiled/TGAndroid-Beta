package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class l0 {
    public boolean A;
    public long B;
    public final ya.c f14727a;
    public final e2.g0 f14728b;
    public final long[] f14729c;
    public final AudioTrack d;
    public final int e;
    public final long f14730f;
    public final boolean f14731g;
    public final b0 h;
    public float f14732i;
    public long f14733j;
    public long f14734k;
    public long f14735l;
    public Method f14736m;
    public long f14737n;
    public long f14738o;
    public long f14739p;
    public long f14740q;
    public long f14741r;
    public int f14742s;
    public int f14743t;
    public long f14744u;
    public long v;
    public long f14745w;
    public long f14746x;
    public long f14747y;
    public long f14748z;

    public l0(ya.c cVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f14727a = cVar;
        this.f14728b = g0Var;
        this.d = audioTrack;
        try {
            this.f14736m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14729c = new long[10];
        this.f14748z = -9223372036854775807L;
        this.f14747y = -9223372036854775807L;
        this.h = new b0(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f14731g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f14730f = j10;
        this.f14740q = 0L;
        this.f14741r = 0L;
        this.A = false;
        this.B = 0L;
        this.f14744u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f14738o = 0L;
        this.f14737n = 0L;
        this.f14732i = 1.0f;
        this.f14733j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f14744u != -9223372036854775807L) {
            return Math.min(this.f14746x, c());
        }
        this.f14728b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14739p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14740q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f14740q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f14741r++;
                    }
                }
                this.f14740q = playbackHeadPosition;
            }
            this.f14739p = elapsedRealtime;
        }
        return this.f14740q + this.B + (this.f14741r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f14743t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f14744u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f14734k, this.f14732i);
        }
        long max = Math.max(0L, B - this.f14737n);
        if (this.f14744u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f14746x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f14745w;
        }
        this.f14728b.getClass();
        return this.f14745w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f14744u, this.f14732i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f14733j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f14732i);
            this.f14728b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f14733j = -9223372036854775807L;
            e2.r rVar = ((i0) this.f14727a.f50136b).f14695j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8274a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
