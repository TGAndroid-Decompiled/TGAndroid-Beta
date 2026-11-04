package m2;

import android.media.AudioTrack;
import gi.v5;
public final class b0 {
    public final a0 f18823a;
    public final int f18824b;
    public final v5 f18825c;
    public int d;
    public long f18826e;
    public long f18827f;
    public long f18828g;
    public long h;
    public long f18829i;

    public b0(AudioTrack audioTrack, v5 v5Var) {
        this.f18823a = new a0(audioTrack);
        this.f18824b = audioTrack.getSampleRate();
        this.f18825c = v5Var;
        a(0);
    }

    public final void a(int i3) {
        this.d = i3;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        this.f18827f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f18827f = 10000000L;
                return;
            }
            this.f18827f = 10000L;
            return;
        }
        this.f18828g = 0L;
        this.h = -1L;
        this.f18829i = -9223372036854775807L;
        this.f18826e = System.nanoTime() / 1000;
        this.f18827f = 10000L;
    }
}
