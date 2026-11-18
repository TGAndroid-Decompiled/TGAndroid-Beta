package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21555a;
    public boolean f21556b = true;
    public final f f21557c;

    public d(f fVar) {
        this.f21557c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21555a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21555a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21556b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21556b) {
            if (this.f21557c.f21558a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21555a;
        if (cVar == null || cVar.f21554c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21556b) {
            this.f21556b = false;
            this.f21555a = this.f21557c.f21558a;
        } else {
            c cVar2 = this.f21555a;
            if (cVar2 != null) {
                cVar = cVar2.f21554c;
            } else {
                cVar = null;
            }
            this.f21555a = cVar;
        }
        return this.f21555a;
    }
}
