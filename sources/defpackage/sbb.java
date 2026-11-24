package defpackage;
public final class sbb implements qbb {
    public static final k40 d = new k40((byte) 7);
    public final Object a = new Object();
    public volatile qbb b;
    public Object c;

    public sbb(qbb qbbVar) {
        this.b = qbbVar;
    }

    @Override
    public final Object get() {
        qbb qbbVar = this.b;
        k40 k40Var = d;
        if (qbbVar != k40Var) {
            synchronized (this.a) {
                if (this.b != k40Var) {
                    Object obj = this.b.get();
                    this.c = obj;
                    this.b = k40Var;
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
