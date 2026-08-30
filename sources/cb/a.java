package cb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f2209a = new ReferenceQueue();
    public final Set f2210b = DesugarCollections.synchronizedSet(new HashSet());
}
