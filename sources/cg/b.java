package cg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f6288b;
    public int f6289c;

    public b(long j10) {
        this.f6288b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f6289c--;
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
        if (this.f6289c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f6289c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f6289c = AudioConversions.usToShorts(this.f6288b, i10, i11);
    }
}
