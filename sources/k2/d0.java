package k2;

import android.media.AudioTrack;
public final class d0 {
    public final c0 f10630a;
    public final int f10631b;
    public final a4.l f10632c;
    public int d;
    public long e;
    public long f10633f;
    public long f10634g;
    public long h;
    public long f10635i;

    public d0(AudioTrack audioTrack, a4.l lVar) {
        this.f10630a = new c0(audioTrack);
        this.f10631b = audioTrack.getSampleRate();
        this.f10632c = lVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f10633f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f10633f = 10000000L;
                return;
            }
            this.f10633f = 10000L;
            return;
        }
        this.f10634g = 0L;
        this.h = -1L;
        this.f10635i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f10633f = 10000L;
    }
}
