package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16925a;
    public boolean f16926b = true;
    public final f f16927c;

    public d(f fVar) {
        this.f16927c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16925a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16925a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16926b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16926b) {
            if (this.f16927c.f16928a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16925a;
        if (cVar == null || cVar.f16924c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16926b) {
            this.f16926b = false;
            this.f16925a = this.f16927c.f16928a;
        } else {
            c cVar2 = this.f16925a;
            if (cVar2 != null) {
                cVar = cVar2.f16924c;
            } else {
                cVar = null;
            }
            this.f16925a = cVar;
        }
        return this.f16925a;
    }
}
