package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16930a;
    public boolean f16931b = true;
    public final f f16932c;

    public d(f fVar) {
        this.f16932c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16930a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16930a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16931b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16931b) {
            if (this.f16932c.f16933a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16930a;
        if (cVar == null || cVar.f16929c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16931b) {
            this.f16931b = false;
            this.f16930a = this.f16932c.f16933a;
        } else {
            c cVar2 = this.f16930a;
            if (cVar2 != null) {
                cVar = cVar2.f16929c;
            } else {
                cVar = null;
            }
            this.f16930a = cVar;
        }
        return this.f16930a;
    }
}
