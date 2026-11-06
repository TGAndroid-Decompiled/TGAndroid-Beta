package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f20664a;
    public boolean f20665b = true;
    public final f f20666c;

    public d(f fVar) {
        this.f20666c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z9;
        c cVar2 = this.f20664a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f20664a = cVar3;
            if (cVar3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f20665b = z9;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20665b) {
            if (this.f20666c.f20667a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f20664a;
        if (cVar == null || cVar.f20663c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f20665b) {
            this.f20665b = false;
            this.f20664a = this.f20666c.f20667a;
        } else {
            c cVar2 = this.f20664a;
            if (cVar2 != null) {
                cVar = cVar2.f20663c;
            } else {
                cVar = null;
            }
            this.f20664a = cVar;
        }
        return this.f20664a;
    }
}
