package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f13904a;
    public boolean f13905b = true;
    public final f f13906c;

    public d(f fVar) {
        this.f13906c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f13904a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f13904a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13905b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f13905b) {
            if (this.f13906c.f13907a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f13904a;
        if (cVar == null || cVar.f13903c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f13905b) {
            this.f13905b = false;
            this.f13904a = this.f13906c.f13907a;
        } else {
            c cVar2 = this.f13904a;
            if (cVar2 != null) {
                cVar = cVar2.f13903c;
            } else {
                cVar = null;
            }
            this.f13904a = cVar;
        }
        return this.f13904a;
    }
}
