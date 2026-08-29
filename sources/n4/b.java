package n4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f17111a;
    public final long f17112b;
    public long f17113c;

    public b(long j10, long j11) {
        this.f17111a = j10;
        this.f17112b = j11;
        this.f17113c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f17113c;
        if (j10 >= this.f17111a && j10 <= this.f17112b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f17113c + 1;
        this.f17113c = j10;
        if (j10 > this.f17112b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
