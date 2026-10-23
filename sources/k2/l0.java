package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class l0 {
    public boolean A;
    public long B;
    public final ya.c f14775a;
    public final e2.g0 f14776b;
    public final long[] f14777c;
    public final AudioTrack d;
    public final int e;
    public final long f14778f;
    public final boolean f14779g;
    public final c0 h;
    public float f14780i;
    public long f14781j;
    public long f14782k;
    public long f14783l;
    public Method f14784m;
    public long f14785n;
    public long f14786o;
    public long f14787p;
    public long f14788q;
    public long f14789r;
    public int f14790s;
    public int f14791t;
    public long f14792u;
    public long v;
    public long f14793w;
    public long f14794x;
    public long f14795y;
    public long f14796z;

    public l0(ya.c cVar, e2.g0 g0Var, AudioTrack audioTrack, int i10, int i11, int i12) {
        long j10;
        this.f14775a = cVar;
        this.f14776b = g0Var;
        this.d = audioTrack;
        try {
            this.f14784m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14777c = new long[10];
        this.f14796z = -9223372036854775807L;
        this.f14795y = -9223372036854775807L;
        this.h = new c0(audioTrack, cVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = e2.m0.M(i10);
        this.f14779g = M;
        if (M) {
            j10 = e2.m0.Y(sampleRate, i12 / i11);
        } else {
            j10 = -9223372036854775807L;
        }
        this.f14778f = j10;
        this.f14788q = 0L;
        this.f14789r = 0L;
        this.A = false;
        this.B = 0L;
        this.f14792u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f14786o = 0L;
        this.f14785n = 0L;
        this.f14780i = 1.0f;
        this.f14781j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f14792u != -9223372036854775807L) {
            return Math.min(this.f14794x, c());
        }
        this.f14776b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14787p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14788q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j10 = this.f14788q;
                if (j10 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j10;
                        this.A = false;
                    } else {
                        this.f14789r++;
                    }
                }
                this.f14788q = playbackHeadPosition;
            }
            this.f14787p = elapsedRealtime;
        }
        return this.f14788q + this.B + (this.f14789r << 32);
    }

    public final long b(long j10) {
        long B;
        int i10 = this.f14791t;
        int i11 = this.e;
        if (i10 == 0) {
            if (this.f14792u != -9223372036854775807L) {
                B = e2.m0.Y(i11, c());
            } else {
                B = e2.m0.Y(i11, a());
            }
        } else {
            B = e2.m0.B(j10 + this.f14782k, this.f14780i);
        }
        long max = Math.max(0L, B - this.f14785n);
        if (this.f14792u != -9223372036854775807L) {
            return Math.min(e2.m0.Y(i11, this.f14794x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f14793w;
        }
        this.f14776b.getClass();
        return this.f14793w + e2.m0.a0(e2.m0.B(e2.m0.S(SystemClock.elapsedRealtime()) - this.f14792u, this.f14780i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j10) {
        long j11 = this.f14781j;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            long F = e2.m0.F(j10 - j11, this.f14780i);
            this.f14776b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - e2.m0.h0(F);
            this.f14781j = -9223372036854775807L;
            e2.r rVar = ((i0) this.f14775a.f50564b).f14746j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f8279a) {
                rVar.e(-1, new f0(currentTimeMillis));
            }
        }
    }
}
