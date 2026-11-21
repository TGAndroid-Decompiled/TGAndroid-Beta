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
    public final w4 f21167a;
    public final h2.g0 f21168b;
    public final long[] f21169c;
    public final AudioTrack d;
    public final int f21170e;
    public final long f21171f;
    public final boolean f21172g;
    public final z h;
    public float f21173i;
    public long f21174j;
    public long f21175k;
    public long f21176l;
    public Method f21177m;
    public long f21178n;
    public long f21179o;
    public long f21180p;
    public long f21181q;
    public long f21182r;
    public int f21183s;
    public int f21184t;
    public long f21185u;
    public long v;
    public long f21186w;
    public long f21187x;
    public long f21188y;
    public long f21189z;

    public j0(w4 w4Var, h2.g0 g0Var, AudioTrack audioTrack, int i7, int i10, int i11) {
        long j3;
        this.f21167a = w4Var;
        this.f21168b = g0Var;
        this.d = audioTrack;
        try {
            this.f21177m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f21169c = new long[10];
        this.f21189z = -9223372036854775807L;
        this.f21188y = -9223372036854775807L;
        this.h = new z(audioTrack, w4Var);
        int sampleRate = audioTrack.getSampleRate();
        this.f21170e = sampleRate;
        boolean M = h2.l0.M(i7);
        this.f21172g = M;
        if (M) {
            j3 = h2.l0.Y(sampleRate, i11 / i10);
        } else {
            j3 = -9223372036854775807L;
        }
        this.f21171f = j3;
        this.f21181q = 0L;
        this.f21182r = 0L;
        this.A = false;
        this.B = 0L;
        this.f21185u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.f21179o = 0L;
        this.f21178n = 0L;
        this.f21173i = 1.0f;
        this.f21174j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.f21185u != -9223372036854775807L) {
            return Math.min(this.f21187x, c());
        }
        this.f21168b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f21180p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f21181q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j3 = this.f21181q;
                if (j3 > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j3;
                        this.A = false;
                    } else {
                        this.f21182r++;
                    }
                }
                this.f21181q = playbackHeadPosition;
            }
            this.f21180p = elapsedRealtime;
        }
        return this.f21181q + this.B + (this.f21182r << 32);
    }

    public final long b(long j3) {
        long B;
        int i7 = this.f21184t;
        int i10 = this.f21170e;
        if (i7 == 0) {
            if (this.f21185u != -9223372036854775807L) {
                B = h2.l0.Y(i10, c());
            } else {
                B = h2.l0.Y(i10, a());
            }
        } else {
            B = h2.l0.B(j3 + this.f21175k, this.f21173i);
        }
        long max = Math.max(0L, B - this.f21178n);
        if (this.f21185u != -9223372036854775807L) {
            return Math.min(h2.l0.Y(i10, this.f21187x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.f21186w;
        }
        this.f21168b.getClass();
        return this.f21186w + h2.l0.a0(h2.l0.B(h2.l0.S(SystemClock.elapsedRealtime()) - this.f21185u, this.f21173i), this.f21170e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j3) {
        long j10 = this.f21174j;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            long F = h2.l0.F(j3 - j10, this.f21173i);
            this.f21168b.getClass();
            long currentTimeMillis = System.currentTimeMillis() - h2.l0.h0(F);
            this.f21174j = -9223372036854775807L;
            h2.r rVar = ((g0) this.f21167a.f15705b).f21135j;
            rVar.getClass();
            if (Thread.currentThread() == rVar.f13839a) {
                rVar.e(-1, new d0(currentTimeMillis));
            }
        }
    }
}
