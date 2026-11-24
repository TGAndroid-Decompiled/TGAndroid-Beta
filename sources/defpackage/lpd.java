package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class lpd extends PhantomReference {
    public final Set a;
    public final sw b;

    public lpd(hj2 hj2Var, ReferenceQueue referenceQueue, Set set, sw swVar) {
        super(hj2Var, referenceQueue);
        this.a = set;
        this.b = swVar;
    }
}
