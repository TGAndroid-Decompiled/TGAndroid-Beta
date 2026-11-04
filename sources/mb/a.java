package mb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f19222a = new ReferenceQueue();
    public final Set f19223b = DesugarCollections.synchronizedSet(new HashSet());
}
