package ag;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f406b;
    public int f407c;

    public b(long j3) {
        this.f406b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f407c--;
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
        if (this.f407c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f407c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f407c = AudioConversions.usToShorts(this.f406b, i10, i11);
    }
}
