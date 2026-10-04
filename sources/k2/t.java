package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class t {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public e2.x I;
    public final a4.m f14511a;
    public final long[] f14512b;
    public AudioTrack f14513c;
    public int d;
    public s f14514e;
    public int f14515f;
    public boolean f14516g;
    public long h;
    public float f14517i;
    public boolean f14518j;
    public long f14519k;
    public int f14520l;
    public long f14521m;
    public long f14522n;
    public Method f14523o;
    public long f14524p;
    public boolean f14525q;
    public boolean f14526r;
    public long f14527s;
    public long f14528t;
    public long f14529u;
    public long v;
    public long f14530w;
    public int f14531x;
    public int f14532y;
    public long f14533z;

    public t(a4.m mVar) {
        this.f14511a = mVar;
        try {
            this.f14523o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14512b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f8595a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.t.a():long");
    }

    public final long b() {
        if (this.f14533z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14528t >= 5) {
            AudioTrack audioTrack = this.f14513c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f14516g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f14530w = this.f14529u;
                    }
                    playbackHeadPosition += this.f14530w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14529u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f14529u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f14529u = playbackHeadPosition;
            }
            this.f14528t = elapsedRealtime;
        }
        return this.f14529u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f14532y == 0) {
            if (this.f14533z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f14515f, d());
            } else {
                z10 = e2.d0.W(this.f14515f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f14521m, this.f14517i);
        }
        long max = Math.max(0L, z10 - this.f14524p);
        if (this.f14533z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f14515f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14513c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f14533z, this.f14517i), this.f14515f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f14515f;
        String str = e2.d0.f8537a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f14516g) {
                AudioTrack audioTrack = this.f14513c;
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
            long j10 = this.f14519k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f14517i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f14519k = -9223372036854775807L;
                o oVar = ((f0) this.f14511a.f297b).f14428t;
                if (oVar != null) {
                    oVar.d(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f14521m = 0L;
        this.f14532y = 0;
        this.f14531x = 0;
        this.f14522n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f14518j = false;
    }
}
