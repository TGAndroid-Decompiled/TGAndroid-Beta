package k2;

import android.media.AudioTrack;
public final class s {
    public final r f14504a;
    public final int f14505b;
    public final a4.m f14506c;
    public int d;
    public long f14507e;
    public long f14508f;
    public long f14509g;
    public long h;
    public long f14510i;

    public s(AudioTrack audioTrack, a4.m mVar) {
        this.f14504a = new r(audioTrack);
        this.f14505b = audioTrack.getSampleRate();
        this.f14506c = mVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14508f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14508f = 10000000L;
                return;
            }
            this.f14508f = 10000L;
            return;
        }
        this.f14509g = 0L;
        this.h = -1L;
        this.f14510i = -9223372036854775807L;
        this.f14507e = System.nanoTime() / 1000;
        this.f14508f = 10000L;
    }
}
