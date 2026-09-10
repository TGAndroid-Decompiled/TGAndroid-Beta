package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f14072a;
    public c f14073b;
    public final int f14074c;

    public b(c cVar, c cVar2, int i10) {
        this.f14074c = i10;
        this.f14072a = cVar2;
        this.f14073b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f14072a == cVar && cVar == this.f14073b) {
            this.f14073b = null;
            this.f14072a = null;
        }
        c cVar4 = this.f14072a;
        if (cVar4 == cVar) {
            switch (this.f14074c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f14077c;
                    break;
            }
            this.f14072a = cVar2;
        }
        c cVar5 = this.f14073b;
        if (cVar5 == cVar) {
            c cVar6 = this.f14072a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f14073b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f14074c) {
            case 0:
                return cVar.f14077c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f14073b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f14073b;
        c cVar3 = this.f14072a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f14073b = cVar;
        return cVar2;
    }
}
