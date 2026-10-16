package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16106a;
    public boolean f16107b = true;
    public final f f16108c;

    public d(f fVar) {
        this.f16108c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16106a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16106a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16107b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16107b) {
            if (this.f16108c.f16109a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16106a;
        if (cVar == null || cVar.f16105c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16107b) {
            this.f16107b = false;
            this.f16106a = this.f16108c.f16109a;
        } else {
            c cVar2 = this.f16106a;
            if (cVar2 != null) {
                cVar = cVar2.f16105c;
            } else {
                cVar = null;
            }
            this.f16106a = cVar;
        }
        return this.f16106a;
    }
}
