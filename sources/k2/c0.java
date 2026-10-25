package k2;

import android.media.AudioTrack;
public final class c0 {
    public final b0 f16131a;
    public final int f16132b;
    public final jg.i f16133c;
    public int d;
    public long e;
    public long f16134f;
    public long f16135g;
    public long h;
    public long f16136i;

    public c0(AudioTrack audioTrack, jg.i iVar) {
        this.f16131a = new b0(audioTrack);
        this.f16132b = audioTrack.getSampleRate();
        this.f16133c = iVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f16134f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f16134f = 10000000L;
                return;
            }
            this.f16134f = 10000L;
            return;
        }
        this.f16135g = 0L;
        this.h = -1L;
        this.f16136i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f16134f = 10000L;
    }
}
