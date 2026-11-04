package eg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f9969b;
    public int f9970c;

    public b(long j10) {
        this.f9969b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f9970c--;
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
        if (this.f9970c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f9970c = 0;
    }

    @Override
    public final void e(int i3, int i10) {
        this.f9970c = AudioConversions.usToShorts(this.f9969b, i3, i10);
    }
}
