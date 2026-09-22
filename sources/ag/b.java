package ag;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f409b;
    public int f410c;

    public b(long j3) {
        this.f409b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f410c--;
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
        if (this.f410c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f410c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f410c = AudioConversions.usToShorts(this.f409b, i10, i11);
    }
}
