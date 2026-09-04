package a0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
public final class d implements Iterator, Map.Entry {
    public int f7a;
    public int f8b = -1;
    public boolean f9c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
        this.f7a = fVar.f31c - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this.f9c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i10 = this.f8b;
                f fVar = this.d;
                if (kotlin.jvm.internal.i.a(key, fVar.e(i10)) && kotlin.jvm.internal.i.a(entry.getValue(), fVar.h(this.f8b))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getKey() {
        if (this.f9c) {
            return this.d.e(this.f8b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if (this.f9c) {
            return this.d.h(this.f8b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        if (this.f8b < this.f7a) {
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        if (this.f9c) {
            int i10 = this.f8b;
            f fVar = this.d;
            Object e7 = fVar.e(i10);
            Object h = fVar.h(this.f8b);
            int i11 = 0;
            if (e7 == null) {
                hashCode = 0;
            } else {
                hashCode = e7.hashCode();
            }
            if (h != null) {
                i11 = h.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f8b++;
            this.f9c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.f9c) {
            this.d.f(this.f8b);
            this.f8b--;
            this.f7a--;
            this.f9c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object setValue(Object obj) {
        if (this.f9c) {
            return this.d.g(this.f8b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
