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
        this.f7a = fVar.f28c - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!this.f9c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f8b;
        f fVar = this.d;
        return kotlin.jvm.internal.j.a(key, fVar.e(i10)) && kotlin.jvm.internal.j.a(entry.getValue(), fVar.h(this.f8b));
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
        return this.f8b < this.f7a;
    }

    @Override
    public final int hashCode() {
        if (!this.f9c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f8b;
        f fVar = this.d;
        Object objE = fVar.e(i10);
        Object objH = fVar.h(this.f8b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8b++;
        this.f9c = true;
        return this;
    }

    @Override
    public final void remove() {
        if (!this.f9c) {
            throw new IllegalStateException();
        }
        this.d.f(this.f8b);
        this.f8b--;
        this.f7a--;
        this.f9c = false;
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
