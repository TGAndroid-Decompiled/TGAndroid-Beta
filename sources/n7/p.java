package n7;

import java.util.AbstractMap;
public final class p extends m {
    public final q f15400c;

    public p(q qVar) {
        this.f15400c = qVar;
    }

    @Override
    public final Object get(int i10) {
        q qVar = this.f15400c;
        return new AbstractMap.SimpleImmutableEntry(qVar.d.f15404c.f15424f.get(i10), qVar.d.d.get(i10));
    }

    @Override
    public final int size() {
        return this.f15400c.d.d.size();
    }
}
