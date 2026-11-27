package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class k51 implements Iterator {
    public final byte a = 3;
    public int b = 0;
    public final int c;
    public final Object d;

    public k51(vhd vhdVar) {
        this.d = vhdVar;
        this.c = vhdVar.size();
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
                    return Byte.valueOf(((n51) obj).m(i2));
                }
                lq5.n();
                return null;
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return Byte.valueOf(((vhd) obj).j(i3));
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i4 = this.b;
                if (i4 < i) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((pzd) obj).i(i4));
                }
                lq5.n();
                return null;
            case 3:
                int i5 = this.b;
                if (i5 < i) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((gfe) obj).i(i5));
                }
                lq5.n();
                return null;
            case 4:
                int i6 = this.b;
                if (i6 < i) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((jne) obj).k(i6));
                }
                lq5.n();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((nif) obj).i(i7));
                }
                lq5.n();
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

    public k51(pzd pzdVar) {
        this.d = pzdVar;
        this.c = pzdVar.j();
    }

    public k51(gfe gfeVar) {
        this.d = gfeVar;
        this.c = gfeVar.k();
    }

    public k51(nif nifVar) {
        this.d = nifVar;
        this.c = nifVar.j();
    }

    public k51(jne jneVar) {
        this.d = jneVar;
        this.c = jneVar.i();
    }

    public k51(n51 n51Var) {
        this.d = n51Var;
        this.c = n51Var.size();
    }
}
