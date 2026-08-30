package a0;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
public final class d implements Iterator, Map.Entry {
    public int f6a;
    public int f7b = -1;
    public boolean f8c;
    public final f d;

    public d(f fVar) {
        this.d = fVar;
        this.f6a = fVar.f25c - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this.f8c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i10 = this.f7b;
                f fVar = this.d;
                if (kotlin.jvm.internal.j.a(key, fVar.e(i10)) && kotlin.jvm.internal.j.a(entry.getValue(), fVar.h(this.f7b))) {
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
        if (this.f8c) {
            return this.d.e(this.f7b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if (this.f8c) {
            return this.d.h(this.f7b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        if (this.f7b < this.f6a) {
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        if (this.f8c) {
            int i10 = this.f7b;
            f fVar = this.d;
            Object e = fVar.e(i10);
            Object h = fVar.h(this.f7b);
            int i11 = 0;
            if (e == null) {
                hashCode = 0;
            } else {
                hashCode = e.hashCode();
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
            this.f7b++;
            this.f8c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        if (this.f8c) {
            this.d.f(this.f7b);
            this.f7b--;
            this.f6a--;
            this.f8c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object setValue(Object obj) {
        if (this.f8c) {
            return this.d.g(this.f7b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
