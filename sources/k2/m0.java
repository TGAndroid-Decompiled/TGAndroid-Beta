package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class m0 {
    public boolean A;
    public long B;
    public final jg.i f16214a;
    public final e2.g0 f16215b;
    public final long[] f16216c;
    public final AudioTrack d;
    public final int e;
    public final long f16217f;
    public final boolean f16218g;
    public final c0 h;
    public float f16219i;
    public long f16220j;
    public long f16221k;
    public long f16222l;
    public Method f16223m;
    public long f16224n;
    public long f16225o;
    public long f16226p;
    public long f16227q;
    public long f16228r;
    public int f16229s;
    public int f16230t;
    public long f16231u;
    public long v;
    public long f16232w;
    public long f16233x;
    public long f16234y;
    public long f16235z;

    public m0(jg.i iVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f16214a = iVar;
        this.f16215b = g0Var;
        this.d = audioTrack;
        try {
            this.f16223m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f16216c = new long[10];
        this.f16235z = -9223372036854775807L;
        this.f16234y = -9223372036854775807L;
        this.h = new c0(audioTrack, iVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.n0.M(i10);
        this.f16218g = M;
        if (M) {
            j10 = e2.n0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f16217f = j10;
        this.f16227q = 0L;
        this.f16228r = 0L;
        this.A = false;
        this.B = 0L;
        this.f16231u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f16225o = 0L;
        this.f16224n = 0L;
        this.f16219i = 1.0f;
        this.f16220j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f16231u != -9223372036854775807L) {
            return Math.min(this.f16233x, c());
        }
        this.f16215b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f16226p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f16227q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f16227q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f16228r++;
                    }
                }
                this.f16227q = playbackHeadPosition;
            }
            this.f16226p = elapsedRealtime;
        }
        return this.f16227q + this.B + (this.f16228r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f16230t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f16231u != -9223372036854775807L) {
                B = e2.n0.Y(i11, c());
            } else {
                B = e2.n0.Y(i11, a());
            }
        } else {
            B = e2.n0.B(j10 + this.f16221k, this.f16219i);
        }
        long max = Math.max(0L, B - this.f16224n);
        if (this.f16231u != -9223372036854775807L) {
            return Math.min(e2.n0.Y(i11, this.f16233x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f16232w;
        }
        this.f16215b.getClass();
        return this.f16232w + e2.n0.a0(e2.n0.B(e2.n0.S(SystemClock.elapsedRealtime()) - this.f16231u, this.f16219i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f16220j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.n0.F(j10 - j11, this.f16219i);
            this.f16215b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.n0.h0(F);
            this.f16220j = -9223372036854775807L;
            e2.r rVar = ((j0) this.f16214a.f15725a).f16182j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f9712a) {
                rVar.e(-1, new g0(currentTimeMillis));
            }
        }
    }
}
