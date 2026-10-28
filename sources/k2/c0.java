package k2;

import android.media.AudioTrack;
public final class c0 {
    public final b0 f16130a;
    public final int f16131b;
    public final jg.i f16132c;
    public int d;
    public long e;
    public long f16133f;
    public long f16134g;
    public long h;
    public long f16135i;

    public c0(AudioTrack audioTrack, jg.i iVar) {
        this.f16130a = new b0(audioTrack);
        this.f16131b = audioTrack.getSampleRate();
        this.f16132c = iVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f16133f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f16133f = 10000000L;
                return;
            }
            this.f16133f = 10000L;
            return;
        }
        this.f16134g = 0L;
        this.h = -1L;
        this.f16135i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f16133f = 10000L;
    }
}
