package l4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f16644a;
    public final long f16645b;
    public long f16646c;

    public b(long j10, long j11) {
        this.f16644a = j10;
        this.f16645b = j11;
        this.f16646c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f16646c;
        if (j10 >= this.f16644a && j10 <= this.f16645b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f16646c + 1;
        this.f16646c = j10;
        if (j10 > this.f16645b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
