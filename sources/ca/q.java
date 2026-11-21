package ca;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
public final class q {
    public ArrayList f5170a;
    public int f5171b;

    public synchronized List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.f5170a));
    }
}
