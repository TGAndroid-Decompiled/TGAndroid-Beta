package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16789a;
    public boolean f16790b = true;
    public final f f16791c;

    public d(f fVar) {
        this.f16791c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f16789a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16789a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f16790b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16790b) {
            if (this.f16791c.f16792a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16789a;
        if (cVar == null || cVar.f16788c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16790b) {
            this.f16790b = false;
            this.f16789a = this.f16791c.f16792a;
        } else {
            c cVar2 = this.f16789a;
            if (cVar2 != null) {
                cVar = cVar2.f16788c;
            } else {
                cVar = null;
            }
            this.f16789a = cVar;
        }
        return this.f16789a;
    }
}
