package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16762a;
    public boolean f16763b = true;
    public final f f16764c;

    public d(f fVar) {
        this.f16764c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16762a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16762a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16763b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16763b) {
            if (this.f16764c.f16765a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16762a;
        if (cVar == null || cVar.f16761c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16763b) {
            this.f16763b = false;
            this.f16762a = this.f16764c.f16765a;
        } else {
            c cVar2 = this.f16762a;
            if (cVar2 != null) {
                cVar = cVar2.f16761c;
            } else {
                cVar = null;
            }
            this.f16762a = cVar;
        }
        return this.f16762a;
    }
}
