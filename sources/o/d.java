package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16122a;
    public boolean f16123b = true;
    public final f f16124c;

    public d(f fVar) {
        this.f16124c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z4;
        c cVar2 = this.f16122a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16122a = cVar3;
            if (cVar3 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f16123b = z4;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16123b) {
            if (this.f16124c.f16125a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16122a;
        if (cVar == null || cVar.f16121c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16123b) {
            this.f16123b = false;
            this.f16122a = this.f16124c.f16125a;
        } else {
            c cVar2 = this.f16122a;
            if (cVar2 != null) {
                cVar = cVar2.f16121c;
            } else {
                cVar = null;
            }
            this.f16122a = cVar;
        }
        return this.f16122a;
    }
}
