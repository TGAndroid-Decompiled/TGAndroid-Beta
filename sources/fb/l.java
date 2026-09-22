package fb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class l extends AbstractSet {
    public final int f9034a;
    public final n f9035b;

    public l(n nVar, int i10) {
        this.f9034a = i10;
        this.f9035b = nVar;
    }

    @Override
    public final void clear() {
        switch (this.f9034a) {
            case 0:
                this.f9035b.clear();
                return;
            default:
                this.f9035b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: fb.l.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f9034a) {
            case 0:
                return new k(this.f9035b, 0);
            default:
                return new k(this.f9035b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: fb.l.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f9034a) {
            case 0:
                return this.f9035b.d;
            default:
                return this.f9035b.d;
        }
    }
}
