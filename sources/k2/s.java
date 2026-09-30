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
    public final a6.i f13344a;
    public final long[] f13345b;
    public AudioTrack f13346c;
    public int d;
    public r e;
    public int f13347f;
    public boolean f13348g;
    public long h;
    public float f13349i;
    public boolean f13350j;
    public long f13351k;
    public int f13352l;
    public long f13353m;
    public long f13354n;
    public Method f13355o;
    public long f13356p;
    public boolean f13357q;
    public boolean f13358r;
    public long f13359s;
    public long f13360t;
    public long f13361u;
    public long v;
    public long f13362w;
    public int f13363x;
    public int f13364y;
    public long f13365z;

    public s(a6.i iVar) {
        this.f13344a = iVar;
        try {
            this.f13355o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13345b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7922a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13365z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13360t >= 5) {
            AudioTrack audioTrack = this.f13346c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13348g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13362w = this.f13361u;
                    }
                    playbackHeadPosition += this.f13362w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13361u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13361u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13361u = playbackHeadPosition;
            }
            this.f13360t = elapsedRealtime;
        }
        return this.f13361u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13364y == 0) {
            if (this.f13365z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13347f, d());
            } else {
                z10 = e2.d0.W(this.f13347f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13353m, this.f13349i);
        }
        long max = Math.max(0L, z10 - this.f13356p);
        if (this.f13365z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13347f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13346c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13365z, this.f13349i), this.f13347f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13347f;
        String str = e2.d0.f7870a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13348g) {
                AudioTrack audioTrack = this.f13346c;
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
            long j10 = this.f13351k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13349i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13351k = -9223372036854775807L;
                n nVar = ((e0) this.f13344a.f303b).f13266t;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13353m = 0L;
        this.f13364y = 0;
        this.f13363x = 0;
        this.f13354n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13350j = false;
    }
}
