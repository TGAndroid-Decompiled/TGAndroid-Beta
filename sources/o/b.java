package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f20661a;
    public c f20662b;
    public final int f20663c;

    public b(c cVar, c cVar2, int i7) {
        this.f20663c = i7;
        this.f20661a = cVar2;
        this.f20662b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f20661a == cVar && cVar == this.f20662b) {
            this.f20662b = null;
            this.f20661a = null;
        }
        c cVar4 = this.f20661a;
        if (cVar4 == cVar) {
            switch (this.f20663c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f20666c;
                    break;
            }
            this.f20661a = cVar2;
        }
        c cVar5 = this.f20662b;
        if (cVar5 == cVar) {
            c cVar6 = this.f20661a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f20662b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f20663c) {
            case 0:
                return cVar.f20666c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20662b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f20662b;
        c cVar3 = this.f20661a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f20662b = cVar;
        return cVar2;
    }
}
