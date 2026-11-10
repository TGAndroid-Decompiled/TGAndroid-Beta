package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f20666a;
    public c f20667b;
    public final int f20668c;

    public b(c cVar, c cVar2, int i7) {
        this.f20668c = i7;
        this.f20666a = cVar2;
        this.f20667b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f20666a == cVar && cVar == this.f20667b) {
            this.f20667b = null;
            this.f20666a = null;
        }
        c cVar4 = this.f20666a;
        if (cVar4 == cVar) {
            switch (this.f20668c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f20671c;
                    break;
            }
            this.f20666a = cVar2;
        }
        c cVar5 = this.f20667b;
        if (cVar5 == cVar) {
            c cVar6 = this.f20666a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f20667b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f20668c) {
            case 0:
                return cVar.f20671c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20667b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f20667b;
        c cVar3 = this.f20666a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f20667b = cVar;
        return cVar2;
    }
}
