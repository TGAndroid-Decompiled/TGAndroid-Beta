package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f20667a;
    public boolean f20668b = true;
    public final f f20669c;

    public d(f fVar) {
        this.f20669c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z9;
        c cVar2 = this.f20667a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f20667a = cVar3;
            if (cVar3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f20668b = z9;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20668b) {
            if (this.f20669c.f20670a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f20667a;
        if (cVar == null || cVar.f20666c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f20668b) {
            this.f20668b = false;
            this.f20667a = this.f20669c.f20670a;
        } else {
            c cVar2 = this.f20667a;
            if (cVar2 != null) {
                cVar = cVar2.f20666c;
            } else {
                cVar = null;
            }
            this.f20667a = cVar;
        }
        return this.f20667a;
    }
}
