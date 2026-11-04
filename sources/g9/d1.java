package g9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
public final class d1 extends AbstractSequentialList implements Serializable {
    public final List f12068a;
    public final f9.k f12069b;

    public d1(List list, f9.k kVar) {
        list.getClass();
        this.f12068a = list;
        this.f12069b = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f12068a.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new b1(this, this.f12068a.listIterator(i3), 1);
    }

    @Override
    public final void removeRange(int i3, int i10) {
        this.f12068a.subList(i3, i10).clear();
    }

    @Override
    public final int size() {
        return this.f12068a.size();
    }
}
