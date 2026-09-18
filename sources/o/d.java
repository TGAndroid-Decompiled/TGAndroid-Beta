package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15303a;
    public boolean f15304b = true;
    public final f f15305c;

    public d(f fVar) {
        this.f15305c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15303a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15303a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15304b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15304b) {
            if (this.f15305c.f15306a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15303a;
        if (cVar == null || cVar.f15302c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15304b) {
            this.f15304b = false;
            this.f15303a = this.f15305c.f15306a;
        } else {
            c cVar2 = this.f15303a;
            if (cVar2 != null) {
                cVar = cVar2.f15302c;
            } else {
                cVar = null;
            }
            this.f15303a = cVar;
        }
        return this.f15303a;
    }
}
