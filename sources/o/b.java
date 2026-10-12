package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f16407a;
    public c f16408b;
    public final int f16409c;

    public b(c cVar, c cVar2, int i10) {
        this.f16409c = i10;
        this.f16407a = cVar2;
        this.f16408b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f16407a == cVar && cVar == this.f16408b) {
            this.f16408b = null;
            this.f16407a = null;
        }
        c cVar4 = this.f16407a;
        if (cVar4 == cVar) {
            switch (this.f16409c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f16412c;
                    break;
            }
            this.f16407a = cVar2;
        }
        c cVar5 = this.f16408b;
        if (cVar5 == cVar) {
            c cVar6 = this.f16407a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f16408b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f16409c) {
            case 0:
                return cVar.f16412c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16408b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f16408b;
        c cVar3 = this.f16407a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f16408b = cVar;
        return cVar2;
    }
}
