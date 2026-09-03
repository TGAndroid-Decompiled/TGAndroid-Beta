package cb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f2233a = new ReferenceQueue();
    public final Set f2234b = DesugarCollections.synchronizedSet(new HashSet());
}
