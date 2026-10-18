package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f17497a;
    public c f17498b;
    public final int f17499c;

    public b(c cVar, c cVar2, int i10) {
        this.f17499c = i10;
        this.f17497a = cVar2;
        this.f17498b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f17497a == cVar && cVar == this.f17498b) {
            this.f17498b = null;
            this.f17497a = null;
        }
        c cVar4 = this.f17497a;
        if (cVar4 == cVar) {
            switch (this.f17499c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f17502c;
                    break;
            }
            this.f17497a = cVar2;
        }
        c cVar5 = this.f17498b;
        if (cVar5 == cVar) {
            c cVar6 = this.f17497a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f17498b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f17499c) {
            case 0:
                return cVar.f17502c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17498b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f17498b;
        c cVar3 = this.f17497a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f17498b = cVar;
        return cVar2;
    }
}
