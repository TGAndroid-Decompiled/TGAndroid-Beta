package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f20463a;
    public c f20464b;
    public final int f20465c;

    public b(c cVar, c cVar2, int i3) {
        this.f20465c = i3;
        this.f20463a = cVar2;
        this.f20464b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f20463a == cVar && cVar == this.f20464b) {
            this.f20464b = null;
            this.f20463a = null;
        }
        c cVar4 = this.f20463a;
        if (cVar4 == cVar) {
            switch (this.f20465c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f20468c;
                    break;
            }
            this.f20463a = cVar2;
        }
        c cVar5 = this.f20464b;
        if (cVar5 == cVar) {
            c cVar6 = this.f20463a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f20464b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f20465c) {
            case 0:
                return cVar.f20468c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20464b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f20464b;
        c cVar3 = this.f20463a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f20464b = cVar;
        return cVar2;
    }
}
