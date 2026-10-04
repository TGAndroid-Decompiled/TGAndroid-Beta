package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16920a;
    public boolean f16921b = true;
    public final f f16922c;

    public d(f fVar) {
        this.f16922c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16920a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16920a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16921b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16921b) {
            if (this.f16922c.f16923a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16920a;
        if (cVar == null || cVar.f16919c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16921b) {
            this.f16921b = false;
            this.f16920a = this.f16922c.f16923a;
        } else {
            c cVar2 = this.f16920a;
            if (cVar2 != null) {
                cVar = cVar2.f16919c;
            } else {
                cVar = null;
            }
            this.f16920a = cVar;
        }
        return this.f16920a;
    }
}
