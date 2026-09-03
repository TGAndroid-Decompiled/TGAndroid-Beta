package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16277a;
    public boolean f16278b = true;
    public final f f16279c;

    public d(f fVar) {
        this.f16279c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z4;
        c cVar2 = this.f16277a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16277a = cVar3;
            if (cVar3 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f16278b = z4;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16278b) {
            if (this.f16279c.f16280a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16277a;
        if (cVar == null || cVar.f16276c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16278b) {
            this.f16278b = false;
            this.f16277a = this.f16279c.f16280a;
        } else {
            c cVar2 = this.f16277a;
            if (cVar2 != null) {
                cVar = cVar2.f16276c;
            } else {
                cVar = null;
            }
            this.f16277a = cVar;
        }
        return this.f16277a;
    }
}
