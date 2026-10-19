package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17504a;
    public boolean f17505b = true;
    public final f f17506c;

    public d(f fVar) {
        this.f17506c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17504a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17504a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17505b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17505b) {
            if (this.f17506c.f17507a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17504a;
        if (cVar == null || cVar.f17503c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17505b) {
            this.f17505b = false;
            this.f17504a = this.f17506c.f17507a;
        } else {
            c cVar2 = this.f17504a;
            if (cVar2 != null) {
                cVar = cVar2.f17503c;
            } else {
                cVar = null;
            }
            this.f17504a = cVar;
        }
        return this.f17504a;
    }
}
