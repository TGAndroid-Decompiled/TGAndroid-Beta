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
    public final xa.c f14649a;
    public final long[] f14650b;
    public AudioTrack f14651c;
    public int d;
    public r f14652e;
    public int f14653f;
    public boolean f14654g;
    public long h;
    public float f14655i;
    public boolean f14656j;
    public long f14657k;
    public int f14658l;
    public long f14659m;
    public long f14660n;
    public Method f14661o;
    public long f14662p;
    public boolean f14663q;
    public boolean f14664r;
    public long f14665s;
    public long f14666t;
    public long f14667u;
    public long v;
    public long f14668w;
    public int f14669x;
    public int f14670y;
    public long f14671z;

    public s(xa.c cVar) {
        this.f14649a = cVar;
        try {
            this.f14661o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14650b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f8795a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14671z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14666t >= 5) {
            AudioTrack audioTrack = this.f14651c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f14654g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f14668w = this.f14667u;
                    }
                    playbackHeadPosition += this.f14668w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14667u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f14667u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f14667u = playbackHeadPosition;
            }
            this.f14666t = elapsedRealtime;
        }
        return this.f14667u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f14670y == 0) {
            if (this.f14671z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f14653f, d());
            } else {
                z10 = e2.d0.W(this.f14653f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f14659m, this.f14655i);
        }
        long max = Math.max(0L, z10 - this.f14662p);
        if (this.f14671z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f14653f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14651c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f14671z, this.f14655i), this.f14653f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f14653f;
        String str = e2.d0.f8737a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f14654g) {
                AudioTrack audioTrack = this.f14651c;
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
            long j10 = this.f14657k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f14655i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f14657k = -9223372036854775807L;
                n nVar = ((d0) this.f14649a.f49331b).f14561t;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f14659m = 0L;
        this.f14670y = 0;
        this.f14669x = 0;
        this.f14660n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f14656j = false;
    }
}
