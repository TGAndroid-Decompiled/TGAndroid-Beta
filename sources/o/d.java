package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17506a;
    public boolean f17507b = true;
    public final f f17508c;

    public d(f fVar) {
        this.f17508c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17506a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17506a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17507b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17507b) {
            if (this.f17508c.f17509a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17506a;
        if (cVar == null || cVar.f17505c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17507b) {
            this.f17507b = false;
            this.f17506a = this.f17508c.f17509a;
        } else {
            c cVar2 = this.f17506a;
            if (cVar2 != null) {
                cVar = cVar2.f17505c;
            } else {
                cVar = null;
            }
            this.f17506a = cVar;
        }
        return this.f17506a;
    }
}
