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
    public final w4 f21139a;
    public final h2.g0 f21140b;
    public final long[] f21141c;
    public final AudioTrack d;
    public final int f21142e;
    public final long f21143f;
    public final boolean f21144g;
    public final z h;
    public float f21145i;
    public long f21146j;
    public long f21147k;
    public long f21148l;
    public Method f21149m;
    public long f21150n;
    public long f21151o;
    public long f21152p;
    public long f21153q;
    public long f21154r;
    public int f21155s;
    public int f21156t;
    public long f21157u;
    public long v;
    public long f21158w;
    public long f21159x;
    public long f21160y;
    public long f21161z;

    public j0(w4 w4Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21139a = w4Var;
        this.f21140b = g0Var;
        this.d = audioTrack;
        try {
            this.f21149m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21141c = new long[10];
        this.f21161z = -9223372036854775807L;
        this.f21160y = -9223372036854775807L;
        this.h = new z(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f21142e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21144g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21143f = j3;
        this.f21153q = 0L;
        this.f21154r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21157u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21151o = 0L;
        this.f21150n = 0L;
        this.f21145i = 1.0f;
        this.f21146j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21157u != -9223372036854775807L) {
            return Math.min(this.f21159x, c());
        }
        this.f21140b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21152p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21153q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21153q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21154r++;
                    }
                }
                this.f21153q = playbackHeadPosition;
            }
            this.f21152p = elapsedRealtime;
        }
        return this.f21153q + this.B + (this.f21154r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21156t;
        int i10 = this.f21142e;
        if (i7 == 0) {
            if (this.f21157u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21147k, this.f21145i);
        }
        long max = Math.max(0L, B - this.f21150n);
        if (this.f21157u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21159x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21158w;
        }
        this.f21140b.getClass();
        return this.f21158w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21157u, this.f21145i), this.f21142e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21146j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21145i);
            this.f21140b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21146j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f21139a.f15642b).f21107j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13810a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
