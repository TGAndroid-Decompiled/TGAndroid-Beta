package ag;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f426b;
    public int f427c;

    public b(long j3) {
        this.f426b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f427c--;
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
        if (this.f427c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f427c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f427c = AudioConversions.usToShorts(this.f426b, i10, i11);
    }
}
