package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f15470a;
    public c f15471b;
    public final int f15472c;

    public b(c cVar, c cVar2, int i10) {
        this.f15472c = i10;
        this.f15470a = cVar2;
        this.f15471b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f15470a == cVar && cVar == this.f15471b) {
            this.f15471b = null;
            this.f15470a = null;
        }
        c cVar4 = this.f15470a;
        if (cVar4 == cVar) {
            switch (this.f15472c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f15475c;
                    break;
            }
            this.f15470a = cVar2;
        }
        c cVar5 = this.f15471b;
        if (cVar5 == cVar) {
            c cVar6 = this.f15470a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f15471b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f15472c) {
            case 0:
                return cVar.f15475c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15471b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f15471b;
        c cVar3 = this.f15470a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f15471b = cVar;
        return cVar2;
    }
}
