package k2;

import android.media.AudioTrack;
public final class b0 {
    public final a0 f14650a;
    public final int f14651b;
    public final ya.d f14652c;
    public int d;
    public long e;
    public long f14653f;
    public long f14654g;
    public long h;
    public long f14655i;

    public b0(AudioTrack audioTrack, ya.d dVar) {
        this.f14650a = new a0(audioTrack);
        this.f14651b = audioTrack.getSampleRate();
        this.f14652c = dVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14653f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14653f = 10000000L;
                return;
            }
            this.f14653f = 10000L;
            return;
        }
        this.f14654g = 0L;
        this.h = -1L;
        this.f14655i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f14653f = 10000L;
    }
}
