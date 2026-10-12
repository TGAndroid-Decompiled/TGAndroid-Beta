package gb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class l extends AbstractSet {
    public final int f10058a;
    public final n f10059b;

    public l(n nVar, int i10) {
        this.f10058a = i10;
        this.f10059b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f10058a) {
            case 0:
                this.f10059b.clear();
                return;
            default:
                this.f10059b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: gb.l.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f10058a) {
            case 0:
                return new k(this.f10059b, 0);
            default:
                return new k(this.f10059b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: gb.l.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f10058a) {
            case 0:
                return this.f10059b.d;
            default:
                return this.f10059b.d;
        }
    }
}
