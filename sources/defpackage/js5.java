package defpackage;

import java.util.Iterator;
public final class js5 extends v5c {
    public int b;
    public Object c;
    public final byte d;
    public final Iterator e;
    public final Object f;

    public js5(l7a l7aVar) {
        this();
        this.d = (byte) 1;
        this.f = l7aVar;
        this.e = l7aVar.a.iterator();
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
        gre.p(z);
        int F = ug8.F(this.b);
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
                        if (((bg8) obj2).apply(next)) {
                            obj = next;
                            break;
                        }
                    }
                    this.b = 3;
                    break;
                default:
                    while (it.hasNext()) {
                        next = it.next();
                        if (((l7a) obj2).b.contains(next)) {
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
        w26.g();
        return null;
    }

    public js5(Iterator it, bg8 bg8Var) {
        this();
        this.d = (byte) 0;
        this.e = it;
        this.f = bg8Var;
    }

    public js5() {
        super((byte) 0);
        this.b = 2;
    }
}
