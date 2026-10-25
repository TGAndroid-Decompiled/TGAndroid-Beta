package a8;

import java.util.Iterator;
import java.util.Map;
public final class o implements Iterator {
    public final int f641a;
    public Iterator f642b;

    @Override
    public final boolean hasNext() {
        switch (this.f641a) {
            case 0:
                return this.f642b.hasNext();
            case 1:
                return this.f642b.hasNext();
            default:
                return this.f642b.hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.f641a) {
            case 0:
                return ((Map.Entry) this.f642b.next()).getValue();
            case 1:
                return (String) this.f642b.next();
            default:
                return ((Map.Entry) this.f642b.next()).getValue();
        }
    }

    @Override
    public final void remove() {
        switch (this.f641a) {
            case 0:
                this.f642b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                this.f642b.remove();
                return;
        }
    }

    public o(Iterator it, int i10) {
        this.f641a = i10;
        switch (i10) {
            case 2:
                it.getClass();
                this.f642b = it;
                return;
            default:
                it.getClass();
                this.f642b = it;
                return;
        }
    }
}
