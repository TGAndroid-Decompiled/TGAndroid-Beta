package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f18980a;
    public boolean f18981b = true;
    public final f f18982c;

    public d(f fVar) {
        this.f18982c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f18980a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f18980a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18981b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18981b) {
            if (this.f18982c.f18983a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f18980a;
        if (cVar == null || cVar.f18979c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f18981b) {
            this.f18981b = false;
            this.f18980a = this.f18982c.f18983a;
        } else {
            c cVar2 = this.f18980a;
            if (cVar2 != null) {
                cVar = cVar2.f18979c;
            } else {
                cVar = null;
            }
            this.f18980a = cVar;
        }
        return this.f18980a;
    }
}
