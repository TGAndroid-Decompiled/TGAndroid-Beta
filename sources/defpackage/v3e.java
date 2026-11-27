package defpackage;

import java.util.ListIterator;
public final class v3e implements ListIterator {
    public final byte a;
    public ListIterator b;

    public v3e(ulf ulfVar, int i) {
        this.a = (byte) 2;
        this.b = ulfVar.a.listIterator(i);
    }

    @Override
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext();
            case 1:
                return this.b.hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b.hasPrevious();
            case 1:
                return this.b.hasPrevious();
            default:
                return this.b.hasPrevious();
        }
    }

    @Override
    public final Object next() {
        switch (this.a) {
            case 0:
                return (String) this.b.next();
            case 1:
                return (String) this.b.next();
            default:
                return (String) this.b.next();
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b.nextIndex();
            case 1:
                return this.b.nextIndex();
            default:
                return this.b.nextIndex();
        }
    }

    @Override
    public final Object previous() {
        switch (this.a) {
            case 0:
                return (String) this.b.previous();
            case 1:
                return (String) this.b.previous();
            default:
                return (String) this.b.previous();
        }
    }

    @Override
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return this.b.previousIndex();
            case 1:
                return this.b.previousIndex();
            default:
                return this.b.previousIndex();
        }
    }

    @Override
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }
}
