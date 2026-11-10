package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f20672a;
    public boolean f20673b = true;
    public final f f20674c;

    public d(f fVar) {
        this.f20674c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z9;
        c cVar2 = this.f20672a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f20672a = cVar3;
            if (cVar3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f20673b = z9;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f20673b) {
            if (this.f20674c.f20675a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f20672a;
        if (cVar == null || cVar.f20671c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f20673b) {
            this.f20673b = false;
            this.f20672a = this.f20674c.f20675a;
        } else {
            c cVar2 = this.f20672a;
            if (cVar2 != null) {
                cVar = cVar2.f20671c;
            } else {
                cVar = null;
            }
            this.f20672a = cVar;
        }
        return this.f20672a;
    }
}
