package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import hi.w4;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class j0 {
    public boolean A;
    public long B;
    public final w4 f21170a;
    public final h2.g0 f21171b;
    public final long[] f21172c;
    public final AudioTrack d;
    public final int f21173e;
    public final long f21174f;
    public final boolean f21175g;
    public final z h;
    public float f21176i;
    public long f21177j;
    public long f21178k;
    public long f21179l;
    public Method f21180m;
    public long f21181n;
    public long f21182o;
    public long f21183p;
    public long f21184q;
    public long f21185r;
    public int f21186s;
    public int f21187t;
    public long f21188u;
    public long v;
    public long f21189w;
    public long f21190x;
    public long f21191y;
    public long f21192z;

    public j0(w4 w4Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21170a = w4Var;
        this.f21171b = g0Var;
        this.d = audioTrack;
        try {
            this.f21180m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21172c = new long[10];
        this.f21192z = -9223372036854775807L;
        this.f21191y = -9223372036854775807L;
        this.h = new z(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f21173e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21175g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21174f = j3;
        this.f21184q = 0L;
        this.f21185r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21188u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21182o = 0L;
        this.f21181n = 0L;
        this.f21176i = 1.0f;
        this.f21177j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21188u != -9223372036854775807L) {
            return Math.min(this.f21190x, c());
        }
        this.f21171b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21183p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21184q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21184q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21185r++;
                    }
                }
                this.f21184q = playbackHeadPosition;
            }
            this.f21183p = elapsedRealtime;
        }
        return this.f21184q + this.B + (this.f21185r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21187t;
        int i10 = this.f21173e;
        if (i7 == 0) {
            if (this.f21188u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21178k, this.f21176i);
        }
        long max = Math.max(0L, B - this.f21181n);
        if (this.f21188u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21190x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21189w;
        }
        this.f21171b.getClass();
        return this.f21189w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21188u, this.f21176i), this.f21173e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21177j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21176i);
            this.f21171b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21177j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f21170a.f15708b).f21138j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13842a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
