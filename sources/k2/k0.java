package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import ji.w4;
public final class k0 {
    public boolean A;
    public long B;
    public final w4 f13928a;
    public final e2.g0 f13929b;
    public final long[] f13930c;
    public final AudioTrack d;
    public final int e;
    public final long f13931f;
    public final boolean f13932g;
    public final b0 h;
    public float f13933i;
    public long f13934j;
    public long f13935k;
    public long f13936l;
    public Method f13937m;
    public long f13938n;
    public long f13939o;
    public long f13940p;
    public long f13941q;
    public long f13942r;
    public int f13943s;
    public int f13944t;
    public long f13945u;
    public long v;
    public long f13946w;
    public long f13947x;
    public long f13948y;
    public long f13949z;

    public k0(w4 w4Var, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f13928a = w4Var;
        this.f13929b = g0Var;
        this.d = audioTrack;
        try {
            this.f13937m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13930c = new long[10];
        this.f13949z = -9223372036854775807L;
        this.f13948y = -9223372036854775807L;
        this.h = new b0(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f13932g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f13931f = j10;
        this.f13941q = 0L;
        this.f13942r = 0L;
        this.A = false;
        this.B = 0L;
        this.f13945u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f13939o = 0L;
        this.f13938n = 0L;
        this.f13933i = 1.0f;
        this.f13934j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f13945u != -9223372036854775807L) {
            return Math.min(this.f13947x, c());
        }
        this.f13929b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13940p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13941q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f13941q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f13942r++;
                    }
                }
                this.f13941q = playbackHeadPosition;
            }
            this.f13940p = elapsedRealtime;
        }
        return this.f13941q + this.B + (this.f13942r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f13944t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f13945u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f13935k, this.f13933i);
        }
        long max = Math.max(0L, B - this.f13938n);
        if (this.f13945u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f13947x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f13946w;
        }
        this.f13929b.getClass();
        return this.f13946w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f13945u, this.f13933i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f13934j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f13933i);
            this.f13929b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f13934j = -9223372036854775807L;
            e2.r rVar = ((h0) this.f13928a.f13595b).f13899j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8395a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
