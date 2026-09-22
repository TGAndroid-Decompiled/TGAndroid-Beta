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
    public final zg.t f13361a;
    public final long[] f13362b;
    public AudioTrack f13363c;
    public int d;
    public s e;
    public int f13364f;
    public boolean f13365g;
    public long h;
    public float f13366i;
    public boolean f13367j;
    public long f13368k;
    public int f13369l;
    public long f13370m;
    public long f13371n;
    public Method f13372o;
    public long f13373p;
    public boolean f13374q;
    public boolean f13375r;
    public long f13376s;
    public long f13377t;
    public long f13378u;
    public long v;
    public long f13379w;
    public int f13380x;
    public int f13381y;
    public long f13382z;

    public t(zg.t tVar) {
        this.f13361a = tVar;
        try {
            this.f13372o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f13362b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7939a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.t.a():long");
    }

    public final long b() {
        if (this.f13382z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f13377t >= 5) {
            AudioTrack audioTrack = this.f13363c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f13365g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f13379w = this.f13378u;
                    }
                    playbackHeadPosition += this.f13379w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f13378u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f13378u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f13378u = playbackHeadPosition;
            }
            this.f13377t = elapsedRealtime;
        }
        return this.f13378u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f13381y == 0) {
            if (this.f13382z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f13364f, d());
            } else {
                z10 = e2.d0.W(this.f13364f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f13370m, this.f13366i);
        }
        long max = Math.max(0L, z10 - this.f13373p);
        if (this.f13382z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f13364f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f13363c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f13382z, this.f13366i), this.f13364f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f13364f;
        String str = e2.d0.f7887a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f13365g) {
                AudioTrack audioTrack = this.f13363c;
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
            long j10 = this.f13368k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f13366i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f13368k = -9223372036854775807L;
                o oVar = ((f0) this.f13361a.f49488a).f13283t;
                if (oVar != null) {
                    oVar.e(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f13370m = 0L;
        this.f13381y = 0;
        this.f13380x = 0;
        this.f13371n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f13367j = false;
    }
}
