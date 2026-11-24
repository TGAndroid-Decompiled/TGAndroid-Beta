package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class dcd implements Iterator {
    public final byte a;
    public Iterator b;

    public dcd(Iterator it, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                it.getClass();
                this.b = it;
                return;
            default:
                it.getClass();
                this.b = it;
                return;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            case 2:
                return this.b.hasNext();
            case 3:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((Map.Entry) this.b.next()).getValue();
            case 1:
                return ((Map.Entry) this.b.next()).getValue();
            case 2:
                return (String) this.b.next();
            case 3:
                return (String) this.b.next();
            default:
                return (String) this.b.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            case 1:
                this.b.remove();
                return;
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public dcd(ehf ehfVar) {
        this.a = (byte) 4;
        this.b = ehfVar.a.iterator();
    }
}
