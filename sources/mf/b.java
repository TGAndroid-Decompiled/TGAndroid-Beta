package mf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f13913b;
    public int f13914c;

    public b(long j10) {
        this.f13913b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f13914c--;
            return (short) 0;
        }
        throw new RuntimeException("Audio input has no remaining value.");
    }

    @Override
    public final int b() {
        return -1;
    }

    @Override
    public final boolean c() {
        if (this.f13914c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f13914c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f13914c = AudioConversions.usToShorts(this.f13913b, i10, i11);
    }
}
