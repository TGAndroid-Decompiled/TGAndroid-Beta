package ag;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f438b;
    public int f439c;

    public b(long j3) {
        this.f438b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f439c--;
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
        if (this.f439c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f439c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f439c = AudioConversions.usToShorts(this.f438b, i10, i11);
    }
}
