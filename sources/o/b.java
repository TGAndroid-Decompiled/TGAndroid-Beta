package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f18908a;
    public c f18909b;
    public final int f18910c;

    public b(c cVar, c cVar2, int i10) {
        this.f18910c = i10;
        this.f18908a = cVar2;
        this.f18909b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f18908a == cVar && cVar == this.f18909b) {
            this.f18909b = null;
            this.f18908a = null;
        }
        c cVar4 = this.f18908a;
        if (cVar4 == cVar) {
            switch (this.f18910c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f18913c;
                    break;
            }
            this.f18908a = cVar2;
        }
        c cVar5 = this.f18909b;
        if (cVar5 == cVar) {
            c cVar6 = this.f18908a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f18909b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f18910c) {
            case 0:
                return cVar.f18913c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18909b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f18909b;
        c cVar3 = this.f18908a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f18909b = cVar;
        return cVar2;
    }
}
