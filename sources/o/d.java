package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17500a;
    public boolean f17501b = true;
    public final f f17502c;

    public d(f fVar) {
        this.f17502c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17500a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17500a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17501b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17501b) {
            if (this.f17502c.f17503a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17500a;
        if (cVar == null || cVar.f17499c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17501b) {
            this.f17501b = false;
            this.f17500a = this.f17502c.f17503a;
        } else {
            c cVar2 = this.f17500a;
            if (cVar2 != null) {
                cVar = cVar2.f17499c;
            } else {
                cVar = null;
            }
            this.f17500a = cVar;
        }
        return this.f17500a;
    }
}
