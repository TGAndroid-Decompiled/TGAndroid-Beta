package j3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

public final class w {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    public final ga.c f12467a;

    public final long[] f12468b;

    public AudioTrack f12469c;
    public int d;

    public int f12470e;

    public v f12471f;

    public int f12472g;
    public boolean h;

    public long f12473i;

    public float f12474j;

    public boolean f12475k;

    public long f12476l;

    public long f12477m;

    public Method f12478n;

    public long f12479o;

    public boolean f12480p;

    public boolean f12481q;

    public long f12482r;

    public long f12483s;

    public long f12484t;

    public long f12485u;
    public int v;

    public int f12486w;

    public long f12487x;

    public long f12488y;

    public long f12489z;

    public w(ga.c cVar) {
        this.f12467a = cVar;
        if (d5.g0.f4795a >= 18) {
            try {
                this.f12478n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f12468b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f12469c;
        audioTrack.getClass();
        if (this.f12487x != -9223372036854775807L) {
            return Math.min(this.A, this.f12489z + ((((SystemClock.elapsedRealtime() * 1000) - this.f12487x) * ((long) this.f12472g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f12485u = this.f12483s;
            }
            playbackHeadPosition += this.f12485u;
        }
        if (d5.g0.f4795a <= 29) {
            if (playbackHeadPosition == 0 && this.f12483s > 0 && playState == 3) {
                if (this.f12488y == -9223372036854775807L) {
                    this.f12488y = SystemClock.elapsedRealtime();
                }
                return this.f12483s;
            }
            this.f12488y = -9223372036854775807L;
        }
        if (this.f12483s > playbackHeadPosition) {
            this.f12484t++;
        }
        this.f12483s = playbackHeadPosition;
        return playbackHeadPosition + (this.f12484t << 32);
    }

    public final boolean b(long j10) {
        if (j10 > a()) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        AudioTrack audioTrack = this.f12469c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final void c(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f12469c = audioTrack;
        this.d = i11;
        this.f12470e = i12;
        this.f12471f = new v(audioTrack);
        this.f12472g = audioTrack.getSampleRate();
        this.h = z10 && d5.g0.f4795a < 23 && (i10 == 5 || i10 == 6);
        boolean zD = d5.g0.D(i10);
        this.f12481q = zD;
        this.f12473i = zD ? (((long) (i12 / i11)) * 1000000) / ((long) this.f12472g) : -9223372036854775807L;
        this.f12483s = 0L;
        this.f12484t = 0L;
        this.f12485u = 0L;
        this.f12480p = false;
        this.f12487x = -9223372036854775807L;
        this.f12488y = -9223372036854775807L;
        this.f12482r = 0L;
        this.f12479o = 0L;
        this.f12474j = 1.0f;
    }
}
