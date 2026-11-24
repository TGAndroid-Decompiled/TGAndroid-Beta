package defpackage;
public final class udb implements sdb {
    public static final k50 d = new k50((byte) 7);
    public final Object a = new Object();
    public volatile sdb b;
    public Object c;

    public udb(sdb sdbVar) {
        this.b = sdbVar;
    }

    @Override
    public final Object get() {
        sdb sdbVar = this.b;
        k50 k50Var = d;
        if (sdbVar != k50Var) {
            synchronized (this.a) {
                if (this.b != k50Var) {
                    Object obj = this.b.get();
                    this.c = obj;
                    this.b = k50Var;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = "<supplier that returned " + this.c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
