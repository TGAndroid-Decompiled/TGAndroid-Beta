package ag;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f529b;
    public int f530c;

    public b(long j3) {
        this.f529b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f530c--;
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
        if (this.f530c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f530c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f530c = AudioConversions.usToShorts(this.f529b, i10, i11);
    }
}
