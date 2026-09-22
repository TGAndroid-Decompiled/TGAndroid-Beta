package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15480a;
    public boolean f15481b = true;
    public final f f15482c;

    public d(f fVar) {
        this.f15482c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15480a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15480a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15481b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15481b) {
            if (this.f15482c.f15483a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15480a;
        if (cVar == null || cVar.f15479c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15481b) {
            this.f15481b = false;
            this.f15480a = this.f15482c.f15483a;
        } else {
            c cVar2 = this.f15480a;
            if (cVar2 != null) {
                cVar = cVar2.f15479c;
            } else {
                cVar = null;
            }
            this.f15480a = cVar;
        }
        return this.f15480a;
    }
}
