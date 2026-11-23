package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f21546a;
    public boolean f21547b = true;
    public final f f21548c;

    public d(f fVar) {
        this.f21548c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f21546a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f21546a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f21547b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f21547b) {
            if (this.f21548c.f21549a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f21546a;
        if (cVar == null || cVar.f21545c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f21547b) {
            this.f21547b = false;
            this.f21546a = this.f21548c.f21549a;
        } else {
            c cVar2 = this.f21546a;
            if (cVar2 != null) {
                cVar = cVar2.f21545c;
            } else {
                cVar = null;
            }
            this.f21546a = cVar;
        }
        return this.f21546a;
    }
}
