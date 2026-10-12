package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16413a;
    public boolean f16414b = true;
    public final f f16415c;

    public d(f fVar) {
        this.f16415c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16413a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16413a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16414b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16414b) {
            if (this.f16415c.f16416a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16413a;
        if (cVar == null || cVar.f16412c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16414b) {
            this.f16414b = false;
            this.f16413a = this.f16415c.f16416a;
        } else {
            c cVar2 = this.f16413a;
            if (cVar2 != null) {
                cVar = cVar2.f16412c;
            } else {
                cVar = null;
            }
            this.f16413a = cVar;
        }
        return this.f16413a;
    }
}
