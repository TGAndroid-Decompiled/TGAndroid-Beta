package o;

import java.util.Iterator;
public final class b extends e implements Iterator {
    public c f16100a;
    public c f16101b;
    public final int f16102c;

    public b(c cVar, c cVar2, int i10) {
        this.f16102c = i10;
        this.f16100a = cVar2;
        this.f16101b = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f16100a == cVar && cVar == this.f16101b) {
            this.f16101b = null;
            this.f16100a = null;
        }
        c cVar4 = this.f16100a;
        if (cVar4 == cVar) {
            switch (this.f16102c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f16105c;
                    break;
            }
            this.f16100a = cVar2;
        }
        c cVar5 = this.f16101b;
        if (cVar5 == cVar) {
            c cVar6 = this.f16100a;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f16101b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f16102c) {
            case 0:
                return cVar.f16105c;
            default:
                return cVar.d;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16101b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Object next() {
        c cVar;
        c cVar2 = this.f16101b;
        c cVar3 = this.f16100a;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = b(cVar2);
        } else {
            cVar = null;
        }
        this.f16101b = cVar;
        return cVar2;
    }
}
