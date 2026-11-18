package dg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f8363b;
    public int f8364c;

    public b(long j3) {
        this.f8363b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f8364c--;
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
        if (this.f8364c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f8364c = 0;
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8364c = AudioConversions.usToShorts(this.f8363b, i7, i10);
    }
}
