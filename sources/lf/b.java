package lf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f15212b;
    public int f15213c;

    public b(long j10) {
        this.f15212b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f15213c--;
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
        if (this.f15213c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f15213c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f15213c = AudioConversions.usToShorts(this.f15212b, i10, i11);
    }
}
