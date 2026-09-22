package k2;

import android.media.AudioTrack;
public final class s {
    public final r f13355a;
    public final int f13356b;
    public final zg.t f13357c;
    public int d;
    public long e;
    public long f13358f;
    public long f13359g;
    public long h;
    public long f13360i;

    public s(AudioTrack audioTrack, zg.t tVar) {
        this.f13355a = new r(audioTrack);
        this.f13356b = audioTrack.getSampleRate();
        this.f13357c = tVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13358f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13358f = 10000000L;
                return;
            }
            this.f13358f = 10000L;
            return;
        }
        this.f13359g = 0L;
        this.h = -1L;
        this.f13360i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13358f = 10000L;
    }
}
