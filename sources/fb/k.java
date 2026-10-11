package fb;

import java.util.AbstractSet;
import java.util.Iterator;
public final class k extends AbstractSet {
    public final int f9824a;
    public final m f9825b;

    public k(m mVar, int i10) {
        this.f9824a = i10;
        this.f9825b = mVar;
    }

    @Override
    public final void clear() {
        switch (this.f9824a) {
            case 0:
                this.f9825b.clear();
                return;
            default:
                this.f9825b.clear();
                return;
        }
    }

    @Override
    public final boolean contains(java.lang.Object r5) {
        throw new UnsupportedOperationException("Method not decompiled: fb.k.contains(java.lang.Object):boolean");
    }

    @Override
    public final Iterator iterator() {
        switch (this.f9824a) {
            case 0:
                return new j(this.f9825b, 0);
            default:
                return new j(this.f9825b, 1);
        }
    }

    @Override
    public final boolean remove(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: fb.k.remove(java.lang.Object):boolean");
    }

    @Override
    public final int size() {
        switch (this.f9824a) {
            case 0:
                return this.f9825b.d;
            default:
                return this.f9825b.d;
        }
    }
}
