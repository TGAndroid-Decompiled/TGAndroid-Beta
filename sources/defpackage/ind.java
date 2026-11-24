package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class ind extends PhantomReference {
    public final Set a;
    public final sv b;

    public ind(th2 th2Var, ReferenceQueue referenceQueue, Set set, sv svVar) {
        super(th2Var, referenceQueue);
        this.a = set;
        this.b = svVar;
    }
}
