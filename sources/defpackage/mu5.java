package defpackage;

import java.util.Iterator;
public final class mu5 extends v9c {
    public int b;
    public Object c;
    public final byte d;
    public final Iterator e;
    public final Object f;

    public mu5(cba cbaVar) {
        this();
        this.d = (byte) 1;
        this.f = cbaVar;
        this.e = cbaVar.a.iterator();
    }

    @Override
    public final boolean hasNext() {
        boolean z;
        Object next;
        if (this.b != 4) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        int F = ik8.F(this.b);
        if (F == 0) {
            return true;
        }
        if (F != 2) {
            this.b = 4;
            byte b = this.d;
            Object obj = null;
            Object obj2 = this.f;
            Iterator it = this.e;
            switch (b) {
                case 0:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((pj8) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((cba) obj2).b.contains(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
            }
            this.c = obj;
            if (this.b != 3) {
                this.b = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.b = 2;
            Object obj = this.c;
            this.c = null;
            return obj;
        }
        lq5.n();
        return null;
    }

    public mu5(Iterator it, pj8 pj8Var) {
        this();
        this.d = (byte) 0;
        this.e = it;
        this.f = pj8Var;
    }

    public mu5() {
        super((byte) 0);
        this.b = 2;
    }
}
