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
    public final w4 f21142a;
    public final h2.g0 f21143b;
    public final long[] f21144c;
    public final AudioTrack d;
    public final int f21145e;
    public final long f21146f;
    public final boolean f21147g;
    public final z h;
    public float f21148i;
    public long f21149j;
    public long f21150k;
    public long f21151l;
    public Method f21152m;
    public long f21153n;
    public long f21154o;
    public long f21155p;
    public long f21156q;
    public long f21157r;
    public int f21158s;
    public int f21159t;
    public long f21160u;
    public long v;
    public long f21161w;
    public long f21162x;
    public long f21163y;
    public long f21164z;

    public j0(w4 w4Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21142a = w4Var;
        this.f21143b = g0Var;
        this.d = audioTrack;
        try {
            this.f21152m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21144c = new long[10];
        this.f21164z = -9223372036854775807L;
        this.f21163y = -9223372036854775807L;
        this.h = new z(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f21145e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21147g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21146f = j3;
        this.f21156q = 0L;
        this.f21157r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21160u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21154o = 0L;
        this.f21153n = 0L;
        this.f21148i = 1.0f;
        this.f21149j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21160u != -9223372036854775807L) {
            return Math.min(this.f21162x, c());
        }
        this.f21143b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21155p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21156q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21156q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21157r++;
                    }
                }
                this.f21156q = playbackHeadPosition;
            }
            this.f21155p = elapsedRealtime;
        }
        return this.f21156q + this.B + (this.f21157r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21159t;
        int i10 = this.f21145e;
        if (i7 == 0) {
            if (this.f21160u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21150k, this.f21148i);
        }
        long max = Math.max(0L, B - this.f21153n);
        if (this.f21160u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21162x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21161w;
        }
        this.f21143b.getClass();
        return this.f21161w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21160u, this.f21148i), this.f21145e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21149j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21148i);
            this.f21143b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21149j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f21142a.f15645b).f21110j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13813a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
