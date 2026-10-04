package k2;

import android.media.AudioTrack;
public final class s {
    public final r f14505a;
    public final int f14506b;
    public final a4.m f14507c;
    public int d;
    public long f14508e;
    public long f14509f;
    public long f14510g;
    public long h;
    public long f14511i;

    public s(AudioTrack audioTrack, a4.m mVar) {
        this.f14505a = new r(audioTrack);
        this.f14506b = audioTrack.getSampleRate();
        this.f14507c = mVar;
        a(0);
    }

    public final void a(int i10) {
        this.d = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f14509f = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f14509f = 10000000L;
                return;
            }
            this.f14509f = 10000L;
            return;
        }
        this.f14510g = 0L;
        this.h = -1L;
        this.f14511i = -9223372036854775807L;
        this.f14508e = System.nanoTime() / 1000;
        this.f14509f = 10000L;
    }
}
