package k2;

import android.media.AudioTrack;
public final class r {
    public final q f12193a;
    public final int f12194b;
    public final pb.c f12195c;
    public int d;
    public long e;
    public long f12196f;
    public long f12197g;
    public long h;
    public long f12198i;

    public r(AudioTrack audioTrack, pb.c cVar) {
        this.f12193a = new q(audioTrack);
        this.f12194b = audioTrack.getSampleRate();
        this.f12195c = cVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f12196f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f12196f = 10000000L;
                return;
            }
            this.f12196f = 10000L;
            return;
        }
        this.f12197g = 0L;
        this.h = -1L;
        this.f12198i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f12196f = 10000L;
    }
}
