package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f14078a;
    public boolean f14079b = true;
    public final f f14080c;

    public d(f fVar) {
        this.f14080c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f14078a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f14078a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14079b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f14079b) {
            if (this.f14080c.f14081a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f14078a;
        if (cVar == null || cVar.f14077c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f14079b) {
            this.f14079b = false;
            this.f14078a = this.f14080c.f14081a;
        } else {
            c cVar2 = this.f14078a;
            if (cVar2 != null) {
                cVar = cVar2.f14077c;
            } else {
                cVar = null;
            }
            this.f14078a = cVar;
        }
        return this.f14078a;
    }
}
