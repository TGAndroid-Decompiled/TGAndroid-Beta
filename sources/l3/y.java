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
    public final androidx.biometric.e0 f11391a;
    public final long[] f11392b;
    public AudioTrack f11393c;
    public int d;
    public int e;
    public x f11394f;
    public int f11395g;
    public boolean h;
    public long f11396i;
    public float f11397j;
    public boolean f11398k;
    public long f11399l;
    public long f11400m;
    public Method f11401n;
    public long f11402o;
    public boolean f11403p;
    public boolean f11404q;
    public long f11405r;
    public long f11406s;
    public long f11407t;
    public long f11408u;
    public long v;
    public int f11409w;
    public int f11410x;
    public long f11411y;
    public long f11412z;

    public y(androidx.biometric.e0 e0Var) {
        this.f11391a = e0Var;
        if (h5.d0.f6924a >= 18) {
            try {
                this.f11401n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11392b = new long[10];
    }

    public final long a(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: l3.y.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f11411y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((h5.d0.t((elapsedRealtime * 1000) - j10, this.f11397j) * this.f11395g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f11406s >= 5) {
            AudioTrack audioTrack = this.f11393c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.f11407t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (h5.d0.f6924a <= 29) {
                    if (playbackHeadPosition == 0 && this.f11407t > 0 && playState == 3) {
                        if (this.f11412z == -9223372036854775807L) {
                            this.f11412z = elapsedRealtime;
                        }
                    } else {
                        this.f11412z = -9223372036854775807L;
                    }
                }
                if (this.f11407t > playbackHeadPosition) {
                    this.f11408u++;
                }
                this.f11407t = playbackHeadPosition;
            }
            this.f11406s = elapsedRealtime;
        }
        return this.f11407t + (this.f11408u << 32);
    }

    public final boolean c(long j10) {
        long a2 = a(false);
        int i10 = this.f11395g;
        int i11 = h5.d0.f6924a;
        if (j10 <= ((a2 * i10) + 999999) / 1000000) {
            if (this.h) {
                AudioTrack audioTrack = this.f11393c;
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
        this.f11399l = 0L;
        this.f11410x = 0;
        this.f11409w = 0;
        this.f11400m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f11398k = false;
    }
}
