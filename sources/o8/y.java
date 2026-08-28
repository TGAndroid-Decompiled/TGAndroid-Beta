package o8;

import java.util.Iterator;
import java.util.ListIterator;
public final class y extends z {
    public final transient int f19103c;
    public final transient int d;
    public final z f19104e;

    public y(z zVar, int i9, int i10) {
        this.f19104e = zVar;
        this.f19103c = i9;
        this.d = i10;
    }

    @Override
    public final Object get(int i9) {
        g7.d0.b(i9, this.d);
        return this.f19104e.get(i9 + this.f19103c);
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final Object[] o() {
        return this.f19104e.o();
    }

    @Override
    public final int p() {
        return this.f19104e.q() + this.f19103c + this.d;
    }

    @Override
    public final int q() {
        return this.f19104e.q() + this.f19103c;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override
    public final z subList(int i9, int i10) {
        g7.d0.d(i9, i10, this.d);
        int i11 = this.f19103c;
        return this.f19104e.subList(i9 + i11, i10 + i11);
    }

    @Override
    public final ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
