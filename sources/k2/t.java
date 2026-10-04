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
    public final a4.m f14512a;
    public final long[] f14513b;
    public AudioTrack f14514c;
    public int d;
    public s f14515e;
    public int f14516f;
    public boolean f14517g;
    public long h;
    public float f14518i;
    public boolean f14519j;
    public long f14520k;
    public int f14521l;
    public long f14522m;
    public long f14523n;
    public Method f14524o;
    public long f14525p;
    public boolean f14526q;
    public boolean f14527r;
    public long f14528s;
    public long f14529t;
    public long f14530u;
    public long v;
    public long f14531w;
    public int f14532x;
    public int f14533y;
    public long f14534z;

    public t(a4.m mVar) {
        this.f14512a = mVar;
        try {
            this.f14524o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14513b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f8596a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.t.a():long");
    }

    public final long b() {
        if (this.f14534z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14529t >= 5) {
            AudioTrack audioTrack = this.f14514c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f14517g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f14531w = this.f14530u;
                    }
                    playbackHeadPosition += this.f14531w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14530u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f14530u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f14530u = playbackHeadPosition;
            }
            this.f14529t = elapsedRealtime;
        }
        return this.f14530u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f14533y == 0) {
            if (this.f14534z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f14516f, d());
            } else {
                z10 = e2.d0.W(this.f14516f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f14522m, this.f14518i);
        }
        long max = Math.max(0L, z10 - this.f14525p);
        if (this.f14534z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f14516f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14514c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f14534z, this.f14518i), this.f14516f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f14516f;
        String str = e2.d0.f8538a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f14517g) {
                AudioTrack audioTrack = this.f14514c;
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
            long j10 = this.f14520k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f14518i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f14520k = -9223372036854775807L;
                o oVar = ((f0) this.f14512a.f297b).f14429t;
                if (oVar != null) {
                    oVar.d(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f14522m = 0L;
        this.f14533y = 0;
        this.f14532x = 0;
        this.f14523n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f14519j = false;
    }
}
