package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15467a;
    public boolean f15468b = true;
    public final f f15469c;

    public d(f fVar) {
        this.f15469c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15467a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15467a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15468b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15468b) {
            if (this.f15469c.f15470a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15467a;
        if (cVar == null || cVar.f15466c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15468b) {
            this.f15468b = false;
            this.f15467a = this.f15469c.f15470a;
        } else {
            c cVar2 = this.f15467a;
            if (cVar2 != null) {
                cVar = cVar2.f15466c;
            } else {
                cVar = null;
            }
            this.f15467a = cVar;
        }
        return this.f15467a;
    }
}
