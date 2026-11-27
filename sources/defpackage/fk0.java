package defpackage;

import org.telegram.messenger.video.AudioConversions;
public final class fk0 extends i00 {
    public final long b;
    public int c;

    public fk0(long j) {
        this.b = j;
    }

    @Override
    public final short a() {
        if (c()) {
            this.c--;
            return (short) 0;
        }
        xi4.l("Audio input has no remaining value.");
        return (short) 0;
    }

    @Override
    public final boolean c() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.c = 0;
    }

    @Override
    public final void e(int i, int i2) {
        this.c = AudioConversions.usToShorts(this.b, i, i2);
    }
}
