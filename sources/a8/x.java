package a8;

import java.util.Iterator;
import java.util.Map;
public final class x implements Iterator {
    public final int f702a;
    public Iterator f703b;

    @Override
    public final boolean hasNext() {
        switch (this.f702a) {
            case 0:
                return this.f703b.hasNext();
            case 1:
                return this.f703b.hasNext();
            default:
                return this.f703b.hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.f702a) {
            case 0:
                return ((Map.Entry) this.f703b.next()).getValue();
            case 1:
                return ((Map.Entry) this.f703b.next()).getValue();
            default:
                return (String) this.f703b.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.f702a) {
            case 0:
                this.f703b.remove();
                return;
            case 1:
                this.f703b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public x(Iterator it, int i7) {
        this.f702a = i7;
        switch (i7) {
            case 1:
                it.getClass();
                this.f703b = it;
                return;
            default:
                it.getClass();
                this.f703b = it;
                return;
        }
    }
}
