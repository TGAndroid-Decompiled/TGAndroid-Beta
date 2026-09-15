package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15293a;
    public boolean f15294b = true;
    public final f f15295c;

    public d(f fVar) {
        this.f15295c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15293a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15293a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15294b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15294b) {
            if (this.f15295c.f15296a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15293a;
        if (cVar == null || cVar.f15292c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15294b) {
            this.f15294b = false;
            this.f15293a = this.f15295c.f15296a;
        } else {
            c cVar2 = this.f15293a;
            if (cVar2 != null) {
                cVar = cVar2.f15292c;
            } else {
                cVar = null;
            }
            this.f15293a = cVar;
        }
        return this.f15293a;
    }
}
