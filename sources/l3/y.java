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
    public final androidx.biometric.f0 f11653a;
    public final long[] f11654b;
    public AudioTrack f11655c;
    public int d;
    public int f11656e;
    public x f11657f;
    public int f11658g;
    public boolean h;
    public long f11659i;
    public float f11660j;
    public boolean f11661k;
    public long f11662l;
    public long f11663m;
    public Method f11664n;
    public long f11665o;
    public boolean f11666p;
    public boolean f11667q;
    public long f11668r;
    public long f11669s;
    public long f11670t;
    public long f11671u;
    public long v;
    public int f11672w;
    public int f11673x;
    public long f11674y;
    public long f11675z;

    public y(androidx.biometric.f0 f0Var) {
        this.f11653a = f0Var;
        if (h5.d0.f7237a >= 18) {
            try {
                this.f11664n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f11654b = new long[10];
    }

    public final long a(boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: l3.y.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f11674y;
        if (j10 != -9223372036854775807L) {
            return Math.min(this.B, this.A + (((h5.d0.t((elapsedRealtime * 1000) - j10, this.f11660j) * this.f11658g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f11669s >= 5) {
            AudioTrack audioTrack = this.f11655c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.f11670t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (h5.d0.f7237a <= 29) {
                    if (playbackHeadPosition == 0 && this.f11670t > 0 && playState == 3) {
                        if (this.f11675z == -9223372036854775807L) {
                            this.f11675z = elapsedRealtime;
                        }
                    } else {
                        this.f11675z = -9223372036854775807L;
                    }
                }
                if (this.f11670t > playbackHeadPosition) {
                    this.f11671u++;
                }
                this.f11670t = playbackHeadPosition;
            }
            this.f11669s = elapsedRealtime;
        }
        return this.f11670t + (this.f11671u << 32);
    }

    public final boolean c(long j10) {
        long a2 = a(false);
        int i10 = this.f11658g;
        int i11 = h5.d0.f7237a;
        if (j10 <= ((a2 * i10) + 999999) / 1000000) {
            if (this.h) {
                AudioTrack audioTrack = this.f11655c;
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
        this.f11662l = 0L;
        this.f11673x = 0;
        this.f11672w = 0;
        this.f11663m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f11661k = false;
    }
}
