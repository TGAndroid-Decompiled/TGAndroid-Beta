package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16964a;
    public boolean f16965b = true;
    public final f f16966c;

    public d(f fVar) {
        this.f16966c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16964a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16964a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16965b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16965b) {
            if (this.f16966c.f16967a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16964a;
        if (cVar == null || cVar.f16963c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16965b) {
            this.f16965b = false;
            this.f16964a = this.f16966c.f16967a;
        } else {
            c cVar2 = this.f16964a;
            if (cVar2 != null) {
                cVar = cVar2.f16963c;
            } else {
                cVar = null;
            }
            this.f16964a = cVar;
        }
        return this.f16964a;
    }
}
