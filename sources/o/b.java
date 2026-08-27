package o;

import java.util.Iterator;

public final class b extends e implements Iterator {

    public c f19075a;

    public c f19076b;

    public final int f19077c;

    public b(c cVar, c cVar2, int i10) {
        this.f19077c = i10;
        this.f19075a = cVar2;
        this.f19076b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f19075a == cVar && cVar == this.f19076b) {
            this.f19076b = null;
            this.f19075a = null;
        }
        c cVar3 = this.f19075a;
        if (cVar3 == cVar) {
            switch (this.f19077c) {
                case 0:
                    cVar2 = cVar3.d;
                    break;
                default:
                    cVar2 = cVar3.f19080c;
                    break;
            }
            this.f19075a = cVar2;
        }
        c cVar4 = this.f19076b;
        if (cVar4 == cVar) {
            c cVar5 = this.f19075a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f19076b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f19077c) {
            case 0:
                return cVar.f19080c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.f19076b != null;
    }

    @Override
    public final Object next() {
        c cVar = this.f19076b;
        c cVar2 = this.f19075a;
        this.f19076b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
