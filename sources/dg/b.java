package dg;

import org.telegram.messenger.video.AudioConversions;
public final class b extends a {
    public final long f8691b;
    public int f8692c;

    public b(long j3) {
        this.f8691b = j3;
    }

    @Override
    public final short a() {
        if (c()) {
            this.f8692c--;
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
        if (this.f8692c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f8692c = 0;
    }

    @Override
    public final void e(int i7, int i10) {
        this.f8692c = AudioConversions.usToShorts(this.f8691b, i7, i10);
    }
}
