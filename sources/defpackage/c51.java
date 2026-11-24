package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class c51 implements Iterator {
    public final byte a = 1;
    public int b = 0;
    public final int c;
    public final Object d;

    public c51(cdd cddVar) {
        this.d = cddVar;
        this.c = cddVar.size();
    }

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 1:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 2:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 3:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            case 4:
                if (this.b < this.c) {
                    return true;
                }
                return false;
            default:
                if (this.b < this.c) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        byte b = this.a;
        int i = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                int i2 = this.b;
                if (i2 < i) {
                    this.b = i2 + 1;
                    return Byte.valueOf(((f51) obj).m(i2));
                }
                w26.g();
                return null;
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return Byte.valueOf(((cdd) obj).j(i3));
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i4 = this.b;
                if (i4 < i) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((zud) obj).i(i4));
                }
                w26.g();
                return null;
            case 3:
                int i5 = this.b;
                if (i5 < i) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((qae) obj).i(i5));
                }
                w26.g();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 < i) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((sie) obj).k(i6));
                }
                w26.g();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((xdf) obj).i(i7));
                }
                w26.g();
                return null;
        }
    }

    @Override
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public c51(zud zudVar) {
        this.d = zudVar;
        this.c = zudVar.j();
    }

    public c51(qae qaeVar) {
        this.d = qaeVar;
        this.c = qaeVar.k();
    }

    public c51(xdf xdfVar) {
        this.d = xdfVar;
        this.c = xdfVar.j();
    }

    public c51(sie sieVar) {
        this.d = sieVar;
        this.c = sieVar.i();
    }

    public c51(f51 f51Var) {
        this.d = f51Var;
        this.c = f51Var.size();
    }
}
