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
    public final w4 f13925a;
    public final e2.g0 f13926b;
    public final long[] f13927c;
    public final AudioTrack d;
    public final int e;
    public final long f13928f;
    public final boolean f13929g;
    public final b0 h;
    public float f13930i;
    public long f13931j;
    public long f13932k;
    public long f13933l;
    public Method f13934m;
    public long f13935n;
    public long f13936o;
    public long f13937p;
    public long f13938q;
    public long f13939r;
    public int f13940s;
    public int f13941t;
    public long f13942u;
    public long v;
    public long f13943w;
    public long f13944x;
    public long f13945y;
    public long f13946z;

    public k0(w4 w4Var, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f13925a = w4Var;
        this.f13926b = g0Var;
        this.d = audioTrack;
        try {
            this.f13934m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13927c = new long[10];
        this.f13946z = -9223372036854775807L;
        this.f13945y = -9223372036854775807L;
        this.h = new b0(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f13929g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f13928f = j10;
        this.f13938q = 0L;
        this.f13939r = 0L;
        this.A = false;
        this.B = 0L;
        this.f13942u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f13936o = 0L;
        this.f13935n = 0L;
        this.f13930i = 1.0f;
        this.f13931j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f13942u != -9223372036854775807L) {
            return Math.min(this.f13944x, c());
        }
        this.f13926b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13937p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13938q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f13938q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f13939r++;
                    }
                }
                this.f13938q = playbackHeadPosition;
            }
            this.f13937p = elapsedRealtime;
        }
        return this.f13938q + this.B + (this.f13939r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f13941t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f13942u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f13932k, this.f13930i);
        }
        long max = Math.max(0L, B - this.f13935n);
        if (this.f13942u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f13944x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f13943w;
        }
        this.f13926b.getClass();
        return this.f13943w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f13942u, this.f13930i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f13931j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f13930i);
            this.f13926b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f13931j = -9223372036854775807L;
            e2.r rVar = ((h0) this.f13925a.f13592b).f13896j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8392a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
