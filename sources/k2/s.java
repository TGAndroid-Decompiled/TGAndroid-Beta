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
    public final xa.c f14675a;
    public final long[] f14676b;
    public AudioTrack f14677c;
    public int d;
    public r f14678e;
    public int f14679f;
    public boolean f14680g;
    public long h;
    public float f14681i;
    public boolean f14682j;
    public long f14683k;
    public int f14684l;
    public long f14685m;
    public long f14686n;
    public Method f14687o;
    public long f14688p;
    public boolean f14689q;
    public boolean f14690r;
    public long f14691s;
    public long f14692t;
    public long f14693u;
    public long v;
    public long f14694w;
    public int f14695x;
    public int f14696y;
    public long f14697z;

    public s(xa.c cVar) {
        this.f14675a = cVar;
        try {
            this.f14687o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14676b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f8823a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14697z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14692t >= 5) {
            AudioTrack audioTrack = this.f14677c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f14680g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f14694w = this.f14693u;
                    }
                    playbackHeadPosition += this.f14694w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14693u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f14693u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f14693u = playbackHeadPosition;
            }
            this.f14692t = elapsedRealtime;
        }
        return this.f14693u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f14696y == 0) {
            if (this.f14697z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f14679f, d());
            } else {
                z10 = e2.d0.W(this.f14679f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f14685m, this.f14681i);
        }
        long max = Math.max(0L, z10 - this.f14688p);
        if (this.f14697z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f14679f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14677c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f14697z, this.f14681i), this.f14679f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f14679f;
        String str = e2.d0.f8765a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f14680g) {
                AudioTrack audioTrack = this.f14677c;
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
            long j10 = this.f14683k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f14681i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f14683k = -9223372036854775807L;
                n nVar = ((d0) this.f14675a.f49360b).f14587t;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f14685m = 0L;
        this.f14696y = 0;
        this.f14695x = 0;
        this.f14686n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f14682j = false;
    }
}
