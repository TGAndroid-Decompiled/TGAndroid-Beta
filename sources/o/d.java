package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15475a;
    public boolean f15476b = true;
    public final f f15477c;

    public d(f fVar) {
        this.f15477c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15475a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15475a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15476b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15476b) {
            if (this.f15477c.f15478a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15475a;
        if (cVar == null || cVar.f15474c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15476b) {
            this.f15476b = false;
            this.f15475a = this.f15477c.f15478a;
        } else {
            c cVar2 = this.f15475a;
            if (cVar2 != null) {
                cVar = cVar2.f15474c;
            } else {
                cVar = null;
            }
            this.f15475a = cVar;
        }
        return this.f15475a;
    }
}
