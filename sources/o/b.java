package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f13897a;
    public c f13898b;
    public final int f13899c;

    public b(c cVar, c cVar2, int i10) {
        this.f13899c = i10;
        this.f13897a = cVar2;
        this.f13898b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f13897a == cVar && cVar == this.f13898b) {
            this.f13898b = null;
            this.f13897a = null;
        }
        c cVar4 = this.f13897a;
        if (cVar4 == cVar) {
            switch (this.f13899c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f13902c;
                    break;
            }
            this.f13897a = cVar2;
        }
        c cVar5 = this.f13898b;
        if (cVar5 == cVar) {
            c cVar6 = this.f13897a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f13898b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f13899c) {
            case 0:
                return cVar.f13902c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f13898b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f13898b;
        c cVar3 = this.f13897a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f13898b = cVar;
        return cVar2;
    }
}
