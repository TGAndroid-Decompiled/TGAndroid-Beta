package b8;

import java.util.Iterator;
import java.util.Map;
public final class o implements Iterator {
    public final int f2851a;
    public Iterator f2852b;

    @Override
    public final boolean hasNext() {
        switch (this.f2851a) {
            case 0:
                return this.f2852b.hasNext();
            case 1:
                return this.f2852b.hasNext();
            default:
                return this.f2852b.hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.f2851a) {
            case 0:
                return ((Map.Entry) this.f2852b.next()).getValue();
            case 1:
                return (String) this.f2852b.next();
            default:
                return ((Map.Entry) this.f2852b.next()).getValue();
        }
    }

    @Override
    public final void remove() {
        switch (this.f2851a) {
            case 0:
                this.f2852b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                this.f2852b.remove();
                return;
        }
    }

    public o(Iterator it, int i3) {
        this.f2851a = i3;
        switch (i3) {
            case 2:
                it.getClass();
                this.f2852b = it;
                return;
            default:
                it.getClass();
                this.f2852b = it;
                return;
        }
    }
}
