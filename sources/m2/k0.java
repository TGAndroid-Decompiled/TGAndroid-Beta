package m2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import gi.v5;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class k0 {
    public boolean A;
    public long B;
    public final v5 f18908a;
    public final g2.h0 f18909b;
    public final long[] f18910c;
    public final AudioTrack d;
    public final int f18911e;
    public final long f18912f;
    public final boolean f18913g;
    public final b0 h;
    public float f18914i;
    public long f18915j;
    public long f18916k;
    public long f18917l;
    public Method f18918m;
    public long f18919n;
    public long f18920o;
    public long f18921p;
    public long f18922q;
    public long f18923r;
    public int f18924s;
    public int f18925t;
    public long f18926u;
    public long v;
    public long f18927w;
    public long f18928x;
    public long f18929y;
    public long f18930z;

    public k0(v5 v5Var, g2.h0 h0Var, AudioTrack audioTrack, int i3, int i10, int i11) {
        long j10;
        this.f18908a = v5Var;
        this.f18909b = h0Var;
        this.d = audioTrack;
        try {
            this.f18918m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f18910c = new long[10];
        this.f18930z = -9223372036854775807L;
        this.f18929y = -9223372036854775807L;
        this.h = new b0(audioTrack, v5Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f18911e = sampleRate;
        boolean M = g2.n0.M(i3);
        this.f18913g = M;
        if (M) {
            j10 = g2.n0.Y(sampleRate, i11 / i10);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f18912f = j10;
        this.f18922q = 0L;
        this.f18923r = 0L;
        this.A = false;
        this.B = 0L;
        this.f18926u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f18920o = 0L;
        this.f18919n = 0L;
        this.f18914i = 1.0f;
        this.f18915j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f18926u != -9223372036854775807L) {
            return Math.min(this.f18928x, c());
        }
        this.f18909b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f18921p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f18922q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f18922q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f18923r++;
                    }
                }
                this.f18922q = playbackHeadPosition;
            }
            this.f18921p = elapsedRealtime;
        }
        return this.f18922q + this.B + (this.f18923r << 32);
    }

    public final long b(long j10) {
        long B;
        int i3 = this.f18925t;
        int i10 = this.f18911e;
        if (i3 == 0) {
            if (this.f18926u != -9223372036854775807L) {
                B = g2.n0.Y(i10, c());
            } else {
                B = g2.n0.Y(i10, a());
            }
        } else {
            B = g2.n0.B(j10 + this.f18916k, this.f18914i);
        }
        long max = Math.max(0L, B - this.f18919n);
        if (this.f18926u != -9223372036854775807L) {
            return Math.min(g2.n0.Y(i10, this.f18928x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f18927w;
        }
        this.f18909b.getClass();
        return this.f18927w + g2.n0.a0(g2.n0.B(g2.n0.S(SystemClock.elapsedRealtime()) - this.f18926u, this.f18914i), this.f18911e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f18915j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = g2.n0.F(j10 - j11, this.f18914i);
            this.f18909b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - g2.n0.h0(F);
            this.f18915j = -9223372036854775807L;
            g2.s sVar = ((h0) this.f18908a.f13688b).f18873j;
            sVar.getClass();
            if (Thread.currentThread() == sVar.f11900a) {
                sVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
