package a8;

import java.util.Iterator;
import java.util.Map;
public final class x implements Iterator {
    public final int f706a;
    public Iterator f707b;

    @Override
    public final boolean hasNext() {
        switch (this.f706a) {
            case 0:
                return this.f707b.hasNext();
            case 1:
                return this.f707b.hasNext();
            default:
                return this.f707b.hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.f706a) {
            case 0:
                return ((Map.Entry) this.f707b.next()).getValue();
            case 1:
                return ((Map.Entry) this.f707b.next()).getValue();
            default:
                return (String) this.f707b.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.f706a) {
            case 0:
                this.f707b.remove();
                return;
            case 1:
                this.f707b.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public x(Iterator it, int i7) {
        this.f706a = i7;
        switch (i7) {
            case 1:
                it.getClass();
                this.f707b = it;
                return;
            default:
                it.getClass();
                this.f707b = it;
                return;
        }
    }
}
