package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21552a;
    public boolean f21553b = true;
    public final f f21554c;

    public d(f fVar) {
        this.f21554c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21552a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21552a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21553b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21553b) {
            if (this.f21554c.f21555a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21552a;
        if (cVar == null || cVar.f21551c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21553b) {
            this.f21553b = false;
            this.f21552a = this.f21554c.f21555a;
        } else {
            c cVar2 = this.f21552a;
            if (cVar2 != null) {
                cVar = cVar2.f21551c;
            } else {
                cVar = null;
            }
            this.f21552a = cVar;
        }
        return this.f21552a;
    }
}
