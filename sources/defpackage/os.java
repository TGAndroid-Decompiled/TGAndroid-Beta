package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class os implements Iterator, Map.Entry {
    public int a;
    public int b = -1;
    public boolean c;
    public final ps d;

    public os(ps psVar) {
        this.d = psVar;
        this.a = psVar.c - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this.c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.b;
                ps psVar = this.d;
                if (rp5.a(key, psVar.f(i)) && rp5.a(entry.getValue(), psVar.i(this.b))) {
                    return true;
                }
            }
            return false;
        }
        sc8.j("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override
    public final Object getKey() {
        if (this.c) {
            return this.d.f(this.b);
        }
        sc8.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override
    public final Object getValue() {
        if (this.c) {
            return this.d.i(this.b);
        }
        sc8.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.c) {
            int i2 = this.b;
            ps psVar = this.d;
            Object f = psVar.f(i2);
            Object i3 = psVar.i(this.b);
            if (f == null) {
                hashCode = 0;
            } else {
                hashCode = f.hashCode();
            }
            if (i3 != null) {
                i = i3.hashCode();
            }
            return hashCode ^ i;
        }
        sc8.j("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        w26.g();
        return null;
    }

    @Override
    public final void remove() {
        if (this.c) {
            this.d.g(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        sdb.a();
    }

    @Override
    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.h(this.b, obj);
        }
        sc8.j("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
