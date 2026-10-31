package k2;

import android.media.AudioTrack;
public final class d0 {
    public final c0 f10629a;
    public final int f10630b;
    public final a4.l f10631c;
    public int d;
    public long e;
    public long f10632f;
    public long f10633g;
    public long h;
    public long f10634i;

    public d0(AudioTrack audioTrack, a4.l lVar) {
        this.f10629a = new c0(audioTrack);
        this.f10630b = audioTrack.getSampleRate();
        this.f10631c = lVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f10632f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f10632f = 10000000L;
                return;
            }
            this.f10632f = 10000L;
            return;
        }
        this.f10633g = 0L;
        this.h = -1L;
        this.f10634i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f10632f = 10000L;
    }
}
