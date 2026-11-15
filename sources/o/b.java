package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f21182a;
    public c f21183b;
    public final int f21184c;

    public b(c cVar, c cVar2, int i7) {
        this.f21184c = i7;
        this.f21182a = cVar2;
        this.f21183b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f21182a == cVar && cVar == this.f21183b) {
            this.f21183b = null;
            this.f21182a = null;
        }
        c cVar4 = this.f21182a;
        if (cVar4 == cVar) {
            switch (this.f21184c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f21187c;
                    break;
            }
            this.f21182a = cVar2;
        }
        c cVar5 = this.f21183b;
        if (cVar5 == cVar) {
            c cVar6 = this.f21182a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f21183b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f21184c) {
            case 0:
                return cVar.f21187c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21183b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f21183b;
        c cVar3 = this.f21182a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f21183b = cVar;
        return cVar2;
    }
}
