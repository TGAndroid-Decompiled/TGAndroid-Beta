package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16882a;
    public boolean f16883b = true;
    public final f f16884c;

    public d(f fVar) {
        this.f16884c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16882a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16882a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16883b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16883b) {
            if (this.f16884c.f16885a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16882a;
        if (cVar == null || cVar.f16881c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16883b) {
            this.f16883b = false;
            this.f16882a = this.f16884c.f16885a;
        } else {
            c cVar2 = this.f16882a;
            if (cVar2 != null) {
                cVar = cVar2.f16881c;
            } else {
                cVar = null;
            }
            this.f16882a = cVar;
        }
        return this.f16882a;
    }
}
