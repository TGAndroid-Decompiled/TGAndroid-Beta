package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f13898a;
    public c f13899b;
    public final int f13900c;

    public b(c cVar, c cVar2, int i10) {
        this.f13900c = i10;
        this.f13898a = cVar2;
        this.f13899b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f13898a == cVar && cVar == this.f13899b) {
            this.f13899b = null;
            this.f13898a = null;
        }
        c cVar4 = this.f13898a;
        if (cVar4 == cVar) {
            switch (this.f13900c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f13903c;
                    break;
            }
            this.f13898a = cVar2;
        }
        c cVar5 = this.f13899b;
        if (cVar5 == cVar) {
            c cVar6 = this.f13898a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f13899b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f13900c) {
            case 0:
                return cVar.f13903c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f13899b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f13899b;
        c cVar3 = this.f13898a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f13899b = cVar;
        return cVar2;
    }
}
