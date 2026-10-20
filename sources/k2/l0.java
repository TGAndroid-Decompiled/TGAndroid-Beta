package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class l0 {
    public boolean A;
    public long B;
    public final ya.d f14732a;
    public final e2.g0 f14733b;
    public final long[] f14734c;
    public final AudioTrack d;
    public final int e;
    public final long f14735f;
    public final boolean f14736g;
    public final b0 h;
    public float f14737i;
    public long f14738j;
    public long f14739k;
    public long f14740l;
    public Method f14741m;
    public long f14742n;
    public long f14743o;
    public long f14744p;
    public long f14745q;
    public long f14746r;
    public int f14747s;
    public int f14748t;
    public long f14749u;
    public long v;
    public long f14750w;
    public long f14751x;
    public long f14752y;
    public long f14753z;

    public l0(ya.d dVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f14732a = dVar;
        this.f14733b = g0Var;
        this.d = audioTrack;
        try {
            this.f14741m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14734c = new long[10];
        this.f14753z = -9223372036854775807L;
        this.f14752y = -9223372036854775807L;
        this.h = new b0(audioTrack, dVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f14736g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f14735f = j10;
        this.f14745q = 0L;
        this.f14746r = 0L;
        this.A = false;
        this.B = 0L;
        this.f14749u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f14743o = 0L;
        this.f14742n = 0L;
        this.f14737i = 1.0f;
        this.f14738j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f14749u != -9223372036854775807L) {
            return Math.min(this.f14751x, c());
        }
        this.f14733b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14744p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14745q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f14745q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f14746r++;
                    }
                }
                this.f14745q = playbackHeadPosition;
            }
            this.f14744p = elapsedRealtime;
        }
        return this.f14745q + this.B + (this.f14746r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f14748t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f14749u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f14739k, this.f14737i);
        }
        long max = Math.max(0L, B - this.f14742n);
        if (this.f14749u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f14751x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f14750w;
        }
        this.f14733b.getClass();
        return this.f14750w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f14749u, this.f14737i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f14738j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f14737i);
            this.f14733b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f14738j = -9223372036854775807L;
            e2.r rVar = ((i0) this.f14732a.f50121b).f14700j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8272a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
