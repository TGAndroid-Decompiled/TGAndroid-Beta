package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f20469a;
    public boolean f20470b = true;
    public final f f20471c;

    public d(f fVar) {
        this.f20471c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f20469a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f20469a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20470b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20470b) {
            if (this.f20471c.f20472a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f20469a;
        if (cVar == null || cVar.f20468c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f20470b) {
            this.f20470b = false;
            this.f20469a = this.f20471c.f20472a;
        } else {
            c cVar2 = this.f20469a;
            if (cVar2 != null) {
                cVar = cVar2.f20468c;
            } else {
                cVar = null;
            }
            this.f20469a = cVar;
        }
        return this.f20469a;
    }
}
