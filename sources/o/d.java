package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f18915a;
    public boolean f18916b = true;
    public final f f18917c;

    public d(f fVar) {
        this.f18917c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f18915a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f18915a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18916b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18916b) {
            if (this.f18917c.f18918a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f18915a;
        if (cVar == null || cVar.f18914c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f18916b) {
            this.f18916b = false;
            this.f18915a = this.f18917c.f18918a;
        } else {
            c cVar2 = this.f18915a;
            if (cVar2 != null) {
                cVar = cVar2.f18914c;
            } else {
                cVar = null;
            }
            this.f18915a = cVar;
        }
        return this.f18915a;
    }
}
