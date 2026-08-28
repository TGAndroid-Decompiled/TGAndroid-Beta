package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f18739a;
    public boolean f18740b = true;
    public final f f18741c;

    public d(f fVar) {
        this.f18741c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f18739a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f18739a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18740b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18740b) {
            if (this.f18741c.f18742a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f18739a;
        if (cVar == null || cVar.f18738c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f18740b) {
            this.f18740b = false;
            this.f18739a = this.f18741c.f18742a;
        } else {
            c cVar2 = this.f18739a;
            if (cVar2 != null) {
                cVar = cVar2.f18738c;
            } else {
                cVar = null;
            }
            this.f18739a = cVar;
        }
        return this.f18739a;
    }
}
