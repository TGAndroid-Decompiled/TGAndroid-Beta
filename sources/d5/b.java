package d5;

import java.util.Collections;
import java.util.List;
import v4.f;
public final class b implements f {
    public static final b f4220b = new b();
    public final List f4221a;

    public b(v4.b bVar) {
        this.f4221a = Collections.singletonList(bVar);
    }

    @Override
    public final int b(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final long g(int i10) {
        boolean z4;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        return 0L;
    }

    @Override
    public final List m(long j10) {
        if (j10 >= 0) {
            return this.f4221a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public final int p() {
        return 1;
    }

    public b() {
        this.f4221a = Collections.EMPTY_LIST;
    }
}
