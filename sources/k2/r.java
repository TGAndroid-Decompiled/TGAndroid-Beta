package k2;

import android.media.AudioTrack;
public final class r {
    public final q f13341a;
    public final int f13342b;
    public final a6.i f13343c;
    public int d;
    public long e;
    public long f13344f;
    public long f13345g;
    public long h;
    public long f13346i;

    public r(AudioTrack audioTrack, a6.i iVar) {
        this.f13341a = new q(audioTrack);
        this.f13342b = audioTrack.getSampleRate();
        this.f13343c = iVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f13344f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f13344f = 10000000L;
                return;
            }
            this.f13344f = 10000L;
            return;
        }
        this.f13345g = 0L;
        this.h = -1L;
        this.f13346i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f13344f = 10000L;
    }
}
