package j3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
public final class v {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public final fa.c f13367a;
    public final long[] f13368b;
    public AudioTrack f13369c;
    public int d;
    public int f13370e;
    public u f13371f;
    public int f13372g;
    public boolean h;
    public long f13373i;
    public float f13374j;
    public boolean f13375k;
    public long f13376l;
    public long f13377m;
    public Method f13378n;
    public long f13379o;
    public boolean f13380p;
    public boolean f13381q;
    public long f13382r;
    public long f13383s;
    public long f13384t;
    public long f13385u;
    public int v;
    public int f13386w;
    public long f13387x;
    public long f13388y;
    public long f13389z;

    public v(fa.c cVar) {
        this.f13367a = cVar;
        if (d5.f0.f4349a >= 18) {
            try {
                this.f13378n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13368b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f13369c;
        audioTrack.getClass();
        if (this.f13387x != -9223372036854775807L) {
            return Math.min(this.A, this.f13389z + ((((SystemClock.elapsedRealtime() * 1000) - this.f13387x) * this.f13372g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f13385u = this.f13383s;
            }
            playbackHeadPosition += this.f13385u;
        }
        if (d5.f0.f4349a <= 29) {
            if (playbackHeadPosition == 0 && this.f13383s > 0 && playState == 3) {
                if (this.f13388y == -9223372036854775807L) {
                    this.f13388y = SystemClock.elapsedRealtime();
                }
                return this.f13383s;
            }
            this.f13388y = -9223372036854775807L;
        }
        if (this.f13383s > playbackHeadPosition) {
            this.f13384t++;
        }
        this.f13383s = playbackHeadPosition;
        return playbackHeadPosition + (this.f13384t << 32);
    }

    public final boolean b(long j10) {
        if (j10 <= a()) {
            if (this.h) {
                AudioTrack audioTrack = this.f13369c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final void c(AudioTrack audioTrack, boolean z10, int i9, int i10, int i11) {
        boolean z11;
        long j10;
        this.f13369c = audioTrack;
        this.d = i10;
        this.f13370e = i11;
        this.f13371f = new u(audioTrack);
        this.f13372g = audioTrack.getSampleRate();
        if (z10 && d5.f0.f4349a < 23 && (i9 == 5 || i9 == 6)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.h = z11;
        boolean D = d5.f0.D(i9);
        this.f13381q = D;
        if (D) {
            j10 = ((i11 / i10) * 1000000) / this.f13372g;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f13373i = j10;
        this.f13383s = 0L;
        this.f13384t = 0L;
        this.f13385u = 0L;
        this.f13380p = false;
        this.f13387x = -9223372036854775807L;
        this.f13388y = -9223372036854775807L;
        this.f13382r = 0L;
        this.f13379o = 0L;
        this.f13374j = 1.0f;
    }
}
