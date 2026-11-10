package dg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f8694b;
    public int f8695c;

    public b(long j3) {
        this.f8694b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f8695c--;
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
        if (this.f8695c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f8695c = 0;
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8695c = AudioConversions.usToShorts(this.f8694b, i7, i10);
    }
}
