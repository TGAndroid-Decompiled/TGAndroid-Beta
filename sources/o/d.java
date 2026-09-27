package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15512a;
    public boolean f15513b = true;
    public final f f15514c;

    public d(f fVar) {
        this.f15514c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15512a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15512a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15513b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15513b) {
            if (this.f15514c.f15515a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15512a;
        if (cVar == null || cVar.f15511c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15513b) {
            this.f15513b = false;
            this.f15512a = this.f15514c.f15515a;
        } else {
            c cVar2 = this.f15512a;
            if (cVar2 != null) {
                cVar = cVar2.f15511c;
            } else {
                cVar = null;
            }
            this.f15512a = cVar;
        }
        return this.f15512a;
    }
}
