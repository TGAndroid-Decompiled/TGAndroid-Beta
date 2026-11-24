package defpackage;

import java.io.Serializable;
public final class tdb implements sdb, Serializable {
    public final transient Object a = new Object();
    public final sdb b;
    public volatile transient boolean c;
    public transient Object d;

    public tdb(sdb sdbVar) {
        this.b = sdbVar;
    }

    @Override
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                if (!this.c) {
                    Object obj = this.b.get();
                    this.d = obj;
                    this.c = true;
                    return obj;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + ">";
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
