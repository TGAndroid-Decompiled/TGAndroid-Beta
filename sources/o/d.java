package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16878a;
    public boolean f16879b = true;
    public final f f16880c;

    public d(f fVar) {
        this.f16880c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16878a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16878a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16879b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16879b) {
            if (this.f16880c.f16881a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16878a;
        if (cVar == null || cVar.f16877c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16879b) {
            this.f16879b = false;
            this.f16878a = this.f16880c.f16881a;
        } else {
            c cVar2 = this.f16878a;
            if (cVar2 != null) {
                cVar = cVar2.f16877c;
            } else {
                cVar = null;
            }
            this.f16878a = cVar;
        }
        return this.f16878a;
    }
}
