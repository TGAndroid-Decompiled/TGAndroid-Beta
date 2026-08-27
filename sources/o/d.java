package o;

import java.util.Iterator;

public final class d extends e implements Iterator {

    public c f19081a;

    public boolean f19082b = true;

    public final f f19083c;

    public d(f fVar) {
        this.f19083c = fVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2 = this.f19081a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f19081a = cVar3;
            this.f19082b = cVar3 == null;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f19082b) {
            return this.f19083c.f19084a != null;
        }
        c cVar = this.f19081a;
        return (cVar == null || cVar.f19080c == null) ? false : true;
    }

    @Override
    public final Object next() {
        if (this.f19082b) {
            this.f19082b = false;
            this.f19081a = this.f19083c.f19084a;
        } else {
            c cVar = this.f19081a;
            this.f19081a = cVar != null ? cVar.f19080c : null;
        }
        return this.f19081a;
    }
}
