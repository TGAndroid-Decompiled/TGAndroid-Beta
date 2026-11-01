package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class o0 {
    public boolean A;
    public long B;
    public final a4.l f10726a;
    public final e2.g0 f10727b;
    public final long[] f10728c;
    public final AudioTrack d;
    public final int e;
    public final long f10729f;
    public final boolean f10730g;
    public final d0 h;
    public float f10731i;
    public long f10732j;
    public long f10733k;
    public long f10734l;
    public Method f10735m;
    public long f10736n;
    public long f10737o;
    public long f10738p;
    public long f10739q;
    public long f10740r;
    public int f10741s;
    public int f10742t;
    public long f10743u;
    public long v;
    public long f10744w;
    public long f10745x;
    public long f10746y;
    public long f10747z;

    public o0(a4.l lVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f10726a = lVar;
        this.f10727b = g0Var;
        this.d = audioTrack;
        try {
            this.f10735m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f10728c = new long[10];
        this.f10747z = -9223372036854775807L;
        this.f10746y = -9223372036854775807L;
        this.h = new d0(audioTrack, lVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.l0.M(i10);
        this.f10730g = M;
        if (M) {
            j10 = e2.l0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f10729f = j10;
        this.f10739q = 0L;
        this.f10740r = 0L;
        this.A = false;
        this.B = 0L;
        this.f10743u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f10737o = 0L;
        this.f10736n = 0L;
        this.f10731i = 1.0f;
        this.f10732j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f10743u != -9223372036854775807L) {
            return Math.min(this.f10745x, c());
        }
        this.f10727b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f10738p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f10739q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f10739q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f10740r++;
                    }
                }
                this.f10739q = playbackHeadPosition;
            }
            this.f10738p = elapsedRealtime;
        }
        return this.f10739q + this.B + (this.f10740r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f10742t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f10743u != -9223372036854775807L) {
                B = e2.l0.Y(i11, c());
            } else {
                B = e2.l0.Y(i11, a());
            }
        } else {
            B = e2.l0.B(j10 + this.f10733k, this.f10731i);
        }
        long max = Math.max(0L, B - this.f10736n);
        if (this.f10743u != -9223372036854775807L) {
            return Math.min(e2.l0.Y(i11, this.f10745x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f10744w;
        }
        this.f10727b.getClass();
        return this.f10744w + e2.l0.a0(e2.l0.B(e2.l0.S(SystemClock.elapsedRealtime()) - this.f10743u, this.f10731i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f10732j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.l0.F(j10 - j11, this.f10731i);
            this.f10727b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.l0.h0(F);
            this.f10732j = -9223372036854775807L;
            e2.r rVar = ((j0) this.f10726a.f279b).f10681j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f6188a) {
                rVar.e(-1, new g0(currentTimeMillis));
            }
        }
    }
}
