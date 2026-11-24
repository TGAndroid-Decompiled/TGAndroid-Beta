package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class wja implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final uja d;

    public wja(uja ujaVar) {
        this.d = ujaVar;
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
        uja ujaVar = this.d;
        if (i < ujaVar.a.size() || (!ujaVar.b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        uja ujaVar = this.d;
        if (i < ujaVar.a.size()) {
            return (Map.Entry) ujaVar.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override
    public final void remove() {
        if (this.b) {
            this.b = false;
            int i = uja.f;
            uja ujaVar = this.d;
            ujaVar.c();
            if (this.a < ujaVar.a.size()) {
                int i2 = this.a;
                this.a = i2 - 1;
                ujaVar.i(i2);
                return;
            }
            a().remove();
            return;
        }
        sc8.j("remove() was called before next()");
    }
}
