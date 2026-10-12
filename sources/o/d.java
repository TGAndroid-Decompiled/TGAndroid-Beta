package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16631a;
    public boolean f16632b = true;
    public final f f16633c;

    public d(f fVar) {
        this.f16633c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16631a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16631a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16632b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16632b) {
            if (this.f16633c.f16634a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16631a;
        if (cVar == null || cVar.f16630c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16632b) {
            this.f16632b = false;
            this.f16631a = this.f16633c.f16634a;
        } else {
            c cVar2 = this.f16631a;
            if (cVar2 != null) {
                cVar = cVar2.f16630c;
            } else {
                cVar = null;
            }
            this.f16631a = cVar;
        }
        return this.f16631a;
    }
}
