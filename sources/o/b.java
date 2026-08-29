package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f18974a;
    public c f18975b;
    public final int f18976c;

    public b(c cVar, c cVar2, int i10) {
        this.f18976c = i10;
        this.f18974a = cVar2;
        this.f18975b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f18974a == cVar && cVar == this.f18975b) {
            this.f18975b = null;
            this.f18974a = null;
        }
        c cVar4 = this.f18974a;
        if (cVar4 == cVar) {
            switch (this.f18976c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f18979c;
                    break;
            }
            this.f18974a = cVar2;
        }
        c cVar5 = this.f18975b;
        if (cVar5 == cVar) {
            c cVar6 = this.f18974a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f18975b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f18976c) {
            case 0:
                return cVar.f18979c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18975b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f18975b;
        c cVar3 = this.f18974a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f18975b = cVar;
        return cVar2;
    }
}
