package l3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
public final class y {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final androidx.biometric.f0 f11281a;
    public final long[] f11282b;
    public AudioTrack f11283c;
    public int d;
    public int e;
    public x f11284f;
    public int f11285g;
    public boolean h;
    public long f11286i;
    public float f11287j;
    public boolean f11288k;
    public long f11289l;
    public long f11290m;
    public Method f11291n;
    public long f11292o;
    public boolean f11293p;
    public boolean f11294q;
    public long f11295r;
    public long f11296s;
    public long f11297t;
    public long f11298u;
    public long v;
    public int f11299w;
    public int f11300x;
    public long f11301y;
    public long f11302z;

    public y(androidx.biometric.f0 f0Var) {
        this.f11281a = f0Var;
        if (h5.d0.f6937a >= 18) {
            try {
                this.f11291n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11282b = new long[10];
    }

    public final long a(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: l3.y.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f11301y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((h5.d0.t((elapsedRealtime * 1000) - j10, this.f11287j) * this.f11285g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f11296s >= 5) {
            AudioTrack audioTrack = this.f11283c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.f11297t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (h5.d0.f6937a <= 29) {
                    if (playbackHeadPosition == 0 && this.f11297t > 0 && playState == 3) {
                        if (this.f11302z == -9223372036854775807L) {
                            this.f11302z = elapsedRealtime;
                        }
                    } else {
                        this.f11302z = -9223372036854775807L;
                    }
                }
                if (this.f11297t > playbackHeadPosition) {
                    this.f11298u++;
                }
                this.f11297t = playbackHeadPosition;
            }
            this.f11296s = elapsedRealtime;
        }
        return this.f11297t + (this.f11298u << 32);
    }

    public final boolean c(long j10) {
        long a2 = a(false);
        int i10 = this.f11285g;
        int i11 = h5.d0.f6937a;
        if (j10 <= ((a2 * i10) + 999999) / 1000000) {
            if (this.h) {
                AudioTrack audioTrack = this.f11283c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && b() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void d() {
        this.f11289l = 0L;
        this.f11300x = 0;
        this.f11299w = 0;
        this.f11290m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f11288k = false;
    }
}
