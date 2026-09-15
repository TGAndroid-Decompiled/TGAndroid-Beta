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
    public final c0 f13357a;
    public final long[] f13358b;
    public AudioTrack f13359c;
    public int d;
    public r e;
    public int f13360f;
    public boolean f13361g;
    public long h;
    public float f13362i;
    public boolean f13363j;
    public long f13364k;
    public int f13365l;
    public long f13366m;
    public long f13367n;
    public Method f13368o;
    public long f13369p;
    public boolean f13370q;
    public boolean f13371r;
    public long f13372s;
    public long f13373t;
    public long f13374u;
    public long v;
    public long f13375w;
    public int f13376x;
    public int f13377y;
    public long f13378z;

    public s(c0 c0Var) {
        this.f13357a = c0Var;
        try {
            this.f13368o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13358b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7935a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13378z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13373t >= 5) {
            AudioTrack audioTrack = this.f13359c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13361g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13375w = this.f13374u;
                    }
                    playbackHeadPosition += this.f13375w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13374u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13374u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13374u = playbackHeadPosition;
            }
            this.f13373t = elapsedRealtime;
        }
        return this.f13374u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13377y == 0) {
            if (this.f13378z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13360f, d());
            } else {
                z10 = e2.d0.W(this.f13360f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13366m, this.f13362i);
        }
        long max = Math.max(0L, z10 - this.f13369p);
        if (this.f13378z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13360f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13359c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13378z, this.f13362i), this.f13360f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13360f;
        String str = e2.d0.f7883a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13361g) {
                AudioTrack audioTrack = this.f13359c;
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
            long j10 = this.f13364k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13362i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13364k = -9223372036854775807L;
                n nVar = ((g0) this.f13357a.f13234b).f13285t;
                if (nVar != null) {
                    nVar.e(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13366m = 0L;
        this.f13377y = 0;
        this.f13376x = 0;
        this.f13367n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13363j = false;
    }
}
