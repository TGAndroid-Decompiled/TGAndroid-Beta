package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class xla implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final vla d;

    public xla(vla vlaVar) {
        this.d = vlaVar;
    }

    public final Iterator a() {
        Iterator it = this.c;
        if (it == null) {
            Iterator it2 = this.d.b.entrySet().iterator();
            this.c = it2;
            return it2;
        }
        return it;
    }

    @Override
    public final boolean hasNext() {
        int i = this.a + 1;
        vla vlaVar = this.d;
        if (i < vlaVar.a.size() || (!vlaVar.b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        vla vlaVar = this.d;
        if (i < vlaVar.a.size()) {
            return (Map.Entry) vlaVar.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override
    public final void remove() {
        if (this.b) {
            this.b = false;
            int i = vla.f;
            vla vlaVar = this.d;
            vlaVar.c();
            if (this.a < vlaVar.a.size()) {
                int i2 = this.a;
                this.a = i2 - 1;
                vlaVar.i(i2);
                return;
            }
            a().remove();
            return;
        }
        dq9.m("remove() was called before next()");
    }
}
