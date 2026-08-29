package ab;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f300a = new ReferenceQueue();
    public final Set f301b = DesugarCollections.synchronizedSet(new HashSet());
}
