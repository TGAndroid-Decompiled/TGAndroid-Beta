package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16630a;
    public boolean f16631b = true;
    public final f f16632c;

    public d(f fVar) {
        this.f16632c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16630a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16630a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16631b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16631b) {
            if (this.f16632c.f16633a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16630a;
        if (cVar == null || cVar.f16629c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16631b) {
            this.f16631b = false;
            this.f16630a = this.f16632c.f16633a;
        } else {
            c cVar2 = this.f16630a;
            if (cVar2 != null) {
                cVar = cVar2.f16629c;
            } else {
                cVar = null;
            }
            this.f16630a = cVar;
        }
        return this.f16630a;
    }
}
