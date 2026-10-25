package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class m0 {
    public boolean A;
    public long B;
    public final jg.i f16215a;
    public final e2.g0 f16216b;
    public final long[] f16217c;
    public final AudioTrack d;
    public final int e;
    public final long f16218f;
    public final boolean f16219g;
    public final c0 h;
    public float f16220i;
    public long f16221j;
    public long f16222k;
    public long f16223l;
    public Method f16224m;
    public long f16225n;
    public long f16226o;
    public long f16227p;
    public long f16228q;
    public long f16229r;
    public int f16230s;
    public int f16231t;
    public long f16232u;
    public long v;
    public long f16233w;
    public long f16234x;
    public long f16235y;
    public long f16236z;

    public m0(jg.i iVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f16215a = iVar;
        this.f16216b = g0Var;
        this.d = audioTrack;
        try {
            this.f16224m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f16217c = new long[10];
        this.f16236z = -9223372036854775807L;
        this.f16235y = -9223372036854775807L;
        this.h = new c0(audioTrack, iVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.n0.M(i10);
        this.f16219g = M;
        if (M) {
            j10 = e2.n0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f16218f = j10;
        this.f16228q = 0L;
        this.f16229r = 0L;
        this.A = false;
        this.B = 0L;
        this.f16232u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f16226o = 0L;
        this.f16225n = 0L;
        this.f16220i = 1.0f;
        this.f16221j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f16232u != -9223372036854775807L) {
            return Math.min(this.f16234x, c());
        }
        this.f16216b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f16227p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f16228q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f16228q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f16229r++;
                    }
                }
                this.f16228q = playbackHeadPosition;
            }
            this.f16227p = elapsedRealtime;
        }
        return this.f16228q + this.B + (this.f16229r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f16231t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f16232u != -9223372036854775807L) {
                B = e2.n0.Y(i11, c());
            } else {
                B = e2.n0.Y(i11, a());
            }
        } else {
            B = e2.n0.B(j10 + this.f16222k, this.f16220i);
        }
        long max = Math.max(0L, B - this.f16225n);
        if (this.f16232u != -9223372036854775807L) {
            return Math.min(e2.n0.Y(i11, this.f16234x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f16233w;
        }
        this.f16216b.getClass();
        return this.f16233w + e2.n0.a0(e2.n0.B(e2.n0.S(SystemClock.elapsedRealtime()) - this.f16232u, this.f16220i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f16221j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.n0.F(j10 - j11, this.f16220i);
            this.f16216b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.n0.h0(F);
            this.f16221j = -9223372036854775807L;
            e2.r rVar = ((j0) this.f16215a.f15726a).f16183j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f9713a) {
                rVar.e(-1, new g0(currentTimeMillis));
            }
        }
    }
}
