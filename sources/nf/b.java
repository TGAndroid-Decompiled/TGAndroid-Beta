package nf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f15981b;
    public int f15982c;

    public b(long j10) {
        this.f15981b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f15982c--;
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
        if (this.f15982c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f15982c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f15982c = AudioConversions.usToShorts(this.f15981b, i10, i11);
    }
}
