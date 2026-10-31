package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class o0 {
    public boolean A;
    public long B;
    public final a4.l f10725a;
    public final e2.g0 f10726b;
    public final long[] f10727c;
    public final AudioTrack d;
    public final int e;
    public final long f10728f;
    public final boolean f10729g;
    public final d0 h;
    public float f10730i;
    public long f10731j;
    public long f10732k;
    public long f10733l;
    public Method f10734m;
    public long f10735n;
    public long f10736o;
    public long f10737p;
    public long f10738q;
    public long f10739r;
    public int f10740s;
    public int f10741t;
    public long f10742u;
    public long v;
    public long f10743w;
    public long f10744x;
    public long f10745y;
    public long f10746z;

    public o0(a4.l lVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f10725a = lVar;
        this.f10726b = g0Var;
        this.d = audioTrack;
        try {
            this.f10734m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10727c = new long[10];
        this.f10746z = -9223372036854775807L;
        this.f10745y = -9223372036854775807L;
        this.h = new d0(audioTrack, lVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.l0.M(i10);
        this.f10729g = M;
        if (M) {
            j10 = e2.l0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f10728f = j10;
        this.f10738q = 0L;
        this.f10739r = 0L;
        this.A = false;
        this.B = 0L;
        this.f10742u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f10736o = 0L;
        this.f10735n = 0L;
        this.f10730i = 1.0f;
        this.f10731j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f10742u != -9223372036854775807L) {
            return Math.min(this.f10744x, c());
        }
        this.f10726b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f10737p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f10738q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f10738q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f10739r++;
                    }
                }
                this.f10738q = playbackHeadPosition;
            }
            this.f10737p = elapsedRealtime;
        }
        return this.f10738q + this.B + (this.f10739r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f10741t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f10742u != -9223372036854775807L) {
                B = e2.l0.Y(i11, c());
            } else {
                B = e2.l0.Y(i11, a());
            }
        } else {
            B = e2.l0.B(j10 + this.f10732k, this.f10730i);
        }
        long max = Math.max(0L, B - this.f10735n);
        if (this.f10742u != -9223372036854775807L) {
            return Math.min(e2.l0.Y(i11, this.f10744x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f10743w;
        }
        this.f10726b.getClass();
        return this.f10743w + e2.l0.a0(e2.l0.B(e2.l0.S(SystemClock.elapsedRealtime()) - this.f10742u, this.f10730i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f10731j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.l0.F(j10 - j11, this.f10730i);
            this.f10726b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.l0.h0(F);
            this.f10731j = -9223372036854775807L;
            e2.r rVar = ((j0) this.f10725a.f279b).f10680j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f6188a) {
                rVar.e(-1, new g0(currentTimeMillis));
            }
        }
    }
}
