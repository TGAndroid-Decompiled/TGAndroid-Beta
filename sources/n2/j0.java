package n2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class j0 {
    public boolean A;
    public long B;
    public final gc.b f20778a;
    public final h2.g0 f20779b;
    public final long[] f20780c;
    public final AudioTrack d;
    public final int f20781e;
    public final long f20782f;
    public final boolean f20783g;
    public final z h;
    public float f20784i;
    public long f20785j;
    public long f20786k;
    public long f20787l;
    public Method f20788m;
    public long f20789n;
    public long f20790o;
    public long f20791p;
    public long f20792q;
    public long f20793r;
    public int f20794s;
    public int f20795t;
    public long f20796u;
    public long v;
    public long f20797w;
    public long f20798x;
    public long f20799y;
    public long f20800z;

    public j0(gc.b bVar, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f20778a = bVar;
        this.f20779b = g0Var;
        this.d = audioTrack;
        try {
            this.f20788m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f20780c = new long[10];
        this.f20800z = -9223372036854775807L;
        this.f20799y = -9223372036854775807L;
        this.h = new z(audioTrack, bVar);
        int sampleRate = audioTrack.getSampleRate();
        this.f20781e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f20783g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f20782f = j3;
        this.f20792q = 0L;
        this.f20793r = 0L;
        this.A = false;
        this.B = 0L;
        this.f20796u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f20790o = 0L;
        this.f20789n = 0L;
        this.f20784i = 1.0f;
        this.f20785j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f20796u != -9223372036854775807L) {
            return Math.min(this.f20798x, c());
        }
        this.f20779b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f20791p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f20792q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f20792q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f20793r++;
                    }
                }
                this.f20792q = playbackHeadPosition;
            }
            this.f20791p = elapsedRealtime;
        }
        return this.f20792q + this.B + (this.f20793r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f20795t;
        int i10 = this.f20781e;
        if (i7 == 0) {
            if (this.f20796u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f20786k, this.f20784i);
        }
        long max = Math.max(0L, B - this.f20789n);
        if (this.f20796u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f20798x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f20797w;
        }
        this.f20779b.getClass();
        return this.f20797w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f20796u, this.f20784i), this.f20781e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f20785j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f20784i);
            this.f20779b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f20785j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f20778a.f13134b).f20746j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13498a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
