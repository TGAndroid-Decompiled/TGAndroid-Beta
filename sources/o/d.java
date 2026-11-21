package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21577a;
    public boolean f21578b = true;
    public final f f21579c;

    public d(f fVar) {
        this.f21579c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21577a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21577a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21578b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21578b) {
            if (this.f21579c.f21580a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21577a;
        if (cVar == null || cVar.f21576c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21578b) {
            this.f21578b = false;
            this.f21577a = this.f21579c.f21580a;
        } else {
            c cVar2 = this.f21577a;
            if (cVar2 != null) {
                cVar = cVar2.f21576c;
            } else {
                cVar = null;
            }
            this.f21577a = cVar;
        }
        return this.f21577a;
    }
}
