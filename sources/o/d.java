package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21645a;
    public boolean f21646b = true;
    public final f f21647c;

    public d(f fVar) {
        this.f21647c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21645a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21645a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21646b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21646b) {
            if (this.f21647c.f21648a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21645a;
        if (cVar == null || cVar.f21644c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21646b) {
            this.f21646b = false;
            this.f21645a = this.f21647c.f21648a;
        } else {
            c cVar2 = this.f21645a;
            if (cVar2 != null) {
                cVar = cVar2.f21644c;
            } else {
                cVar = null;
            }
            this.f21645a = cVar;
        }
        return this.f21645a;
    }
}
