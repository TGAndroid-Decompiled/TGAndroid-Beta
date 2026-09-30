package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15476a;
    public boolean f15477b = true;
    public final f f15478c;

    public d(f fVar) {
        this.f15478c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15476a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15476a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15477b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15477b) {
            if (this.f15478c.f15479a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15476a;
        if (cVar == null || cVar.f15475c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15477b) {
            this.f15477b = false;
            this.f15476a = this.f15478c.f15479a;
        } else {
            c cVar2 = this.f15476a;
            if (cVar2 != null) {
                cVar = cVar2.f15475c;
            } else {
                cVar = null;
            }
            this.f15476a = cVar;
        }
        return this.f15476a;
    }
}
