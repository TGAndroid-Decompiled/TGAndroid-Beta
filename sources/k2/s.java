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
    public final a6.i f13359a;
    public final long[] f13360b;
    public AudioTrack f13361c;
    public int d;
    public r e;
    public int f13362f;
    public boolean f13363g;
    public long h;
    public float f13364i;
    public boolean f13365j;
    public long f13366k;
    public int f13367l;
    public long f13368m;
    public long f13369n;
    public Method f13370o;
    public long f13371p;
    public boolean f13372q;
    public boolean f13373r;
    public long f13374s;
    public long f13375t;
    public long f13376u;
    public long v;
    public long f13377w;
    public int f13378x;
    public int f13379y;
    public long f13380z;

    public s(a6.i iVar) {
        this.f13359a = iVar;
        try {
            this.f13370o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13360b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7940a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f13380z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13375t >= 5) {
            AudioTrack audioTrack = this.f13361c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13363g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13377w = this.f13376u;
                    }
                    playbackHeadPosition += this.f13377w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13376u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13376u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13376u = playbackHeadPosition;
            }
            this.f13375t = elapsedRealtime;
        }
        return this.f13376u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13379y == 0) {
            if (this.f13380z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13362f, d());
            } else {
                z10 = e2.d0.W(this.f13362f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13368m, this.f13364i);
        }
        long max = Math.max(0L, z10 - this.f13371p);
        if (this.f13380z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13362f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13361c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13380z, this.f13364i), this.f13362f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13362f;
        String str = e2.d0.f7888a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13363g) {
                AudioTrack audioTrack = this.f13361c;
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
            long j10 = this.f13366k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13364i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13366k = -9223372036854775807L;
                n nVar = ((f0) this.f13359a.f303b).f13284t;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13368m = 0L;
        this.f13379y = 0;
        this.f13378x = 0;
        this.f13369n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13365j = false;
    }
}
