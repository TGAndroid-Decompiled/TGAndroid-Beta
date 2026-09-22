package a4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class m implements z3.d {
    public final List f274a;

    public m(List list) {
        this.f274a = list;
    }

    @Override
    public int a(long j3) {
        if (j3 < 0) {
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
        e2.d.b(z10);
        return 0L;
    }

    @Override
    public List f(long j3) {
        if (j3 >= 0) {
            return this.f274a;
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public int g() {
        return 1;
    }

    public m(ArrayList arrayList) {
        this.f274a = DesugarCollections.unmodifiableList(arrayList);
    }
}
