package e5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class b implements v4.f {
    public final int f5107a = 0;
    public final List f5108b;

    public b(ArrayList arrayList) {
        this.f5108b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final int b(long j10) {
        switch (this.f5107a) {
            case 0:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
            default:
                if (j10 < 0) {
                    return 0;
                }
                return -1;
        }
    }

    @Override
    public final long g(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f5107a) {
            case 0:
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.f(z4);
                return 0L;
            default:
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h5.a.f(z10);
                return 0L;
        }
    }

    @Override
    public final List m(long j10) {
        switch (this.f5107a) {
            case 0:
                if (j10 >= 0) {
                    return this.f5108b;
                }
                return Collections.EMPTY_LIST;
            default:
                if (j10 >= 0) {
                    return this.f5108b;
                }
                return Collections.EMPTY_LIST;
        }
    }

    @Override
    public final int p() {
        switch (this.f5107a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public b(List list) {
        this.f5108b = list;
    }
}
