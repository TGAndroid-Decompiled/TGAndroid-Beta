package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f16142a;
    public boolean f16143b = true;
    public final f f16144c;

    public d(f fVar) {
        this.f16144c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z4;
        c cVar2 = this.f16142a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f16142a = cVar3;
            if (cVar3 == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f16143b = z4;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f16143b) {
            if (this.f16144c.f16145a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f16142a;
        if (cVar == null || cVar.f16141c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f16143b) {
            this.f16143b = false;
            this.f16142a = this.f16144c.f16145a;
        } else {
            c cVar2 = this.f16142a;
            if (cVar2 != null) {
                cVar = cVar2.f16141c;
            } else {
                cVar = null;
            }
            this.f16142a = cVar;
        }
        return this.f16142a;
    }
}
