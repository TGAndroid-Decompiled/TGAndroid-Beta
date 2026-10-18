package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class l0 {
    public boolean A;
    public long B;
    public final ya.c f14734a;
    public final e2.g0 f14735b;
    public final long[] f14736c;
    public final AudioTrack d;
    public final int e;
    public final long f14737f;
    public final boolean f14738g;
    public final b0 h;
    public float f14739i;
    public long f14740j;
    public long f14741k;
    public long f14742l;
    public Method f14743m;
    public long f14744n;
    public long f14745o;
    public long f14746p;
    public long f14747q;
    public long f14748r;
    public int f14749s;
    public int f14750t;
    public long f14751u;
    public long v;
    public long f14752w;
    public long f14753x;
    public long f14754y;
    public long f14755z;

    public l0(ya.c cVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f14734a = cVar;
        this.f14735b = g0Var;
        this.d = audioTrack;
        try {
            this.f14743m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14736c = new long[10];
        this.f14755z = -9223372036854775807L;
        this.f14754y = -9223372036854775807L;
        this.h = new b0(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f14738g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f14737f = j10;
        this.f14747q = 0L;
        this.f14748r = 0L;
        this.A = false;
        this.B = 0L;
        this.f14751u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f14745o = 0L;
        this.f14744n = 0L;
        this.f14739i = 1.0f;
        this.f14740j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f14751u != -9223372036854775807L) {
            return Math.min(this.f14753x, c());
        }
        this.f14735b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14746p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14747q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f14747q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f14748r++;
                    }
                }
                this.f14747q = playbackHeadPosition;
            }
            this.f14746p = elapsedRealtime;
        }
        return this.f14747q + this.B + (this.f14748r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f14750t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f14751u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f14741k, this.f14739i);
        }
        long max = Math.max(0L, B - this.f14744n);
        if (this.f14751u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f14753x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f14752w;
        }
        this.f14735b.getClass();
        return this.f14752w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f14751u, this.f14739i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f14740j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f14739i);
            this.f14735b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f14740j = -9223372036854775807L;
            e2.r rVar = ((i0) this.f14734a.f50161b).f14702j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8275a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
