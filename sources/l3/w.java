package l3;

import ag.o1;
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
    public final o1 f14226a;
    public final long[] f14227b;
    public AudioTrack f14228c;
    public int d;
    public int f14229e;
    public v f14230f;
    public int f14231g;
    public boolean h;
    public long f14232i;
    public float f14233j;
    public boolean f14234k;
    public long f14235l;
    public long f14236m;
    public Method f14237n;
    public long f14238o;
    public boolean f14239p;
    public boolean f14240q;
    public long f14241r;
    public long f14242s;
    public long f14243t;
    public long f14244u;
    public int v;
    public int f14245w;
    public long f14246x;
    public long f14247y;
    public long f14248z;

    public w(o1 o1Var) {
        this.f14226a = o1Var;
        if (f5.d0.f6579a >= 18) {
            try {
                this.f14237n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f14227b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f14228c;
        audioTrack.getClass();
        if (this.f14246x != -9223372036854775807L) {
            return Math.min(this.A, this.f14248z + ((((SystemClock.elapsedRealtime() * 1000) - this.f14246x) * this.f14231g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f14244u = this.f14242s;
            }
            playbackHeadPosition += this.f14244u;
        }
        if (f5.d0.f6579a <= 29) {
            if (playbackHeadPosition == 0 && this.f14242s > 0 && playState == 3) {
                if (this.f14247y == -9223372036854775807L) {
                    this.f14247y = SystemClock.elapsedRealtime();
                }
                return this.f14242s;
            }
            this.f14247y = -9223372036854775807L;
        }
        if (this.f14242s > playbackHeadPosition) {
            this.f14243t++;
        }
        this.f14242s = playbackHeadPosition;
        return playbackHeadPosition + (this.f14243t << 32);
    }

    public final boolean b(long j10) {
        if (j10 <= a()) {
            if (this.h) {
                AudioTrack audioTrack = this.f14228c;
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

    public final void c(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        boolean z11;
        long j10;
        this.f14228c = audioTrack;
        this.d = i11;
        this.f14229e = i12;
        this.f14230f = new v(audioTrack);
        this.f14231g = audioTrack.getSampleRate();
        if (z10 && f5.d0.f6579a < 23 && (i10 == 5 || i10 == 6)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.h = z11;
        boolean D = f5.d0.D(i10);
        this.f14240q = D;
        if (D) {
            j10 = ((i12 / i11) * 1000000) / this.f14231g;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f14232i = j10;
        this.f14242s = 0L;
        this.f14243t = 0L;
        this.f14244u = 0L;
        this.f14239p = false;
        this.f14246x = -9223372036854775807L;
        this.f14247y = -9223372036854775807L;
        this.f14241r = 0L;
        this.f14238o = 0L;
        this.f14233j = 1.0f;
    }
}
