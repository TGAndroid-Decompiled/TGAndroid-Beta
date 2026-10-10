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
    public final xa.d f14540a;
    public final long[] f14541b;
    public AudioTrack f14542c;
    public int d;
    public r f14543e;
    public int f14544f;
    public long f14545g;
    public float h;
    public boolean f14546i;
    public long f14547j;
    public int f14548k;
    public long f14549l;
    public long f14550m;
    public Method f14551n;
    public long f14552o;
    public boolean f14553p;
    public boolean f14554q;
    public long f14555r;
    public long f14556s;
    public long f14557t;
    public long f14558u;
    public int v;
    public int f14559w;
    public long f14560x;
    public long f14561y;
    public long f14562z;

    public s(xa.d dVar) {
        this.f14540a = dVar;
        try {
            this.f14551n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14541b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = e2.x.f8590a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14560x != -9223372036854775807L) {
            return Math.min(this.A, d());
        }
        this.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14556s >= 5) {
            AudioTrack audioTrack = this.f14542c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14557t > 0 && playState == 3) {
                        if (this.f14561y == -9223372036854775807L) {
                            this.f14561y = elapsedRealtime;
                        }
                    } else {
                        this.f14561y = -9223372036854775807L;
                    }
                }
                long j3 = this.f14557t;
                if (j3 > playbackHeadPosition) {
                    if (this.E) {
                        this.F += j3;
                        this.E = false;
                    } else {
                        this.f14558u++;
                    }
                }
                this.f14557t = playbackHeadPosition;
            }
            this.f14556s = elapsedRealtime;
        }
        return this.f14557t + this.F + (this.f14558u << 32);
    }

    public final long c(long j3) {
        long y3;
        if (this.f14559w == 0) {
            if (this.f14560x != -9223372036854775807L) {
                y3 = e2.d0.V(this.f14544f, d());
            } else {
                y3 = e2.d0.V(this.f14544f, b());
            }
        } else {
            y3 = e2.d0.y(j3 + this.f14549l, this.h);
        }
        long max = Math.max(0L, y3 - this.f14552o);
        if (this.f14560x != -9223372036854775807L) {
            return Math.min(e2.d0.V(this.f14544f, this.A), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14542c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f14562z;
        }
        this.G.getClass();
        return this.f14562z + e2.d0.X(e2.d0.y(e2.d0.P(SystemClock.elapsedRealtime()) - this.f14560x, this.h), this.f14544f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j3) {
        if (this.B) {
            long j10 = this.f14547j;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long C = e2.d0.C(j3 - j10, this.h);
                this.G.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C);
                this.f14547j = -9223372036854775807L;
                n nVar = ((d0) this.f14540a.f51151b).f14452s;
                if (nVar != null) {
                    nVar.a(currentTimeMillis);
                }
            }
        }
    }

    public final void f() {
        this.f14549l = 0L;
        this.f14559w = 0;
        this.v = 0;
        this.f14550m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.f14546i = false;
    }
}
