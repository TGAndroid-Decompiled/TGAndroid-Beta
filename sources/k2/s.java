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
    public final b0 f13346a;
    public final long[] f13347b;
    public AudioTrack f13348c;
    public int d;
    public r e;
    public int f13349f;
    public boolean f13350g;
    public long h;
    public float f13351i;
    public boolean f13352j;
    public long f13353k;
    public int f13354l;
    public long f13355m;
    public long f13356n;
    public Method f13357o;
    public long f13358p;
    public boolean f13359q;
    public boolean f13360r;
    public long f13361s;
    public long f13362t;
    public long f13363u;
    public long v;
    public long f13364w;
    public int f13365x;
    public int f13366y;
    public long f13367z;

    public s(b0 b0Var) {
        this.f13346a = b0Var;
        try {
            this.f13357o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13347b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7923a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13367z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13362t >= 5) {
            AudioTrack audioTrack = this.f13348c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13350g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13364w = this.f13363u;
                    }
                    playbackHeadPosition += this.f13364w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13363u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13363u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13363u = playbackHeadPosition;
            }
            this.f13362t = elapsedRealtime;
        }
        return this.f13363u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13366y == 0) {
            if (this.f13367z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13349f, d());
            } else {
                z10 = e2.d0.W(this.f13349f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13355m, this.f13351i);
        }
        long max = Math.max(0L, z10 - this.f13358p);
        if (this.f13367z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13349f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13348c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13367z, this.f13351i), this.f13349f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13349f;
        String str = e2.d0.f7871a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13350g) {
                AudioTrack audioTrack = this.f13348c;
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
            long j10 = this.f13353k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13351i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13353k = -9223372036854775807L;
                n nVar = ((f0) this.f13346a.f13222b).f13271t;
                if (nVar != null) {
                    nVar.e(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13355m = 0L;
        this.f13366y = 0;
        this.f13365x = 0;
        this.f13356n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13352j = false;
    }
}
