package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16921a;
    public boolean f16922b = true;
    public final f f16923c;

    public d(f fVar) {
        this.f16923c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16921a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16921a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16922b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16922b) {
            if (this.f16923c.f16924a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16921a;
        if (cVar == null || cVar.f16920c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16922b) {
            this.f16922b = false;
            this.f16921a = this.f16923c.f16924a;
        } else {
            c cVar2 = this.f16921a;
            if (cVar2 != null) {
                cVar = cVar2.f16920c;
            } else {
                cVar = null;
            }
            this.f16921a = cVar;
        }
        return this.f16921a;
    }
}
