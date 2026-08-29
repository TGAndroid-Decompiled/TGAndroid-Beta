package b5;

import java.util.Collections;
import java.util.List;
import t4.f;
public final class b implements f {
    public static final b f1936b = new b();
    public final List f1937a;

    public b(t4.b bVar) {
        this.f1937a = Collections.singletonList(bVar);
    }

    @Override
    public final int e(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final long m(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        return 0L;
    }

    @Override
    public final List q(long j10) {
        if (j10 >= 0) {
            return this.f1937a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final int v() {
        return 1;
    }

    public b() {
        this.f1937a = Collections.EMPTY_LIST;
    }
}
