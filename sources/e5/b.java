package e5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class b implements v4.f {
    public final int f4944a;
    public final List f4945b;

    public b(int i10, List list) {
        this.f4944a = i10;
        this.f4945b = list;
    }

    @Override
    public final int d(long j10) {
        switch (this.f4944a) {
            case 0:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
            case 1:
                return -1;
            default:
                return -1;
        }
    }

    @Override
    public final long l(int i10) {
        boolean z4;
        switch (this.f4944a) {
            case 0:
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                return 0L;
            case 1:
                return 0L;
            default:
                return 0L;
        }
    }

    @Override
    public final List q(long j10) {
        switch (this.f4944a) {
            case 0:
                if (j10 >= 0) {
                    return this.f4945b;
                }
                return Collections.EMPTY_LIST;
            case 1:
                return this.f4945b;
            default:
                return this.f4945b;
        }
    }

    @Override
    public final int x() {
        switch (this.f4944a) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    public b(ArrayList arrayList) {
        this.f4944a = 0;
        this.f4945b = DesugarCollections.unmodifiableList(arrayList);
    }
}
