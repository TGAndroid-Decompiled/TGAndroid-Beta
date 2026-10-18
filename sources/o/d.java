package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17507a;
    public boolean f17508b = true;
    public final f f17509c;

    public d(f fVar) {
        this.f17509c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17507a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17507a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17508b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17508b) {
            if (this.f17509c.f17510a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17507a;
        if (cVar == null || cVar.f17506c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17508b) {
            this.f17508b = false;
            this.f17507a = this.f17509c.f17510a;
        } else {
            c cVar2 = this.f17507a;
            if (cVar2 != null) {
                cVar = cVar2.f17506c;
            } else {
                cVar = null;
            }
            this.f17507a = cVar;
        }
        return this.f17507a;
    }
}
