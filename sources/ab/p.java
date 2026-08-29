package ab;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class p extends PhantomReference {
    public final Set f331a;
    public final n f332b;

    public p(a aVar, ReferenceQueue referenceQueue, Set set, n nVar) {
        super(aVar, referenceQueue);
        this.f331a = set;
        this.f332b = nVar;
    }
}
