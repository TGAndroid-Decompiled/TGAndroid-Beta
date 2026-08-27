package jf;

import org.telegram.messenger.video.AudioConversions;

public final class b extends a {

    public final long f12931b;

    public int f12932c;

    public b(long j10) {
        this.f12931b = j10;
    }

    @Override
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.f12932c--;
        return (short) 0;
    }

    @Override
    public final int b() {
        return -1;
    }

    @Override
    public final boolean c() {
        return this.f12932c > 0;
    }

    @Override
    public final void d() {
        this.f12932c = 0;
    }

    @Override
    public final void e(int i10, int i11) {
        this.f12932c = AudioConversions.usToShorts(this.f12931b, i10, i11);
    }
}
