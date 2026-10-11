package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16928a;
    public boolean f16929b = true;
    public final f f16930c;

    public d(f fVar) {
        this.f16930c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16928a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16928a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16929b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16929b) {
            if (this.f16930c.f16931a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16928a;
        if (cVar == null || cVar.f16927c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16929b) {
            this.f16929b = false;
            this.f16928a = this.f16930c.f16931a;
        } else {
            c cVar2 = this.f16928a;
            if (cVar2 != null) {
                cVar = cVar2.f16927c;
            } else {
                cVar = null;
            }
            this.f16928a = cVar;
        }
        return this.f16928a;
    }
}
