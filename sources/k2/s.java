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
    public final a6.i f13358a;
    public final long[] f13359b;
    public AudioTrack f13360c;
    public int d;
    public r e;
    public int f13361f;
    public boolean f13362g;
    public long h;
    public float f13363i;
    public boolean f13364j;
    public long f13365k;
    public int f13366l;
    public long f13367m;
    public long f13368n;
    public Method f13369o;
    public long f13370p;
    public boolean f13371q;
    public boolean f13372r;
    public long f13373s;
    public long f13374t;
    public long f13375u;
    public long v;
    public long f13376w;
    public int f13377x;
    public int f13378y;
    public long f13379z;

    public s(a6.i iVar) {
        this.f13358a = iVar;
        try {
            this.f13369o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13359b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7939a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13379z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13374t >= 5) {
            AudioTrack audioTrack = this.f13360c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13362g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13376w = this.f13375u;
                    }
                    playbackHeadPosition += this.f13376w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13375u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13375u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13375u = playbackHeadPosition;
            }
            this.f13374t = elapsedRealtime;
        }
        return this.f13375u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13378y == 0) {
            if (this.f13379z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13361f, d());
            } else {
                z10 = e2.d0.W(this.f13361f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13367m, this.f13363i);
        }
        long max = Math.max(0L, z10 - this.f13370p);
        if (this.f13379z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13361f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13360c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13379z, this.f13363i), this.f13361f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13361f;
        String str = e2.d0.f7887a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13362g) {
                AudioTrack audioTrack = this.f13360c;
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
            long j10 = this.f13365k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13363i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13365k = -9223372036854775807L;
                n nVar = ((f0) this.f13358a.f303b).f13283t;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13367m = 0L;
        this.f13378y = 0;
        this.f13377x = 0;
        this.f13368n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13364j = false;
    }
}
