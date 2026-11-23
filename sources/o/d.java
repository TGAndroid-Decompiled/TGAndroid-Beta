package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21580a;
    public boolean f21581b = true;
    public final f f21582c;

    public d(f fVar) {
        this.f21582c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21580a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21580a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21581b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21581b) {
            if (this.f21582c.f21583a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21580a;
        if (cVar == null || cVar.f21579c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21581b) {
            this.f21581b = false;
            this.f21580a = this.f21582c.f21583a;
        } else {
            c cVar2 = this.f21580a;
            if (cVar2 != null) {
                cVar = cVar2.f21579c;
            } else {
                cVar = null;
            }
            this.f21580a = cVar;
        }
        return this.f21580a;
    }
}
