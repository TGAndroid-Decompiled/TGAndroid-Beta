package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21188a;
    public boolean f21189b = true;
    public final f f21190c;

    public d(f fVar) {
        this.f21190c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21188a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21188a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21189b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21189b) {
            if (this.f21190c.f21191a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21188a;
        if (cVar == null || cVar.f21187c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21189b) {
            this.f21189b = false;
            this.f21188a = this.f21190c.f21191a;
        } else {
            c cVar2 = this.f21188a;
            if (cVar2 != null) {
                cVar = cVar2.f21187c;
            } else {
                cVar = null;
            }
            this.f21188a = cVar;
        }
        return this.f21188a;
    }
}
