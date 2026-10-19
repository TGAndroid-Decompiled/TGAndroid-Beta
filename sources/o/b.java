package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f17500a;
    public c f17501b;
    public final int f17502c;

    public b(c cVar, c cVar2, int i10) {
        this.f17502c = i10;
        this.f17500a = cVar2;
        this.f17501b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f17500a == cVar && cVar == this.f17501b) {
            this.f17501b = null;
            this.f17500a = null;
        }
        c cVar4 = this.f17500a;
        if (cVar4 == cVar) {
            switch (this.f17502c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f17505c;
                    break;
            }
            this.f17500a = cVar2;
        }
        c cVar5 = this.f17501b;
        if (cVar5 == cVar) {
            c cVar6 = this.f17500a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f17501b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f17502c) {
            case 0:
                return cVar.f17505c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17501b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f17501b;
        c cVar3 = this.f17500a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f17501b = cVar;
        return cVar2;
    }
}
