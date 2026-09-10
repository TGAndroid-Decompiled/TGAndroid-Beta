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
    public final pb.c f12199a;
    public final long[] f12200b;
    public AudioTrack f12201c;
    public int d;
    public r e;
    public int f12202f;
    public boolean f12203g;
    public long h;
    public float f12204i;
    public boolean f12205j;
    public long f12206k;
    public int f12207l;
    public long f12208m;
    public long f12209n;
    public Method f12210o;
    public long f12211p;
    public boolean f12212q;
    public boolean f12213r;
    public long f12214s;
    public long f12215t;
    public long f12216u;
    public long v;
    public long f12217w;
    public int f12218x;
    public int f12219y;
    public long f12220z;

    public s(pb.c cVar) {
        this.f12199a = cVar;
        try {
            this.f12210o = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f12200b = new long[10];
        this.F = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = e2.x.f7240a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f12220z != -9223372036854775807L) {
            return Math.min(this.C, d());
        }
        this.I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f12215t >= 5) {
            AudioTrack audioTrack = this.f12201c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f12203g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f12217w = this.f12216u;
                    }
                    playbackHeadPosition += this.f12217w;
                }
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f12216u > 0 && playState == 3) {
                        if (this.A == -9223372036854775807L) {
                            this.A = elapsedRealtime;
                        }
                    } else {
                        this.A = -9223372036854775807L;
                    }
                }
                long j3 = this.f12216u;
                if (j3 > playbackHeadPosition) {
                    if (this.G) {
                        this.H += j3;
                        this.G = false;
                    } else {
                        this.v++;
                    }
                }
                this.f12216u = playbackHeadPosition;
            }
            this.f12215t = elapsedRealtime;
        }
        return this.f12216u + this.H + (this.v << 32);
    }

    public final long c(long j3) {
        long z10;
        if (this.f12219y == 0) {
            if (this.f12220z != -9223372036854775807L) {
                z10 = e2.d0.W(this.f12202f, d());
            } else {
                z10 = e2.d0.W(this.f12202f, b());
            }
        } else {
            z10 = e2.d0.z(j3 + this.f12208m, this.f12204i);
        }
        long max = Math.max(0L, z10 - this.f12211p);
        if (this.f12220z != -9223372036854775807L) {
            return Math.min(e2.d0.W(this.f12202f, this.C), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f12201c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.B;
        }
        this.I.getClass();
        return this.B + e2.d0.Y(e2.d0.z(e2.d0.Q(SystemClock.elapsedRealtime()) - this.f12220z, this.f12204i), this.f12202f, 1000000L, RoundingMode.UP);
    }

    public final boolean e(long j3) {
        long a2 = a();
        int i10 = this.f12202f;
        String str = e2.d0.f7188a;
        if (j3 <= e2.d0.Y(a2, i10, 1000000L, RoundingMode.UP)) {
            if (this.f12203g) {
                AudioTrack audioTrack = this.f12201c;
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
            long j10 = this.f12206k;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long D = e2.d0.D(j3 - j10, this.f12204i);
                this.I.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.e0(D);
                this.f12206k = -9223372036854775807L;
                n nVar = ((e0) this.f12199a.f39876b).f12121t;
                if (nVar != null) {
                    nVar.e(currentTimeMillis);
                }
            }
        }
    }

    public final void g() {
        this.f12208m = 0L;
        this.f12219y = 0;
        this.f12218x = 0;
        this.f12209n = 0L;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.f12205j = false;
    }
}
