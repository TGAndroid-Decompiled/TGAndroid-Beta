package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16275a;
    public boolean f16276b = true;
    public final f f16277c;

    public d(f fVar) {
        this.f16277c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z4;
        c cVar2 = this.f16275a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16275a = cVar3;
            if (cVar3 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f16276b = z4;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16276b) {
            if (this.f16277c.f16278a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16275a;
        if (cVar == null || cVar.f16274c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16276b) {
            this.f16276b = false;
            this.f16275a = this.f16277c.f16278a;
        } else {
            c cVar2 = this.f16275a;
            if (cVar2 != null) {
                cVar = cVar2.f16274c;
            } else {
                cVar = null;
            }
            this.f16275a = cVar;
        }
        return this.f16275a;
    }
}
