package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class k0 {
    public boolean A;
    public long B;
    public final h6.o f21239a;
    public final h2.g0 f21240b;
    public final long[] f21241c;
    public final AudioTrack d;
    public final int f21242e;
    public final long f21243f;
    public final boolean f21244g;
    public final z h;
    public float f21245i;
    public long f21246j;
    public long f21247k;
    public long f21248l;
    public Method f21249m;
    public long f21250n;
    public long f21251o;
    public long f21252p;
    public long f21253q;
    public long f21254r;
    public int f21255s;
    public int f21256t;
    public long f21257u;
    public long v;
    public long f21258w;
    public long f21259x;
    public long f21260y;
    public long f21261z;

    public k0(h6.o oVar, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21239a = oVar;
        this.f21240b = g0Var;
        this.d = audioTrack;
        try {
            this.f21249m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21241c = new long[10];
        this.f21261z = -9223372036854775807L;
        this.f21260y = -9223372036854775807L;
        this.h = new z(audioTrack, oVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f21242e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21244g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21243f = j3;
        this.f21253q = 0L;
        this.f21254r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21257u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21251o = 0L;
        this.f21250n = 0L;
        this.f21245i = 1.0f;
        this.f21246j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21257u != -9223372036854775807L) {
            return Math.min(this.f21259x, c());
        }
        this.f21240b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21252p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21253q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21253q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21254r++;
                    }
                }
                this.f21253q = playbackHeadPosition;
            }
            this.f21252p = elapsedRealtime;
        }
        return this.f21253q + this.B + (this.f21254r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21256t;
        int i10 = this.f21242e;
        if (i7 == 0) {
            if (this.f21257u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21247k, this.f21245i);
        }
        long max = Math.max(0L, B - this.f21250n);
        if (this.f21257u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21259x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21258w;
        }
        this.f21240b.getClass();
        return this.f21258w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21257u, this.f21245i), this.f21242e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21246j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21245i);
            this.f21240b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21246j = -9223372036854775807L;
            h2.r rVar = ((h0) this.f21239a.f13936b).f21204j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13805a) {
                rVar.e(-1, new e0(currentTimeMillis));
            }
        }
    }
}
