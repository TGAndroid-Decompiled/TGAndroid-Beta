package n4;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class a {
    public final int f18382a;
    public final int f18383b;
    public final List f18384c;
    public final List d;
    public final List f18385e;
    public final List f18386f;

    public a(int i9, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f18382a = i9;
        this.f18383b = i10;
        this.f18384c = DesugarCollections.unmodifiableList(arrayList);
        this.d = DesugarCollections.unmodifiableList(list);
        this.f18385e = DesugarCollections.unmodifiableList(list2);
        this.f18386f = DesugarCollections.unmodifiableList(list3);
    }
}
