package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17503a;
    public boolean f17504b = true;
    public final f f17505c;

    public d(f fVar) {
        this.f17505c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17503a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17503a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17504b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17504b) {
            if (this.f17505c.f17506a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17503a;
        if (cVar == null || cVar.f17502c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17504b) {
            this.f17504b = false;
            this.f17503a = this.f17505c.f17506a;
        } else {
            c cVar2 = this.f17503a;
            if (cVar2 != null) {
                cVar = cVar2.f17502c;
            } else {
                cVar = null;
            }
            this.f17503a = cVar;
        }
        return this.f17503a;
    }
}
