package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f13903a;
    public boolean f13904b = true;
    public final f f13905c;

    public d(f fVar) {
        this.f13905c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f13903a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f13903a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13904b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f13904b) {
            if (this.f13905c.f13906a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f13903a;
        if (cVar == null || cVar.f13902c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f13904b) {
            this.f13904b = false;
            this.f13903a = this.f13905c.f13906a;
        } else {
            c cVar2 = this.f13903a;
            if (cVar2 != null) {
                cVar = cVar2.f13902c;
            } else {
                cVar = null;
            }
            this.f13903a = cVar;
        }
        return this.f13903a;
    }
}
