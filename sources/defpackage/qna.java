package defpackage;

import java.util.Iterator;
import java.util.Map;
public final class qna implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final ona d;

    public qna(ona onaVar) {
        this.d = onaVar;
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
        ona onaVar = this.d;
        if (i < onaVar.a.size() || (!onaVar.b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        ona onaVar = this.d;
        if (i < onaVar.a.size()) {
            return (Map.Entry) onaVar.a.get(this.a);
        }
        return (Map.Entry) a().next();
    }

    @Override
    public final void remove() {
        if (this.b) {
            this.b = false;
            int i = ona.f;
            ona onaVar = this.d;
            onaVar.c();
            if (this.a < onaVar.a.size()) {
                int i2 = this.a;
                this.a = i2 - 1;
                onaVar.i(i2);
                return;
            }
            a().remove();
            return;
        }
        grb.i("remove() was called before next()");
    }
}
