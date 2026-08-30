package nf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f14961b;
    public int f14962c;

    public b(long j10) {
        this.f14961b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f14962c--;
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
        if (this.f14962c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f14962c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f14962c = AudioConversions.usToShorts(this.f14961b, i10, i11);
    }
}
