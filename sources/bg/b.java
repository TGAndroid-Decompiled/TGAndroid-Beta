package bg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f4349b;
    public int f4350c;

    public b(long j10) {
        this.f4349b = j10;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f4350c--;
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
        if (this.f4350c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f4350c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f4350c = AudioConversions.usToShorts(this.f4349b, i10, i11);
    }
}
