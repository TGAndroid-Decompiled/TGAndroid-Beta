package l4;

import java.util.NoSuchElementException;

public abstract class b implements l {

    public final long f15401a;

    public final long f15402b;

    public long f15403c;

    public b(long j10, long j11) {
        this.f15401a = j10;
        this.f15402b = j11;
        this.f15403c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f15403c;
        if (j10 < this.f15401a || j10 > this.f15402b) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final boolean next() {
        long j10 = this.f15403c + 1;
        this.f15403c = j10;
        return !(j10 > this.f15402b);
    }
}
