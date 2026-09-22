package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15291a;
    public boolean f15292b = true;
    public final f f15293c;

    public d(f fVar) {
        this.f15293c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15291a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15291a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15292b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15292b) {
            if (this.f15293c.f15294a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15291a;
        if (cVar == null || cVar.f15290c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15292b) {
            this.f15292b = false;
            this.f15291a = this.f15293c.f15294a;
        } else {
            c cVar2 = this.f15291a;
            if (cVar2 != null) {
                cVar = cVar2.f15290c;
            } else {
                cVar = null;
            }
            this.f15291a = cVar;
        }
        return this.f15291a;
    }
}
