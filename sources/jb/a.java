package jb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f9774a = new ReferenceQueue();
    public final Set f9775b = DesugarCollections.synchronizedSet(new HashSet());
}
