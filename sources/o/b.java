package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f16922a;
    public c f16923b;
    public final int f16924c;

    public b(c cVar, c cVar2, int i10) {
        this.f16924c = i10;
        this.f16922a = cVar2;
        this.f16923b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f16922a == cVar && cVar == this.f16923b) {
            this.f16923b = null;
            this.f16922a = null;
        }
        c cVar4 = this.f16922a;
        if (cVar4 == cVar) {
            switch (this.f16924c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f16927c;
                    break;
            }
            this.f16922a = cVar2;
        }
        c cVar5 = this.f16923b;
        if (cVar5 == cVar) {
            c cVar6 = this.f16922a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f16923b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f16924c) {
            case 0:
                return cVar.f16927c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16923b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f16923b;
        c cVar3 = this.f16922a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f16923b = cVar;
        return cVar2;
    }
}
