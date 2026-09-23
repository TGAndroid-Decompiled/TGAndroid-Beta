package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15268a;
    public boolean f15269b = true;
    public final f f15270c;

    public d(f fVar) {
        this.f15270c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15268a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15268a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15269b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15269b) {
            if (this.f15270c.f15271a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15268a;
        if (cVar == null || cVar.f15267c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15269b) {
            this.f15269b = false;
            this.f15268a = this.f15270c.f15271a;
        } else {
            c cVar2 = this.f15268a;
            if (cVar2 != null) {
                cVar = cVar2.f15267c;
            } else {
                cVar = null;
            }
            this.f15268a = cVar;
        }
        return this.f15268a;
    }
}
