package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class s {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public e2.x I;
    public final c0 f13360a;
    public final long[] f13361b;
    public AudioTrack f13362c;
    public int d;
    public r e;
    public int f13363f;
    public boolean f13364g;
    public long h;
    public float f13365i;
    public boolean f13366j;
    public long f13367k;
    public int f13368l;
    public long f13369m;
    public long f13370n;
    public Method f13371o;
    public long f13372p;
    public boolean f13373q;
    public boolean f13374r;
    public long f13375s;
    public long f13376t;
    public long f13377u;
    public long v;
    public long f13378w;
    public int f13379x;
    public int f13380y;
    public long f13381z;

    public s(c0 c0Var) {
        this.f13360a = c0Var;
        try {
            this.f13371o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13361b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7940a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13381z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13376t >= 5) {
            AudioTrack audioTrack = this.f13362c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13364g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13378w = this.f13377u;
                    }
                    playbackHeadPosition += this.f13378w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13377u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13377u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13377u = playbackHeadPosition;
            }
            this.f13376t = elapsedRealtime;
        }
        return this.f13377u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13380y == 0) {
            if (this.f13381z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13363f, d());
            } else {
                z10 = e2.d0.W(this.f13363f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13369m, this.f13365i);
        }
        long max = Math.max(0L, z10 - this.f13372p);
        if (this.f13381z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13363f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13362c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13381z, this.f13365i), this.f13363f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13363f;
        String str = e2.d0.f7888a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13364g) {
                AudioTrack audioTrack = this.f13362c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || b() != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(long j3) {
        if (this.D) {
            long j10 = this.f13367k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13365i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13367k = -9223372036854775807L;
                n nVar = ((g0) this.f13360a.f13237b).f13288t;
                if (nVar != null) {
                    nVar.e(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13369m = 0L;
        this.f13380y = 0;
        this.f13379x = 0;
        this.f13370n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13366j = false;
    }
}
