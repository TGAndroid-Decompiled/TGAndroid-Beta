package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f15491a;
    public boolean f15492b = true;
    public final f f15493c;

    public d(f fVar) {
        this.f15493c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f15491a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f15491a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f15492b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f15492b) {
            if (this.f15493c.f15494a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f15491a;
        if (cVar == null || cVar.f15490c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f15492b) {
            this.f15492b = false;
            this.f15491a = this.f15493c.f15494a;
        } else {
            c cVar2 = this.f15491a;
            if (cVar2 != null) {
                cVar = cVar2.f15490c;
            } else {
                cVar = null;
            }
            this.f15491a = cVar;
        }
        return this.f15491a;
    }
}
