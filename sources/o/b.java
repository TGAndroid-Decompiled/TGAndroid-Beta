package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f18733a;
    public c f18734b;
    public final int f18735c;

    public b(c cVar, c cVar2, int i9) {
        this.f18735c = i9;
        this.f18733a = cVar2;
        this.f18734b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f18733a == cVar && cVar == this.f18734b) {
            this.f18734b = null;
            this.f18733a = null;
        }
        c cVar4 = this.f18733a;
        if (cVar4 == cVar) {
            switch (this.f18735c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f18738c;
                    break;
            }
            this.f18733a = cVar2;
        }
        c cVar5 = this.f18734b;
        if (cVar5 == cVar) {
            c cVar6 = this.f18733a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f18734b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f18735c) {
            case 0:
                return cVar.f18738c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f18734b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f18734b;
        c cVar3 = this.f18733a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f18734b = cVar;
        return cVar2;
    }
}
