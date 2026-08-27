package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class a {

    public final int f18209a;

    public final int f18210b;

    public final List f18211c;
    public final List d;

    public final List f18212e;

    public final List f18213f;

    public a(int i10, int i11, ArrayList arrayList, List list, List list2, List list3) {
        this.f18209a = i10;
        this.f18210b = i11;
        this.f18211c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f18212e = DesugarCollections.unmodifiableList(list2);
        this.f18213f = DesugarCollections.unmodifiableList(list3);
    }
}
