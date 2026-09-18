package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f15297a;
    public c f15298b;
    public final int f15299c;

    public b(c cVar, c cVar2, int i10) {
        this.f15299c = i10;
        this.f15297a = cVar2;
        this.f15298b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f15297a == cVar && cVar == this.f15298b) {
            this.f15298b = null;
            this.f15297a = null;
        }
        c cVar4 = this.f15297a;
        if (cVar4 == cVar) {
            switch (this.f15299c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f15302c;
                    break;
            }
            this.f15297a = cVar2;
        }
        c cVar5 = this.f15298b;
        if (cVar5 == cVar) {
            c cVar6 = this.f15297a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f15298b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f15299c) {
            case 0:
                return cVar.f15302c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15298b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f15298b;
        c cVar3 = this.f15297a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f15298b = cVar;
        return cVar2;
    }
}
