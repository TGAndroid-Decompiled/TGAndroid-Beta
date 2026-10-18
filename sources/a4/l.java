package a4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class l implements z3.d {
    public final List f278a;

    public l(List list) {
        this.f278a = list;
    }

    @Override
    public int c(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public long d(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        return 0L;
    }

    @Override
    public List e(long j10) {
        if (j10 >= 0) {
            return this.f278a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public int i() {
        return 1;
    }

    public l(ArrayList arrayList) {
        this.f278a = DesugarCollections.unmodifiableList(arrayList);
    }
}
