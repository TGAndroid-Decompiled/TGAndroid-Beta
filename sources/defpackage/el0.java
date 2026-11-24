package defpackage;

import org.telegram.messenger.video.AudioConversions;
public final class el0 extends h10 {
    public final long b;
    public int c;

    public el0(long j) {
        this.b = j;
    }

    @Override
    public final short a() {
        if (c()) {
            this.c--;
            return (short) 0;
        }
        zo4.k("Audio input has no remaining value.");
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
