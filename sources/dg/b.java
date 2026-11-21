package dg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f8389b;
    public int f8390c;

    public b(long j3) {
        this.f8389b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f8390c--;
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
        if (this.f8390c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f8390c = 0;
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8390c = AudioConversions.usToShorts(this.f8389b, i7, i10);
    }
}
