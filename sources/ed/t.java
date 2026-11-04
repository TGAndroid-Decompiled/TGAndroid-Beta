package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class t implements Iterator {
    public int f9956a;
    public Object f9957b;
    public int f9958c;
    public int d;
    public final u f9959e;

    public t(u uVar) {
        this.f9959e = uVar;
        this.f9958c = uVar.d;
        this.d = uVar.f9962c;
    }

    public final boolean a() {
        this.f9956a = 3;
        int i3 = this.f9958c;
        if (i3 == 0) {
            this.f9956a = 2;
        } else {
            u uVar = this.f9959e;
            Object[] objArr = uVar.f9960a;
            int i10 = this.d;
            this.f9957b = objArr[i10];
            this.f9956a = 1;
            this.d = (i10 + 1) % uVar.f9961b;
            this.f9958c = i3 - 1;
        }
        if (this.f9956a == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasNext() {
        int i3 = this.f9956a;
        if (i3 != 0) {
            if (i3 == 1) {
                return true;
            }
            if (i3 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return a();
    }

    @Override
    public final Object next() {
        int i3 = this.f9956a;
        if (i3 == 1) {
            this.f9956a = 0;
            return this.f9957b;
        } else if (i3 != 2 && a()) {
            this.f9956a = 0;
            return this.f9957b;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
