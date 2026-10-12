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
    public final xa.c f14537a;
    public final long[] f14538b;
    public AudioTrack f14539c;
    public int d;
    public r f14540e;
    public int f14541f;
    public long f14542g;
    public float h;
    public boolean f14543i;
    public long f14544j;
    public int f14545k;
    public long f14546l;
    public long f14547m;
    public Method f14548n;
    public long f14549o;
    public boolean f14550p;
    public boolean f14551q;
    public long f14552r;
    public long f14553s;
    public long f14554t;
    public long f14555u;
    public int v;
    public int f14556w;
    public long f14557x;
    public long f14558y;
    public long f14559z;

    public s(xa.c cVar) {
        this.f14537a = cVar;
        try {
            this.f14548n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f14538b = new long[10];
        this.D = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.G = e2.x.f8587a;
    }

    public final long a() {
        throw new UnsupportedOperationException("Method not decompiled: k2.s.a():long");
    }

    public final long b() {
        if (this.f14557x != -9223372036854775807L) {
            return Math.min(this.A, d());
        }
        this.G.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f14553s >= 5) {
            AudioTrack audioTrack = this.f14539c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.f14554t > 0 && playState == 3) {
                        if (this.f14558y == -9223372036854775807L) {
                            this.f14558y = elapsedRealtime;
                        }
                    } else {
                        this.f14558y = -9223372036854775807L;
                    }
                }
                long j3 = this.f14554t;
                if (j3 > playbackHeadPosition) {
                    if (this.E) {
                        this.F += j3;
                        this.E = false;
                    } else {
                        this.f14555u++;
                    }
                }
                this.f14554t = playbackHeadPosition;
            }
            this.f14553s = elapsedRealtime;
        }
        return this.f14554t + this.F + (this.f14555u << 32);
    }

    public final long c(long j3) {
        long y3;
        if (this.f14556w == 0) {
            if (this.f14557x != -9223372036854775807L) {
                y3 = e2.d0.V(this.f14541f, d());
            } else {
                y3 = e2.d0.V(this.f14541f, b());
            }
        } else {
            y3 = e2.d0.y(j3 + this.f14546l, this.h);
        }
        long max = Math.max(0L, y3 - this.f14549o);
        if (this.f14557x != -9223372036854775807L) {
            return Math.min(e2.d0.V(this.f14541f, this.A), max);
        }
        return max;
    }

    public final long d() {
        AudioTrack audioTrack = this.f14539c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f14559z;
        }
        this.G.getClass();
        return this.f14559z + e2.d0.X(e2.d0.y(e2.d0.P(SystemClock.elapsedRealtime()) - this.f14557x, this.h), this.f14541f, 1000000L, RoundingMode.UP);
    }

    public final void e(long j3) {
        if (this.B) {
            long j10 = this.f14544j;
            if (j10 != -9223372036854775807L && j3 >= j10) {
                long C = e2.d0.C(j3 - j10, this.h);
                this.G.getClass();
                long currentTimeMillis = System.currentTimeMillis() - e2.d0.d0(C);
                this.f14544j = -9223372036854775807L;
                n nVar = ((d0) this.f14537a.f51343b).f14449s;
                if (nVar != null) {
                    nVar.b(currentTimeMillis);
                }
            }
        }
    }

    public final void f() {
        this.f14546l = 0L;
        this.f14556w = 0;
        this.v = 0;
        this.f14547m = 0L;
        this.C = -9223372036854775807L;
        this.D = -9223372036854775807L;
        this.f14543i = false;
    }
}
