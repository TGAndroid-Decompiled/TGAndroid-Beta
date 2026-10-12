package k2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
public final class s {
    public long A;
    public boolean B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public e2.x G;
    public final xa.c f14536a;
    public final long[] f14537b;
    public AudioTrack f14538c;
    public int d;
    public r f14539e;
    public int f14540f;
    public long f14541g;
    public float h;
    public boolean f14542i;
    public long f14543j;
    public int f14544k;
    public long f14545l;
    public long f14546m;
    public Method f14547n;
    public long f14548o;
    public boolean f14549p;
    public boolean f14550q;
    public long f14551r;
    public long f14552s;
    public long f14553t;
    public long f14554u;
    public int v;
    public int f14555w;
    public long f14556x;
    public long f14557y;
    public long f14558z;

    public s(xa.c cVar) {
        this.f14536a = cVar;
        try {
            this.f14547n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14537b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = e2.x.f8587a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14556x != -9223372036854775807L) {
            return Math.min(this.A, d());
        }
        this.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14552s >= 5) {
            AudioTrack audioTrack = this.f14538c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14553t > 0 && playState == 3) {
                        if (this.f14557y == -9223372036854775807L) {
                            this.f14557y = elapsedRealtime;
                        }
                    } else {
                        this.f14557y = -9223372036854775807L;
                    }
                }
                long j3 = this.f14553t;
                if (j3 > playbackHeadPosition) {
                    if (this.E) {
                        this.F += j3;
                        this.E = false;
                    } else {
                        this.f14554u++;
                    }
                }
                this.f14553t = playbackHeadPosition;
            }
            this.f14552s = elapsedRealtime;
        }
        return this.f14553t + this.F + (this.f14554u << 32);
    }

    public final long c(long j3) {
        long y3;
        if (this.f14555w == 0) {
            if (this.f14556x != -9223372036854775807L) {
                y3 = e2.d0.V(this.f14540f, d());
            } else {
                y3 = e2.d0.V(this.f14540f, b());
            }
        } else {
            y3 = e2.d0.y(j3 + this.f14545l, this.h);
        }
        long max = Math.max(0L, y3 - this.f14548o);
        if (this.f14556x != -9223372036854775807L) {
            return Math.min(e2.d0.V(this.f14540f, this.A), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14538c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f14558z;
        }
        this.G.getClass();
        return this.f14558z + e2.d0.X(e2.d0.y(e2.d0.P(SystemClock.elapsedRealtime()) - this.f14556x, this.h), this.f14540f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j3) {
        if (this.B) {
            long j10 = this.f14543j;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long C = e2.d0.C(j3 - j10, this.h);
                this.G.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C);
                this.f14543j = -9223372036854775807L;
                n nVar = ((d0) this.f14536a.f51335b).f14448s;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void f() {
        this.f14545l = 0L;
        this.f14555w = 0;
        this.v = 0;
        this.f14546m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.f14542i = false;
    }
}
