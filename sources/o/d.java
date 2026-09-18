package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15432a;
    public boolean f15433b = true;
    public final f f15434c;

    public d(f fVar) {
        this.f15434c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15432a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15432a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15433b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15433b) {
            if (this.f15434c.f15435a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15432a;
        if (cVar == null || cVar.f15431c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15433b) {
            this.f15433b = false;
            this.f15432a = this.f15434c.f15435a;
        } else {
            c cVar2 = this.f15432a;
            if (cVar2 != null) {
                cVar = cVar2.f15431c;
            } else {
                cVar = null;
            }
            this.f15432a = cVar;
        }
        return this.f15432a;
    }
}
