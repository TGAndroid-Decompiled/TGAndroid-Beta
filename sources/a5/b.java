package a5;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b implements r4.g {

    public final int f51a;

    public final List f52b;

    public b(int i10, List list) {
        this.f51a = i10;
        this.f52b = list;
    }

    @Override
    public final int c(long j10) {
        switch (this.f51a) {
            case 0:
                return j10 < 0 ? 0 : -1;
            case 1:
                return j10 < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    @Override
    public final long f(int i10) {
        switch (this.f51a) {
            case 0:
                d5.a.f(i10 == 0);
                break;
            case 1:
                d5.a.f(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override
    public final List h(long j10) {
        switch (this.f51a) {
            case 0:
                return j10 >= 0 ? this.f52b : Collections.EMPTY_LIST;
            case 1:
                return j10 >= 0 ? this.f52b : Collections.EMPTY_LIST;
            default:
                return this.f52b;
        }
    }

    @Override
    public final int p() {
        switch (this.f51a) {
        }
        return 1;
    }

    public b(ArrayList arrayList) {
        this.f51a = 0;
        this.f52b = DesugarCollections.unmodifiableList(arrayList);
    }
}
