package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class m50 {
    public boolean A;
    public long B;
    public final sz4 a;
    public final bfb b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final b50 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public m50(sz4 sz4Var, bfb bfbVar, AudioTrack audioTrack, int i, int i2, int i3) {
        long j;
        this.a = sz4Var;
        this.b = bfbVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new b50(audioTrack, sz4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean N = hac.N(i);
        this.g = N;
        if (N) {
            j = hac.Z(sampleRate, i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f = j;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long D;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            if (this.u != -9223372036854775807L) {
                D = hac.Z(i2, c());
            } else {
                D = hac.Z(i2, a());
            }
        } else {
            D = hac.D(j + this.k, this.i);
        }
        long max = Math.max(0L, D - this.n);
        if (this.u != -9223372036854775807L) {
            return Math.min(hac.Z(i2, this.x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + hac.b0(hac.D(hac.T(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 != -9223372036854775807L && j >= j2) {
            long H = hac.H(j - j2, this.i);
            this.b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - hac.i0(H);
            this.j = -9223372036854775807L;
            a86 a86Var = ((j50) this.a.a).i;
            a86Var.getClass();
            if (Thread.currentThread() == a86Var.a) {
                a86Var.e(-1, new f50(currentTimeMillis));
            }
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}
