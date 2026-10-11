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
    public final xa.c f14539a;
    public final long[] f14540b;
    public AudioTrack f14541c;
    public int d;
    public r f14542e;
    public int f14543f;
    public long f14544g;
    public float h;
    public boolean f14545i;
    public long f14546j;
    public int f14547k;
    public long f14548l;
    public long f14549m;
    public Method f14550n;
    public long f14551o;
    public boolean f14552p;
    public boolean f14553q;
    public long f14554r;
    public long f14555s;
    public long f14556t;
    public long f14557u;
    public int v;
    public int f14558w;
    public long f14559x;
    public long f14560y;
    public long f14561z;

    public s(xa.c cVar) {
        this.f14539a = cVar;
        try {
            this.f14550n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14540b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = e2.x.f8589a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14559x != -9223372036854775807L) {
            return Math.min(this.A, d());
        }
        this.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14555s >= 5) {
            AudioTrack audioTrack = this.f14541c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14556t > 0 && playState == 3) {
                        if (this.f14560y == -9223372036854775807L) {
                            this.f14560y = elapsedRealtime;
                        }
                    } else {
                        this.f14560y = -9223372036854775807L;
                    }
                }
                long j3 = this.f14556t;
                if (j3 > playbackHeadPosition) {
                    if (this.E) {
                        this.F += j3;
                        this.E = false;
                    } else {
                        this.f14557u++;
                    }
                }
                this.f14556t = playbackHeadPosition;
            }
            this.f14555s = elapsedRealtime;
        }
        return this.f14556t + this.F + (this.f14557u << 32);
    }

    public final long c(long j3) {
        long y3;
        if (this.f14558w == 0) {
            if (this.f14559x != -9223372036854775807L) {
                y3 = e2.d0.V(this.f14543f, d());
            } else {
                y3 = e2.d0.V(this.f14543f, b());
            }
        } else {
            y3 = e2.d0.y(j3 + this.f14548l, this.h);
        }
        long max = Math.max(0L, y3 - this.f14551o);
        if (this.f14559x != -9223372036854775807L) {
            return Math.min(e2.d0.V(this.f14543f, this.A), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14541c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f14561z;
        }
        this.G.getClass();
        return this.f14561z + e2.d0.X(e2.d0.y(e2.d0.P(SystemClock.elapsedRealtime()) - this.f14559x, this.h), this.f14543f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j3) {
        if (this.B) {
            long j10 = this.f14546j;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long C = e2.d0.C(j3 - j10, this.h);
                this.G.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C);
                this.f14546j = -9223372036854775807L;
                n nVar = ((d0) this.f14539a.f51194b).f14451s;
                if (nVar != null) {
                    nVar.a(currentTimeMillis);
                }
            }
        }
    }

    public final void f() {
        this.f14548l = 0L;
        this.f14558w = 0;
        this.v = 0;
        this.f14549m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.f14545i = false;
    }
}
