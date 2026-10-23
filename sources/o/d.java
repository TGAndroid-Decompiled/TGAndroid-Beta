package o;

import java.util.Iterator;
public final class d extends e implements Iterator {
    public c f17567a;
    public boolean f17568b = true;
    public final f f17569c;

    public d(f fVar) {
        this.f17569c = fVar;
    }

    @Override
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f17567a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f17567a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f17568b = z10;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.f17568b) {
            if (this.f17569c.f17570a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f17567a;
        if (cVar == null || cVar.f17566c == null) {
            return false;
        }
        return true;
    }

    @Override
    public final Object next() {
        c cVar;
        if (this.f17568b) {
            this.f17568b = false;
            this.f17567a = this.f17569c.f17570a;
        } else {
            c cVar2 = this.f17567a;
            if (cVar2 != null) {
                cVar = cVar2.f17566c;
            } else {
                cVar = null;
            }
            this.f17567a = cVar;
        }
        return this.f17567a;
    }
}
