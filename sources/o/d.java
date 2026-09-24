package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15460a;
    public boolean f15461b = true;
    public final f f15462c;

    public d(f fVar) {
        this.f15462c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15460a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15460a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15461b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15461b) {
            if (this.f15462c.f15463a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15460a;
        if (cVar == null || cVar.f15459c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15461b) {
            this.f15461b = false;
            this.f15460a = this.f15462c.f15463a;
        } else {
            c cVar2 = this.f15460a;
            if (cVar2 != null) {
                cVar = cVar2.f15459c;
            } else {
                cVar = null;
            }
            this.f15460a = cVar;
        }
        return this.f15460a;
    }
}
