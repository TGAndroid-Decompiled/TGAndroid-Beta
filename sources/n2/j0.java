package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import hi.x4;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class j0 {
    public boolean A;
    public long B;
    public final x4 f21136a;
    public final h2.g0 f21137b;
    public final long[] f21138c;
    public final AudioTrack d;
    public final int f21139e;
    public final long f21140f;
    public final boolean f21141g;
    public final z h;
    public float f21142i;
    public long f21143j;
    public long f21144k;
    public long f21145l;
    public Method f21146m;
    public long f21147n;
    public long f21148o;
    public long f21149p;
    public long f21150q;
    public long f21151r;
    public int f21152s;
    public int f21153t;
    public long f21154u;
    public long v;
    public long f21155w;
    public long f21156x;
    public long f21157y;
    public long f21158z;

    public j0(x4 x4Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21136a = x4Var;
        this.f21137b = g0Var;
        this.d = audioTrack;
        try {
            this.f21146m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21138c = new long[10];
        this.f21158z = -9223372036854775807L;
        this.f21157y = -9223372036854775807L;
        this.h = new z(audioTrack, x4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f21139e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21141g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21140f = j3;
        this.f21150q = 0L;
        this.f21151r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21154u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21148o = 0L;
        this.f21147n = 0L;
        this.f21142i = 1.0f;
        this.f21143j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21154u != -9223372036854775807L) {
            return Math.min(this.f21156x, c());
        }
        this.f21137b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21149p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21150q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21150q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21151r++;
                    }
                }
                this.f21150q = playbackHeadPosition;
            }
            this.f21149p = elapsedRealtime;
        }
        return this.f21150q + this.B + (this.f21151r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21153t;
        int i10 = this.f21139e;
        if (i7 == 0) {
            if (this.f21154u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21144k, this.f21142i);
        }
        long max = Math.max(0L, B - this.f21147n);
        if (this.f21154u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21156x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21155w;
        }
        this.f21137b.getClass();
        return this.f21155w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21154u, this.f21142i), this.f21139e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21143j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21142i);
            this.f21137b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21143j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f21136a.f15680b).f21104j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13805a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
