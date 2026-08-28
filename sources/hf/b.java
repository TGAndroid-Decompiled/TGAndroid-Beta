package hf;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f10517b;
    public int f10518c;

    public b(long j10) {
        this.f10517b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f10518c--;
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
        if (this.f10518c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f10518c = 0;
    }

    @Override
    public final void e(int i9, int i10) {
        this.f10518c = AudioConversions.usToShorts(this.f10517b, i9, i10);
    }
}
