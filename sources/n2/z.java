package n2;

import android.media.AudioTrack;
public final class z {
    public final y f20923a;
    public final int f20924b;
    public final gc.b f20925c;
    public int d;
    public long f20926e;
    public long f20927f;
    public long f20928g;
    public long h;
    public long f20929i;

    public z(AudioTrack audioTrack, gc.b bVar) {
        this.f20923a = new y(audioTrack);
        this.f20924b = audioTrack.getSampleRate();
        this.f20925c = bVar;
        a(0);
    }

    public final void a(int i7) {
        this.d = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        this.f20927f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f20927f = 10000000L;
                return;
            }
            this.f20927f = 10000L;
            return;
        }
        this.f20928g = 0L;
        this.h = -1L;
        this.f20929i = -9223372036854775807L;
        this.f20926e = System.nanoTime() / 1000;
        this.f20927f = 10000L;
    }
}
